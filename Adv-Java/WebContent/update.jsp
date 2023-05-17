<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD App</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<!--
<script>


function checkFname()
{
	var f = document.insert.fname.value;
	
	var reg= /^[a-zA-Z]+$/ 
	
	if(f=="")
	{
		document.getElementById("fname").innerHTML = "Please Enter First Name.";
	}
	else if(!reg.test(f))
	{
		document.getElementById("fname").innerHTML="Please Enter Alphabets Only."
	}
	else
	{
		document.getElementById("fname").innerHTML="";
	}
	
}

function checkEmail()
{
	
	var e  = document.insert.email.value;
	
	var reg = /^[a-zA-Z0-9._-]+@[a-zA-Z]+\.[a-zA-Z]{2,4}$/
	
	if(e=="")
	{
		document.getElementById("email").innerHTML="Please Enter Email";	
	}
	else if(!reg.test(e))
	{
		document.getElementById("email").innerHTML="Please Enter Valid Email-Id";
	}
	else
	{
		document.getElementById("email").innerHTML="";	
	}
	
}

function checkMobile()
{
	var m = document.insert.mobile.value;
	
	var reg=/^\d{10}$/
	
	if(m=="")
	{
		document.getElementById("mobile").innerHTML="Please Enter Mobile.No";
	}
	else if(!reg.test(m))
	{
		document.getElementById("mobile").innerHTML="Please Enter 10 Digit No.";
	}
	else
	{
		document.getElementById("mobile").innerHTML="";	
	}
	
}

function checkPassword()
{
	
	var p = document.insert.password.value;
	
	var reg = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/
	
	if(p=="")
	{
		document.getElementById("password").innerHTML="Please Enter Password.";
	}
	else if(!reg.test(p))
	{
		document.getElementById("password").innerHTML="Please Valid Password.(Min 1 Digit,Min 1 lowercase, Min 1 Uppercase,Min 1 Special Characters, Min Length 8, Max Length 15)";
	}	
	else
	{
		document.getElementById("password").innerHTML="";
	}
	
}
function checkCPassword()
{
	var p1 = document.insert.password.value;
	var p2 = document.insert.cpassword.value;
	
	if(p1=="")
	{
		document.getElementById("cpassword").innerHTML="Please Enter Password";	
	}
	else if(p2!=p1)
	{
		document.getElementById("cpassword").innerHTML="Password and Confirm Password does not Matched.";
	}
	else
	{
		document.getElementById("cpassword").innerHTML="";	
	}
	
}


</script>

-->


</head>
<body>
	<h3 align="center">Update Form</h3>
	<hr>
	<br>
	<%
		Employee e = (Employee) request.getAttribute("e");
	%>




	<form name="insert" action="EmployeeController" method="post">
		<table align="center">
		<input type="hidden" name="id" value="<%=e.getId()%>">
		
			<tr>			
				<td>First Name :</td>
				<td><input type="text" name="fname" onblur="checkFname();"
					value="<%=e.getFname()%>"></td>
				<td><span id="fname" style="color: red;"></span></td>
			</tr>

			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"
					placeholder="Enter Last Name" value="<%=e.getLname()%>"></td>
			</tr>

			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" onblur="checkEmail();"
					value="<%=e.getEmail()%>"></td>
				<td><span id="email" style="color: red;"></span></td>
			</tr>

			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile" onblur="checkMobile();"
					value="<%=e.getMobile()%>"></td>
				<td><span id="mobile" style="color: red;"></span></td>
			</tr>

			<tr>
				<td>Gender :</td>
				<td>
					<%
						if (e.getGender().equals("male")) {
					%> <input type="radio" name="gender" value="male" checked="checked">Male
					<input type="radio" name="gender" value="female">Female <%
 	} else if (e.getGender().equals("female")) {
 %> <input type="radio" name="gender" value="male">Male <input
					type="radio" name="gender" value="female" checked="checked">Female


					<%
 	} else {
 %> <input type="radio" name="gender" value="male">Male <input
					type="radio" name="gender" value="female">Female <%
 	}
 %>


				</td>
			</tr>

			<tr>
				<td>Address :</td>
				<td><textarea name="address" rows="5" cols="23"><%=e.getAddress()%></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="action" value="Update"
					class="btn btn-danger"></td>
			</tr>

		</table>
	</form>



</body>
</html>