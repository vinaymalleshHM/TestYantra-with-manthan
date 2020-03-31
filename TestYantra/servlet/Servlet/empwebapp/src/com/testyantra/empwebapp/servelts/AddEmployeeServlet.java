package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		HttpSession session = req.getSession(false);
		if (session != null) {
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("EmployeeInfoBean");
		
		int empId =  Integer.parseInt(req.getParameter("empId"));
		
		String empName = req.getParameter("empName");
		
		int age =  Integer.parseInt(req.getParameter("age"));
		
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		String designation = req.getParameter("designation");
		
		long mobile = Long.parseLong(req.getParameter("mobile"));
		
		
		EmployeeInfoBean EmployeeInfoBean = new EmployeeInfoBean();
		
		EmployeeInfoBean.setEmpid(empId);
		EmployeeInfoBean.setEmpName(empName);
		EmployeeInfoBean.setAge(age);
		EmployeeInfoBean.setSalary(salary);
		EmployeeInfoBean.setDesignation(designation);
		EmployeeInfoBean.setMobile(mobile);
		
		
		if(dao.addEmployee(EmployeeInfoBean)) {
			out.println("<h2> Record inserted succesfully....<h2>");
			out.println("<h3>Thanks"+bean.getEmpName()+"to add Record<h3>");
			
		}
		else {
			out.println("<h2> unable to inserted Record....<h2>");
			out.println("<h3>Sorry"+bean.getEmpName()+","+bean.getDesignation()+" Unable to add Record<h3>");
		}
		}
		else {
			out.println("<h2>please login First<h2>");
			req.getRequestDispatcher("./LoginForm.html").include(req, resp);
			
		}
	
		
		out.println("</body>");
		out.println("</html>");
		
		
	
	}
	
	

}
