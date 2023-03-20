<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="pink">
	<h1>Edit Mobile Here</h1>
	<form:form method="POST" action="/editMobile">
		<table>
			<tr>
				<td><form:hidden path="model_no" /></td>
			</tr>
			<tr>
				<td>Model Name:</td>
				<td><form:input path="model_name" /></td>
			</tr>
			<tr>
				<td>Mobile Name:</td>
				<td><form:input path="mobile_name" /></td>
			</tr>
			<tr>
				<td>Mobile Ram:</td>
				<td><form:input path="ram_size" /></td>
			</tr>
			<tr>
				<td>Mobile Rom:</td>
				<td><form:input path="rom_size" />						
			</tr>
			<tr>
				<td>Operating System:</td>
				<td><form:input path="os_name" /></td>
			</tr>
			<tr>
				<td>Front Cam:</td>
				<td><form:input path="f_cam" /></td>
			</tr>
			<tr>
				<td>Back Cam:</td>
				<td><form:input path="b_cam" /></td>
			</tr>
			<tr>
				<td>Battary Capacity:</td>
				<td><form:input path="battary_capacity" /></td>
			</tr>
			<tr>
				<td>IMEI NO:</td>
				<td><form:input path="imei_no" /></td>
			</tr>
			<tr>
				<td>Mobile Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Mobile Color:</td>
				<td><form:input path="color" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="EditSave" /></td>
			</tr>
		</table>
	</form:form>
	<a href="/views">View All Employee Details</a>
	<p></p>
	<a href="/">Add New Employee Here</a>
</body>

