//package com.javvaa;
//
//	import java.util.Scanner;
//
//	class ScannerClass
//	{
//		int id;  
//		String name;
//		float sal;
//		void Person (int id,String name,float sal)
//		{
//			this.id=id;
//			this.name=name;
//			System.out.println("person constructor is excuted");
//
//		    
//		}
//	}
//
//	class Employee extends Person
//	{
//		float sal;
//		Employee(int id, String name, float sal) {
//
//			super();
//			this.sal=sal;
//			System.out.println("employee constr excuted");
//
//		}
//		void dispaly()
//
//		{
//			
//		    Scanner s=new Scanner(System.in);
//			System.out.println(" employeee details are:");
//			System.out.println("enter employe id name sal:");
//			
//			int  id=s.nextInt();
//			String name=s.next();
//		    float sal=s.nextFloat();
//			
//		    System.out.println(+id +" " +name +sal);
//			System.out.println("employee id :"+id);
//			System.out.println("employee name is:"+name);
//		    System.out.println("employee sal:"+sal);
//	       // System.out.println(id+" "+name+" "+sal);
//
//
//		}
//
//	}
//
//	class ProgramThisuper {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Employee e=new Employee(11,"mani",30000);
//			e.dispaly();
//		}
//
//	
//
//}
//
