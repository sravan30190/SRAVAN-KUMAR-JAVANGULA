import java.io.*;
class P214
{
    public static void main(String[] args)
   {
         boolean flag = false;
         int n=Integer.parseInt(args[0]);
        for(int i = 2; i <= n/2; ++i)
        {
             if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(n+ " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
   }
}