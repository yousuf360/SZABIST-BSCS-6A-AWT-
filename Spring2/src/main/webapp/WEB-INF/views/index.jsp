<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Schedule</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script type="text/javascript">
$(document).ready(function()
{
	//$("#type1").click(function() { var one = document.getElementsByTagName("td").valueOf().toString();
	$("table").on("click","#cls", function()
	{
		var key = $(this).attr("codes") + "-" + $(this).attr("slot") + "-" + $(this).attr("sectionname");
		//$(this).dialog();
		alert(key);
		$("#dialog").dialog();
	});
	$("table").on("click","#spc", function()
			{
			
			$.ajax({
				url:"index.jsp",
				type:"GET",
				data:{days:"",slots:"" ,rooms:""}
			}).done(function(data){
				
			}
					)
			
		alert();
		$("#dialog1").dialog();
		
			});
			
});
</script>
<style>.cls{}</style>
</head>
<body>
<div id="type1">
<table bordercolor="black" style="border-collapse: collapse;" border="1" >
<c:forEach var="student" items="${students}">
	<tr>
		<td><c:out value="${ student.regno }"></c:out></td>
		<td><a href="/Spring2/edit?regno=${ student.regno }" id=${ student.regno }>
		<c:out value="${ student.studentname }"></c:out></a></td>
	</tr>
</c:forEach>
</table>
<br><br>
<table border="1" style="border-collapse: collapse; border-color: black; font-family: Sans; font-size: small">
	<tr>
		<td>Days</td>
		<td>Slots</td>
		<c:forEach var="section" items="${sections}">
		<td>
		<c:out value="${section.sectionname}"></c:out>
		</td>
		</c:forEach>
	</tr>
	<c:forEach var="day" items="${days}">
		<c:forEach var="slot" items="${slots}">
		<tr>
			<c:if test = "${slots[0]==slot}">
				<td rowspan="${fun:length(slots)}">
					<c:out value="${day.getDayname()}"></c:out>
				</td>
				</c:if>
				<td>
					<c:out value="${slot.duration}"></c:out>
				</td>
					<c:forEach var="sec" items="${sections }">
						<c:set var="key" value="${day.dayid}-${slot.slottypeid}-${sec.sectionname}"></c:set>
						<c:choose>
							<c:when test="${hSchedule.containsKey(key) }">
								<c:set var="schedules" value="${hSchedule[key]}"></c:set>

								<td id="cls" day="${schedules[0].getId().dayid }" slot="${schedules[0].getId().subslotid }" sectionname="${schedules[0].getId().sectionname }" style="background-color: pink;">
									<c:out value="${schedules[0].getId().code } - ${schedules[0].getId().title} - ${schedules[0].getId().teachername}"></c:out>
									<br>
									<c:choose>
									<c:when test="${schedules[0].getId().roomno.contains('Lab')}">
									<c:out value="${schedules[0].getId().roomno}"></c:out>
									</c:when>
									<c:otherwise>
									<c:out value="Room ${schedules[0].getId().roomno}"></c:out>
									</c:otherwise>
									</c:choose>
								</td>
							</c:when>
							<c:otherwise>
							<td id="spc">&nbsp;</td>
							</c:otherwise>
						</c:choose>
					</c:forEach>
		</tr>
		</c:forEach>
	</c:forEach>
</table>
</div>
<div id="dialog">
<input type="text" id="day">
<input type="text" id="slot">
<input type="text" id="room">
</div>
<div id="dialog1">
<input type="text" id="day">
<input type="text" id="slot">
<input type="text" id="room">
<input type="submit" id="submit" value="Insert">

</div>
</body>
</html>