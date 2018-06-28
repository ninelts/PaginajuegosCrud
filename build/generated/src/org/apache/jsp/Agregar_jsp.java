package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Agregar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <script src=\"js/jquery-3.3.1.min.js\"> </script> \n");
      out.write("         <script src=\"js/bootstrap.js\"> </script>\n");
      out.write("         <script src=\"js/popper.js\"> </script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <body>\n");
      out.write("     \n");
      out.write(" \n");
      out.write("       <div id=\"header\"> </div>\n");
      out.write("       <script type=\"text/javascript\">$(\"#header\").load(\"includes/header.html\") </script>\n");
      out.write("       \n");
      out.write("       <form> \n");
      out.write("           \n");
      out.write("           \n");
      out.write("       <div class=\"row\">\n");
      out.write("           \n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputEmail4\">Cod Juego</label>\n");
      out.write("                     <input type=\"\" class=\"form-control\"  placeholder=\"Nombre Producto\"name=\"j_cod\" >\n");
      out.write("                         </div>    \n");
      out.write("   \n");
      out.write("    <div class=\"form-group col-md-4\">\n");
      out.write("        <label for=\"inputEmail4\">Nombre Juego</label>\n");
      out.write("            <input type=\"\" class=\"form-control\"  placeholder=\"Nombre Producto\" name=\"j_nombre\">\n");
      out.write("             </div> \n");
      out.write("           \n");
      out.write("           <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputAddress\">Url trailer juego </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\"  placeholder=\"precio\" name=\"j_video\">\n");
      out.write("                        </div>   \n");
      out.write("                                </div>\n");
      out.write("       \n");
      out.write("      \n");
      out.write("     <div class=\"row\"> \n");
      out.write("         \n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <label for=\"inputAddress\">Valor </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\"  placeholder=\"precio\" name=\"j_valor\">\n");
      out.write("                    </div>\n");
      out.write("  \n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("            <label for=\"inputAddress\">Url imagen </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\"  placeholder=\"precio\" name=\"j_img\">\n");
      out.write("                     </div>\n");
      out.write("                                </div>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("                        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <div class=\"row\">       \n");
      out.write("           <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputCity\">Requisitos Minimos</label>\n");
      out.write("                    <textarea  name=\"j_req_min\" rows=\"3\" cols=\"40\">\n");
      out.write("                         </textarea>\n");
      out.write("                                    </div>    \n");
      out.write("\n");
      out.write("     <div class=\"form-group col-md-4 \">\n");
      out.write("          <label for=\"inputCity\">Requisitos Maximos</label> \n");
      out.write("              <textarea  name=\"j_req_max\" rows=\"3\" cols=\"40\">\n");
      out.write("                </textarea>\n");
      out.write("                        </div>\n");
      out.write("                                   \n");
      out.write("    <div class=\"form-group col-md-4 \">\n");
      out.write("          <label for=\"inputCity\">Descripcion</label> \n");
      out.write("          <textarea class=\"\"  name=\"j_descripcion\" rows=\"3\" cols=\"40\" name=\"descripcion_j\">\n");
      out.write("                </textarea>\n");
      out.write("                           </div>\n");
      out.write("                                        </div> \n");
      out.write("    \n");
      out.write("   \n");
      out.write("           <input type=\"submit\" formaction=\"crud_modificar\" formmethod=\"POST\" value=\"Modificar\" />\n");
      out.write("           <input type=\"submit\" formaction=\"crud_crear\" formmethod=\"POST\" value=\"Guardar\" />\n");
      out.write("           <input type=\"submit\" formaction=\"crud_eliminar\" formmethod=\"POST\" value=\"Modificar\" />\n");
      out.write("    </form>\n");
      out.write("       \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("       \n");
      out.write("            \n");
      out.write("           \n");
      out.write("           \n");
      out.write("  \n");
      out.write("       <div id=\"footeer\"></div>\n");
      out.write("       <script type=\"text/javascript\"> $(\"#footeer\").load(\"includes/footeer.html\") </script>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("   </body>\n");
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
