package com.thinking.machines.util;
public class TMLinkedList implements TMList 
{
class TMNode
{
public int data;
public TMNode next;
TMNode()
{
data=0;
next=null;
}
}
private TMNode start,end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
} 

public void add(int data)
{
TMNode t=new TMNode();
t.data=data;
if(this.start==null)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
end=t;
}
this.size++;
}

public void add(int index,int data)
{
insert(index,data);
}

public void insert(int index,int data)
{
if(index<0) throw new ArrayIndexOutOfBoundsException("invalid index :"+index);
if(index>=size) 
{
add(data);
return;
}
TMNode node=new TMNode();
node.data=data;
if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
TMNode j,k;
int i=0;
k=null;
j=this.start;
while(i<index)
{
k=j;
j=j.next;
i++;
}
k.next=node;
node.next=j;
}
this.size++;
}

public void removeAll()
{
this.clear();
}

public int removeAt(int index)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("Invalid ibndex :"+index);
int data;
if(start==end) // only one node
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0) //many but remove first
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode j,k;
k=null;
j=this.start;
int i=0;
while(i<index)
{
k=j;
j=j.next;
i++;
}
data=j.data;
k.next=j.next;
if(this.end==j) this.end=k;
this.size--;
return data;
}

public void clear()
{
this.size=0;
this.start=null;
this.end=null;
}

public int size()
{
return this.size;
}

public int get(int index)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("Invalid index : "+index); 
int x=0;
TMNode t;
t=start;
while(x<index)
{
t=t.next;
x++;
}
return t.data;
}

public void update(int index,int data)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("invalid index :"+index);
if(index==0)
{
this.start.data=data;
}
if(index==size-1)
{
this.end.data=data;
}
TMNode j;
int i;
i=0;
j=this.start;
while(i<index)
{
j=j.next;
i++;
}
j.data=data;
}

public void copyTo(TMList other)
{
other.clear();
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void copyFrom(TMList other)
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void appendTo(TMList other)
{
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void appendFrom(TMList other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}


}