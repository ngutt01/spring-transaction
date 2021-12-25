<html>
<head>
<title>Welcome to App</title>
</head>
<body>
	<%@include file="Menu.jsp"%>
	<div class="container">

		<div class="card">
			<div class="card-header bg-primary text-white">
				<h3>Student Register Page</h3>
			</div>
			<div class="card-body">
				<form action="stdreg" method="POST">

					<div class="row">
						<div class="col-4">ID</div>
						<div class="col-4">
							<input type="text" name="sid" class="form-control"/>
						</div>
					</div>



					<div class="row">
						<div class="col-4">NAME</div>
						<div class="col-4">
							<input type="text" name="sname" class="form-control"/>
						</div>
					</div>

					<div class="row">
						<div class="col-4">GENDER</div>
						<div class="col-4">
							<input type="radio" name="gen" value="Male" /> Male <input
								type="radio" name="gen" value="Female" /> Female
						</div>
					</div>

					<div class="row">
						<div class="col-4">DOB</div>
						<div class="col-4">
							<input type="text" name="dob" class="form-control" placeholder="DD/MM/YYYY" size="8" />
						</div>
					</div>

					<div class="row">
						<div class="col-4">EMAIL</div>
						<div class="col-4">
							<input type="text" name="email" class="form-control"/>
						</div>
					</div>

					<div class="row">
						<div class="col-4">MOBILE</div>
						<div class="col-4">
							<input type="text" name="mobile" class="form-control"/>
						</div>
					</div>

					<div class="row">
						<div class="col-4">ADDRESS</div>
						<div class="col-4">
							<textarea name="addr" class="form-control"></textarea>
						</div>
					</div>

					<input type="submit" value="Register" class="btn btn-success" />
				</form>
			</div>
			<div class="card-footer">${message}</div>
		</div>




	</div>
</body>
</html>