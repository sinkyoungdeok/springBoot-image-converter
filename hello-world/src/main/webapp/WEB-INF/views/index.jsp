<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<meta charset="utf-8" />
	<title>CMAF Streaming</title>
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />

	<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
    <link href="resources/assets/css/facebook/app.min.css" rel="stylesheet" />
	<link href="https://unpkg.com/video.js/dist/video-js.css" rel="stylesheet">
	<!-- ================== END BASE CSS STYLE ================== -->

	<!-- ================== BEGIN PAGE LEVEL STYLE ================== -->
	<link href="resources/assets/plugins/jvectormap-next/jquery-jvectormap.css" rel="stylesheet" />
	<link href="resources/assets/plugins/bootstrap-datepicker/dist/css/bootstrap-datepicker.css" rel="stylesheet" />
	<link href="resources/assets/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" />
	<link href="https://unpkg.com/video.js/dist/video-js.css" rel="stylesheet">
	<!-- ================== END PAGE LEVEL STYLE ================== -->
</head>
<body>
    <!-- begin #page-container -->
    <div id="page-container" class="fade page-sidebar-fixed page-header-fixed">
		<!-- begin #header -->
		<div id="header" class="header navbar-inverse">
			<!-- begin navbar-header -->
			<div class="navbar-header">
				<a href="index.php" class="navbar-brand"> <b>ATLAS</b> DIMS <small>live</small></a>
				<button type="button" class="navbar-toggle" data-click="sidebar-toggled">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<!-- end navbar-header -->

		</div>
		<!-- end #header -->
		<!-- begin #sidebar -->
		<div id="sidebar" class="sidebar">
			<!-- begin sidebar scrollbar -->
			<div data-scrollbar="true" data-height="100%">
				<!-- begin sidebar user -->
				<ul class="nav">
					<li class="nav-profile">
						<a href="javascript:;" data-toggle="nav-profile">
							<div class="image w-75">
								<img src="./img/sk2.png" alt="" />
							</div>
							<div class="info">
							 DIMS
                             <small> (Dynamic Image Management System) </small>
							</div>
						</a>
					</li>
				</ul>
				<!-- end sidebar user -->
				<!-- begin sidebar nav -->
				<ul class="nav">
					<li class="nav-header">Navigation</li>
					<li class="active">
						<a href="index.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>About</span>
							
						</a>
					</li>
					<li class="has-sub">
						<a href="preview.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Preview</span>
						</a>
					</li>
					<li class="has-sub">
						<a href="resize.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Resize </span>
						</a>
					</li>
					<li class="has-sub">
						<a href="crop.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Crop </span>
						</a>
					</li>
					<li class="has-sub">
						<a href="composite.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Composite </span>
						</a>
					</li>
					<li class="has-sub">
						<a href="thumbnail.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Thumbnail</span>
						</a>
					</li>
					<li class="has-sub">
						<a href="imageFormatConversion.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Image Format Conversion </span>
						</a>
					</li>
					<li class="has-sub">
						<a href="imageQuality.do" data-toggle="ajax">
							<i class="fab fa-simplybuilt"></i>
							<b class="caret"></b>
							<span>Image Quality </span>
						</a>
					</li>
				</ul>
				<!-- end sidebar nav -->

			</div>
			<!-- end sidebar scrollbar -->
		</div>
		<div class="sidebar-bg"></div>
		<!-- end #sidebar -->
    
name : ${name}
<!-- ================== BEGIN BASE JS ================== -->
<script src="resources/assets/js/app.min.js"></script>
<script src="resources/assets/js/theme/facebook.min.js"></script>
<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<script src="resources/assets/plugins/jquery-sparkline/jquery.sparkline.min.js"></script>
<!--	<script src="resources/assets/js/demo/dashboard.js"></script> -->
 <script src="https://unpkg.com/video.js/dist/video.js"></script>
 <script src="https://unpkg.com/videojs-flash/dist/videojs-flash.js"></script>
 <script src="https://unpkg.com/videojs-contrib-hls/dist/videojs-contrib-hls.js"></script>
<!-- ================== END PAGE LEVEL JS ================== -->
</body>
</html>