<%-- 
    Document   : cadastrarUsuario
    Created on : 01/06/2022, 15:48:27
    Author     : henry
--%>

<%@page import="br.com.DTO.UsuarioDTO"%>
<%@page import="br.com.DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Usuario</title>
    </head>
    <body>
        <%
            try {
                    UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                    objUsuarioDTO.setNome_usuario(request.getParameter("nome"));
                    objUsuarioDTO.setEmail_usuario(request.getParameter("email"));
                    objUsuarioDTO.setSenha_usuario(request.getParameter("senha"));
                    objUsuarioDTO.setSenha_usuario_igual(request.getParameter("senha_igual"));
            
                    UsuarioDAO objUsuarioDAO = new UsuarioDAO();
                    objUsuarioDAO.CadastrarUsuario(objUsuarioDTO);
                } catch (Exception e) {
                }
        %>
        <meta http-equiv="Refresh" content="1; url=http://localhost:8080/FCD/Usuario/frmLoginView.html" />
    </body>
</html>
