package com.prodapt.weeklytest2;

public class TestController {

public static void main(String[] args) {
Employee obj = new Employee("Bir Inder", 21, "Software Developer");
Hr_Manager o1 = new Hr_Manager();
obj = o1.dispRecords(obj);
o1.processRecords();

Employee x = new Employee("MEHER", 21, "ASE Delivery");
x = o1.dispRecords(x);
o1.processRecords();

Employee z = new Employee("Vinay", 33, "Delivery Head");
z = o1.dispRecords(z);
o1.processRecords();

Employee b = new Employee("Udit", 34, "Project Manager");
b = o1.dispRecords(b);
o1.processRecords();

Employee a = new Employee("Raghu", 40, "Team Lead");
a = o1.dispRecords(a);
o1.processRecords();

}

}