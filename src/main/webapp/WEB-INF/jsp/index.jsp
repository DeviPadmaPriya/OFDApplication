<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESTAURANT DETAILS</title>
</head>
<body>
 
<div align="center">
    <h1>Restaurants List</h1>
   
    <a align ="left" href="/new">Add New Restaurant</a>
    <br/><br/>
    <table >
    
        <thead>
            <tr style="background-color:Blue ;color:white;">
                <th>RestaurantID</th>
                <th>RestaurantName</th>
                <th>Address</th>
                <th>ManagerName</th>
                <th>ContactNum</th>
                <th>TO PERFORM</th>
            </tr>
        </thead>
        <tbody>
               <tr th :each="restaurant: ${listRestaurants}">
<img width="200" height="200" src="https://www.pexels.com/photo/flat-lay-photography-of-vegetable-salad-on-plate-1640777/" alt="foods"/>
    
    
    <td style="color:red" th:text="${restaurant.RestaurantId}"></td>
    <td th:text="${restaurant.RestaurantName}"></td>
    <td th:text="${restaurant.Address}"></td>
    <td th:text="${restaurant.ManagerName}"></td>
    <td th:text="${restaurant.ContactNum}"></td>
               
            <td>   
                    <a href="/@{'/edit/'+${restaurant.id}}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/@{'/delete/'+${restaurant.id}}">Delete</a>
                    
                </td>
            
      
        </tbody>
    </table>

</div>
 
</body>
</html>