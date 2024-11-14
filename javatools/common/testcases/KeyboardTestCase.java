import com.thinking.machines.util.*;

class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("enter a string : ");
a=k.getString();
String b;
b=k.getString("enter another string : ");
char c;
c=k.getCharacter("enter your gender (M/F) : ");

long d;
d=k.getLong("enter long type value : ");
int e;
e=k.getInt("enter int type value : ");
short f;
f=k.getShort("enter short type value : ");
byte g;
g=k.getByte("enter byte type value : ");
double h;
h=k.getDouble("enter double type value : ");
float i;
i=k.getFloat("enter float type value : ");
boolean j;
j=k.getBoolean("enter boolean type value : ");

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);

}
}