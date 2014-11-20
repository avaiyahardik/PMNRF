<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Bootstrap Admin Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <%@include  file="header.jsp" %>
            <%@include  file="leftMaster.jsp" %>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">PMNRF-India</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Add New Disaster
                            </div>
                            <div class="panel-body">
                                <div class="row" style="margin-left: 50px;" >
                                    <div class="col-lg-6">
                                        <form role="form" action="Controller" method="get">
                                            <div class="form-group">
                                                <label>Disaster Name </label>
                                                <input class="form-control">
                                                <p class="help-block">Give Appropriate Disaster Name here.</p>
                                            </div>
                                            <div class="form-group">
                                                <label for="disabledSelect">Select Disaster Type</label>
                                                <select id="disabledSelect" class="form-control">
                                                    <option>Flood</option>
                                                    <option>Earth Quate</option>
                                                    <option>Riots</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>Enter the City Name</label>
                                                <input class="form-control" placeholder="Enter city name">
                                            </div>
                                            <div class="form-group">
                                                <label for="disabledSelect">Select State</label>
                                                <select id="disabledSelect" class="form-control">
                                                    <option>Gujarat</option>
                                                    <option>MP</option>
                                                    <option>UP</option>
                                                    <option>Punjab</option>
                                                    <option>Delhi</option>
                                                    <option>Rajasthan</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>Add Photos here (Max. 5 Photos)</label>
                                            </div>


                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <!--Videos 

                                            <div class="form-group">
                                                <label>Add Videos here (Max. 5 Videos)</label>
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file">
                                            </div>
                                            <!-- Video end -->

                                            <div class="form-group">
                                                <label>Add Description Here.</label>
                                                <textarea class="form-control" rows="3"></textarea>
                                            </div>
                                            <button type="submit" class="btn btn-default" name="add_disaster">Save Disaster</button>
                                            <button type="reset" class="btn btn-default" name="cancel_add_disaster">Cancel</button>
                                        </form>
                                    </div>
                                </div>
                                <!-- /.row (nested) -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="js/plugins/metisMenu/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="js/sb-admin-2.js"></script>

    </body>

</html>
