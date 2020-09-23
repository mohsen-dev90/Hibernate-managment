<%--
  Created by IntelliJ IDEA.
  User: mohsen
  Date: 9/23/2020
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <title>Person</title>
</head>
<body>

    <div id="add">
        <h1> Add Person </h1>
        <form action="PersonController" method="GET">
            <table>
                <tr>
                    <td> Person firstName: </td>
                    <td><input type="text" name="firstName"></td>
                </tr>
                <tr>
                    <td> Person lastName: </td>
                    <td><input type="text" name="lastName"></td>
                </tr>
                <tr>
                    <td> Person role: </td>
                    <td><input type="text" name="role"></td>
                </tr>

                <tr>
                    <td><input type="submit" name="addPerson" value="Add"></td>

                </tr>
            </table>
        </form>
    </div>
    <form action="PersonController" method="POST">
        <input type="submit" name="showPerson" value="Show"> &nbsp; &nbsp;<br>


       </form>
    </body>
</html>
