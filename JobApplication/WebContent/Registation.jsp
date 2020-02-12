<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HPCL-2020</title>
</head>
<body>	
	<h1>Welcome Dear HPCL-2020 Aspirant</h1>
	<p class="a UNDERLINE">>>Please read all the instructions before go
		through the perticulars</p>
	<a
		href="https://www.soa.org/globalassets/assets/files/edu/edu-rules-reg-instructions.pdf">Click
		here to view Instructions: </a>
	<br>
	<p class="b">*Fileds are Mandatory</p>
	<form action="register" method="post">


		*Name:<input type="text" name="name">
		<p style="font-size: 10; font-style: calibri; color: green;">Mension
			name as per SSC</p>
		*Gender <br>Male :<input type="radio" name="gender" value="male">
		Female:<input type="radio" name="gender" value="female"> <br>
		<br> *Year of Passout:<input type="number" min="2010" max="2019"
			name="yearofpass"> <br> <br> *Date of birth:<input
			type="date" name="dateofbirth" min="01-Jan-2000" max="01-Jan-2030"> <br>
		<br> *Education:<select id=qualification>
			<option selected="select">-Select-</option>
			<option  value="1" >P.G</option>
			<option value="2" >Degree</option>
			<option  value="3" >Inter</option>
			<option  value="4" >SSC</option>
		</select> <br> <br> &nbsp&nbspYour Interest: <br> <input
			type="checkbox" value="Studies" name=interest >Studies <br> <input
			type="checkbox" value="business" name=interest>Bussiness <br> <input
			type="checkbox" value="employment" name=interest>Employment <br> <input
			type="checkbox" value="entertainment" name=interest>Entertainment <br>

		<br> Sample image:<a href="image.html" id="" name="">click
			here </a><br> Comments: <br>
		<textarea rows="3" cols="40"> </textarea>
		<input type="submit" name="register">

	</form>


	<p class="inst">
		Guidelines for Scanning Signature <br>1. Draw a box of 6*3 cm
		(width*height) on a white paper sheet<br> 2. Take a thick tip
		black/blue ink pen (preferably fountain pen).<br> 3. The
		applicant has to put his/her signature in full in the box drawn.<br>
		4. Following kind of signatures are NOT acceptable:<br> a.
		Signature containing Initials only<br> b. Signature in CAPITAL
		LETTERS <br>c. Signature with overwriting <br>5. Signature
		must be signed by the applicant, not by any other person. Signature
		should be done in the center of the box.
	</p>

</body>
</html>