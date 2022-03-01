<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Add API</title>
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
							<div class="card-header"
								style="background: linear-gradient(91deg, #7571f9, transparent);"\>
								<h3 class="m-0 text-white">Add a new API</h3>
							</div>
							<div class="card-body">

								<form class="cmxform" id="commentForm" method="get" action="#">
									<fieldset>
										<div class="form-group">
											<label for="cname">Domain Name</label> <input id="cname"
												class="form-control" name="name" minlength="2" type="text"
												required>
										</div>

										<div class="form-group">
											<label for="cname">API Name</label> <input id="cname"
												class="form-control" name="name" minlength="2" type="text"
												required>
										</div>

										<div class="form-group">
											<label for="cname">API Type</label> <select
												class="form-control " id="exampleFormControlSelect2">
												<option disabled class="nav-item">Select API Type</option>
												<option class="nav-item">REST</option>
												<option class="nav-item">SOAP</option>
											</select>
										</div>



										<div class="form-group">
											<label for="cname">Request Method Type</label> <select
												class="form-control " id="exampleFormControlSelect2">
												<option disabled class="nav-item">Select Request
													Method Type</option>
												<option class="nav-item">GET</option>
												<option class="nav-item">POST</option>
												<option class="nav-item">PUT</option>
												<option class="nav-item">DELETE</option>
												<option class="nav-item">POST</option>
											</select>
										</div>
										
										<div class="form-group">
											<label for="cname">Response Type</label> <select
												class="form-control " id="exampleFormControlSelect2">
												<option disabled class="nav-item">Select Response
													Type</option>
												<option class="nav-item">XML</option>
												<option class="nav-item">JSON</option>
											</select>
										</div>


										<div class="form-group">
											<label for="cname">API Endpoint</label> <input id="cname"
												class="form-control" name="name" minlength="2" type="text"
												required>
										</div>


										<div class="form-group">
											<label for="ccomment">API Description</label>
											<textarea id="ccomment" class="form-control" name="comment"
												required></textarea>
										</div>

									
										

										<div class="form-group">
											<label for="cname">Sample Request</label> <input id="cname"
												class="form-control" name="name" minlength="2" type="text"
												required>
										</div>

										<div class="form-group">
											<label for="cname">Sample Response</label> <input id="cname"
												class="form-control" name="name" minlength="2" type="text"
												required>
										</div>
										<input class="btn btn-primary" type="submit" value="Save">
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
<!-- End custom js for this page-->
</body>

</html>
