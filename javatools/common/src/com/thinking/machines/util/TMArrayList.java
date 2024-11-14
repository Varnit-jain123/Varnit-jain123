package com.thinking.machines.util;
public class TMArrayList implements TMList
{
private int collection[];
private int size;

public TMArrayList()
{
this.collection=new int[10];
this.size=0;
}

public void clear()
{
this.size=0;
}

public int removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("invalid index : "+index);
int ep=this.size-2;
int data=this.collection[index];
for(int e=index;e<=ep;e++)
{
this.collection[e]=this.collection[e+1];
}
this.size--;
return data;
}

public void add(int data)
{
if(this.size==collection.length)
{
int tmp[]=new int[this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
this.collection[this.size]=data;
this.size++;
} //add ends

public void add(int index,int data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("invalid index : "+index);
if(this.size==collection.length)
{
int tmp[]=new int[this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
for(int e=this.size;e>index;e--)
{
this.collection[e]=this.collection[e-1];
}
this.collection[index]=data;
this.size++;
} //add at specific index ends

public int get(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("invalid index : "+index);
return this.collection[index];
} //get ends

public int size() //There is a property named size and there is also a function named size. This is allowed in Java.
{
return this.size;
}

public void insert(int index,int data)
{
add(index,data);
}

public void removeAll()
{
clear();
}

public void update(int index,int data)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("invalid index : "+index);
this.collection[index]=data;
}

public void copyTo(TMList other)
{
other.clear();
for(int i=0;i<this.size();i++) other.add(this.get(i));
}

public void copyFrom(TMList other)
{
this.clear();
for(int i=0;i<other.size();i++) this.add(other.get(i));
}

public void appendTo(TMList other)
{
for(int i=0;i<this.size();i++) other.add(this.get(i));
}

public void appendFrom(TMList other)
{
for(int i=0;i<other.size();i++) this.add(other.get(i));
}

} //TMArrayList class ends
