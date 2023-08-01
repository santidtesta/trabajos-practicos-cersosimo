<%-- 
    Document   : index
    Created on : 6 jul 2023, 20:41:45
    Author     : Santino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Solicitud</h1>
        
        <p>Despues de introducir tus datos, oprime el boton "enviar"</p>
        
        <form action="paginaDestino.jsp" method="post">
        
        <table border="2" cellspacing="3" cellpadding="3">
            <tbody>
                <tr>
                    <td>Nombre: </td>
                    <td><input type="text" name="nombre" placeholder="Francisco"></td>
                </tr>
                <tr>
                    <td>Apellidos: </td>
                    <td><input type="text" name="apellido" placeholder="Garcia"></td>
                </tr>
                <tr>
                    <td>Correo: </td>
                    <td><input type="email" name="email" placeholder="ejemplo@ejemplo.com"></td>
                </tr>
            </tbody>
        </table>
        
        <label>Eres:</label>
        <input type="radio" name="genero" value="Hombre"> Hombre
        <input type="radio" name="genero" value="Mujer"> Mujer
        
        <br>
        
        
        <label>Selecciona lo que sabes:</label><br>
        <input type="checkbox" name="java" value="Java"> Java
        <input type="checkbox" name="cCpp" value="C/C++"> C/C++
        <input type="checkbox" name="basic" value="Basic"> Basic
        <input type="checkbox" name="html" value="HTML"> HTML
        
         <br><br>
         
         <label>Selecciona los idiomas que comprendes: </label> <br>
         <select id="idiomas" name="idioma" multiple>
             <option value="Espanol">Español</option>
             <option value="Ingles">Ingles</option>
             <option value="Frances">Frances</option>
             <option value="Aleman">Aleman</option>
         </select>

         <br><br>
         
        <input type="reset" value="Borrar">
        <input type="submit" value="Enviar">

        </form>
    </body>
</html>
