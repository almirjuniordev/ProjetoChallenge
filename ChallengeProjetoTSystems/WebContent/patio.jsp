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
	  
	  
	  <!-- Conteudo --> 
	  <div class="content-wrapper">
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        Pátio
	        <small></small>
	      </h1>
  	      <ol class="breadcrumb">
	        <li><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>
	        <li class="active">Pátio</li>
	      </ol>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
	    

			      
	    <div class="row">
	        <div class="col-lg-6">
	        
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Estoque</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	            
	            
	            

	             
	             <div id="estoque" style="height: 300px; width: 100%;"></div>
	            
	            </div>
	            <!-- /.box-body -->
	          </div>
	          <!-- /.box -->
	
     		</div>
		        <!-- /.col -->
		        
            <div class="col-lg-6">
	        
	          <div class="box">
	            <div class="box-header">
	              <h3 class="box-title">Pátio</h3>
	            </div>
	            <!-- /.box-header -->
	            <div class="box-body">
	             
	             <div id="patio" style="height: 300px; width: 100%;"></div>
	            
	            </div>
	            <!-- /.box-body -->
	          </div>
	          <!-- /.box -->
	
     		</div>
		        <!-- /.col -->
      	</div>
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
					fontSize: 24,
					fontFamily: "Source Sans Pro",
					fontWeight: 500,
				},
                animationEnabled: true,
                exportEnabled: true,
                
				legend:{
					verticalAlign: "center",
					horizontalAlign: "left",
/* 					fontSize: 20,
					fontFamily: "Helvetica"  */       
				},
				theme: "theme1",
				data: [
				{        
					type: "pie",       
 					indexLabelFontFamily: "Source Sans Pro",       
					indexLabelFontSize: 15,
					indexLabel: "{label} {y}%",
					startAngle:-20,      
					showInLegend: false,
					
					toolTipContent:"{legendText} {y}%",
					dataPoints: [
						{  y: 58.95, legendText:"Camiseta Magenta", label: "Camiseta Magenta" , color: "#ff0066" },
						{  y: 8.95, legendText:"Camiseta Branca", label: "Camiseta Branca", color: "#E6E8FA" },
						{  y: 32.1, legendText:"Camiseta Azul", label: "Camiseta Azul", color: "#23238E" },
					]
				}
				]
			});
			
			var patio = new CanvasJS.Chart("patio",
					{
				title:{
					text: "Quantidade de Produto no Pátio",
					fontSize: 24,
					fontFamily: "Source Sans Pro",
					fontWeight: 500,
				},
				        animationEnabled: true,
				        exportEnabled: true,
						legend: {
							verticalAlign: "bottom",
							horizontalAlign: "center"
						},
						theme: "theme1",
						data: [
						{        
							type: "pie",       
		 					indexLabelFontFamily: "Source Sans Pro",       
							indexLabelFontSize: 15,
							indexLabelFontColor: "MistyRose",       
							indexLabelLineColor: "darkgrey", 
							indexLabelPlacement: "inside", 
							fontFamily: "Source Sans Pro",
							showInLegend: true,
							toolTipContent: "{name}: {y}hrs",
							indexLabel: "#percent%", 
							dataPoints: [
								{  y: 71.4, name: "Espaço Não Utilizado", legendMarkerType: "triangle"},
								{  y: 28.6, name: "Espaço Utilizado", legendMarkerType: "square"},
								/* {  y: 12, name: "Time Spent Out", legendMarkerType: "circle"} */
							]
						}
						]
					});
			
			
			
			estoque.render();
			patio.render();
		}
	</script>
	<script type="text/javascript" src="assets/plugins/canvasjs/canvasjs.min.js"></script> 
</body>
</html>
