<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Schedule</title>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
 
<script type="text/javascript">
$(document).ready(function(){
	$("#frm").dialog({
		modal:true,
		autoOpen:false,
		minWidth:600,
		minHeight:500,
		height:500,
		width:500
	});

$('body').on('click','.cell',function(){
	var arr= $(this).attr("key").split("-");
	var dayid=arr[0];
	var slottypeid=arr[1];
	var secid = arr[2];
	$.ajax({url:"${pageContext.request.contextPath}/getCourses",
				data:{'id':secid},
				type:"GET"
			}).done(function(data){
				console.log(data);
				var mydata=$.parseJSON(data);
				$('#Course').autocomplete({source:mydata,
					select: function (event, ui) {
										     
					}});
				console.log(mydata)	
	});
	/* $('body').on('click','.cell',function(){
		  alert('Handler for .click() called.');
	} ); */
		$('#frm').dialog('open');
		$("#frm").css({"display":"inline"});
	});
});



</script>
<style type="text/css">
.cell:hover{
background-color: white;
cursor: pointer; 
cursor: hand;
}
</style>
</head>
<body>
<div id="frm" style="display:none">
<form name="frmopr" method="post" >

<table>
<tr>
	<td>Teacher:</td><td><input id="teacher"></td>
</tr>
<tr>
	<td>Course:</td><td><input id="Course"></td>
</tr>	
<tr>
	<td>Slot:</td><td><input id="Slot"></td>
</tr>
<tr>	
	<td><input type="button" name="save-insert" value="Update" ></td>
	<td><input type="button" value="Cancel"></td>
</tr>
</table>
</form>

</div>

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
				
				<td class="cell" key="${key}">
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