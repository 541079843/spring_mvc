<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <title>hello world</title>
</head>
<body>
    <form action="/binding/people/save" method="post">
        <p>name: <input type="text" name="name" /></p>
        <p>age: <input type="text" name="age" /></p>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>