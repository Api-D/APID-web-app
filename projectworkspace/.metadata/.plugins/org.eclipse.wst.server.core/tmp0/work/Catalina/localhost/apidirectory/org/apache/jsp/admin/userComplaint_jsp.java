/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2022-02-28 07:24:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<!-- partial:partials/_navbar.html -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- partial -->\r\n");
      out.write("\t\t<div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("\t\t\t<!-- partial:partials/_sidebar.html -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- partial -->\r\n");
      out.write("\t\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t\t<div class=\"content-wrapper\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row grid-margin\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3 class=\"card-title\">File a complaint</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"cmxform\" id=\"commentForm\" method=\"get\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"cname\">Subject</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"cname\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"name\" minlength=\"2\" type=\"text\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"maxlength-textarea\">Description</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea id=\"maxlength-textarea\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmaxlength=\"500\" rows=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"This textarea has a limit of 500 chars.\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <div class=\"col-lg-4 grid-margin stretch-card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t              <div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                <div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                  <h5 class=\"card-title d-flex\">Add file (optional)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                    <small class=\"ml-auto align-self-end\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                    </small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                  </h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                  <input type=\"file\" class=\"dropify\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    </div>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"btn btn-primary\" type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- content-wrapper ends -->\r\n");
      out.write("\t\t\t\t<!-- partial:../../partials/_footer.html -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- partial -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- main-panel ends -->\r\n");
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
      out.write("\t<!-- Custom js for this page-->\r\n");
      out.write("\t<script src=\"adminResources/js/form-validation.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/bt-maxLength.js\"></script>\r\n");
      out.write("\t<script src=\"adminResources/js/formpickers.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/form-addons.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/x-editable.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/dropify.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/dropzone.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/jquery-file-upload.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/formpickers.js\"></script>\r\n");
      out.write("  \t<script src=\"adminResources/js/form-repeater.js\"></script>\r\n");
      out.write("\t<!-- End custom js for this page-->\r\n");
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
