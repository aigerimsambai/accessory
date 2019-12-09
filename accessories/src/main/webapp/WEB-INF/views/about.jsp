<div class="container">

	<div class="row">

		<div class="jumbotron" style="margin-top: 15px;">
			<h1>About Our Service</h1>
			<h5>Located in Almaty. Al-Farabi 85a</h5>
			<h5>Phone number : + 7 727 153 22 33 </h5>
			<h5>Email : accessories@gmail.com</h5>
		</div>
	
	</div>

	<div class='row'>
		<div class='col-md-4'>

			<div class='circle'>
				<img th:src="@{/images/t1.jpg}" class='image-rounded' alt='...' width='250px' height='250px'>
				<div class='caption'>
					<h3 style='color: #28a745;'>Smartphone 2019</h3>

					<div id='panel1'>
						<p>Samsung Galaxy Note 10</p>
					</div>
				</div>
			</div>


		</div>
		<div class='col-md-8'>
			<div class='embed-responsive embed-responsive-16by9'>
				<iframe width="560" height="315" src="https://www.youtube.com/embed/vSWmTnQ1akI" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</div>



		</div>
	</div>

</div>
<footer id="myFooter" style="background-color: #22244f; color: #fff; border-radius: 8px; padding-top: 10px; margin-top: 20px;">
	<div class="container" >
		<div class="row">
			<div class="col-sm-3">
				<br>
				<!--<h2 class="logo"><a href="#"> LOGO </a></h2>-->
				<img class="img-rounded" src="image/icon.png"  style="padding-left: 40px; ">
			</div>
			<div class="col-sm-2">
				<h5>Get started</h5>
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">Sign up</a></li>
					<li><a href="#">Downloads</a></li>
				</ul>
			</div>
			<div class="col-sm-2">
				<h5>About us</h5>
				<ul>
					<li><a href="#">Company Information</a></li>
					<li><a href="#">Contact us</a></li>
					<li><a href="#">Reviews</a></li>
				</ul>
			</div>
			<div class="col-sm-2">
				<h5>Support</h5>
				<ul>
					<li><a href="#">FAQ</a></li>
					<li><a href="#">Help desk</a></li>
					<li><a href="#">Forums</a></li>
				</ul>
			</div>
			<div class="col-sm-3">
				<div class="social-networks">
					<a href="#" class="twitter"><i class="fa fa-twitter" style=""></i></a>
					<a href="#" class="facebook"><i class="fa fa-facebook" style="padding-left: 15px;"></i></a>
					<a href="#" class="google"><i class="fa fa-google-plus" style="padding-left: 15px;"></i></a>
				</div>
				<button type="button" class="btn btn-default" style="color:#DE423A; margin-top: 50px;" > <a href="contact.html" >Contact us</a>

				</button>
				<a href="#" class=" scrollToTop " ><img class="img-rounded" th:src="@{/images/aa.png}" style="float: right;"> </a>
				<script>
					$(document).ready(function(){

						//Check to see if the window is top if not then display button
						$(window).scroll(function(){
							if ($(this).scrollTop() > 100) {
								$('.scrollToTop').fadeIn();
							} else {
								$('.scrollToTop').fadeOut();
							}
						});

						//Click event to scroll to top
						$('.scrollToTop').click(function(){
							$('html, body').animate({scrollTop : 0},800);
							return false;
						});

					});</script>
			</div>
		</div>
	</div>
	<br>
</footer>