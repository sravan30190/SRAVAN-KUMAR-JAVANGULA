import java.io.*;
import java.util.*;
class box
{
 public double vol(double l,double w,double h)
{
return l*w*h;
}
public static void main(String[] sravan)
{
box pk=new box();
System.out.println("total volume:" +pk.vol(10,20,10)+  "cubic mts");
}
} 