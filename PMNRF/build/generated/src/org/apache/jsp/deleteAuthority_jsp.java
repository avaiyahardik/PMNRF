package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteAuthority_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/leftMaster.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title><!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"><!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\"><!-- Timeline CSS -->\n");
      out.write("        <link href=\"css/plugins/timeline.css\" rel=\"stylesheet\"><!-- Custom CSS -->\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\"><!-- Morris Charts CSS -->\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\"><!-- Custom Fonts -->\n");
      out.write("        <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris-data.js\"></script>\n");
      out.write("        <script src=\"js/sb-admin-2.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">SB Admin v2.0</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-envelope fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>Read All Messages</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-messages -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-tasks fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 1</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">40% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                                <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 2</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">20% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                                <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 3</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">60% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                                <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 4</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">80% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                                <span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>See All Tasks</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-tasks -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-bell fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-comment fa-fw\"></i> New Comment\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\n");
      out.write("                                        <span class=\"pull-right text-muted small\">12 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-tasks fa-fw\"></i> New Task\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>See All Alerts</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-alerts -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-user -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title><!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"><!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\"><!-- Timeline CSS -->\n");
      out.write("        <link href=\"css/plugins/timeline.css\" rel=\"stylesheet\"><!-- Custom CSS -->\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\"><!-- Morris Charts CSS -->\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\"><!-- Custom Fonts -->\n");
      out.write("        <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris-data.js\"></script>\n");
      out.write("        <script src=\"js/sb-admin-2.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("                <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                        <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                            <li class=\"sidebar-search\">\n");
      out.write("                                <div class=\"input-group custom-search-form\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-default\" type=\"button\">\n");
      out.write("                                            <i class=\"fa fa-search\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /input-group -->\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"active\" href=\"index.html\"><i class=\"fa fa-dashboard fa-fw\"></i> Dashboard</a>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"addDisaster.jsp\"><i class=\"fa fa-edit fa-fw\"></i> New Disaster</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"deleteDisaster.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Delete Disaster</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <!--<a href=\"forms.html\"><i class=\"fa fa-edit fa-fw\"></i>Disaster Management Authority</a>-->\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-edit fa-fw\"></i>Disaster Mngt Authority<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-second-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"panels-wells.html\">Add Authority</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"buttons.html\">Delete Authority</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <!-- /.nav-second-level -->\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-table fa-fw\"></i>Certificates<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-second-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"panels-wells.html\">Silver</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"buttons.html\">Gold</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"notifications.html\">Platinum</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <!-- /.nav-second-level -->\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-files-o fa-fw\"></i> Relief Reports<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-second-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"blank.html\">Blank Page</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"login.html\">Login Page</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <!-- /.nav-second-level -->\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Charts<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-second-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"flot.html\">Flot Charts</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"morris.html\">Morris.js Charts</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <!-- /.nav-second-level -->\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"tables.html\"><i class=\"fa fa-table fa-fw\"></i> Tables</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.sidebar-collapse -->\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">PMNRF-India</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Delete Disaster Management Authority\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <form role=\"form\" action=\"Controller\" method=\"get\">\n");
      out.write("                                            <div class=\"form-group\" style=\"margin-top: 30px;\" >\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\" style=\"margin-top: 30px;\">\n");
      out.write("                                                <label for=\"disabledSelect\">Select Authority </label>\n");
      out.write("                                                <select id=\"disabledSelect\" class=\"form-control\">\n");
      out.write("                                                    <option>Agency - I</option>\n");
      out.write("                                                    <option>Agency - II</option>\n");
      out.write("                                                    <option>Agency - III</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"margin-top: 30px;\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\" name=\"add_disaster\">Delete Disaster</button>\n");
      out.write("                                                <button type=\"reset\" class=\"btn btn-default\" name=\"cancel_add_disaster\">Cancel</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.row (nested) -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("        <script src=\"js/plugins/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
