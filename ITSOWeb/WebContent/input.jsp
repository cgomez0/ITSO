<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<h2>Welcome, Liberty Developer</h2>
	<h:form>
		<br /> Enter your name:
		<h:inputText id="name" value="#{userManagedBean.name }" />
		<br />Enter your location:
		<h:inputText id="location" value="#{userManagedBean.location }" />
		<br />
		<h:commandButton action="#{userManagedBean.submit }" value="submit" />
		
	</h:form>
</f:view>
</body>
</html>