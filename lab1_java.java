import java.util.Scanner;
class quadraticequation
{
  public static void main(String args[])
   {
     Scanner S = new Scanner(System.in);
     System.out.println("Enter the values of a b and c");
     double a,b,c,d,r1,r2;
     a=S.nextFloat();
     if(a==0)
      {
       System.out.println("invalid input");
      }
     else
   {
     b=S.nextFloat();
     c=S.nextFloat();
     d=(b*b)-(4*a*c);
     
     if(d>0)
      {
         r1=(-b+Math.pow(d,0.5))/(2*a);
         r2=(-b-Math.pow(d,0.5))/(2*a);
  
	System.out.println(" Roots are Real and Distinct and The values are:  " + r1 + "and" + r2);
      }
	else if(d==0)
	  {
            r1=-b/(2*a);
	    System.out.println("Roots are Equal and the values are " + r1);
	  }
     else
 	{
            r1=-b/(2*a);
            r2=(Math.sqrt(Math.abs(d)))/(2*a);
	  System.out.println("Roots are not real and the values are " + r1 + "+i" +Math.abs(r2)+ "and" + r1+ "-i" +Math.abs(r2));	
	}
     }
   }

}				