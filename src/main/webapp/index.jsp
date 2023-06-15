<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/estilos.css" rel="stylesheet">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<div class="wrapper fadeInDown">
		  <div id="formContent">
		
		    <div class="fadeIn first">
		      <img src="https://raw.githubusercontent.com/Dhamary08/Email-Sign/master/KOders.jpg" class="img" id="icon">
		    </div>
		
		    <form action="procesaLogin" method="POST">
		      <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">
		      <input type="password" id="password" class="fadeIn third" name="pass" placeholder="password">
		      <input type="submit" class="fadeIn fourth" value="Log In">
		    </form>
		
		    <div id="formFooter">
		    <br/>
		      <a class="underlineHover" href="#">Olvido la clave?</a>
		    </div>
		
		  </div>
	</div>
</body>
</html>