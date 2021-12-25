<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<%@include file="Menu.jsp"%>
	<div class="container">

		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Student Data Page</h3>
			</div>
			<div class="card-body">

				<table class="table table-hover">

					<tr class="bg-info text-white">
						<td>ID</td>
						<td>NAME</td>
						<td>GEN</td>
						<td>DOB</td>
						<td>EMAIL</td>
						<td>PHNO</td>
						<td>ADDR</td>
						<td>OPERATION</td>
					</tr>

					<c:forEach items="${list}" var="ob">
						<tr>
							<td><c:out value="${ob.id }" /></td>
							<td><c:out value="${ob.name }" /></td>
							<td><c:out value="${ob.gen }" /></td>
							<td><c:out value="${ob.dob }" /></td>
							<td><c:out value="${ob.email }" /></td>
							<td><c:out value="${ob.phno }" /></td>
							<td><c:out value="${ob.addr }" /></td>
							<td>
								<a href="delete?id=${ob.id}" class="btn btn-danger">DELETE</a>
							</td>

						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

	</div>
</body>
</html>