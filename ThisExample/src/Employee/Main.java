package Employee;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
private int id;
private int salary;
private String name;
private String email;

Employee(int id, String name, String email, int salary){

this.id = id;
this.name = name;
this.salary = salary;
this.email = email;

}
public int getId(){
return id;
}

public String getName(){
return name;
}

public String getEmail(){
return email;
}

public int getSalary(){
return salary;
}

public String toString(){
return id+" "+name+" "+email+" "+salary;
}
}

public class Main{
	
public static void main(String[] args){
	ArrayList<Employee> lst = new ArrayList<Employee>();

 

Scanner num = new Scanner(System.in);

Scanner text = new Scanner(System.in);

int ch;
do{
System.out.println("Welcome to Database\n1)Insert\n2)Show\n3)Search\n4)Delete\n5)Update");
System.out.println("\nEnter Your Choice:");
ch = num.nextInt();

switch(ch){
default: System.out.println("InValid Choice\n-------------------------");
break;

case 1:
System.out.println("Enter the id:");
int id = num.nextInt();
System.out.println("Enter the name:");
String name = text.nextLine();
System.out.println("Enter the email:");
String email = text.nextLine();
System.out.println("Enter the salary:");
int salary = num.nextInt();
lst.add(new Employee(id,name,email,salary));
break;

case 2:
System.out.println("\nShowing the list of Employee:\n-------------------------------------");

Iterator<Employee> i = lst.iterator();

while(i.hasNext()){
Employee e = i.next();
System.out.println(e);
}

System.out.println("----------------------------------");
break;

case 3:
boolean found = false;
System.out.println("Enter the Employee Id:  ");
int e_id = num.nextInt();
i = lst.iterator();
while(i.hasNext())
{

Employee e = i.next();
if(e.getId()==e_id)
{

System.out.println("\n-----------------------------\n"+e);
found = true;
}
}
System.out.println("-----------------------------------");
if(!found){
System.out.println("No Data found\n-----------------------------------");
}
break;

case 4:
found = false;
System.out.println("Enter the Id to be DELETED: ");
e_id = num.nextInt();
i = lst.iterator();

while(i.hasNext()){

Employee e = i.next();

if(e.getId() == e_id){

i.remove();

found = true;

}

}

if(!found){

System.out.println("No data on '"+e_id+"' found");

}

else{

System.out.println("----------------------------------\nId : '"+e_id+"' is Successfully DELETED\n-------------------------------------");

}

break;

 

case 5:

found = false;

System.out.println("Enter the employee Id");

e_id = num.nextInt();

 

ListIterator<Employee> l = lst.listIterator();

 

while(l.hasNext()){

Employee e = l.next();

if(e.getId()==e_id){

System.out.println("Enter the name:");

name = text.nextLine();

System.out.println("Enter the email:");

email = text.nextLine();

System.out.println("Enter the salary:");

salary = num.nextInt();

l.set(new Employee(id=e.getId(),name,email,salary));

found = true;

}

}

if(!found){

System.out.println("No Data Found");

}

else{

System.out.println(""+e_id+" is Successfully Updated");
}
break;
}
}while(ch!=0);
}

}
