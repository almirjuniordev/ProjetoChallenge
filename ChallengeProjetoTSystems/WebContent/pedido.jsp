<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>2D5 | Home</title>
  <!-- Responsivo -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  
  	<%@ include file="layouts/layoutCSS.jsp" %>
  	  <%@include file="layouts/compraCSS.jsp" %> 
  
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
	        Novo Pedido
	        <small>Efetuar novo pedido</small>
	      </h1>
	      <small>Selecione o produto na cor desejada, a quantidade e o endereço de entrega</small>
	      <br />
    	  <ol class="breadcrumb">
	        <li><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>
	        <li class="active">Novo Pedido</li>
	      </ol>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
	   
	    
	    <nav>
		  <div class="container">
		    <ul class="navbar-left">
		    </ul> <!--end navbar-left -->
		
		    <ul class="navbar-right" id="carrinho">
		      <li><a href="#" id="cart"><i class="fa fa-shopping-cart"></i>Carrinho<span class="badge">3</span></a></li>
		    </ul> <!--end navbar-right -->
		  </div> <!--end container -->
		</nav>
		
		<div class="container">
		 <div class="shopping-cart">
		   <div class="shopping-cart-header">
		     <i class="fa fa-shopping-cart cart-icon"></i><span class="badge">3</span>
		     <div class="shopping-cart-total">
		       <span class="lighter-text">Total:</span>
		       <span class="main-color-text">R$93,50</span>
		     </div>
		   </div> <!--end shopping-cart-header -->
		
		   <ul class="shopping-cart-items">
		     <li class="clearfix">
		       <img src="assets/img/Produtos/Branco1.jpg" alt="item1" />
		       <span class="item-name">Camiseta Branca</span>
		       <span class="item-price">R$30,25</span>
		       <span class="item-quantity">Quantidade: 01</span>
		     </li>
		
		     <li class="clearfix">
		       <img src="assets/img/Produtos/Azul1.jpg" alt="item1" />
		       <span class="item-name">Camiseta Azul</span>
		       <span class="item-price">R$43,25</span>
		       <span class="item-quantity">Quantidade: 01</span>
		     </li>
		
		     <li class="clearfix">
		       <img src="assets/img/Produtos/Magenta1.jpg" alt="item1" />
		       <span class="item-name">Camiseta Magenta</span>
		       <span class="item-price">R$20,00</span>
		       <span class="item-quantity">Quantidade: 01</span>
		     </li>
		   </ul>
		
		 </div> <!--end shopping-cart -->
		</div> <!--end container -->
	    <form action="pedidos" method=post>
	        <table>
	        <thead>
	           <tr>
	                <th>Selecione</th>
	                <th>Produto</th>
	                <th>Cor</th>
	                <th>Quantidade</th>
	            </tr>
	        </thead>
	        <tbody>
	            
	              <c:forEach var="produto" items="${listaDeproduto}">
	            	<tr>
	            		<td><input type="checkbox" name="codigo" value="${produto.codigoProduto}"> </td>
						<td>${produto.nomeProduto}</td>
						<td>${produto.descricao}</td>
						<td><input type="number" min="0" name="quantidade" id="${produto.codigoProduto}"></td>
					</tr>
	            </c:forEach>
	            
	        </tbody>
	    </table>
    
	    
	    
	
	    <br />
	    <h3>Endereço de entrega</h3>
	    
		<br />
		<div class="form-group">
		  <input class="form-control" placeholder="Digite o endereço" />
		</div>
		
		<br />
		<!-- Indicates a successful or positive action -->
		<!-- <button type="button" id="finalizar" class="btn btn-success">Finalizar</button> -->
		<input type="submit" value="Enviar" class="btn btn-success">
		</form>
	    
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
	    	 },
		 columnDefs: [ {
	         orderable: false,
	         targets:   0
	     } ],
	     order: [[ 1, 'asc' ]]
	 } );
	</script>
	<script>
	$("#finalizar").click(function() {
		
		var objeto = 
		{ 
				'pedidos[]' : [],
				'quantidade[]' : [] 
		};
		$(":checked").each(function() {
			objeto['pedidos[]'].push($(this).val());
		});
		
		$("input[name='quantidade']").each(function() {
			objeto['quantidade[]'].push($(this).val());
		});
		
		
        $.ajax({
            url:'pedidos',
            type:'POST',
            data:objeto,
            success : function(retorno){
                
                swal("Pedido Recebido!", "N° da Ordem de Venda: "+ retorno.nrpedido +", success")
            }  
          });
		

	});
		
	</script>
	
 
</body>
</html>
