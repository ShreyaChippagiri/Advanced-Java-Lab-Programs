import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTabbedPaneDemo extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(
			new Runnable()
			{
				public void run()
				{
					makeGUI();
				}
			});
		} 
		catch (Exception exc) 
		{
			System.out.println("Can't create because of " + exc);
		}
	}
	
	private void makeGUI() 
	{
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Login", new LoginPanel());
		jtp.addTab("Numbers", new NumberPanel());
		//jtp.addTab("Imagine", new ImaginePanel());
		add(jtp);
	}
}

class LoginPanel extends JPanel implements ActionListener
{
	JTextField jtf;
	JLabel jlab;
	JButton jb;
	
	public LoginPanel()
	{
		jlab = new JLabel("Name:");
		add(jlab);
		jtf = new JTextField(15);
		add(jtf);
		jlab = new JLabel("City:");
		add(jlab);
		jtf = new JTextField(15);
		add(jtf);
		jb = new JButton("CLICK");	
		jb.setActionCommand("WELCOME!!");
		jb.addActionListener(this);
		add(jb);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		jlab.setText(jb.getActionCommand());
		add(jlab);
	}
}

class NumberPanel extends JPanel implements Runnable
{
	JTextField jtf;
	JLabel jlab;
	JButton jbStart;
	JButton jbStop;
	Thread t;
	NumberPanel p;
	static int i = 0;
	volatile boolean var = true;
	
	public NumberPanel()
	{
		p = this;
		
		jbStart = new JButton("START");
		jbStart.setActionCommand("BeginCount");
		jbStart.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				var = true;
				new Thread(p).start();
			}
		});
		add(jbStart);
		
		jbStop = new JButton("STOP");
		jbStop.setActionCommand("EndCount");
		jbStop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				var = false;
			}
		});
		add(jbStop);
		
		jlab = new JLabel("COUNTER:");
		add(jlab);
		
		jtf = new JTextField(15);
		jtf.setText("0");
		add(jtf);
	}
	
	public void run()
	{
		try
		{
			while(var == true)
			{
				jtf.setText("" + (Integer.parseInt(jtf.getText()) + 1));
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
		
		}
	}
}