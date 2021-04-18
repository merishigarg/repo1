//To check number is palindrome or not

import java.util.Scanner;
{
public static void main (String[] args)
{
Scanner p=new Scanner(System.in);
System.out.print("Enter a number: ");
int a=p.nextInt();
b=a;
rev=0;
while(a>0)
{
rev=(rev*10)+(a%10);
a=a/10;
}
if(b==rev)
System.out.print("\nNumber is Palindrome");
else
System.out.print("\nNumber is not Palindrome");
}
}
