import java.util.Properties;
import javax.naming.*;

public class Lookup {        
  public static void main(String[] args) {        
    String name = "";
    if (args.length > 0) 
      name = args[0];
        
    try {
      // Create a Properties object and set properties appropriately
      Properties props = new Properties();
      props.put(Context.INITIAL_CONTEXT_FACTORY,
          "com.sun.jndi.fscontext.RefFSContextFactory");
      props.put(Context.PROVIDER_URL, "file:///");
            
      // Create the initial context from the properties we just created
      Context initialContext = new InitialContext(props);
            
      // Look up the object
      Object obj = initialContext.lookup(name);
      if (name.equals(""))
        System.out.println("Looked up the initial context");
      else
        System.out.println(name + " is bound to: " + obj);
    }
    catch (NamingException nnfe) {
      System.out.println("Encountered a naming exception");
    }
  }
}