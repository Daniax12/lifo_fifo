
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   // HttpSession session = request.getSession();
    String getPath = (String) request.getParameter("page");
    if(getPath == null) getPath = "etat_stock";
    String theFile = getPath + ".jsp";
    
%>

<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title Page-->
    <title>Stock option</title>

    <!-- Fontfaces CSS-->
    <link href="assets/css/font-face.css" rel="stylesheet">
    <link href="assets/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet">
    <link href="assets/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet">

    <!-- Bootstrap CSS-->
    <link href="assets/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="assets/vendor/animsition/animsition.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <link href="assets/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet">
    <link href="assets/vendor/select2/select2.min.css" rel="stylesheet">
    <link href="assets/vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet">

    <!-- Main CSS-->
    <link href="assets/css/theme.css" rel="stylesheet">

</head>

    <body class="animsition">
        <!-- ============================================================== -->
        <!-- main wrapper -->
        <!-- ============================================================== -->
        <div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Header -->
            <!-- ============================================================== -->     
            <%@ include file = "header.jsp" %>
            <!-- ============================================================== -->
            <!-- End header -->
            <!-- ============================================================== --> 
                    <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
            <%@ include file = "header_content.jsp" %>

            <!-- MAIN CONTENT-->
            <div class="main-content">
                <%--<%@ include file = "%{getPath}.jsp" %>--%>
                <jsp:include page="<%= theFile %>"/>
                <!-- Header -->
                <!-- ============================================================== -->     
             </div>
            <!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>

    </div>

    <!-- Jquery JS-->
    <script src="assets/vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="assets/vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="assets/vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="assets/vendor/animsition/animsition.min.js"></script>
    <script src="assets/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="assets/vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="assets/vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="assets/vendor/circle-progress/circle-progress.min.js"></script>
    <script src="assets/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="assets/vendor/select2/select2.min.js">
    </script>

    <!-- Main JS-->
    <script src="assets/js/main.js"></script>

</body>

</html>
