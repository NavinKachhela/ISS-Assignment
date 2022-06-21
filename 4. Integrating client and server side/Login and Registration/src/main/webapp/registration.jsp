<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Sign Up</title>
	<!-- Font Icon -->
	<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<!-- Main css -->
	<link rel="stylesheet" href="css/style.css"> </head>

<body>
	<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
	<div class="main">
		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
						<form name='registration' method="post" action="register" class="register-form" name='registration' id="register-form" onsubmit="return formValidation()">
							<div class="form-group">
								<label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
								<input type="text" name="name" id="name" placeholder="Your Name" /> <span class="margin-top-3" id="formerror_name"></span> </div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label>
								<input name="email" id="email" placeholder="Your Email" /> <span class="margin-top-3" id="formerror_email"></span> </div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label>
								<input type="password" name="pass" id="pass" placeholder="Password" /> <span class="margin-top-3" id="formerror_pass"></span> </div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass" placeholder="Repeat your password" /> <span class="margin-top-3" id="formerror_repass"></span> </div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-phone"></i></label>
								<input type="text" name="contact" id="contact" placeholder="Contact no" /> <span class="margin-top-3" id="formerror_contact"></span> </div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup" class="form-submit" value="Register" /> </div>
						</form>
					</div>
					<div class="signup-image">
						<figure> <img src="images/signup-image.jpg" alt="sign up image"> </figure> <a href="login.jsp" class="signup-image-link">I am already member</a> </div>
				</div>
			</div>
		</section>
	</div>
	<!-- JS -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>