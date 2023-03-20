<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
   prefix="c"%>    
 <body bgcolor="pink">
 
 <h1>Mobile Details</h1>  
<table border="1" width="70%" cellpadding="2">
<tr>
<th> Mobile Model Number</th>
<th>Mobile Model Name</th>
<th>Mobile Name</th>
<th>Ram Size</th>
<th>Rom Size</th>
<th> Os- Name</th>
<th>Processor Name</th>
<th>front Cam</th>
<th>Back Cam</th>
<th>Battery Capacity</th>
<th>IMEI Number</th>
<th>Mobile Price</th>
<th>Mobile Color</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="mobile" items="${mobile}">
<tr>
<td>${mobile.model_no}</td>
<td>${mobile.model_name}</td>
<td>${mobile.mobile_name}</td>
<td>${mobile.ram_size}</td>
<td>${mobile.rom_size}</td>
<td>${mobile.os_name}</td>
<td>${mobile.process_name}</td>
<td>${mobile.f_cam}</td>
<td>${mobile.b_cam}</td>
<td>${mobile.battary_capacity}</td>
<td>${mobile.imei_no}</td>
<td>${mobile.price}</td>
<td>${mobile.color}</td>
<td><a href="/edit/${mobile.model_no}">Edit</a></td>
<td><a href="/delete/${mobile.model_no}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br>
<a href="/">Add New Mobile</a>
</body>

