<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg =(String)request.getAttribute("msg") ;%>
    <jsp:include page="/home"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h3><%=msg%></h3>
	<%
		}
	%>
<form action="./upEmp" method="get">
		<fieldset>
			<legend>Upadte</legend>
				<table>
					<tr>
						<td>Mobile</td>
						<td>:</td>
						<td><input type="number" name="mobile1" required></td>
					</tr>
					<tr>
						<td>empId</td>
						<td>:</td>
						<td><input type="number" name="empId" required></td>
					</tr>
					<tr>
						<td colspan="3"><input type="submit" value="update"></td>
					</tr>
				</table>
		</fieldset>
	</form>
</body>
</html>