<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<style type="text/css">

</style>
</head>
<body>


<table border="1" style="border-collapse: collapse; bordercolor:black; width:100%;">

	<tr>
		<td>Days</td>
		
		<td>Timings</td>
		<td colspan="18">Sections</td>
	</tr> 
	
	<tr>
		<td>Days</td>
		
		<td>Timings</td>
		<c:forEach var="section" items="${Sections }">
		
		
			<td><c:out value="${section.sectionname}"></c:out></td>
		
		
		</c:forEach>
		
	</tr>

	<c:forEach var="day" items="${Days}">
		<c:forEach var="slot" items="${Slots}">
			
		<tr>
			
				<td>
					<c:out value="${day.dayname}"></c:out>
				</td>
			
			
			<td><c:out value="${slot.getId().duration}"></c:out></td>
			
			<c:forEach var="section" items="${Sections}">
			
			
			<c:set var="key" value="${day.dayid}-${slot.getId().subslotid}-${section.sectionname}"></c:set>
			<c:choose>
			<c:when test="${hSchedule.containsKey(key)}">
			<c:set var="Schedules" value="${hSchedule[key]}"></c:set>
			<c:forEach var="schedule" items="${Schedules}">
			
			<td><c:out value="${schedule.getId().code} - ${schedule.getId().title} - ${schedule.getId().teachername} - ${schedule.getId().roomno} - ${schedule.getId().campus}"></c:out></td>
			
			
			</c:forEach>
			</c:when>
			<c:otherwise>
			<td><c:out value=""></c:out></td>
			</c:otherwise>
			</c:choose>
			</c:forEach>
		</tr>
		
		</c:forEach>
	</c:forEach>
	

</table>
</body>
</html>