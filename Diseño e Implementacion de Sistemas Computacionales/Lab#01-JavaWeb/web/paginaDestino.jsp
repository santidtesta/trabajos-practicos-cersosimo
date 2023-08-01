<%-- 
    Document   : paginaDestino
    Created on : 6 jul 2023, 20:40:28
    Author     : Santino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%
          String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          String email = request.getParameter("email");
          String genero = request.getParameter("genero");
        %>
        
        <table border="1" cellspacing="3" cellpadding="3">
            <tbody>
                <tr>
                    <td>Te llamas: </td>
                    <td><%= nombre %></td>
                </tr>
                <tr>
                    <td>Apellidos: </td>
                    <td><%= apellido%></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><%= email%></td>
                </tr>
                <tr>
                    <td>Tu genero: </td>
                    <td><%= genero%></td>
                </tr>
            </tbody>
        </table>
                
        <% 
            String java = request.getParameter("java");
            String cCpp = request.getParameter("cCpp");
            String basic = request.getParameter("basic");
            String html = request.getParameter("html");           
        %>
        
        <p>Los lenguajes que manejas son: </p>
        
        <%if (java != null) {%>
            <p><%= java%></p>    
           <%}%>
        <%if (cCpp != null) {%>
            <p><%= cCpp%></p>    
           <%}%>        
        <%if (basic != null) {%>
            <p><%= basic%></p>    
           <%}%>        
        <%if (html != null) {%>
            <p><%= html%></p>    
           <%}%>
           
        <%
            String idiomas[] = request.getParameterValues("idioma");
        %>
        
        <p>Los idiomas que comprendes son: </p>
        
        <%
          for (int i = 0; i < idiomas.length; i++) {%>
          <p><%= idiomas[i] %></p>
             <% } %>
        
    

