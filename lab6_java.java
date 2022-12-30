import java.util.Scanner;
class WrongAgeException extends Exception{
	public String toString(){
		return ("age can't be negative");
	}
}

class AgeException extends Exception{
	public String toString(){
		return("Age of son can't be greater than father's age");	
	}
}

class Father
{
	int father_age;
	Father(int x) throws WrongAgeException
   {
          	father_age=x;
       		if(father_age<0)
        {
            		throw new WrongAgeException();
	}        
    }
}

class Son extends Father{
	int son_age;
    	Son(int x,int y) throws AgeException, WrongAgeException{
        		super(x);
        		son_age=y;
        		if(son_age<0){
            		throw new WrongAgeException();
        		}
        		if(son_age>=father_age){
            		throw new AgeException();
        }
    }
}


class lab7
{
	public static void main(String args[]) {
        		try {
            		Scanner s=new Scanner(System.in);
            		System.out.println("Enter father's  age :");
           		int x=s.nextInt();
			System.out.println("Enter son's age:");
            		int y=s.nextInt();
            		Son S=new Son(x,y);
            		System.out.println("Father age is " + S.father_age + "\nSon age is " + S.son_age);
        } 
		catch (WrongAgeException wa) {
         			System.out.println(wa);   
        		}
        		catch (AgeException a){
            		System.out.println(a);
        		}
        		catch (Exception e){
            		System.out.println("enter valid numbers");
        }
    }
}