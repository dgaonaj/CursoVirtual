<% 
HttpSession sesion = request.getSession();
if(sesion.getAttribute("administrador") != null){
%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Inscribirse al curso</title>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
	           <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
	<div class="row">
            
			<div class="col-md-12" align="center">                                 
			    <legend style="font-size: 25px; ">INGRESAR CONTENIDO AL CURSO</legend>
                                    <div align="left">
                                        <a href="dashboard_admin.jsp"><button class="btn btn-success"><span class="glyphicon glyphicon-share-alt"></span>Dashboard</button></a>
                                    </div>
				<div class="col-md-6" style="margin-top: 10px;">
					 <div class="panel panel-success" align="center">
                                            <div class="panel-heading">Cursos Creados</div>
                                            <div class="panel-body">Panel Content</div>
                                         </div>
				</div>
				<div class="col-md-6">
                                   
					<div>
						<img src="img/ingresar.jpg" alt="">
					</div>
					<div>
                                        	<form action="">
                                                       <label for="sel2">Selecciona el curso al cual ingresar contenidos:</label>
                                                             <select class="form-control" id="sel2" name="idCurso">
                                                                        <option value="">.....</option>
                                                                        <option value="">......</option>
                                                             </select>       
                                                        <div class="form-group">
                                                                <label>Ingresa el ID del Contenido:</label>
                                                                <input type="text" class="form-control" name="idContenido" placeholder="Ingresa el id del Contenido a crear">
                                                        </div>
                                                        <div class="form-group">
                                                                <label>Nombre del Unidad:</label>
                                                                <input type="text" class="form-control" name="nombreUnidad" placeholder="Ingresa el nombre de la unidad">
                                                        </div>
                                                        <div class="form-group">
                                                                <label>Nombre del Tema:</label>
                                                                <input type="text" class="form-control" name="nombreTema" placeholder="Ingresa el nombre del tema">
                                                        </div>
                                                        <div class="form-group">
                                                                <label>Descripcion:</label>
                                                                <textarea name="Descripcion" id="" class="form-control" cols="30" rows="10"></textarea>
                                                        </div>
                                                        <div style="margin-top: 20px;">
                                                          <button class="btn btn-info"><span class="glyphicon glyphicon-ok"></span> Ingresar Contenido</button>
                                                          <button class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</button>
                                                        </div>
                                                </form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>
<% }else{
    request.getRequestDispatcher("index.jsp").forward(request, response);  
}
%>