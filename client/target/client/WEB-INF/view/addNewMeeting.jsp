<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/saveMeeting"  modelAttribute="meeting">
    <form:hidden path="id"></form:hidden><br/><br>
    Название мероприятия<form:input path="name"></form:input><br><br>
    Локация<form:input path="location"></form:input><br><br>
    Описание<form:input path="descriptions"></form:input><br><br>
<%--    Дата начала<form:hidden path="localDateTimeStart"></form:hidden>--%>
<%--    Конец<form:hidden path="localDateTimeEnd"></form:hidden>--%>
    <input type="submit">
</form:form>
</body>
</html>
