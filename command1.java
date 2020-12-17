class Command1
{
public static void main(String s[])
{
long id;
double balance;
id=Long.parseLong(s[0]);
balance=Double.parseDouble(s[1]);
System.out.println("Customer ID: "+id);
System.out.println("Customer Balance: "+balance);
}
}

