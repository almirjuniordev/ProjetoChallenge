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
	        Cadastrar Cliente
	        <small>Cadastro de novo Cliente</small>
	      </h1>
	      <ol class="breadcrumb">
	        <li><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>
	        <li class="active">Clientes</li>
	      </ol>
	    </section>
	    <section class="content">
	    
	  <ul class="nav nav-tabs">
	    <!-- <li class="active"><a data-toggle="tab" href="#pFisica">Funcionario</a></li> -->
	    <li><a data-toggle="tab" href="#pJuridica">Fornecedor</a></li>
	
	  </ul>

	  <div class="tab-content">
	    <div id="pFisica" class="tab-pane fade">
	    <form action="pessoa" method="post">
             <div class="form-group col-lg-5 col-md-5 col-sm-7 col-3">
             		
             		<hr>
                  <label>Nome</label>
                  <input type="text" class="form-control" id="nomePF" name="nomePF" placeholder=""
                  required/>
                  
                  <label>CPF</label>
                  <input type="text" class="form-control" id="cpf" name="cpf" onkeyup="somenteNumeros(this);" placeholder=""required/>
                  
                  <label>E-mail</label>
                  <input type="text" class="form-control" id="emailPF" name="emailPF" placeholder=""
                  required/>
                  
                  <label>Telefone</label>
                  <input type="text" class="form-control" id="telefonePF" name="telefonePF" onkeyup="somenteNumeros(this);"  placeholder=""
                  required/>
                  
                  <label>Endereço</label>
                  <input type="text" class="form-control" id="enderecoPF" name="enderecoPF" placeholder=""
                  required/>
                  <hr>
               	<span class="input-group-btn">
	                <button type="submit" id="cadastrarPF" class="btn btn-primary">Cadastrar
	                </button>
              	</span>
	                  
              </div>
	    </form>
	    </div>
	   
	   
	    <div id="pJuridica" class="tab-pane fade in active">
	              <div class="form-group">
	              
	              	<hr>
	                  <label>CNPJ</label>
	                  <input type="text" class="form-control" id="cnpj" placeholder=""
	                  required/>
	                  
	                  <label>Razão Social</label>
	                  <input type="text" class="form-control" id="razaoSocial" placeholder="">
	                  
	                  
	                  <label>Telefone</label>
	                  <input type="text" class="form-control" id="telefonePJ" placeholder=""
	                  required/>
	                  
	                  <label>Endereço</label>
	                  <input type="text" class="form-control" id="enderecoPJ" placeholder=""
	                  required/>
	                  
	                  <label>E-mail</label>
	                  <input type="text" class="form-control" id="emailPJ" placeholder="">
	                  
          	          <label>Materia-Prima</label>
	                  <input type="text" class="form-control" id="materiaPrimaPJ" placeholder="">
	                  
					  <label>Valor</label>
	                  <input type="text" class="form-control" id="ValorPJ" placeholder="">
	                  
            		  <label>Estimativa(em dias)</label>
	                  <input type="number" class="form-control" id="estimativa" min="0" placeholder="">
	                  
	                  <hr>
	                  
		               	<span class="input-group-btn">
			                <button type="submit" id="cadastrarPJ" class="btn btn-primary">Cadastrar
			                </button>
		              	</span>
	                  
	                </div>
	    </div>
    </div>
	    </section>
	    <!-- /.content -->
	  <!-- /.Conteudo -->
	  
	  

		</div>
	  <%@ include file="compartilhado/rodape.jsp" %>
	  
	  
	  <%@ include file="compartilhado/temas.jsp" %>
	  </div>
	<!-- ./wrapper -->
	
	<%@ include file="layouts/layoutJS.jsp" %>
	
	 <script>
	    function somenteNumeros(num) {
	        var er = /[^0-9.]/;
	        er.lastIndex = 0;
	        var campo = num;
	        if (er.test(campo.value)) {
	          campo.value = "";
	        }
	    }
 	</script>
	
	
<!-- 	<script>
		$("#cadastrar").click(function() {
		swal("Cadastro Realizado com Sucesso! ;)", "ID do Cliente: 987654321", "success")
	});
		
	</script>
	
	<script>
		$("#cadastrar2").click(function() {
		swal("Cadastro Realizado com Sucesso! ;)", "ID do Cliente: 987654321", "success")
	});
		
	</script> -->
	
	
	
	
</body>
</html>
