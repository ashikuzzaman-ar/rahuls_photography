<%-- 
    Document   : all_packages
    Created on : Jun 20, 2016, 3:19:33 AM
    Author     : Sajid
--%>

<%@page import="com.studevs.models.Packages"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if (request.getAttribute("packages") != null) {%>
        <table>
            <%for (Packages packages : (List<Packages>) request.getAttribute("packages")) {%>
            <tr>
                <td>
                    Package_Name : 
                </td>
                <td>
                    <%=packages.getName()%>
                </td>
            <tr>
                <td></td>
                
                <td>
                    <a href="get_package.htt?id=<%=packages.getId()%>">TAKE</a>
                </td>
            </tr>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
