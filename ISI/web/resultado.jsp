<%-- 
    Document   : resultado
    Created on : 22/11/2015, 18:34:13
    Author     : arthur
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="charset=utf-8">
        <title>Subway</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">	
	<script type="text/javascript" src="bootstrap/jquery.js"> </script>
        
        
    </head>
    <body>

        <%
            List styles = (List)request.getAttribute("styles");
            Iterator it = styles.iterator();
            
            while (it.hasNext()) {
                out.print(it.next());
            }
        %>   
        
    </body>
</html>