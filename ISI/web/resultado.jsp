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
        
        <script>
            
            
            function logOut(){
				
				
				FB.logout(function(response){
					
					callBackMudancasStatus(response);
					
					
				});
				
			}
            
        </script>
        
    </head>
    <body>
        
        <div id="fb-root"></div>
            <script>(function(d, s, id) {
              var js, fjs = d.getElementsByTagName(s)[0];
              if (d.getElementById(id)) return;
              js = d.createElement(s); js.id = id;
              js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.5&appId=1046768882041202";
              fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));</script>
        
        <%
            List styles = (List)request.getAttribute("styles");
            Iterator it = styles.iterator();
            
            while (it.hasNext()) {
                out.print(it.next());
            }
        %>   
       
        <div class="row">
            <div class="col-md-8 col-md-push-5">
                <div class="fb-share-button" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count"></div>
                <input type="button" value="Voltar" onClick="history.go(-1)" class="btn btn-danger" >
                
            </div>
        </div>
        
    </body>
</html>