<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Message Board</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
    
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Message Board Application</h1>
            </div>
            <div id="content">
                <!-- ここに各ページのビューが入る -->
                ${param.content}
            </div>
            <div id="footer">
                by Taro Kirameki
            </div>
        </div>
    </body>
</html>