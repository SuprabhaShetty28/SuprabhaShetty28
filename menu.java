import java.io.*;
class menu
{
	public static void main(String args[])throws io Exception
	{
		int num,rev=0,sum=0,f1=0,f2=1,i,d,ch,f3;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("menu\n");
		System.out.println("1.reverse a number and find sum of digits");
		System.out.println("2.print the fibonacci series");
		ch=Integer.parseInt(in.readLine());
		switch(ch)
		{
			case 1:System.out.println("enter the number\n");
			num=Integer.parseInt(in.readLine());
			while(num!=0)
			{
				d=num%10;
				sum=sum+d;
				rev=rev*10+d;
				num=num/10;
			}
			System.out.println("sum of digits:"+sum);
			System.out.println("reverse of the number :"+rev);
			break;
			case 2:System.out.println("enter how many numbers you want\n");
			num=Integer.parseInt(in.readLine());
			if(num<0)
			System.out.println("invalid entry");
			else if(num==1)
			System.out.println(f1+"\n");
			else
			{
				System.out.println("\n"+f1+"\n"+f2+"\n");
				for(i=3;i<=num;i++)
				{
					f3=f1+f2;
					System.out.println("f3+"\n");       
					f1=f2;
					f2=f3;
				}
			}
			break;
			default:System.out.println("invalid");
		}
		
	}
}

		