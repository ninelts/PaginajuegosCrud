<%-- 
    Document   : Agregar
    Created on : 24-05-2018, 23:50:18
    Author     : 19609335-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/estilos.css">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <script src="js/jquery-3.3.1.min.js"> </script> 
         <script src="js/bootstrap.js"> </script>
         <script src="js/popper.js"> </script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
         
    </head>
    
    
    
   <body>
     
 
       <div id="header"> </div>
       <script type="text/javascript">$("#header").load("includes/header.html") </script>
       
       <form> 
           
           
       <div class="row">
           
            <div class="form-group col-md-4">
                <label for="inputEmail4">Cod Juego</label>
                     <input type="" class="form-control"  placeholder="Nombre Producto"name="j_cod" >
                         </div>    
   
    <div class="form-group col-md-4">
        <label for="inputEmail4">Nombre Juego</label>
            <input type="" class="form-control"  placeholder="Nombre Producto" name="j_nombre">
             </div> 
           
           <div class="form-group col-md-4">
                <label for="inputAddress">Url trailer juego </label>
                    <input type="text" class="form-control"  placeholder="precio" name="j_video">
                        </div>   
                                </div>
       
      
     <div class="row"> 
         
        <div class="form-group col-md-4">
            <label for="inputAddress">Valor </label>
                <input type="text" class="form-control"  placeholder="precio" name="j_valor">
                    </div>
  
        <div class="form-group col-md-4">
            <label for="inputAddress">Url imagen </label>
                <input type="text" class="form-control"  placeholder="precio" name="j_img">
                     </div>
                                </div>
  
     
                        
       
       
        <div class="row">       
           <div class="form-group col-md-4">
                <label for="inputCity">Requisitos Minimos</label>
                    <textarea  name="j_req_min" rows="3" cols="40">
                         </textarea>
                                    </div>    

     <div class="form-group col-md-4 ">
          <label for="inputCity">Requisitos Maximos</label> 
              <textarea  name="j_req_max" rows="3" cols="40">
                </textarea>
                        </div>
                                   
    <div class="form-group col-md-4 ">
          <label for="inputCity">Descripcion</label> 
          <textarea class=""  name="j_descripcion" rows="3" cols="40" name="descripcion_j">
                </textarea>
                           </div>
                                        </div> 
    
   
           <input type="submit" formaction="crud_modificar" formmethod="POST" value="Modificar" />
           <input type="submit" formaction="crud_crear" formmethod="POST" value="Guardar" />
           <input type="submit" formaction="crud_eliminar" formmethod="POST" value="Eliminar" />
    </form>
       
   
  
  
  

       
            
           
           
  
       <div id="footeer"></div>
       <script type="text/javascript"> $("#footeer").load("includes/footeer.html") </script>
       
       
   </body>
</html>
