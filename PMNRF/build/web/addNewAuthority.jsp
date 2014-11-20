<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>New Authority</title>
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
                                Create Authority Account
                            </div>
                            <div class="panel-body">
                                <div class="row" style="margin-left: 30px;" >
                                    <div class="col-lg-6">
                                        <form role="form" action="Controller" method="get">
                                            <div class="form-group">
                                                <label> Username </label>
                                                <input class="form-control" name="username">
                                                <p class="help-block">Give authority username.</p>
                                            </div>
                                            <div class="form-group">
                                                <label for="disabledSelect">Select Authority Type</label>
                                                <select id="disabledSelect" class="form-control" name="authorityType" >
                                                    <option>State Agency</option>
                                                    <option>Central Agency</option>
                                                    <option>NGO</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>Enter Email ID</label>
                                                <input class="form-control" placeholder="Enter Email ID" name="email" />
                                            </div>
                                            <div class="form-group">
                                                <label>Password</label>
                                                <input class="form-control" placeholder="Password" type="password" name="password" />
                                            </div>
                                            <div class="form-group">
                                                <label>Confirm Password</label>
                                                <input class="form-control" placeholder="Confirm Password" type="password" name="confirmPassword" />
                                            </div>
                                            <div class="form-group">
                                                <label>City</label>
                                                <input class="form-control" placeholder="City Name" name="city" />
                                            </div>
                                            <div class="form-group">
                                                <label>Pincode</label>
                                                <input class="form-control" placeholder="6 Digit Pincode" name="pincode" />
                                            </div>
                                            <div class="form-group">
                                                <label> State </label>
                                                <input class="form-control" placeholder="State Name" name="state" />
                                            </div>
                                            <div class="form-group">
                                                <label>Address</label>
                                                <textarea class="form-control" rows="3" name="address" ></textarea>
                                            </div>
                                            <button type="submit" class="btn btn-default" name="action" value="add_authority">Save Authority</button>
                                            <button type="reset" class="btn btn-default" name="action" value="cancel_add_authority">Cancel</button>
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
