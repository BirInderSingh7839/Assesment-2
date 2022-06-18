package com.prodapt.weeklytest2;
public class AbstractChild extends MyAbstract{
@Override
void hi()
{
System.out.println("Abstract Class!!");
}
void disp()
{
System.out.println("Data:"+data);
}
void yes()
{
super.hello();
System.out.println("Super!!");
}
}
