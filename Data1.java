import java.io.*;
class Data1
{
public static void main(String j[])throws Exception
{
int pid;
String pname;
double pprice;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter The Product ID ");
pid=Integer.parseInt(dis.readLine());
System.out.println("Enter The Product Name ");
pname=dis.readLine();
System.out.println("Enter The Product Price ");
pprice=Double.parseDouble(dis.readLine());
System.out.println("Product Details: ");
System.out.println("Product ID: "+pid);
System.out.println("Product Name: "+pname);
System.out.println("Product Price: "+pprice);
}
}