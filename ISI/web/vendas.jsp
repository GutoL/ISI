<%-- 
    Document   : vendas
    Created on : 26/11/2015, 00:11:25
    Author     : Renan
--%>

<%@page import="model.Venda"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendas</title>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    </head>
    <body>
        <div class='container'>
            <h1>Relatório de vendas</h1>
        <h2>Pães</h2>
        <p>Gráfico em pizza de venda de pães</p>
        <script type='text/javascript'>
        var italiano = 0;
        var ng = 0;
        var peo = 0;
        var tq = 0;
        var ngam = 0;
        <%

            ArrayList<Venda> vendas = DbConnection.executeQuery();
            
            for(int i = 0; i < vendas.size(); i++) {

                if(vendas.get(i).pao.equals("Italiano")){
                    out.print("italiano++;");
                }
                if(vendas.get(i).pao.equals("9 Graos")){
                    out.print("ng++;");
                }
                if(vendas.get(i).pao.equals("Parmesao e Oregano")){
                    out.print("peo++;");
                }
                if(vendas.get(i).pao.equals("Tres Queijos")){
                    out.print("tq++;");
                }
                if(vendas.get(i).pao.equals("9 Graos com Aveia e Mel")){
                    out.print("ngam++;");
                }
                
            }
            
        %>
        
        
        
        
        
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Pães', 'Venda de pães'],
          ['Italiano',     italiano],
          ['9 Grãos',      ng],
          ['Parmesão e orégano',  peo],
          ['Três queijo', tq],
          ['9 Grãos com Aveia e Mel',   ngam]
        ]);

        var options = {
          title: 'Venda de pães'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
      
      
      
    </script>
        <div id="piechart" style="width: 900px; height: 500px;"></div>
        
        <h2>Sabores</h2>
        <p>Gráfico em pizza de venda dos sabores</p>
        <script type='text/javascript'>
        var ft = 0;
        var bmt = 0;
        var fbs = 0;
        var veg = 0;
        var ita = 0;
        <%
            
            for(int i = 0; i < vendas.size(); i++) {

                if(vendas.get(i).recheio.equals("Frango Teriaki")){
                    out.print("ft++;");
                }
                if(vendas.get(i).recheio.equals("B.M.T.")){
                    out.print("bmt++;");
                }
                if(vendas.get(i).recheio.equals("Frango e Bacon Sublime")){
                    out.print("fbs++;");
                }
                if(vendas.get(i).recheio.equals("Vegetariano")){
                    out.print("veg++;");
                }
                if(vendas.get(i).recheio.equals("Italiano")){
                    out.print("ita++;");
                }
                
            }
            
        %>
        
        
        
        
        
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Recheios', 'Venda de recheios'],
          ['Frango Teriaki',     ft],
          ['B.M.T',      bmt],
          ['Frango e Bacon Sublime',  fbs],
          ['Vegetariano', veg],
          ['Italiano',   ita]
        ]);

        var options = {
          title: 'Venda de recheios'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart2'));

        chart.draw(data, options);
      }
      
      
      
    </script>
    <div id="piechart2" style="width: 900px; height: 500px;"></div>
        
    <h3>Histórico de vendas </h3>
    <div >
    <p>Relatório geral de vendas:</p><br/>
    <table class='table'>
        <tr>
            <th>Pao</th>
            <th>Tamanho</th>
            <th>Recheio</th>
            <th>Queijo</th>
            <th>Adicionais</th>
            <th>Vegetais</th>
            <th>Molhos</th>
        </tr>
    <%
            
    for(int i = 0; i < vendas.size(); i++) {
        out.print("<tr>");
        out.print("<td>" + vendas.get(i).pao + "</td>"
        + "<td>" + vendas.get(i).tamanho + "</td>"
        + "<td>" + vendas.get(i).recheio + "</td>"
        + "<td>: " + vendas.get(i).queijo + "</td>"
        + "<td>" + vendas.get(i).adicionais + "</td>"
        + "<td>" + vendas.get(i).vegetais + "</td>"
        + "<td>" + vendas.get(i).molhos + "</td>"
        );
        out.print("</tr>");
        
    
    }
    
    %>
    </table>
    </div>
    </div>
    
    </body>
</html>
