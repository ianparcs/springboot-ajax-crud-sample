$(document).ready(
		function() {
			
			$("#employeeForm").submit(function(event) {
				event.preventDefault();
				addEmployee();
			});

			function addEmployee() {

				var employeeData = {
						firstName : $("#firstName").val(),
						lastName : $("#lastName").val(),
						birthDate : $("#birthDate").val(),
						jobPosition : $("#jobPosition").val(),
						salary : $("#salary").val()
				}

				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "addEmployee",
					data : JSON.stringify(employeeData),
					dataType : 'json',
					success : function(result) {
						console.log(result);
						if (result.status == "success") {
							$("#postResultDiv").html(
									"" + result.data.firstName
											+ "Post Successfully! <br>"
											+ "---> Congrats !!" + "</p>");
					
							var user = "employee Name  "
								+ result.data.firstName
								+ ", employee  = " + result.data.lastName
								+ "<br>";
						
							$('#getResultDiv .list-group').append(
									user)
						} 
					
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})