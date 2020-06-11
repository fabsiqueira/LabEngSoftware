<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <style type="text/css">
        body{
            background: #D3D3D3;
        }
        .box{
            background: #f2f2f2;
            width:200px;
            height:300px;
            padding: 40px;
            margin: 0 auto;
            border-radius: 10px;
        }
        input{
            margin: 0 auto;
            display: flex;
            align-items: center;
        }
        p{
            text-align: center;
        }
        h3{
            text-align: center;
        }
        input[type="submit" i] {
            padding: 3px 15px 3px 15px;
            background: #A9A9A9;
            cursor: pointer;
            color: #fff;
        }
        
        a{
           
            text-align: center;
            color: #000;
            padding-left: 69px;
        }
    </style>
    <body>
        <h3>Bem vindo a calculadora, <%=request.getAttribute("login")%> </h3> 
        <div class="box">
            
        <form method="get" 
         action= "calculo.action">
            <p>Insira um número:</p> <input name="op1"/><br/>
            <p>Insira outro número:</p> <input name="op2"/><br/>
            <p>Resultado:</p> <input name="op2"/><br/>
            <input type="submit">
        </form> 
            <br />
                <a href = historico.action> Historico </a>
            
        </div>
           
    </body>
</html>
