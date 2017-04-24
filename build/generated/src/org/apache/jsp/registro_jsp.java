package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Document</title>\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script> \n");
      out.write("\t           <!-- Latest compiled and minified CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("  <script> \n");
      out.write("  $(function() {\n");
      out.write("     $('#especialidaddocente').hide();\n");
      out.write("})\n");
      out.write("  function activado(argument) {\n");
      out.write("      $('#especialidaddocente').show();\n");
      out.write("  }\n");
      out.write("  function desactivado(argument) {\n");
      out.write("    $('#especialidaddocente').hide();\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body background=\"img/fondo_registro1.jpg\">\n");
      out.write("<div class=\"container-fluid\">  \t\t \t\t\n");
      out.write(" \t\t<div class=\"row\">\n");
      out.write(" \t\t<div class=\"col-md-3\">  \t\t\t\n");
      out.write(" \t\t</div>\n");
      out.write(" \t\t\t<div class=\"col-md-6 \" style=\"margin-top: 50px; background-color: white ;\"\n");
      out.write("                             <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombres}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write(" \t\t\t\t<form action=\"CrearUsuarioCtrl\" method=\"post\">\n");
      out.write(" \t\t\t\t<div align=\"center\">\n");
      out.write("        <legend align=\"center\">Formulario De Registro</legend>\n");
      out.write(" \t\t\t\t<span  > <img src=\"img/registro_logo.png\" alt=\"\" width=\"100\" height=\"100\"></span>\n");
      out.write(" \t\t\t\t</div>\n");
      out.write(" \t\t\t\t \t\t\t\t  <div class=\"form-group\">\n");
      out.write(" \t\t\t\t  <label>Nombres:</label>\t\n");
      out.write(" \t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"nombres\" placeholder=\"Ingrese su nombre \">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">                   \t                 \n");
      out.write(" \t\t\t\t\t<label>Apellidos:</label>\n");
      out.write(" \t\t\t\t\t<input type=\"text\" class=\"form-control\"\tname=\"apellidos\" placeholder=\"Ingrese sus  apellidos\">\n");
      out.write("                 </div>\n");
      out.write("         <div class=\"form-group\">                                      \n");
      out.write("         <div class=\"form-group\">\n");
      out.write("  <label for=\"sel1\">Tipo de Identificacion:</label>\n");
      out.write("    <select class=\"form-control\" id=\"sel1\">\n");
      out.write("      <option value=\"0\">Ninguno</option>\n");
      out.write("      <option value=\"1\">Cedula De Ciudadania</option>\n");
      out.write("      <option value=\"2\">Tarjeta Identidad</option>\n");
      out.write("      \n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"form-group\">                                     \n");
      out.write("          <label>Numero Identificacion:</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"numidentifica\" placeholder=\"Digite su Numero de Identificacion\">\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"form-group\">                                     \n");
      out.write("          <label>Correo</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"correo\" placeholder=\"Digite su Correo Electronico\">\n");
      out.write("                 </div>\n");
      out.write(" <div class=\"form-group\">                                     \n");
      out.write("          <label>Username:</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Digite su contraseña\">\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"form-group\">                                     \n");
      out.write("          <label>Password:</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"password\" placeholder=\"Digite su contraseña\">\n");
      out.write("                 </div>\n");
      out.write("                  \n");
      out.write("                 <div class=\"form-group\" align=\"center\" >\n");
      out.write("                 \t<label>Tipo de usuario</label>\n");
      out.write("                      <div class=\"radio\">\n");
      out.write("\t\t                     <label class=\"radio-inline\"><input type=\"radio\" value=\"estudiante\" name=\"tipoUsuario\" onclick=\"desactivado();\">Estudiante </label>\n");
      out.write("\n");
      out.write("\t\t                     <label class=\"radio-inline\"><input type=\"radio\" value=\"docente\" name=\"tipoUsuario\" onclick=\"activado();\"> Docente </label>\n");
      out.write("                       </div>\n");
      out.write("\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"form-group\" id=\"especialidaddocente\">\n");
      out.write("                   <label>Especialidad Docente:</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"especialidaddocente\" placeholder=\"Digite su especialidad o area de conocimiento\">\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"form-group\" align=\"center\">\n");
      out.write("                     <button class=\"btn btn-success\" onclick=\"submit();\" name=\"accion\" value=\"crear\">Ingresar</button>\n");
      out.write("                 </div>\n");
      out.write(" \t\t\t\t</form>\n");
      out.write(" \t\t\t</div>\n");
      out.write(" \t\t</div>\n");
      out.write(" \t\t<div class=\"row\">\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t</div>\n");
      out.write(" \t\t<div class=\"row\">\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t</div>\n");
      out.write(" \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
