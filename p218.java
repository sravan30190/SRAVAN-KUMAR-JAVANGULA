import java.io.*;
import java.util.*;
class P218 
{
public static void main(String[] args) 
{
int n= 121, r = 0, rm, o;
o = n;
while( n!= 0 )
{
rm = n% 10;
r =r * 10 + rm;
n/= 10;
 }
if (o == r)
{
System.out.println(o+ " is a palindrome.");
}
else
{
System.out.println(o + " is not a palindrome.");
}
}}