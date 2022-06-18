package com.prodapt.weeklytest2;


public class Hr_Manager {
String na;
int ag;
String des;

public Employee dispRecords(Employee obj) {
na = obj.getName();
ag = obj.getAge();
des = obj.getDesignation();
return obj;
}

void processRecords() {
System.out.println("Name:" + na);
System.out.println("Age:" + ag);
System.out.println("Designation:" + des);
}
}