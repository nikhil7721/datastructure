import java.util.Scanner;
public class Armrange {
   public static boolean  Armstrong(int n)
	{
		int r,sum=0,temp;
		temp=n;
			while(n>0)
	       {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
	       }
			if(temp==sum)
			return true;
			else
			return false;
	}
	public static void main(String[] args) 
	{
		int num;   
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the limit: ");    
		num=sc.nextInt();  
		System.out.println("Armstrong Number up to "+ num + " are: ");  
		for(int i=0; i<=num; i++)  
		if(Armstrong(i))  
		System.out.print(i+ ", ");   

	}

}