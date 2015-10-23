<jsp:useBean id="login" class="com.connexiaair.Login" scope="session" />
<jsp:setProperty name="login" property="*" />
<html>
<head>
<title>Connexia Airlines</title>
<body>
<%
if (login.checkCredentials())
{
%>
Welcome <%=request.getParameter("id") %> !
<% } else { %>
Invalid credentials.
<% } %>
</body></html>