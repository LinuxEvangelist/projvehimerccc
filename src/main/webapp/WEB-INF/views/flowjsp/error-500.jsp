<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<title>500 Error Page - Ace Admin</title>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->

		<!-- #section:pages/error -->
		<div class="error-container">
			<div class="well">
				<h1 class="grey lighter smaller">
					<span class="blue bigger-125">
						<i class="ace-icon fa fa-random"></i>
						500
					</span>
					Something Went Wrong
				</h1>

				<hr />
				<h3 class="lighter smaller">
					But we are working
					<i class="ace-icon fa fa-wrench icon-animated-wrench bigger-125"></i>
					on it!
				</h3>

				<div class="space"></div>

				<div>
					<h4 class="lighter smaller">Meanwhile, try one of the following:</h4>

					<ul class="list-unstyled spaced inline bigger-110 margin-15">
						<li>
							<i class="ace-icon fa fa-hand-o-right blue"></i>
							Read the faq
						</li>

						<li>
							<i class="ace-icon fa fa-hand-o-right blue"></i>
							Give us more info on how this specific error occurred!
						</li>
					</ul>
				</div>

				<hr />
				<div class="space"></div>

				<div class="center">
					<a href="javascript:history.back()" class="btn btn-grey">
						<i class="ace-icon fa fa-arrow-left"></i>
						Go Back
					</a>

					<a data-url="page/index" href="#page/index" class="btn btn-primary">
						<i class="ace-icon fa fa-tachometer"></i>
						Dashboard
					</a>
				</div>
			</div>
		</div>

		<!-- /section:pages/error -->

		<!-- PAGE CONTENT ENDS -->
	</div><!-- /.col -->
</div><!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [null, null]
	$('.page-content-area').ace_ajax('loadScripts', scripts, function() {
	  //inline scripts related to this page
	});
</script>
