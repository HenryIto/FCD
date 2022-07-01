<%-- 
    Document   : inserirProduto
    Created on : 25/05/2022, 16:23:12
    Author     : henry
--%>

<%@page import="br.com.DTO.ProdutoDTO"%>
<%@page import="br.com.DAO.ProdutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Produtos</title>
    </head>
    <body>
        
        <%
          try {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                objProdutoDTO.setNome_produto(request.getParameter("nome_prod"));
                objProdutoDTO.setQnt_produto(request.getParameter("qnt_prod"));
            
                ProdutoDAO objProdutoDAO = new ProdutoDAO();
                objProdutoDAO.CadastrarProduto(objProdutoDTO);
              } catch (Exception e) {
              }
        %>
        <meta http-equiv="Refresh" content="1; url=http://localhost:8080/FCD/Produto/listarProduto.jsp" />
    </body>
</html>
