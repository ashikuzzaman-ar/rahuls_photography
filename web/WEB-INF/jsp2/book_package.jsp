<%-- 
    Document   : book_package
    Created on : Jun 20, 2016, 3:03:39 PM
    Author     : Sajid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book package</title>
    </head>

    <body>
        <form:form modelAttribute="booking" action="book_it.htt" method="POST">
            <table>
                <form:hidden path="package_id"/>


                <tr>
                    <td>
                        <form:select path="date">
                            <form:options items="${slots}"/>
                        </form:select>
                    </td>
                </tr>
                <!--<br><br><br>-->

                <tr>
                    <td>
                        <form:input path="name" placeholder="Enter your name"/><br>
                        <form:errors path="name"/>
                    </td>
                </tr>


                <tr>
                    <td>
                        <form:input path="email" placeholder="Enter your email"/><br>
                        <form:errors path="email" />
                    </td>
                </tr>




                <tr>
                    <td>
                        <form:input path="event_venue" placeholder="Enter the event venue"/><br>
                        <form:errors path="event_venue" />
                    </td>
                </tr>



                <tr>
                    <td>
                        <form:input path="contact_number" placeholder="Enter your contact number"/><br>
                        <form:errors path="contact_number" />
                    </td>
                </tr>

                <tr>
                    <td>
                        Fill in the following fields after
                        you have made required advance...
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:input path="booking_bkash_account" placeholder="Enter bkash account number"/><br>
                        <form:errors path="booking_bkash_account" ></form:errors>
                        </td>
                    </tr>


                    <tr>
                        <td>
                        <form:input path="bkash_transaction_id" placeholder="Enter the transaction id"/><br>
                        <form:errors path="bkash_transaction_id" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="BOOK">
                    </td>
                </tr>
            </table>

        </form:form>
    </body>
</html>
