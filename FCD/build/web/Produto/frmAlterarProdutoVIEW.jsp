<%-- 
    Document   : frmAlterarProdutoVIEW
    Created on : 31/05/2022, 22:56:00
    Author     : henry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Produtos</title>
        <style>
            body{
                font-family: Arial,Helvetica, sans-serif;
                background-image:linear-gradient(to right, rgb(35,147,220), rgb(17,54,71));
            }
            .box{
                color: white;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background-color: rgba(0,0,0,0.8);
                padding: 15px;
                border-radius: 15px;
                width: 20%;
            }
            fieldset{
                border: 3px solid dodgerblue;
                border-radius: 15px;
            }
            legend{
                border: 1px solid dodgerblue;
                padding: 10px;
                text-align: center;
                background-color: dodgerblue;
                border-radius: 8px;
            }
            .inputUser{
                background: none;
                border: none;
                border-bottom: 1px solid white;
                outline: none;
                color: white;
                font-size: 15px;
                width: 100%;
                letter-spacing: 2px;
            }
            button{
                background-color: dodgerblue;
                width: 100%;
                padding: 15px;
                color: white;
                font-size: 15px;
                cursor: pointer;
                border-radius: 10px;
            }
            a{
                color: white;
                padding: 10px;
                text-decoration: none;
                font-size: 20px;
            }
        </style>
    </head>
    <body>
        <a href='http://localhost:8080/FCD/index.html'>Menu</a>
        <div class ="box">
        <form action="alterarProduto.jsp" method="POST">
            <fieldset>
                <legend><b>Alterar Produto</b></legend><br>
            <label>Código do Produto: </label> <br>
            <input type="text" name="id" class="inputUser" value="<%=request.getParameter("id")%>"> <br>
            <br>
            <label>Nome do Produto: </label> <br>
            <input type="text" name="nome" class="inputUser" value="<%=request.getParameter("nome")%>"> <br>
            <br>
            <label>Quantidade do Produto: </label> <br>
            <input type="text" name="quantidade" class="inputUser" value="<%=request.getParameter("quantidade")%>"> <br>
            <br>
            <button type="submit">Alterar</button>
            </fieldset>
        </form>
        </div>
    </body>
</html>
