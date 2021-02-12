<%-- 
    Document   : articles_form
    Created on : 14-Jan-2021, 21:39:35
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            table {
                border-spacing: 5px;
                margin : 50px auto 0px;
                font-size: 16px;
                width: 100%;
                margin : 50px auto 0px;
            }
            thead {
                background-color: rgba(255, 255, 255, 0.3);
            }
            tbody {

                border: 1px solid rgba(255, 255, 255, 0.3);
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

            /* demo styles */

            body {
                background: -webkit-linear-gradient(left, #25c481, #25b7c4);
                background: linear-gradient(to right, #25c481, #25b7c4);
                font-family: "Roboto", sans-serif;
            }
            .container {
                height: 100px;
                position: relative;
            }

            .vertical-center {
                margin: 5% 50%; 
            }

        </style>
        <title>Articles</title>
    </head>
    <body>
        <h1 class="test">Articles Information</h1>
        <c:if test="${!empty list}">
            <div style="margin: 0px 10%">

                <table cellpadding="0" cellspacing="0" border="0">
                    <div class="tbl-header">
                        <thead>
                            <tr>
                                <th scope="col">Code</th>
                                <th scope="col">Designation</th>
                                <th scope="col">Prix</th>
                                <th scope="col">Edit</th>
                                <th scope="col">Delete</th>
                            </tr>
                        </thead>
                    </div>
                    <div class="tbl-content">
                        <tbody>
                            <c:forEach items="${list}" var="article">
                                <tr>
                                    <td>${article.code}</td>
                                    <td>${article.designation}</td>
                                    <td>${article.prix}</td>
                                    <td><a href="<c:url value='/edit/${article.code}'/>" >Edit</a></td>
                                    <td><a href="<c:url value='/delete/${article.code}' />" >Delete</a></td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </div>
                </table>
                <div class="container">
                    <div class="vertical-center">
                        <a href="<c:url value='article/add'/>" >
                            <button style="background-color: cornflowerblue;border:0;height: 30px">Add</button>
                        </a>
                    </div>
                </div>
            </div>


        </c:if>
    </body>
</html>
