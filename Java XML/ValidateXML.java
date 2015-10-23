    import java.io.File;  
    import java.io.IOException;  
    import java.util.ArrayList;  
    import java.util.List;  
      
    import javax.xml.parsers.ParserConfigurationException;  
    import javax.xml.parsers.SAXParser;  
    import javax.xml.parsers.SAXParserFactory;  
     import org.xml.sax.Attributes;  
    import org.xml.sax.SAXException;  
    import org.xml.sax.SAXNotRecognizedException;  
    import org.xml.sax.SAXNotSupportedException;  
    import org.xml.sax.helpers.DefaultHandler;  
    public class ValidateXML extends DefaultHandler  {  
    static List<String> emps=new ArrayList<String>();  
    public static StringBuffer buffer=new StringBuffer();  
      
      
     public static void main(String[] args)   
     {  
        
        
      try {  
       SAXParserFactory factory=SAXParserFactory.newInstance();  
         
       SAXParser parser=factory.newSAXParser();  
        File file=new File("C:/employee.xml");  
             
         parser.parse(file, new ValidateXML());  
                          System.out.println(buffer);  
         System.out.println("the no. of emps are :::: "+emps.size()); 
       for(int i=0;i<emps.size();i++) 
        System.out.println("EMP"+i+"n"+emps.get(i));  
      }  
       catch (IOException e) {  
        // TODO Auto-generated catch block  
        e.printStackTrace();  
       }  
        
      catch (ParserConfigurationException e) {  
       // TODO Auto-generated catch block  
       e.printStackTrace();  
      } catch (SAXException e) {  
       System.out.println("XML is not well formed");  
       // TODO Auto-generated catch block  
       e.printStackTrace();  
      }  
                             
     }  
      
      public void startElement(String uri, String localName, String qName,  
       Attributes attributes) throws SAXException   
       {  
        
      System.out.println("name start tag has to be displayed");  
      buffer.append("<");   
       System.out.println("Start element qname ==== "+qName);  
       System.out.println("uri===="+uri);  
       System.out.println("local name===="+localName);  
      buffer.append(qName);  
       buffer.append(">");   
       System.out.println("Inside start Element::::"+qName);  
              
         
       }  
       
        
       public void endElement(String uri, String localName, String qName)  
        throws SAXException   
        {  
       
     buffer.append("</");   
       System.out.println("end element name == "+qName);  
     buffer.append(qName);  
       buffer.append(">");   
         
       if(buffer.toString().contains("<Personnel>")) 
        buffer.toString().replace("<Personnel>", " "); 
       if(buffer.toString().contains("</Personnel>")) 
        buffer.toString().replace("</Personnel>", " "); 
       if(qName.equalsIgnoreCase("employee")){ 
     //  emps.add(buffer); 
       buffer.delete(0, buffer.length()); 
       }
       
       System.out.println(buffer);  
       
        }  
        
         
       @Override  
       public void characters(char[] ch, int start, int length)  
         throws SAXException   
         {  
        System.out.println("The string is ::::"+new String(ch,start,length));  
          
       buffer.append(new String(ch,start,length).replaceAll("&", "&amp;").trim());    
       
                 
         }  
         
    }  