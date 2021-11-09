package hello;

public class armstrong
{
public static void main(String[] args)
{int r,sum=0,n=162,temp;
temp=n;
	while(n>0)
	{
	r=n%10;
	sum=sum+r*r*r;
	n=n/10;
	}
	if(temp==sum)
	System.out.println("no is armstrong no");
	else
	System.out.println("no is not an armstrong no");

}
}
