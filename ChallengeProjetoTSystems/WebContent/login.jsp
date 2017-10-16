<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>2D5 | Home</title>
    <!-- Responsivo -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  
  <%@include file="layouts/estiloCSS.jsp" %>
  
  <!-- jQuery 2.2.3 -->
<script src="assets/plugins/jQuery/jquery-3.2.1.min.js"></script>
  
</head>
<body class="hold-transition skin-purple sidebar-mini">

	<script src="assets/js/layout.js"></script>
	<div class="wrapper">
	  	  
  	  <!-- Conteudo -->
  	  
  	  <body>
  <div class="form">    
          
          <form action="/" method="post">
          
            <div class="field-wrap">
            <label>
              Email<span class="req">*</span>
            </label>
            <input type="email" required/>
          </div>
          
          <div class="field-wrap">
            <label>
              Senha<span class="req">*</span>
            </label>
            <input type="password" required/>
          </div>
          
          <p class="forgot"><a href="#">Esqueceu a Senha?</a></p>
          
        <span class="input-group-btn">
	    <button type="submit" class="button button-block" id="entrar">Log In</button>
	    </span>
          
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="js/index.js"></script>

	<script>
	$("#entrar1").click(function() {
		window.location.href = "index.jsp"
	});
		
	</script>


</body>
</html>  
	  <%@ include file="compartilhado/temas.jsp" %>
	  </div>
	<!-- ./wrapper -->
	
	<%@ include file="layouts/layoutJS.jsp" %>
	<script>
	$('.form').find('input, textarea').on('keyup blur focus', function (e) {
		  
		  var $this = $(this),
		      label = $this.prev('label');

			  if (e.type === 'keyup') {
					if ($this.val() === '') {
		          label.removeClass('active highlight');
		        } else {
		          label.addClass('active highlight');
		        }
		    } else if (e.type === 'blur') {
		    	if( $this.val() === '' ) {
		    		label.removeClass('active highlight'); 
					} else {
				    label.removeClass('highlight');   
					}   
		    } else if (e.type === 'focus') {
		      
		      if( $this.val() === '' ) {
		    		label.removeClass('highlight'); 
					} 
		      else if( $this.val() !== '' ) {
				    label.addClass('highlight');
					}
		    }

		});

		$('.tab a').on('click', function (e) {
		  
		  e.preventDefault();
		  
		  $(this).parent().addClass('active');
		  $(this).parent().siblings().removeClass('active');
		  
		  target = $(this).attr('href');

		  $('.tab-content > div').not(target).hide();
		  
		  $(target).fadeIn(600);
		  
		});
	</script>
