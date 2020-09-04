<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddProduct</title>
</head>
<body>
<b>Add/Update Product here...</b>>
	<form:form action="addnewproduct" method="post" modelAttribute="product">
		<table>
		<form:hidden path="pid"/>
			<tr>
				<td>Enter the Product Name</td>
				<td><form:input id="productName" path="productName" name="productName" /></td>
			</tr>
			<tr>
				<td>Enter the Quantity</td>
				<td><form:input id="quantity" path="quantity" name="quantity"  /></td>
			</tr>
			<tr>
				<td>Enter the Price</td>
				<td><form:input id="price" path="price" name="price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add/Update Product" /></td>
				<td><input type="reset" value="CancelProduct" /></td>
			</tr>
		</table>
	</form:form>

</body>
<style>
h2 {
	color: Green;
	text-align: center;
	text: Bold
}
</style>

</html>