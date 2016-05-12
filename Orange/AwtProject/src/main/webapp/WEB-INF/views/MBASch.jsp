<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1; style="border-collapse: collapse; border-color: black; font-size: 10px;">
<tr>
<td>Days</td>
<td>Time Slots</td>
<y:forEach var="section" items="${Sections}">
<td><y:out value="${section.sectionname}"></y:out></td>
</y:forEach>
</tr>
<tr>
<y:forEach var="day" items="${Days}">
<y:forEach var="slottype" items="${SlotType}">
<tr>
			<y:if test="${SlotType[0]==slottype}">
				<td rowspan="${fun:length(SlotType)}">
					<y:out value="${day.dayname}"></y:out>
				</td>
			</y:if>
			<td>
				<y:out value="${slottype.duration}"></y:out>
			</td>
			<y:forEach var="section" items="${Sections}">
			<y:set var="key" value="${day.dayid}-${slottype.slottypeid}-${section.secid}"></y:set>
				<td>
					<y:choose>
						<y:when test="${hashsch.containsKey(key)}">
							<y:out value="${hashsch[key].getOfferdcourse().getCourse().getCode()}"></y:out><br>
							<y:out value="${hashsch[key].getOfferdcourse().getCourse().getTitle()}"></y:out><br>		
							<y:out value="${hashsch[key].getOfferdcourse().getTeacher().getTeachername()}"></y:out>		
						</y:when>
						<y:otherwise>
							
						</y:otherwise>
					</y:choose>
				</td>
			</y:forEach>
</tr>
</y:forEach>
</y:forEach>
</tr>
</table>

</body>
</html>