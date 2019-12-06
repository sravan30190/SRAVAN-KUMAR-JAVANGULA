
import java.io.*;
import java.util.*;
import java.lang.*;
class author
{
private String name,email,gen;
author(String name,String email,String gen)
{
name=this.name;
email=this.email;
gen=this.gen;
}
String getname()
{
return name;
}
String getemail()
{
return auname;
}
String getgen()
{
return gen;
}

}
class book
{
private String bname,aname;
private Double price;
private int qunty;
book(String bname,String aname)
{
this.bname=bname;
this.aname=aname;
}
String getbname()
{
return bname;
}
String getaname()
{
return aname;
}
void setqty(int qunty)
{
this.qunty=qunty;
}
int getqty()
{
return qunty;
}
void setprice(Double price)
{
this.price=price;
}
Double getprice()
{
return price;
}
}
class main{
public static void main(String[] srvan)
{
author pk=new author("ravi","drbabu456@gmail.com","othres");
book ps = new book("Sherlock Homles","Sir Arthur Conan Doyle");
System.out.println("NAME OF THE BOOK:\n "+ps.getbname());
System.out.println("NAME OF THE author:\n "+ps.getaname());
ps.setprice(96.58);
ps.setqty(10);
System.out.println("PRICE:\n"+ps.getprice());
System.out.println("QUNTITY:\n"+ps.getqty());
System.out.println("NAME:\n"+pk.getname());
System.out.println("GENDER:\n"+pk.getgen());
System.out.println("EMAIL:\n"+pk.getemail());


}
}




