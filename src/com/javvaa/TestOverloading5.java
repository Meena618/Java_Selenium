package com.javvaa;

class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading5{  
public static void main(String[] args){  
System.out.println(Adder.add(35,68));  
System.out.println(Adder.add(12.3,12.6));  
}} 