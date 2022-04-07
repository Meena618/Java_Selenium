//package com.javvaa;
//
//final class EmployeePannumber{
//    
//	 	final String pancardNumber;    
//	 	public EmployeePannumber(String pancardNumber)  
//	 	{    
//	 		this.pancardNumber=pancardNumber;    
//	 	}  
//	 	public String getPancardNumber(){    
//	 		return pancardNumber;    
//	 	}    
//	 }    
//	 public class ImmutableDemo  
//	 {  
//	 	public static void main(String ar[])  
//	 	{  
//	 		/*
//	 		 * Employee e = new Employee("ABC123"); String s1 = e.getPancardNumber();
//	 		 * System.out.println("Pancard Number: " + s1);
//	 		 */
//	 		
//	 		String s1 = new String("ravi kumar");    //String 1  
//	 		
//	 		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1, 5) + s1.substring(5, 6).toUpperCase() + s1.substring(5);
//	 		
//	 		System.out.println("===>> "+ s1);
//	 		
//	 		
//	 		String[] strArr = s1.split("\\s");
//	 		
//	 		
//	 		
//	 		for (int i=0; i< strArr.length; i++) {
//	 			System.out.println("before --> "+strArr[i]);
//	 			
//	 			System.out.println("substring --> "+strArr[i].substring(0, 1).toUpperCase());
//	 			strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
//	 			
//	 			//ravi = (r).upper + avi
//	 			System.out.println("after --> "+strArr[i]);
//	 		}
//	 		
//	         //s1 = s1.substring(0, 1).toUpperCase()  + s1.substring(1);
//	         //System.out.println(s1);
//	 		
//	 	}  
//	 } final class Employee
//	 {    
//			final String pancardNumber;    
//			public Employee(String pancardNumber)  
//			{    
//				this.pancardNumber=pancardNumber;    
//			}  
//			public String getPancardNumber(){    
//				return pancardNumber;    
//			}    
//		}    
//		public class ImmutableDemo  
//		{  
//			public static void main(String ar[])  
//			{  
//				/*
//				 * Employee e = new Employee("ABC123"); String s1 = e.getPancardNumber();
//				 * System.out.println("Pancard Number: " + s1);
//				 */
//				
//				String s1 = new String("ravi kumar");    //String 1  
//				
//				s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1, 5) + s1.substring(5, 6).toUpperCase() + s1.substring(5);
//				
//				System.out.println("===>> "+ s1);
//				
//				
//				String[] strArr = s1.split("\\s");
//				
//				
//				
//				for (int i=0; i< strArr.length; i++) {
//					System.out.println("before --> "+strArr[i]);
//					
//					System.out.println("substring --> "+strArr[i].substring(0, 1).toUpperCase());
//					strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
//					
//					//ravi = (r).upper + avi
//					System.out.println("after --> "+strArr[i]);
//				}
//				
//		        //s1 = s1.substring(0, 1).toUpperCase()  + s1.substring(1);
//		        //System.out.println(s1);
//				
//			}  
//		}
//
//}
