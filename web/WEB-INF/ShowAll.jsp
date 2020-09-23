<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#deletePerson").hide();
            $("#updatePerson").hide();

            $("#update").click(function(){
                $("#updatePerson").show();
                $("#deletePerson").hide();
            });
            $("#delete").click(function(){
                $("#deletePerson").show();
                $("#updatePerson").hide();
            });
        });
    </script>
</head>
<body>
All Person: <br>
<c:forEach var="emp" items="${personList}">
    Person ID: ${emp.id} <br>
    Person firstName: ${emp.firstName} <br>
    Person lastName: ${emp.lastName} <br>
    Person role: ${emp.role} <br>
    -------------------------------------<br>
</c:forEach>
<form action="EmployeeController" method="POST">
    Update: <input type="checkbox" id="update"> Delete: <input type="checkbox" id="delete" onclick="document.getElementById('ename').disabled=this.checked;document.getElementById('enumberupdate').disabled=this.checked;"><br><br>
    <select name="id">
        <c:forEach items="${personList}" var="employee">
            <option value="${employee.id}">${employee.id}</option>
        </c:forEach>
    </select>

    <br>
    Update Name: <input id="ename" type="text" name="ename"><br>
    Update Number: <input id="enumberupdate" type="text" name="enumberupdate"> <br><br>
    <button type="submit" id="updateEmployee" name="updateEmployee"> Update</button> <br> <br>
    <button type="submit" id="deleteEmployee" name="deleteEmployee"> Delete </button>




</form>
</body>
</html>