<%-- 
    Document   : index
    Created on : 10-Apr-2022, 1:58:08 PM
    Author     : pooja
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
                    <h3>User Login</h3>
                    <s:url var="url_login" value="/login"/>
                    <f:form action="${url_login}" modelAttribute="command">
                        <table border="1">
                            <tr>
                                <td>Username</td>
                                <td><f:input path="loginName"/></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><f:input path="password"/></td>
                            </tr>
                            <tr>

                                <td colspan="2" align="right">
                                    <button>Login</button><br/>
                                    <a href="#">New User Registration</a>
                                </td>
                            </tr>
                            
                        </table>
                    </f:form>      
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
