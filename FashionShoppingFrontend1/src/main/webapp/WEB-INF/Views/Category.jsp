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
</form>
<legend> Category Form</legend>
CatId:<input type ="text"Id="catid"><br>
<br>
Cat Name:<input type="text" Name="name"><br>
<br>
<input type="submit"value="submit">
<input type="reset" value"cancel">
</fieldset>
</div>
<table>
<tr>
<th>CatId</th>
<th>CatName</th>
<th>Edit/Delete</th>
</tr>

<c1:forEach items="${categories}" var="Cat">
 <tr>
 <td>${cat.getCatId()}</td>
 <td>${cat.getCatName()}</td>
 </tr>
 </c1:forEach>
 </table>
 
</body>
</html>