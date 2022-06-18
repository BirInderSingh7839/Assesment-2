package com.prodapt.weeklytest2;


public class Employee {
String Name;
int Age;
String Designation;

public String getName() {
return Name;
}

public Employee(String name, int age, String designation) {
this.Name = name;
this.Age = age;
this.Designation = designation;
}

public void setName(String name) {
Name = name;
}

public int getAge() {
return Age;
}

public void setAge(int age) {
Age = age;
}

public String getDesignation() {
return Designation;
}

public void setDesignation(String designation) {
Designation = designation;
}
}