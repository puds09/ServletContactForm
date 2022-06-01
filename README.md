# Formulário para entrar em contato com uma empresa


## 📝 Adicionando e Editando um contato no banco de dados

<p> CRUD completo da API:</p>
<ul>
    <li>Criando novo contato</li> 
    <li>Listando os contatos já recebidos</li>
    <li>Removendo um contato já existente</li>
    <li>Editando um contato já existente</li>
</ul>

![Adicionando e editando contato Vídeo](https://github.com/puds09/ServletContactForm/blob/main/API-contatoEmpresa/Adicionando%20EEditandoContato.gif)


## ✅ Autenticação

<p> Parametro de requisição "ListaContato" só é acessível por um usuário logado </p>
<p> Acesso liberado apenas caso nickname e senha conferem idênticas no banco de dados</p>

![Autenticação e páginas bloqueadas para usuários não autorizados](https://github.com/puds09/ServletContactForm/blob/main/API-contatoEmpresa/Autenticacao_Login.gif)

## ➕ Informções adicionais

<p>❗ Para que a aplicação saiba se o usuário já está logado ao mudar de uma página para outra (sem precisar de um novo formulário de login), utilizei cookie, a Interface HttpSession.</p> 
<p>❗ No projeto final, com padrão MVC, as "views" não são acessíveis pela URL. É necessário passar pelo Servlet, o qual irá filtrar a requisição e redicionar, ou seja, fazer o Controller.</p>


##
##

##### ❓ Qualquer dúvida, pode me contatar pela issue, ou:

<div style="display: inline_block" align="center"><br>
  
  <a href="https://www.linkedin.com/in/pedro-ribeiro-b522671b1/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
  
  <a href = "mailto:ph.pedro09@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

</div>
