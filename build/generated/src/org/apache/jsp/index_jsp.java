package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script> \r\n");
      out.write("\t           <!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: \t#DEB887;\" background=\"\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\" align=\"center\" style=\"text-shadow: 3px 2px black;\">\r\n");
      out.write("\t\t\t<legend style=\"font-style: oblique; font\"><h1><span style=\"color :red;font-size: 60px;\">AULA</span> <span style=\"color:blue ;font-size: 60px;\">VIRTUAL</span></h1></legend>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        ");

            HttpSession sesion = request.getSession(false); 
            String estudiante = (String) sesion.getAttribute("usuario");
            String docente = (String) sesion.getAttribute("docente");
            String administrador = (String) sesion.getAttribute("administrador");
            if(estudiante.isEmpty() && docente.isEmpty() && administrador.isEmpty()){ 
        
      out.write("\r\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 \" align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"login.jsp\"><button class=\"btn btn-success\"><span class=\" glyphicon glyphicon-user\"></span> Iniciar Sesion</button></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6\" align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"register.jsp\"><button class=\"btn btn-info\"><span class=\" glyphicon glyphicon-download-alt\"></span> Registrarse</button></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            ");
 }else if(!estudiante.isEmpty()){ 
      out.write("\r\n");
      out.write("            <div class=\"row\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 \" align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"dashboard_estudiante.jsp\"><button class=\"btn btn-success\"><span class=\" glyphicon glyphicon-user\"></span> Dashboard</button></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            \r\n");
      out.write("            ");
 }else if(!docente.isEmpty()){ 
      out.write("\r\n");
      out.write("            <div class=\"row\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 \" align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"dashboard_docente.jsp\"><button class=\"btn btn-success\"><span class=\" glyphicon glyphicon-user\"></span> Dashboard</button></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            ");
 }else if(!administrador.isEmpty()){ 
      out.write("\r\n");
      out.write("            <div class=\"row\" style=\"margin-top: 10px;\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 \" align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"dashboard_admin.jsp\"><button class=\"btn btn-success\"><span class=\" glyphicon glyphicon-user\"></span> Dashboard</button></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" style=\"padding-top: 10px;\">\r\n");
      out.write("  <div class=\"col-md-12\">\r\n");
      out.write("  <div id=\"carousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("           <!--Indicadores-->\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("      <li data-target=\"#carousel\" data-slide-to=\"1\" ></li>\r\n");
      out.write("      <li data-target=\"#carousel\" data-slide-to=\"2\" ></li>\r\n");
      out.write("      <li data-target=\"#carousel\" data-slide-to=\"3\" ></li>\r\n");
      out.write("     \r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write("    <!--contenedro slider-->\r\n");
      out.write("<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("     <div class=\"item active\">\r\n");
      out.write("         <img src=\"img/slide/slide1.jpg\"  class=\"image-responsive\" width=\"2001\" height=\"604\" > \r\n");
      out.write("           <div class=\"carousel-caption\">\r\n");
      out.write("           <h2>REGISTRATE AHORA MISMO</h2>\r\n");
      out.write("            <button class=\"btn btn-success\"><span class=\"glyphicon glyphicon-download-alt\"></span> Registate Aqui</button>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"item\">\r\n");
      out.write("         <img src=\"img/slide/slide2.jpg\"  class=\"image-responsive\"  width=\"2001\" height=\"604\"> \r\n");
      out.write("           <div class=\"carousel-caption\">\r\n");
      out.write("               <h2 style=\"color:blue\">FACIL,RAPIDO,SENCILLO </h2>\r\n");
      out.write("          \r\n");
      out.write("         </div>\r\n");
      out.write("     </div> \r\n");
      out.write("\r\n");
      out.write("     <div class=\"item\">\r\n");
      out.write("         <img src=\"img/slide/slide3.jpg\"   > \r\n");
      out.write("           <div class=\"carousel-caption\" >\r\n");
      out.write("           \r\n");
      out.write("           <H2 style=\"color: blue\">CURSOS NUEVOS </H2>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div> \r\n");
      out.write(" <div class=\"item\">\r\n");
      out.write("         <img src=\"img/slide/slide4.jpg\"   width=\"2001\" height=\"604\"> \r\n");
      out.write("           <div class=\"carousel-caption\"  >\r\n");
      out.write("           \r\n");
      out.write("           <H2 style=\"color:blue\">CONOCIMIENTO A TU ALCANCE</H2>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("       <div class=\"row\" style=\"margin-top: 20px;\">\r\n");
      out.write("       \t<div class=\"col-md-4\">\r\n");
      out.write("       \r\n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\" style=\"background-color: red;\">\r\n");
      out.write("       \t\t\t<span class=\"glyphicon glyphicon-ok\" style=\"font-size: 30px; color:green;\"></span>\r\n");
      out.write("       \t\t\t<div class=\"caption\">\r\n");
      out.write("       <p style=\"color: white;\">Buenos contenidos,actividades que fomentan el aprendizaje, y cursos actualizados disponibles para ti constantemenre esto y mucho mas encontraras en Aulavirtual.com</p>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \r\n");
      out.write("       \t<div class=\"col-md-4\">\r\n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\" style=\"background-color: red;\">\r\n");
      out.write("       \t\t<span class=\"glyphicon glyphicon-user \" style=\"font-size: 30px; color:green;\"></span>\r\n");
      out.write("       \t\t\t<div class=\"caption\">\r\n");
      out.write("       \t\t\t<p style=\"color:white;\">Nuestro equipo de formadores son expertos reconocidos en software, negocios creatividad y otras areas del conociemiento, adaptan los contenidos de acuerdo a tu nivel de aprendizaje y los presentan en breves y prÃ¡cticas acividades o material de estudio.</p>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t</div>\r\n");
      out.write("       \t<div class=\"col-md-4\">\r\n");
      out.write("       \t\r\n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\"w style=\"background-color: red;\">\r\n");
      out.write("       \t\t<span class=\"glyphicon glyphicon-pencil\" style=\"font-size: 30px; color:green;\"></span>\r\n");
      out.write("       \t\t\t<div class=\"caption\">\r\n");
      out.write("\r\n");
      out.write("       \t\t\t<p style=\"color: white;\">Evaluaciones que permitiran evaluar a los deocentes y evaluarte a ti mismo ,el nivel de apripiacion sobre los temas del curso y saber que tendras que reforzar recuerda que estas en un proceso de aprendizaje y aveces hay cosas que se pasan por alto </p>\r\n");
      out.write("       \t\t   </div>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t</div>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
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
