<html>
<head>
<title>Welcome to App</title>
</head>
<body>
<%@include file="Menu.jsp" %>
<h3>Student Register Page</h3>
<form action="stdreg" method="POST">
<pre>
ID    : <input type="text" name="sid"/>
NAME  : <input type="text" name="sname"/>
GENDER: <input type="radio" name="gen" value="Male"/> Male <input type="radio" name="gen" value="Female"/> Female
DOB   : <input type="text" name="dob" placeholder="DD/MM/YYYY" size="8"/>
EMAIL : <input type="text" name="email"/>
MOBILE: <input type="text" name="mobile"/>
ADDRESS: <textarea name="addr"></textarea>
	<input type="submit" value="Register"/>
</pre>
</form>
${message}
</body>
</html>