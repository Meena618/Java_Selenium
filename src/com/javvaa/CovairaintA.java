package com.javvaa;

class CovairanitA{    
	CovairanitA get(){return this;}    
}    
    
class B1 extends CovairanitA{    
@Override  
B1 get(){return this;}    
void message(){System.out.println("welcome to covariant return type");}    
    
public static void main(String args[]){    
new B1().get().message();    
}    
}  