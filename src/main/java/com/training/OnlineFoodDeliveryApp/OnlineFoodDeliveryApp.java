package com.training.OnlineFoodDeliveryApp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.training.OnlineFoodDeliveryApp.controller","com.training.OnlineFoodDeliveryApp.repository","com.training.OnlineFoodDeliveryApp.services","com.training.OnlineFoodDeliveryApp.model"})
public class OnlineFoodDeliveryApp {

	public static void main(String[] args) {
		SpringApplication.run(OnlineFoodDeliveryApp.class, args);
	}

}


/* <tr th :each="restaurants: ${listRestaurants}">
<img width="200" height="200" src="https://www.pexels.com/photo/flat-lay-photography-of-vegetable-salad-on-plate-1640777/" alt="foods"/>
    
    <c:forEach items="${centerList}" var="center">
    <td style="color:red" th:text="${restaurants.RestaurantId}"></td>
    <td th:text="${restaurants.RestaurantName}"></td>
    <td th:text="${restaurants.Address}"></td>
    <td th:text="${restaurants.ManagerName}"></td>
    <td th:text="${restaurants.ContactNum}"></td>*/