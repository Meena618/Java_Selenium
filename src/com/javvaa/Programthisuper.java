package com.javvaa; 

	public class Programthisuper {

		public static void main(String[] args) {
			
			char[] ch = {'H', 'i'}; 
			
			String str = "srinivas:kumar:I am here";
			String amount = "$12.34";
			
			System.out.println(str);
			
			String[] sArray =str.split(":");
			for(int i=0; i< sArray.length; i++) {
				System.out.println("str.array ==> "+ sArray[i]);
			}
			
			
			System.out.println("str.trim() ==> "+ str.trim());
			
			System.out.println("str.indexOf() ==> "+ str.indexOf('k'));
			System.out.println("str.indexOf String() ==> "+ str.indexOf("am"));
			
			System.out.println("str.length() ==> "+ str.length());
			System.out.println("str.Uppercase ==> "+ str.toUpperCase());
			System.out.println("str.Uppercase ==> "+ str.concat(" I am here"));
			
			System.out.println("SubString --> "+ str.substring(9, str.length()));
			
			System.out.println("SubString amount --> "+amount.substring(1, amount.length()));
			
			/*
			 * System.out.println(str.charAt(0)); System.out.println(str.charAt(1));
			 * System.out.println(str.charAt(2));
			 */
			//System.out.println(str.charAt(3));
			
		 System.out.println(ch[1]);
		System.out.println(ch[2]);
			
			// TODO Auto-generated method stub
			//Employee e=new Employee(11,"mani",30000);
			//e.dispaly();
		}

	}

