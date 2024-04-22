<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<label for="title">タイトル</label><br />
<!-- リクエストスコープのmessageオブジェクトからデータを参照し、入力内容の初期値として表示 -->
<input type="text" name="title" id="title" value="${message.title}" />
<br /><br />

<label for="content_msg">メッセージ</label><br />
<input type="text" name="content" id="content_msg" value="${message.content}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">投稿</button>