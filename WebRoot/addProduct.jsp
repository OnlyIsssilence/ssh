<%--
  Created by IntelliJ IDEA.
  User: onlyisssilence
  Date: 2017/2/23
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>保存商品标签</h1>
<s:form action="product_add" method="POST" namespace="/" theme="simple">
    <table border="1" width="400">
        <tr>
            <td>商品名称</td>
            <td><s:textfield name="product.pname"/></td>
        </tr>

        <tr>
            <td>商品价格</td>
            <td><s:textfield name="product.price"/></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="添加"/></td>
        </tr>

    </table>
</s:form>


<jsp:plugin type="applet" codebase="dirname" code="MyApplet.class" width="60" height="80">

    <jsp:params>
        <jsp:param name="fontcolor" value="red"/>
        <jsp:param name="background" value="black"/>
    </jsp:params>

    <jsp:fallback>
        Unable to initialize Java Plugin
    </jsp:fallback>

</jsp:plugin>



























</body>
</html>
