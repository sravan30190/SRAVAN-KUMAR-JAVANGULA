import java.io.*;
import java.util.*;
class P220
{
public static void main(String args[])
{
Scanner hc = new Scanner(System.in);
int a=hc.nextInt();
int b=hc.nextInt();
char s;
do{
System.out.println("1.add\n2.sub");
System.out.println("enter choice:");
int choice=hc.nextInt();
switch(choice)
{
case 1:
int sum= a+b;
System.out.println("sum is:"+sum);
break;
case 2:
int diff= a-b;
System.out.println("diff is:"+diff);
break;
}
System.out.println("will you continue:");
s=hc.next().charAt(0);
}
while(s=='Y' || s=='y');
}
}