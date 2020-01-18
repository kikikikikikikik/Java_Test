<%@ page import="com.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28893
  Date: 2020/1/18
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student stu1 = new Student(10,"mike");
    Student stu2 = new Student(20,"allen");
    List<Student> list=new ArrayList();
    list.add(stu1);
    list.add(stu2);
%>
<!--JSP进行简单循环输出-->
<%
    for(Student stu:list){
        out.write(stu.getSid()+" "+stu.getSname()+"<br>");
    }
%>
<!--JSP进行简单循环输出结合html-->
<center>
    <table border="2">
        <tr>
            <td>学员编号</td>
            <td>学员姓名</td>
        </tr>
        <%
          for(Student student:list){
          %>
        <tr>
            <td><%=student.getSid()%></td>
            <td><%=student.getSname()%></td>
        </tr>
        <%
          }
        %>
    </table>
</center>
