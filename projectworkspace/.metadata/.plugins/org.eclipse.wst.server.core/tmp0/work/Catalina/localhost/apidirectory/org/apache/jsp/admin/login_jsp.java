/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2022-02-28 08:14:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>Serein Admin</title>\r\n");
      out.write("<!-- plugins:css -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"adminResources/css/materialdesignicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"adminResources/css/vendor.bundle.base.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"adminResources/css/vendor.bundle.addons.css\">\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- plugin css for this page -->\r\n");
      out.write("<!-- End plugin css for this page -->\r\n");
      out.write("<!-- inject:css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"adminResources/css/style.css\">\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"adminResources/image/favicon.png\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-scroller\">\r\n");
      out.write("\t\t<div class=\"container-fluid page-body-wrapper full-page-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"content-wrapper d-flex align-items-center auth\">\r\n");
      out.write("\t\t\t\t<div class=\"row w-100\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 mx-auto\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"auth-form-light text-left p-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brand-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"adminResources/image/logo.svg\" alt=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Hello! let's get started</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"font-weight-light\">Sign in to continue.</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"pt-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control form-control-lg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"exampleInputEmail1\" placeholder=\"Username\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control form-control-lg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"./index.jsp\">SIGN IN</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"my-2 d-flex justify-content-between align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"form-check-label text-muted\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" class=\"form-check-input\"> Keep me\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsigned in\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"auth-link text-black\">Forgot password?</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-block btn-facebook auth-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"mdi mdi-facebook mr-2\"></i>Connect using Facebook\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-block btn-google auth-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"mdi mdi-google mr-2\"></i>Connect using Google\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center mt-4 font-weight-light\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tDon't have an account? <a href=\"./register.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-primary\">Create</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- content-wrapper ends -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- page-body-wrapper ends -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- container-scroller -->\r\n");
      out.write("\t<!-- plugins:js -->\r\n");
      out.write("\t<script src=\"adminResources/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/vendor.bundle.addons.js\"></script>\r\n");
      out.write("\t<!-- endinject -->\r\n");
      out.write("\t<!-- inject:js -->\r\n");
      out.write("\t<script src=\"adminResources/js/off-canvas.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/hoverable-collapse.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/template.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/settings.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/todolist.js\"></script>\r\n");
      out.write("\t<!-- endinject -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
