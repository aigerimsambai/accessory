$("document").ready(function(){
	
	    $("#fixbut").click(function(){
		        $(window).scrollTop(0);
	    });
		$(window).width(function(){
			    var x = window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth;
				if(x >1198){
					$("#click").css({
						"margin" :"670px auto 15px"
					});
				}
				else if(x > 991){
					$("#click").css({
						"margin" :"560px auto 15px"
					});
				}
				else if(x > 760){
					$("#click").css({
						"margin" :"440px auto 15px"
					});
				}
				else if(x > 660){
					$("#click").css({
						"margin" :"385px auto 15px"
					});
				}
				else if(x > 560){
					$("#click").css({
						"margin" :"330px auto 15px"
					});
				}
				else if(x > 360){
					$("#click").css({
						"margin" :"270px auto 15px"
					});
				}
				else {
					$("#click").css({
						"margin" :"210px auto 15px"
					});
				}
		});
		
		$(window).scroll(function() { 
			    var y = $(window).scrollTop();
			    if (y > 10) {
					$('nav').addClass('navbar-fixed-top') ;
					$("nav").css({
						"width":"84.5%",
				"margin-left": " auto",
				"margin-right":"auto",
				"border-style":"1px solid black",
				"border-radius":"5px"
					});
 

				        // $("header").css({
								// "position": "fixed"
					    // });
				        $("#fixbut").css({
					            "display":"inline"
				        });	
				        $("#slides").css({"margin-top":"10px",
								"display":"block",
								"width":"100%"
						});
			    }else{ $('nav').removeClass('navbar-fixed-top'); 
 $("nav").css({
						"width":"100%",
				"margin-left": " auto",
				"margin-right":"auto",
				"border-style":"1px solid black",
				"border-radius":"5px"
					});
				        // $("header").css({
								// "position": "relative"
								// });
				        $("#fixbut").css({
					            "display":"none"
				        });	
				        $("#slides").css({"margin-top":"10px",
								"display":"block",
								"width":"100%"});

				}
		});

});