<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
action="/action_page.php"
method="get" target="_blank">
<fieldset style=" margin-right:750px;">
<legend> Supplier Form</legend>
SupId:<input type ="text"Id="Supid"><br>
<br>
SupName:<input type="text" Name="name"><br>
<br>
Address:<input type="text"Id Name="Address"><br>
<br>
Phone-no:<input type ="text"Id="phno"><br>
<br>
EmailId:<input type ="text"Id="emailid"><br>
<br>
<input type="submit" value="submit">
<input type="reset" value"cancel">
</fieldset>
</form>
<table>
<tr>
<th>SupId</th>
<th>SupName</th>
<th>Address</th>
<th>Phone-no</th>
<th>EmailId</th>
<th>Edit/Delete</th>
</tr>
<c1:forEach items="${supplies}" var="supplier">
<tr>
<td>${supplier.getSupId()}</td>
<td>${supplier.getSupName()}</td>
<td>${supplier.getAddress()}</td>
<td>${supplier.getPhone-no()}</td>
<td>${supplier.getEmailId()}</td>
</tr>
</c1:forEach>
</table>
</body>
</html>