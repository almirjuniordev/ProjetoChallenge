<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>2D5 | Home</title>
  <!-- Responsivo -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  
  <%@ include file="layouts/layoutCSS.jsp" %>
  
  <!-- jQuery 2.2.3 -->
<script src="assets/plugins/jQuery/jquery-3.2.1.min.js"></script>
  
</head>
<body class="hold-transition skin-purple sidebar-mini">

	<script src="assets/js/layout.js"></script>
	<div class="wrapper">
	
	  
	  <%@ include file="compartilhado/cabecalho.jsp" %>
	  
	  
  	  <%@ include file="compartilhado/menu.jsp" %>
	  
	  
	  <!-- Conteudo -->
	  <div class="content-wrapper">
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        Descrição de Produtos
	        <small></small>
	      </h1>
	      </section>
	
	    <!-- Main content -->
	    <section class="content">
	    
      		    <div class="row">
	        <div class="col-xs-12">
		          <div class="box">
		            <div class="box-header">
		              <h4 class="box-title">Camiseta Magenta</h4>
		              
		              <div>
		              <img src="assets/img/Produtos/Magenta1.jpg" align="left" height="40%" width="40%">
		              <img src="assets/img/Produtos/Magenta2.jpg" align="middle" height="40%" width="40%">
		              
		              </div>
		            </div>

		          </div>
		          <!-- /.box -->
		
		     	</div>
	        <!-- /.col -->
      	</div>

	    <span class="input-group-btn">
	    <button type="button" class="btn btn-info" id="ant1">Anterior </button>
	    </span>

	    <span class="input-group-btn">
	    <button type="button" class="btn btn-info" id="prox3">Próximo </button>
	    </span>
	    
	    </section>
	    
	    <!-- /.content -->
	  </div>
	  <!-- /.Conteudo -->
	  
	  
	  
	  <%@ include file="compartilhado/rodape.jsp" %>
	  
	  
	  <%@ include file="compartilhado/temas.jsp" %>
	</div>
	<!-- ./wrapper -->
	
	<%@ include file="layouts/layoutJS.jsp" %>
	
	<script>
	$("#ant1").click(function() {
		window.location.href = "produto1.jsp"
	});
	
	$("#prox3").click(function() {
		window.location.href = "produto3.jsp"
	});
	
		
	</script>
	
  	<script>
  	
	 $('table').DataTable({
	      'paging'      : true,
	      'lengthChange': false,
	      'searching'   : false,
	      'ordering'    : true,
	      'info'        : true,
	      'autoWidth'   : false,

	      "oLanguage": {
	    	    "sProcessing": "Aguarde enquanto os dados são carregados ...",
	    	    "sLengthMenu": "Mostrar _MENU_ registros por pagina",
	    	    "sZeroRecords": "Nenhum registro correspondente ao criterio encontrado",
	    	    "sInfoEmtpy": "Exibindo 0 a 0 de 0 registros",
	    	    "sInfo": "Exibindo de _START_ a _END_ de _TOTAL_ registros",
	    	    "sInfoFiltered": "",
	    	    "sSearch": "Procurar",
	    	    "oPaginate": {
	    	       "sFirst":    "Primeiro",
	    	       "sPrevious": "Anterior",
	    	       "sNext":     "Próximo",
	    	       "sLast":     "Último"
	    	    }
	    	 }   
	    })
	</script>
	  
</body>
</html>