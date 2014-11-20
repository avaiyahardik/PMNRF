<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Add Disaster</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">
        <link href="css/sb-admin-2.css" rel="stylesheet">
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
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
                                        <form role="form" action="Controller" method="get" enctype="multipart/form-data" >
                                            <div class="form-group">
                                                <label>Disaster Name </label>
                                                <input class="form-control" name="disasterName" >
                                                <p class="help-block">Give Appropriate Disaster Name here.</p>
                                            </div>
                                            <div class="form-group">
                                                <label for="disabledSelect">Select Disaster Type</label>
                                                <select id="disabledSelect" class="form-control" name="disasterType" />
                                                    <option>Flood</option>
                                                    <option>Earth Quate</option>
                                                    <option>Riots</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>Enter the City Name</label>
                                                <input class="form-control" placeholder="Enter city name" name="city" />
                                            </div>
                                            <div class="form-group">
                                                <label>Disaster Occurence Date</label>
                                                <input class="form-control" type="date" name="dateOfOccurence" />
                                            </div>
                                            <div class="form-group">
                                                <label for="disabledSelect">Select State</label>
                                                <select id="disabledSelect" class="form-control" name="state" />
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
                                                <input type="file" name="photo1" />
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file" name="photo2" />
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file" name="photo3" />
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file" name="photo4" />
                                            </div>
                                            <div class="form-group">
                                                <label>File input</label>
                                                <input type="file" name="photo5" />
                                            </div>
                                            <div class="form-group">
                                                <label>Add Description Here.</label>
                                                <textarea class="form-control" rows="3" name="description" ></textarea>
                                            </div>
                                            <button type="submit" class="btn btn-default" name="action" value="Save_Disaster" >Save Disaster</button>
                                            <button type="reset" class="btn btn-default" name="action" value="Cancel" >Cancel</button>
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
