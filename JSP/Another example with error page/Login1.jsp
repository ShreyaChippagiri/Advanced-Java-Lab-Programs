<%@ page import= "java.util.*"%>
<%@ page import= "java.lang.*"%>
<%@page errorPage= "myerror.jsp"%> 
<HTML>
<TITLE>
LOGIN
</TITLE>
<BODY>
<form name="myform" method="GET">
<%! String username;
    String password1;
    String returnDate()
    { Date today= new Date();
      return today.toString();
    }
%>
<BR>
<input type="textbox" name="username" value="" size=25>
<P>
<input type="password" name="password1" value="" size=25>
<P>
<input type="submit" value="retrieve">
</form>
<% String user= request.getParameter("username");
   String pwd= request.getParameter("password1");
   if(user != null && pwd!= null)
   {
    if("nish".equals(user) && "hi".equals(pwd))
     { out.println("Successful Login");
       out.println(returnDate());
     }
     else
     { throw new Exception();
     }
	}
   
%>
</BODY>
</HTML>  