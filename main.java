import java.io.*;
import java.lang.*;
import java.util.*;
class cal
{
static int intpower(int a, int b)
{
int p=1;
        while (b != 0)
        {
            p *= a;
            b--;
        }
return p;
}
static double Dpower(double x, double y)
{
double q;
q=Math.pow(x,y);
return q;
}
}
class main
{
public static void main(String[] ars)
{
cal pk=new cal();
System.out.println("Integers power result:"+pk.intpower(4,5));
System.out.println("Double power result:"+pk.Dpower(4.2,5.8));
}
}