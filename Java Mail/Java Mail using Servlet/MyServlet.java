import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		final String name = req.getParameter("userName");
		final String pass = req.getParameter("pass");
		String to = req.getParameter("to");
		String sub = req.getParameter("sub");
		String msg = req.getParameter("msg");
		
		Properties props = System.getProperties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props, 
				new javax.mail.Authenticator(){
			
				protected PasswordAuthentication getPasswordAuthentication(){
					
					return new PasswordAuthentication(name, pass);
				}
		});
		
		//Session session = Session.getDefaultInstance(props);
		try{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(name));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Mail through JAVA!!");
			message.setText(msg);
			Transport.send(message);
			
			System.out.println("Mail sent successfully!! :D");
		}catch(MessagingException e){
			
			throw new RuntimeException(e);
		}
		
	}
}

