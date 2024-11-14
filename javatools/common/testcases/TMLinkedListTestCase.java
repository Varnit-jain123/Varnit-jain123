import com.thinking.machines.util.*;
class TMLinkedListTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(10);
list1.add(20);
list1.add(30);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
//TMLinkedList list2=new TMLinkedList();
//list2.copyFrom(list1);
//for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("Afet inserting");
list1.insert(0,5);
list1.insert(2,15);
list1.insert(5,35);
list1.insert(10,40);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("after removing");
System.out.println("removed :"+list1.removeAt(2));
System.out.println("removed :"+list1.removeAt(4));
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

list1.update(0,1000);
list1.update(3,5000);
list1.update(4,2000);

System.out.println("updated list");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("Appending from list 2 to list 1");
TMLinkedList list2=new TMLinkedList();
list2.add(1000);
list2.add(2000);
list2.add(3000);
list1.appendFrom(list2);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.appendTo(list2);
System.out.println("Appending to list 2 from list 1");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

}
}