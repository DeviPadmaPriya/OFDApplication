<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>
</head>
<body>


<div  align="center">
        <h1>Create New Restaurant</h1>
        <br />
        <form action= # th:action="@{/save}" th:object="${restaurants}"
            method="post">
 
            <table border="0" cellpadding="10">
                <tr>
                    <td> RestaurantId:</td>
                    <td><input type="text" th:field="*{name}" /></td>
                </tr>
                <tr>
                    <td>RestaurantName:</td>
                    <td><input type="text" th:field="*{resnam}" /></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type="text" th:field="*{adress}" /></td>
                </tr>
                <tr>
                    <td>ManagerName:</td>
                    <td><input type="text" th:field="*mangname}" /></td>
                </tr> 
                <tr>
                    <td>ContactNum:</td>
                    <td><input type="text" th:field="*connum}" /></td>
                </tr>                           
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>