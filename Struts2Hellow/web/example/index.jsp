<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="index page"/></title>
    </head>

    <body>
        <s:form action="product">
            <s:textfield name="id" label="Product Id"></s:textfield>
            <s:textfield name="name" label="Product Name"></s:textfield>
            <s:textfield name="price" label="Product Price"></s:textfield>
            <s:submit value="Save"></s:submit>
        </s:form>
    </body>
</html>