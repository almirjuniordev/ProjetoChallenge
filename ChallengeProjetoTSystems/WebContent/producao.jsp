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
	        Produção
	        <small>Itens necessários para produção</small>
	      </h1>
	      <ol class="breadcrumb">
	        <li><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>
	        <li class="active">Produção</li>
	      </ol>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
	    
	    <div class="row">
	        <div class="col-xs-12">
		          <div class="box">
		            <div class="box-header">
		              <h3 class="box-title">Camiseta Magenta</h3>
		            </div>
		            <!-- /.box-header -->
		            <div class="box-body">
		            
		            <div class="box-body">
		              <table class="table table-bordered table-hover">
		                <thead>
		                <tr>
		                  <th>Matéria-Prima</th>
		                  <th>Quantidade</th>
		                  <th>Cor</th>
		
		                </tr>
		                </thead>
		                <tbody>
		                	<c:forEach var="n" items="${producaoMagenta}"></c:forEach>
		                </tbody>
		              </table>
		            </div>
					</div>
		            <!-- /.box-body -->
		          </div>
		          <!-- /.box -->
		
		     	</div>
	        <!-- /.col -->
      	</div>
      	
      	
      	 <div class="row">
	        <div class="col-xs-12">
		          <div class="box">
		            <div class="box-header">
		              <h3 class="box-title">Camiseta Azul</h3>
		            </div>
		            <!-- /.box-header -->
		            <div class="box-body">
		            
		            <div class="box-body">
		              <table class="table table-bordered table-hover">
		                <thead>
		                <tr>
		                  <th>Matéria-Prima</th>
		                  <th>Quantidade</th>
		                  <th>Cor</th>
		
		                </tr>
		                </thead>
		                <tbody>
		                	<c:forEach var="n" items="${producaoAzul}"></c:forEach>
		                </tbody>
		              </table>
		            </div>
					</div>
		            <!-- /.box-body -->
		          </div>
		          <!-- /.box -->
		
		     	</div>
	        <!-- /.col -->
      	</div>
      	
      	
      	      	 <div class="row">
	        <div class="col-xs-12">
		          <div class="box">
		            <div class="box-header">
		              <h3 class="box-title">Camiseta Branca</h3>
		            </div>
		            <!-- /.box-header -->
		            <div class="box-body">
		            
		            <div class="box-body">
		              <table class="table table-bordered table-hover">
		                <thead>
		                <tr>
		                  <th>Matéria-Prima</th>
		                  <th>Quantidade</th>
		                  <th>Cor</th>
		
		                </tr>
		                </thead>
		                <tbody>
		                	<c:forEach var="n" items="${producaoBranca}"></c:forEach>
		                </tbody>
		              </table>
		            </div>
					</div>
		            <!-- /.box-body -->
		          </div>
		          <!-- /.box -->
		
		     	</div>
	        <!-- /.col -->
      	</div>
      	
      	
      	<span class="input-group-btn">

		    <button type="submit" class="btn btn-success">Gerar Relatorio</button>
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
