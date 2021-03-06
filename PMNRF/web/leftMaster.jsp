<%-- 
    Document   : leftMaster
    Created on : Nov 20, 2014, 2:28:28 PM
    Author     : Shidhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>PMNRF-India</title><!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet"><!-- MetisMenu CSS -->
        <link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet"><!-- Timeline CSS -->
        <link href="css/plugins/timeline.css" rel="stylesheet"><!-- Custom CSS -->
        <link href="css/sb-admin-2.css" rel="stylesheet"><!-- Morris Charts CSS -->
        <link href="css/plugins/morris.css" rel="stylesheet"><!-- Custom Fonts -->
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/plugins/metisMenu/metisMenu.min.js"></script>
        <script src="js/plugins/morris/raphael.min.js"></script>
        <script src="js/plugins/morris/morris.min.js"></script>
        <script src="js/plugins/morris/morris-data.js"></script>
        <script src="js/sb-admin-2.js"></script>
    </head>
    <body>
        <div id="wrapper">
                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                                <!-- /input-group -->
                            </li>
                            <li>
                                <a class="active" href="index.jsp">
                                    <i class="fa fa-dashboard fa-fw"></i> 
                                    
                                </a>
                            </li>
                            
                            <li>
                                <a href="addDisaster.jsp"><i class="fa fa-edit fa-fw"></i> New Disaster</a>
                            </li>
                            <li>
                                <a href="deleteDisaster.jsp"><i class="fa fa-edit fa-fw"></i> Delete Disaster</a>
                            </li>
                            <li>
                                <!--<a href="forms.html"><i class="fa fa-edit fa-fw"></i>Disaster Management Authority</a>-->
                                <a href="#"><i class="fa fa-edit fa-fw"></i>Disaster Mngt Authority<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="addNewAuthority.jsp">Add Authority</a>
                                    </li>
                                    <li>
                                        <a href="Controller?action=loadAuthority">Delete Authority</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            
                            <li>
                                <a href="#"><i class="fa fa-table fa-fw"></i>Certificates<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#">Silver</a>
                                    </li>
                                    <li>
                                        <a href="#">Gold</a>
                                    </li>
                                    <li>
                                        <a href="#">Platinum</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            
                            <li>
                                <a href="#"><i class="fa fa-files-o fa-fw"></i> Relief Reports<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="blank.html">Blank Page</a>
                                    </li>
                                    <li>
                                        <a href="login.jsp">Login Page</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="flot.html">Flot Charts</a>
                                    </li>
                                    <li>
                                        <a href="morris.html">Morris.js Charts</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="DonationTable.jsp"><i class="fa fa-table fa-fw"></i> Tables</a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
            </nav>
        </div>
    </body>
</html>
