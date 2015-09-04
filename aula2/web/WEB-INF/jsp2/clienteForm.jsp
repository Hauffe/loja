<%-- 
    Document   : clienteForm
    Created on : 28/08/2015, 18:17:15
    Author     : alexandre.hauffe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../plugins/jquery-2.1.4.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="http://www.geradorcpf.com/jquery.maskedinput-1.1.4.pack.js"/></script>
        <script type="text/javascript">
            $(document).ready(function(){$("#cpf").mask("999.999.999-99");});
        </script>
    </head>
    <body>
        <h1>Cadastro:</h1>
        <div style="width: 195px;">
            <form action="cadastro" method="POST">
                <label for="pessoa">Pessoa: </label>
                <input type="radio" name="pessoa" value="fisica" />fisica <input type="radio" name="pessoa" value="juridica" />juridica
                <label for="nome">Nome:</label>
                <input type="text" name="nome"/>
                <label for="cpf">CPF:</label>
                <input type="text" name="cpf" maxlength="11" id="cpf"/>
                <label for="datanasc">Data de nascimento:</label>
                <input type="date" name="datanasc"/>
                <label for="sexo">Sexo:</label>
                <select name="sexo">
                    <option value="" selected="selected">Selecione</option>
                    <option value="m">Masculino</option>
                    <option value="f">Feminino</option>
                </select>
                <label for="comentario">Comentario</label>
                <textarea name="comentario">Digite algo aqui meu caro amiguinho!</textarea>
                <input type="submit" value="Salvar">
            </form>
        </div>
    </body>
</html>
