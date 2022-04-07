
package com.javvaa;

class Animal1{  
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends Animal1{  
void eat1(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat(); 
eat1();
bark();  
}  
}  
class SuperDemo{  
public static void main(String args[]){  
Dog1 d=new Dog1();  
d.work();  
}}  
