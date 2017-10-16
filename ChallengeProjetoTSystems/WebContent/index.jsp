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
	<%--   <jsp:include page=""></jsp:include> --%>
	  
	  
  	  <%@ include file="compartilhado/menu.jsp" %>
	  
	  <c:forEach var="n" items="${lista}">
			<tr>
			<td>${n}</td>
			</tr>
	  </c:forEach>
	  <!-- Conteudo -->
	  <div class="content-wrapper">
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        Home
	        <small>Página Inicial</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
	    
	    
			<div class="row">
		        <div class="col-xs-12">
		          <div class="box">
		            <div class="box-header">
		              <h3 class="box-title">Armazém</h3>
		            </div>
		            <!-- /.box-header -->
		            <div class="box-body">
		            
		            
		            <div id="armazem" style="height: 300px; width: 100%;"></div>
		            
		            
		            
		              <!-- <table class="table table-bordered table-hover">
		                <thead>
		                <tr>
		                  <th>Quantidade</th>
		                  <th>Descrição</th>
		                  <th>Cor</th>
		
		                </tr>
		                </thead>
		                <tbody>
		                <tr>
		                  <td>50</td>
		                  <td>Tecido
		                  </td>
		                  <td>Branco</td>
		
		                </tr>
		                <tr>
		                  <td>200</td>
		                  <td>Tecido
		                  </td>
		                  <td>Magenta</td>
		
		                </tr>
		                <tr>
		                  <td>10</td>
		                  <td>Linha
		                  </td>
		                  <td>Azul</td>
		                </tr>
		                </tbody>
		              </table>
		             --></div>
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
		              <h3 class="box-title">Estoque</h3>
		            </div>
		            <!-- /.box-header -->
		            <div class="box-body">
		            
		            
		            
		          <!--     <table class="table table-bordered table-hover">
		                <thead>
		                <tr>
		                  <th>Quantidade</th>
		                  <th>Produto</th>
		                  <th>Cor</th>
		
		                </tr>
		                </thead>
		                <tbody>
		                <tr>
		                  <td>24</td>
		                  <td>Camiseta
		                  </td>
		                  <td>Branco</td>
		
		                </tr>
		                <tr>
		                  <td>1582</td>
		                  <td>Camiseta
		                  </td>
		                  <td>Magenta</td>
		
		                </tr>
		                <tr>
		                  <td>150</td>
		                  <td>Camiseta
		                  </td>
		                  <td>Azul</td>
		                </tr>
		                </tbody>
		              </table>
		             -->
		             
		             <div id="estoque" style="height: 300px; width: 100%;"></div>
		            
		            </div>
		            <!-- /.box-body -->
		          </div>
		          <!-- /.box -->
		
		     	</div>
		        <!-- /.col -->
		      </div>
		      
			    
		<!-- /.row -->
	    
	    
	    
	    
	
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
	
	<script type="text/javascript">
		window.onload = function () {
			var estoque = new CanvasJS.Chart("estoque",
			{
				title:{
					text: "Quantidade de Produto em estoque",
					horizontalAlign: "center",
 					fontSize: 24,
					fontFamily: "Source Sans Pro",
					fontWeight: 500,
				},
                animationEnabled: true,
                
				legend:{
					verticalAlign: "center",
					horizontalAlign: "left",
					fontFamily: "Source Sans Pro",      
				},
				theme: "theme1",
				data: [
				{        
					type: "pie",  
					indexLabel: "{label} {y}%",
					startAngle:-20,      
					showInLegend: false,
					
					toolTipContent:"{legendText} {y}%",
					dataPoints:  [
						{  y: 58.95, legendText:"Camiseta Magenta", label: "Camiseta Magenta" , color: "#ff0066"},
						{  y: 8.95, legendText:"Camiseta Branca", label: "Camiseta Branca", color: "#E6E8FA"},
						{  y: 32.1, legendText:"Camiseta Azul", label: "Camiseta Azul", color: "#23238E"},
							]
				}
				]
			});
			
			var armazem = new CanvasJS.Chart("armazem",
					{
						title:{
							text: "Quantidade no Armazém",
							horizontalAlign: "center",
		 					fontSize: 24,
							fontFamily: "Source Sans Pro",
							fontWeight: 500,
						},     
		                animationEnabled: true,
		                theme: "theme1",
						data: [
						{        
							type: "doughnut",
							startAngle: 60,                          
							toolTipContent: "{legendText}: {y} - <strong>#percentual% </strong>", 					
							showInLegend: false,
							fontFamily: "Source Sans Pro",
							dataPoints: [
								{y: 65899660, indexLabel: "Tecido Magenta #percent%", legendText: "Magenta", color: "#ff0066", fontFamily: "Source Sans Pro" },
								{y: 60929152, indexLabel: "Tecido Branco #percent%", legendText: "Branco", color: "#E6E8FA" },
								{y: 2175850,  indexLabel: "Tecido Azul #percent%", legendText: "Azul", color: "#23238E" }			
							]
						}
						]
					});
			
			
			
			estoque.render();
			armazem.render();
		}
	</script>
	<script type="text/javascript" src="assets/plugins/canvasjs/canvasjs.min.js"></script> 
</body>
</html>
