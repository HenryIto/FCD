<%-- 
    Document   : listarProduto
    Created on : 31/05/2022, 15:21:07
    Author     : henry
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.com.DAO.ProdutoDAO"%>
<%@page import="br.com.DTO.ProdutoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
        <style>
            body{
                font-family: Arial,Helvetica, sans-serif;
                background-image:linear-gradient(to right, rgb(35,147,220), rgb(17,54,71));
            }
            table{
                color: white;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background-color: rgba(0,0,0,0.8);
                padding: 15px;
                border-radius: 15px;
                width: 40%;
            }
            a{
                color: white;
                text-decoration: none;
                padding: 3px;
                
            }
            .menu{
                color: white;
                text-decoration: none;
                padding: 3px;
                font-size: 20px;
            }
        </style>
    </head>
    <body>
        <a class="menu" href='http://localhost:8080/FCD/index.html'>Menu</a>
        <%
            try {
                    out.print("<table border=1 bordercolor=dodgerblue>");
                    out.print("<th>Código</th>");
                    out.print("<td>Nome do Produto</td>");
                    out.print("<td>Quantidade do Produto</td>");
                    out.print("<td>Ações</td>");
                    out.print("</th>");
                ProdutoDAO objProdutoDAO = new ProdutoDAO();
                ArrayList<ProdutoDTO> lista = objProdutoDAO.PesquisarProduto();
                
                for(int i = 0; i < lista.size(); i++){
                    out.print("<tr>");
                    out.print("<td>");
                    out.print(lista.get(i).getId_produto());
                    out.print("</td>");
                    out.print("<td>");
                    out.print(lista.get(i).getNome_produto());
                    out.print("</td>");
                    out.print("<td>");
                    out.print(lista.get(i).getQnt_produto());
                    out.print("</td>");
                    out.print("<td>");
                    out.print("<a href='frmExcluirProdutoVIEW.jsp?id=" + lista.get(i).getId_produto()
                                                                       + "&nome=" + lista.get(i).getNome_produto()
                                                                       + "&quantidade=" + lista.get(i).getQnt_produto()
                                                                       + "'> Excluir </a>");
                    
                    out.print("<a href='frmAlterarProdutoVIEW.jsp?id=" + lista.get(i).getId_produto()
                                                                       + "&nome=" + lista.get(i).getNome_produto()
                                                                       + "&quantidade=" + lista.get(i).getQnt_produto()
                                                                       + "'> Alterar </a>");
                    out.print("</td>");
                    out.print("</tr>");
        %> <br> <br> <%
                }
                } catch (Exception e) {
                }
        %> 
    </body>
</html>
