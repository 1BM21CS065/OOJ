class call implements Runnable
 {
   String a;
   int x,time;
   Thread t;
   call(String tn,int ti,int ex)
    {
	a=tn;
	x=ex;
	time=ti;
	t=new Thread(this,a);
	t.start();
    }

synchronized public void run()
  {
    try
     {
       for(int i=0;i<x;i++)
	{
	  System.out.println(a);
	  Thread.sleep(time);
	}
    }
 catch(InterruptedException ie)
   {
     System.out.println("interrupted execution");
   }
 }
}
class lab_7
 {
   public static void main(String xx[])
    {
	new call("BMS college of engineering",10000,2);
	new call("CSE",2000,10);
    }
 } 
