<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/AtualizarContato" var="linkServletForms"/>


<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no" >
    <title>Contato</title>
    
    <!-- CSS -->
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css"> 

    <!-- link icons -->
    <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
</head>
<body>

    <div id="main-container">
        <!-- informações de enderço -->
        <div class="left-side" id="left-side">
            <div class="info-box" id="info-box"></div>
            <div class="information" id="information">
                <h2><span class="lnr lnr-location"></span>Endereço</h2>
                <p class="info-p">Brasil, Planeta Terra</p>
                <h2><span class="lnr lnr-phone-handset"></span>Telefone</h2>
                <p class="info-p">4002-8922</p>
                <h2><span class="lnr lnr-envelope"></span>E-mail</h2>
                <p class="info-p">email@gmail.com</p>
            </div>
        </div>
        <!-- formulario para contato -->
        <div class="right-side" id="right-side">
            <h2>Nos mande uma mensagem!</h2>
            <form action="${linkServletForms}" id="contact-form" method="post">
                <label for="name">Nome:</label>
                <input type="text" name="name" placeholder="Digite seu nome" value="${contato.getNome() }">
                <label for="email">E-mail:</label>
                <input type="email" name="email" placeholder="Digite seu E-mail" value="${contato.getEmail() }">
                <label for="Phone">Telefone:</label>
                <input type="text" name="phone" placeholder="Digite seu telefone" value="${contato.getTelefone() }">
                <label for="msg">Sua mensagem:</label>
                <textarea name="message" placeholder="Como podemos te ajudar">${contato.getMensagem() }</textarea>
                <input type="hidden" name="id" value="${contato.getId() }">
                <input type="submit" value="Enviar mensagem">
            </form>
			    
        </div>
    </div>
</body>
</html>