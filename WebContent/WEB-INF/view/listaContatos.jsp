<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/EnviarForms" var="linkServletForms"/>
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
   			<c:import url="logout-parcial.jsp" />
            <h2>Contatos Recebidos:</h2>
				<c:forEach items="${ contatos }" var="contato">
				<div style="display: flex; width: 100%; justify-content: start; margin: 5px">
					<a href="/PaginaDeContato/entrada?acao=EditaContato&id=${contato.getId() }" style="margin-right: 5px">Editar</a>
					<a href="/PaginaDeContato/entrada?acao=RemoverContato&id=${contato.getId() }" >Remover</a>
				</div>
				<ul class="list" style="margin: 12px; text-align: left">
					<li class="list-item" style="margin:2px">Nome:  ${ contato.getNome() }		</li>
					<li class="list-item" style="margin:2px">Email:  ${contato.getEmail() }		</li>
					<li class="list-item" style="margin:2px">Telefone:  ${contato.getTelefone() }	</li>
					<li class="list-item" style="margin:2px">Mensagem: ${contato.getMensagem() }	</li>
					
				</ul>
						
				</c:forEach>
        </div>
    </div>
</body>
</html>