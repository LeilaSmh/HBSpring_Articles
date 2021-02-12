<%-- 
    Document   : article
    Created on : Feb 12, 2021, 12:37:34 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        h1 {
            color: #fff;
            text-transform: uppercase;
            font-weight: 300;
            text-align: center;
            margin-bottom: 15px;
            font-family: "Trebuchet MS", sans-serif;
            font-size: 5em;
            letter-spacing: -2px;
            text-transform: uppercase;
        }
        body {
            background: -webkit-linear-gradient(left, #25c481, #25b7c4);
            background: linear-gradient(to right, #25c481, #25b7c4);
            font-family: "Roboto", sans-serif;
        }
        th {
            padding: 20px 15px;
            text-align: center;
            font-weight: 500;
            font-size: 12px;
            color: #fff;
            text-transform: uppercase;
        }
        td {
            padding: 15px;
            text-align: center;
            font-weight: 300;
            font-size: 12px;
            color: #fff;
            border-bottom: solid 1px rgba(255, 255, 255, 0.1);
        }

    </style>
    <body>
        <h1 class="test">Articles Form</h1>
        <div style="margin: 0px 40%">
            <c:url var="updateAction" value="/article/update"/>
            <form:form action="${updateAction}" method="POST" modelAttribute="article">
                <table>
                    <tr>
                        <td><form:label path="code">Code:</form:label></td>
                        <td><form:input path="code"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="designation">Designation:</form:label></td>
                        <td><form:input path="designation"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="prix">Prix:</form:label></td>
                        <td><form:input path="prix"/></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div style="text-align: center">
                                <c:if test="${action == 'add'}">
                                    <input type="submit" name="operation" value="Add"/>
                                </c:if> 
                                <c:if test="${action == 'edit'}">
                                    <input type="submit" name="operation" value="Edit"/>
                                </c:if>
                            </div>
                        </td>
                    </tr>
                </table>
            </form:form>
        </div>
    </body>
</html>
