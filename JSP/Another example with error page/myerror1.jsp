<%@page import="java.util.*"%>
<%@page isErrorPage="true" %>
<HTML>
<TITLE>
ERROR PAGE
</TITLE>
<BODY>
<B> An Error Occured <P>
<P> <FONT COLOR="RED"> <%= exception.toString()%>
</FONT>
<P> <% exception.printStackTrace(); %>
<P> Please correct the error & try again 
<BR>
</BODY>
</HTML> 