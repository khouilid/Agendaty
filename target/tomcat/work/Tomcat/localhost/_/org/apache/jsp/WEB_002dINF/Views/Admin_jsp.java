/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-02 22:52:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.Model.UsersEntity;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/Views/Lyouts/sidebar.jsp", Long.valueOf(1614725036764L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Corona Admin</title>\n");
      out.write("    <!-- plugins:css -->\n");
      out.write("    ");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/css/vendor.bundle.base.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Plugin css for this page -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/jvectormap/jquery-jvectormap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/owl-carousel-2/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/vendors/owl-carousel-2/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../assets/css/style.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../assets/images/favicon.png\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container-scroller\">\n");
      out.write("    <!-- partial:partials/_sidebar.jsp -->\n");
      out.write("    ");


    UsersEntity user = (UsersEntity) session.getAttribute("user");


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("    <div class=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\n");
      out.write("        <a class=\"sidebar-brand brand-logo\" href=\"/\">\n");
      out.write("            <h2 class=\" text-white\">Agandaty</h2>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <a class=\"sidebar-brand brand-logo-mini\" href=\"/\">\n");
      out.write("            <h2 class=\" text-white\">AG</h2>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("        <li class=\"nav-item profile\">\n");
      out.write("            <div class=\"profile-desc\">\n");
      out.write("                <div class=\"profile-pic\">\n");
      out.write("                    <div class=\"count-indicator\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <img class=\"img-xs rounded-circle \" src=\"assets/images/faces/face15.jpg\" alt=\"img\">\n");
      out.write("                        <span class=\"count bg-success\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"profile-name\">\n");
      out.write("                        <h5 class=\"mb-0 font-weight-normal\">");
      out.print(user.getUsername());
      out.write("</h5>\n");
      out.write("                        <span>Admin</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\" id=\"profile-dropdown\" data-toggle=\"dropdown\"><i class=\"mdi mdi-dots-vertical\"></i></a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right sidebar-dropdown preview-list\"\n");
      out.write("                     aria-labelledby=\"profile-dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                <i class=\"mdi mdi-settings text-primary\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content\">\n");
      out.write("                            <p class=\"preview-subject ellipsis mb-1 text-small\">Account settings</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                <i class=\"mdi mdi-onepassword  text-info\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content\">\n");
      out.write("                            <p class=\"preview-subject ellipsis mb-1 text-small\">Change Password</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a href=\"#\" class=\"dropdown-item preview-item\">\n");
      out.write("                        <div class=\"preview-thumbnail\">\n");
      out.write("                            <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                <i class=\"mdi mdi-calendar-today text-success\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"preview-item-content\">\n");
      out.write("                            <p class=\"preview-subject ellipsis mb-1 text-small\">Log out</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item nav-category\">\n");
      out.write("            <span class=\"nav-link\">Navigation</span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item menu-items\">\n");
      out.write("            <a class=\"nav-link\" href=\"/\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-speedometer\"></i>\n");
      out.write("              </span>\n");
      out.write("                <span class=\"menu-title\">Dashboard</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item menu-items\">\n");
      out.write("            <a class=\"nav-link\" href=\"Customers\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-table-large\"></i>\n");
      out.write("              </span>\n");
      out.write("                <span class=\"menu-title\">Customers</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item menu-items\">\n");
      out.write("            <a class=\"nav-link\" href=\"/charts\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-chart-bar\"></i>\n");
      out.write("              </span>\n");
      out.write("                <span class=\"menu-title\">Charts</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item menu-items\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#auth\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("              <span class=\"menu-icon\">\n");
      out.write("                <i class=\"mdi mdi-security\"></i>\n");
      out.write("              </span>\n");
      out.write("                <span class=\"menu-title\">New account</span>\n");
      out.write("                <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"auth\">\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"/createNewAccountPersonal\"> Personal account </a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"/CreateNewAccountEnterprise\"> Enterprise account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <!-- partial -->\n");
      out.write("    <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("        <!-- partial:partials/_navbar.jsp -->\n");
      out.write("        <nav class=\"navbar p-0 fixed-top d-flex flex-row\">\n");
      out.write("            <div class=\"navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center\">\n");
      out.write("                <a class=\"navbar-brand brand-logo-mini\" href=\"/\">\n");
      out.write("                    <h2 class=\" text-white\">AK</h2>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-menu-wrapper flex-grow d-flex align-items-stretch\">\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("                    <span class=\"mdi mdi-menu\"></span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\"\n");
      out.write("                        data-toggle=\"offcanvas\">\n");
      out.write("                    <span class=\"mdi mdi-format-line-spacing\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- partial -->\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 grid-margin\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5>Total</h5>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                        <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                            <h2 class=\"mb-0\"></h2>\n");
      out.write("                                            <p class=\"text-success ml-2 mb-0 font-weight-medium\">+3.5%</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"text-muted font-weight-normal\">comes from personnal accounts</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                        <i class=\"icon-lg mdi mdi-codepen text-primary ml-auto\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 grid-margin\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5>Total enterprise accounts</h5>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                        <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                            <h2 class=\"mb-0\"></h2>\n");
      out.write("                                            <p class=\"text-success ml-2 mb-0 font-weight-medium\">+8.3%</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"text-muted font-weight-normal\"> 9.61% Since last month</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                        <i class=\"icon-lg mdi mdi-wallet-travel text-danger ml-auto\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 grid-margin\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5>Total personnal accounts</h5>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                        <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                            <h2 class=\"mb-0\"></h2>\n");
      out.write("                                            <p class=\"text-danger ml-2 mb-0 font-weight-medium\">-2.1% </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"text-muted font-weight-normal\">2.27% Since last month</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                        <i class=\"icon-lg mdi mdi-monitor text-success ml-auto\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row \">\n");
      out.write("                    <div class=\"col-12 grid-margin\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Top enterprise accounts</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th> Company Name</th>\n");
      out.write("                                            <th> Sold</th>\n");
      out.write("                                            <th> Created</th>\n");
      out.write("                                            <th> Account NÂ°:</th>\n");
      out.write("                                            <th> CVC</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row \">\n");
      out.write("                    <div class=\"col-12 grid-margin\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Top personal accounts</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th> First Name</th>\n");
      out.write("                                            <th> Last Name</th>\n");
      out.write("                                            <th> Sold</th>\n");
      out.write("                                            <th> Created</th>\n");
      out.write("                                            <th> Account NÂ°:</th>\n");
      out.write("                                            <th> CVC</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Customers by Countries</h4>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <table class=\"table\">\n");
      out.write("                                                <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-us\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>USA</td>\n");
      out.write("                                                    <td class=\"text-right\"> 1500</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 56.35%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-de\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>Germany</td>\n");
      out.write("                                                    <td class=\"text-right\"> 800</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 33.25%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-au\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>Australia</td>\n");
      out.write("                                                    <td class=\"text-right\"> 760</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 15.45%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-gb\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>United Kingdom</td>\n");
      out.write("                                                    <td class=\"text-right\"> 450</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 25.00%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-ro\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>Romania</td>\n");
      out.write("                                                    <td class=\"text-right\"> 620</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 10.25%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <i class=\"flag-icon flag-icon-br\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>Brasil</td>\n");
      out.write("                                                    <td class=\"text-right\"> 230</td>\n");
      out.write("                                                    <td class=\"text-right font-weight-medium\"> 75.00%</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-7\">\n");
      out.write("                                        <div id=\"audience-map\" class=\"vector-map\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- content-wrapper ends -->\n");
      out.write("            <!-- partial:partials/_footer.jsp -->\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("                    <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright Â© bootstrapdash.com 2020</span>\n");
      out.write("                    <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\"> Free <a\n");
      out.write("                            href=\"https://www.bootstrapdash.com/bootstrap-admin-template/\" target=\"_blank\">Bootstrap admin templates</a> from Bootstrapdash.com</span>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- partial -->\n");
      out.write("        </div>\n");
      out.write("        <!-- main-panel ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("</div>\n");
      out.write("<!-- container-scroller -->\n");
      out.write("<!-- plugins:js -->\n");
      out.write("<script src=\"../../assets/vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Plugin js for this page -->\n");
      out.write("<script src=\"../../assets/vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("<script src=\"../../assets/vendors/progressbar.js/progressbar.min.js\"></script>\n");
      out.write("<script src=\"../../assets/vendors/jvectormap/jquery-jvectormap.min.js\"></script>\n");
      out.write("<script src=\"../../assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<script src=\"../../assets/vendors/owl-carousel-2/owl.carousel.min.js\"></script>\n");
      out.write("<!-- End plugin js for this page -->\n");
      out.write("<!-- inject:js -->\n");
      out.write("<script src=\"../../assets/js/off-canvas.js\"></script>\n");
      out.write("<script src=\"../../assets/js/hoverable-collapse.js\"></script>\n");
      out.write("<script src=\"../../assets/js/misc.js\"></script>\n");
      out.write("<script src=\"../../assets/js/settings.js\"></script>\n");
      out.write("<script src=\"../../assets/js/todolist.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Custom js for this page -->\n");
      out.write("<script src=\"../../assets/js/dashboard.js\"></script>\n");
      out.write("<!-- End custom js for this page -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}