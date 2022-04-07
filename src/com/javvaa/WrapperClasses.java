package com.javvaa;

public class WrapperClasses {
	public static void main(String args[]) {
		byte b=10;
		int i=25;
		char c='M';
		short s=30;
		long l=85;
		float f=56.5f;
		double d=99.8d;
		boolean b1=true;

		Byte byteobj=b;
		Integer intobj=i;
		Character charobj=c;
		Short shortobj=s;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Boolean booleanobj=b1;

		System.out.println("========Printing the autoboxing wrapper class==========");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Boolean object:"+booleanobj);

		byte bytevalue=byteobj;
		int intvalue=intobj;
		char charvalue=charobj;
		short shortvalue=shortobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double duoblevalue=doubleobj;
		boolean booleanvalue=booleanobj;

		System.out.println("========Printing the unboxing wrapper class==========");
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatobj);  
		System.out.println("double value: "+doubleobj);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+booleanobj);  



	}
}
