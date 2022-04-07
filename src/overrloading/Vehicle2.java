package overrloading;


class Vehicle2{  
	 public void run(){System.out.println("Vehicle is running");}  
	 
	//Creating a child class  
	 static class Bike2 extends Vehicle2{  
		 public void runv()
		 
		 {System.out.println("Bike isgg running");}  
		 
	 
	  public static void main(String[] args){  
	  //creating an instance of child class  
	  Bike2 obj = new Bike2();  
	  //calling the method with child class instance  
	  obj.run();
	  obj.runv();
	  
	  
	  }  
	}}