import java.util.*;
class ThreadDemo
{
	public static void main(String args[])
	{
		Display d1=new Display();
		Thread1 ob1=new Thread1(d1,"t1");
		Thread2 ob2=new Thread2(d1,"t2");
		Thread3 ob3=new Thread3(d1,"t3");
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("exception occured");
		}
		System.out.println("main thread is exiting");
		
	}
}


class Display
{
	 void disp(int value)
	{
		System.out.println(" " + value);
		try
		{
		
				Thread.sleep(500);
		}
		catch (InterruptedException e) 
		{
			System.out.println(" interrupted.");
		}

	}

}
//finds factorial
class Thread1 implements Runnable
{
	String name;
	Thread t;
	Display objd;
	
	
	Thread1(Display d,String threadname)
	{
		objd=d;
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread"+t);
		t.start();
	}
	
	public void run()
	{	
		synchronized(objd)
		{
			int number=5;
			int fact=1;
			
			
			
				for (int i=2;i<=number;i++)
				{
					fact=fact*i;
					
				}
				System.out.println("the factorial of" + number +" is");
					objd.disp(fact);
				System.out.println("exiting" + name);
		
			
		}
			
	}
		
}


class Thread2 implements Runnable
{
		String name;
		Thread t;
		Display objd;
		int a[]=new int[20];
	
	
	Thread2(Display d,String threadname)
	{
		objd=d;
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread"+t);
		t.start();
	}
		public void run()
		{
			synchronized(objd)
			{
			int number=5;
			a[0]=0;
			a[1]=1;
		
	
			for(int i=2;i<number;i++)
			{
			a[i]=a[i-1]+a[i-2];
			}
			
		
			System.out.println("the " +number+" th fibonacci number is" );
			objd.disp(a[number-1]);
				System.out.println("exiting" + name);
			}
		}
	

}


class Thread3 implements Runnable
{
		String name;
		Thread t;
		Display objd;
		int a[]=new int[5];

	Thread3(Display d,String threadname)
	{
		objd=d;
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread"+t);
			a[0]=3;
			a[1]=6;
			a[2]=1;
			a[3]=2;
			a[4]=8;
		t.start();
	}
	
	public void run()
	{
		synchronized(objd)
		{
		int temp=0;
		int n=5;	
			System.out.print("the unsorted array is");
			for(int k=0;k<n;k++)
			{
				objd.disp(a[k]);
			}
	
			for(int i=0;i<n-1;i++)
			{
				for(int j=0; j<n-1-i;j++)
				{
					if(a[j]>a[j+1])
					{
						 temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			System.out.println("the sorted array is");
			for(int k=0;k<n;k++)
			{
				objd.disp(a[k]);
			}
				System.out.println("exiting" + name);
		
		
		}
		

	}
	

}

