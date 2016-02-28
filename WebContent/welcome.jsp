<%@page import="java.util.List"%>
<%@page import="weplay.spring.HelloWorld"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome to JokerWebTest Index</title>
	<script src="/WePlay/jQuery/jquery-1.11.3.min.js"></script>
	<script src="/WePlay//bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="/WePlay/bootstrap-3.3.4-dist/css/bootstrap.min.css"></link>

</head>

<script type="text/javascript">
	$(function(){
		
		$("#showBinary").click(function(){
			var text = $("input[name='text']").val();
			alert(text);
		});
	});
</script>
<body>
<h1>Welcome We Play!</h1>
<h2>You can do every thing you want!</h2>

	<div style="width:400px;">
	
	<%
		List list = (List)request.getAttribute("list");
	
		for(int i =0 ; i<list.size(); i++){
			HelloWorld h = (HelloWorld)list.get(i);
			
			%>
				<h1><%=h.getName() %>,We Play! </h1><br/>
			<%
		}
	%>
	</div>
	
</body>
</html>