$(document).ready(
		function() {

			// GET REQUEST
			$("#retrieveEmployees").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "getEmployees",
					success : function(result) {
						if (result.status == "success") {
							$('#getResultDiv ul').empty();
						
							$.each(result.data,
									function(i, employee) {
										var user = "employee Name  "
												+ employee.firstName
												+ ", employee  = " + employee.lastName
												+ "<br>";
										$('#getResultDiv .list-group').append(
												user)
									});
							console.log("Success: ", result);
						} 
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		});