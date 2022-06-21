<%
	if(session.getAttribute("name") == null){
		response.sendRedirect("login.jsp");
	}
%>
	<!DOCTYPE html>
	<html lang="en">

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
		<meta name="description" content="" />
		<meta name="author" content="" />
		<title>Home Page</title>
		<!-- Font Awesome icons (free version)-->
		<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
		<!-- Google fonts-->
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
		<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
		<!-- Core theme CSS (includes Bootstrap)-->
		<link href="css/index-styles.css" rel="stylesheet" /> </head>

	<body id="page-top">
		<!-- Navigation-->
		<nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
			<div class="container">
				<button class="navbar-toggler text-uppercase font-weight-bold bg-info text-white rounded" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"> Menu <i class="fas fa-bars"></i> </button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Logout</a></li>
						<li class="nav-item mx-0 mx-lg-1 bg-primary">
							<a class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">
								<%= session.getAttribute("name") %>
							</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="masthead bg-info text-white text-center">
			<div class="container d-flex align-items-center flex-column">
				<h1 class="masthead-heading text-uppercase mb-0">Welcome <%= session.getAttribute("name") %></h1> </div>
		</div>
		<!-- Bootstrap core JS-->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
		<!-- Core theme JS-->
		<script src="js/scripts.js"></script>
	</body>

	</html>