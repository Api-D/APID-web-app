/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2022-02-28 08:18:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\r\n");
      out.write("\t\t<a class=\"navbar-brand brand-logo\" href=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"adminResources/image/logo.svg\" alt=\"logo\" /></a> <a\r\n");
      out.write("\t\t\tclass=\"navbar-brand brand-logo-mini\" href=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"adminResources/image/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\r\n");
      out.write("\t\t<button class=\"navbar-toggler navbar-toggler align-self-center\"\r\n");
      out.write("\t\t\ttype=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("\t\t\t<span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"nav-item nav-profile dropdown\"><a\r\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\tid=\"profileDropdown\"> <img src=\"adminResources/imag/face5.jpg\"\r\n");
      out.write("\t\t\t\t\talt=\"profile\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\"\r\n");
      out.write("\t\t\t\t\taria-labelledby=\"profileDropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"mdi mdi-logout text-primary\"></i> Logout\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<button\r\n");
      out.write("\t\t\tclass=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\"\r\n");
      out.write("\t\t\ttype=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("\t\t\t<span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
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
