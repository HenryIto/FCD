package org.apache.jsp.Produto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.DAO.ProdutoDAO;
import br.com.DTO.ProdutoDTO;

public final class listarProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de Produtos</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: Arial,Helvetica, sans-serif;\n");
      out.write("                background-image:linear-gradient(to right, rgb(35,147,220), rgb(17,54,71));\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                color: white;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                background-color: rgba(0,0,0,0.8);\n");
      out.write("                padding: 15px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                width: 40%;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 3px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .menu{\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 3px;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a class=\"menu\" href='http://localhost:8080/FCD/index.html'>Menu</a>\n");
      out.write("        ");

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
        
      out.write(" <br> <br> ");

                }
                } catch (Exception e) {
                }
        
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
