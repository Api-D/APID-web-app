<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Serein Admin</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet" href="adminResources/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="adminResources/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="adminResources/css/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="adminResources/image/favicon.png" />
</head>

<body>
	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->


		<jsp:include page="header.jsp"></jsp:include>


		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->


			<jsp:include page="menu.jsp"></jsp:include>


			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row grid-margin">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-body">
									<h3 class="card-title">File a feedback</h3>
									<hr><br>
									<form class="cmxform" id="commentForm" method="get" action="#">
										<fieldset>
											<div class="col-lg-4 grid-margin stretch-card">
								              <div class="card">
								                <div class="card-body">								                  
								                  <p class="card-description">Rate us</p>
								                  <select id="example-css" name="rating" autocomplete="off">
								                    <option value="1">1</option>
								                    <option value="2">2</option>
								                    <option value="3">3</option>
								                    <option value="4">4</option>
								                    <option value="5">5</option>
								                  </select>
								                </div>
								              </div>
								            </div>
											<div class="form-group">
												<label for="maxlength-textarea">Comments</label>
												<textarea id="maxlength-textarea" class="form-control"
													maxlength="750" rows="5"
													placeholder="This textarea has a limit of 750 chars."></textarea>
											</div>																				
											<input class="btn btn-primary" type="submit" value="Submit">
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->

				<jsp:include page="footer.jsp"></jsp:include>

				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="adminResources/js/vendor.bundle.base.js"></script>
	<script src="adminResources/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- inject:js -->
	<script src="adminResources/js/off-canvas.js"></script>
	<script src="adminResources/js/hoverable-collapse.js"></script>
	<script src="adminResources/js/template.js"></script>
	<script src="adminResources/js/settings.js"></script>
	<script src="adminResources/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="adminResources/js/form-validation.js"></script>
	<script src="adminResources/js/bt-maxLength.js"></script>
	<script src="adminResources/js/formpickers.js"></script>
  	<script src="adminResources/js/form-addons.js"></script>
  	<script src="adminResources/js/x-editable.js"></script>
  	<script src="adminResources/js/dropify.js"></script>
  	<script src="adminResources/js/dropzone.js"></script>
  	<script src="adminResources/js/jquery-file-upload.js"></script>
  	<script src="adminResources/js/formpickers.js"></script>
  	<script src="adminResources/js/form-repeater.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
