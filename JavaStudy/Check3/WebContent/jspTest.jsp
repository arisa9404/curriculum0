<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--header表示-->
<%@ include file="header.jsp" %>

<!-- name、idの入力エリアを作成しなさい -->
<div class="content">
        <table>
            <tr align="center">
                <th>
                    <label for="name-id">
                        name
                    </label>
                </th>
                <th>
                    <input type="text" name="name" id="name-id">
                </th>
            </tr>
            <tr align="center">
                <th>
                    <label for="id-id">
                        id
                    </label>
                </th>
                <th>
                  <input type="text" name="name" id="name-id">
            </tr>
        </table>
    </div>

<!--footerを表示-->
<%@ include file="footer.jsp" %>


</body>
</html>