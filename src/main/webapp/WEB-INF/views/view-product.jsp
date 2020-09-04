<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="org.dxc.shopping.entity.Product,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Available</title>
</head>
<body>
<table>
 <thead>
   <tr>
     <td>ProductId</td>
     <td>ProductName</td>
     <td>Quantity</td>
     <td>Price</td>
   </tr>
 </thead>
<tbody>
    <c:if test="${not empty listOfProducts}">
         <c:forEach var="product" items="${listOfProducts}">
             <tr>
                <td>${product.pid}</td>
                <td>${product.productName}</td>
                <td>${product.quantity}</td>
                <td>${product.price}</td>
                <td><a href="update?productId=${product.pid}">Update</a></td>
                <td> <a href="delete?productId=${product.pid}">Delete</a></td>
             </tr>
         </c:forEach>
     </c:if>
</tbody>
</table>
</body>
<style>

title{
	color: Green;
	text-align: center;
}
</style>
</html>