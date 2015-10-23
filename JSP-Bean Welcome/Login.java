package com.connexiaair;
import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

public class Login
{
private String id;
private String password;

public void setId(String value)
  {
   id=value;
  }
public void setPwd(String value)
  {
   password=value;
  }

  
  public Login(){
  }
  public boolean checkCredentials(){
  if("pes".equalsIgnoreCase(id) && "pes".equalsIgnoreCase(password)){
  return true;
  }else{
   return false;
  }
  }
}
  
  