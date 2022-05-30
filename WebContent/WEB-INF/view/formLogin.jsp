<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkServlet"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Login para funcionários </h2>
	<p>Aqui você tem acesso aos contatos recebidos pela empresa</p>
	<form action="${linkServlet}" method="post">
		Login: <input type="text" name="login">
		Senha: <input type="password" name="senha">
		<input type="hidden" name="acao" value="Login">
		<input type="submit">	
	</form>
	<br>
	<c:import url="indexLink.jsp" />
</body>
</html>
