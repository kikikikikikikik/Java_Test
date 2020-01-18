<%--
  Created by IntelliJ IDEA.
  User: 28893
  Date: 2020/1/18
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--在JSP中第一种书写if-->
<%
    int age = 23;
    if(age >= 18){
        out.write("欢迎");
    }else {
        out.write("谢谢");
    }
%>
<!--在JSP中第二种书写if-->
<%
    if(age >= 18){
%>
    <font color="red">欢迎</font>
<%
    }else{
        %>
        <font color="green">谢谢</font>
           <%
    }
%>
