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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>inicio page</title>\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script> \n");
      out.write("\t           <!-- Latest compiled and minified CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: black;\" background=\"img/index.jpg\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 40px;\">\n");
      out.write("\t\t\t<div class=\"col-md-6 \" align=\"center\">\n");
      out.write("                            <a href=\"loginCtrl\"><button class=\"btn btn-success\" ><span class=\" glyphicon glyphicon-user\"></span> Iniciar Sesion</button></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6\" align=\"center\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-info\"><span class=\" glyphicon glyphicon-download-alt\"></span> Registrarse</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("       <div class=\"row\" align=\"center\">\n");
      out.write("       \t <img src=\"img/logo.png\" alt=\"\" width=\"300\" height=\"300\">\n");
      out.write("       </div>\n");
      out.write("       <div class=\"row\">\n");
      out.write("       \t<div class=\"col-md-4\">\n");
      out.write("       \n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\">\n");
      out.write("       \t\t\t<span class=\"glyphicon glyphicon-ok\" style=\"font-size: 30px; color:green;\" ></span>\n");
      out.write("       \t\t\t<div class=\"caption\">\n");
      out.write("       \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis illo molestiae, quia perferendis eaque accusamus aliquam! Itaque ad eius iste, doloremque, debitis unde facere earum iure vitae voluptate, delectus laboriosam!</p>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\n");
      out.write("       \t<div class=\"col-md-4\">\n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\">\n");
      out.write("       \t\t<span class=\"glyphicon glyphicon-user \" style=\"font-size: 30px; color:green;\"></span>\n");
      out.write("       \t\t\t<div class=\"caption\">\n");
      out.write("       \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis illo molestiae, quia perferendis eaque accusamus aliquam! Itaque ad eius iste, doloremque, debitis unde facere earum iure vitae voluptate, delectus laboriosam!</p>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t\n");
      out.write("       \t</div>\n");
      out.write("       \t<div class=\"col-md-4\">\n");
      out.write("       \t\n");
      out.write("       \t\t<div class=\"thumbnail\" align=\"center\">\n");
      out.write("       \t\t<span class=\"glyphicon glyphicon-pencil\" style=\"font-size: 30px; color:green;\"></span>\n");
      out.write("       \t\t\t<div class=\"caption\">\n");
      out.write("       \t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis illo molestiae, quia perferendis eaque accusamus aliquam! Itaque ad eius iste, doloremque, debitis unde facere earum iure vitae voluptate, delectus laboriosam!</p>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t\t</div>\n");
      out.write("       \t</div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
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
