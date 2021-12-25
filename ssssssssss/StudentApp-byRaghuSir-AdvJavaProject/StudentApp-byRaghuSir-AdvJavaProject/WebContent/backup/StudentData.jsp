<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<%@include file="Menu.jsp" %>
<h3>Student Data Page</h3>
<table border="1">
<tr>
	<td>ID</td>
	<td>NAME</td>
	<td>GEN</td>
	<td>DOB</td>
	<td>EMAIL</td>
	<td>PHNO</td>
	<td>ADDR</td>
</tr>

<c:forEach items="${list}" var="ob">
  <tr>
	<td>  <c:out value="${ob.id }"/> </td>
	<td>  <c:out value="${ob.name }"/> </td>
	<td>  <c:out value="${ob.gen }"/> </td>
	<td>  <c:out value="${ob.dob }"/> </td>
	<td>  <c:out value="${ob.email }"/> </td>
	<td>  <c:out value="${ob.phno }"/> </td>
	<td>  <c:out value="${ob.addr }"/> </td>
  
  </tr>
</c:forEach>
</table>
</body>
</html>