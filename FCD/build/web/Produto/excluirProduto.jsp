<%-- 
    Document   : excluirProduto
    Created on : 31/05/2022, 15:54:41
    Author     : henry
--%>

<%@page import="br.com.DAO.ProdutoDAO"%>
<%@page import="br.com.DTO.ProdutoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Produtos</title>
    </head>
    <body>
        <%
            try {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setId_produto(Integer.parseInt(request.getParameter("id")));
                
            
                ProdutoDAO objProdutoDAO = new ProdutoDAO();
                objProdutoDAO.ExcluirProduto(objProdutoDTO);
                } catch (Exception e) {
                }
        %>
        <meta http-equiv="Refresh" content="1; url=http://localhost:8080/FCD/Produto/listarProduto.jsp" />
    </body>
</html>
