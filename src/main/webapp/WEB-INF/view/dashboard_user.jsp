<%-- 
    Document   : index
    Created on : 10-Apr-2022, 1:58:08 PM
    Author     : pooja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User DashBoard - Contact Application</title>
    <s:url var="url_css" value="/static/css/style.css"/>
    <link href="${url_bg}" rel="stylesheet" type="text/css"/>
</head>
<s:url var="url_bg" value="/static/images/bg.jpg"/>

<body background="${url_bg}">
    <table border="1"width="80%" align="center">

        <tr>
            <td height="70px">

                <jsp:include page="include/header.jsp"/>
            </td>
        </tr>
        <tr>
            <td height="25px">
                <jsp:include page="include/menu.jsp"/>
            </td>
        </tr>
        <tr>
            <td height="350" valign="top">   
                <h1>User DashBoard</h1>
                todo user option
            </td>
        </tr>
        <tr>
            <td height="25px">
                <%---futer--%>
                <jsp:include page="include/footer.jsp"/>
            </td>
        </tr>
    </table>

</body>
</html>

