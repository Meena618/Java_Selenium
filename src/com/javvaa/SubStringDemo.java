package com.javvaa;

public class SubStringDemo {
public static void main (String args[])
{
String s1="Meenambica";
String s2="MEENAMBICA";
String s3="Adwaith Rao";
String s6="my name is sridhar";
String s4=s1.concat(s2);
String s8=s2.toLowerCase();
String sd=String.join("-","welcome","to","string","methods");
String s5="Meenambica"+"Sridar Rao";
System.out.println("Öiginal name:"+s1);
System.out.println("Substring starting from index :"+s1.substring(5));
System.out.println("Substring starting from index :"+s2.substring(4));
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println("Concatinate the names:"+s3);
System.out.println("Compare the string names:"+s1.compareTo(s2));
System.out.println("Compare the string names:"+s1.compareTo(s3));
System.out.println("Compare the string names:"+s1.compareTo(s6));
System.out.println("contains the string names:"+s6.contains("name"));
System.out.println(s2.toLowerCase());
System.out.println("Join the string-"+sd);






}


}

