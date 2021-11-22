package com.TestMaximum;

public class MaximumNum {

public static void WrapInteger(Integer Num1,Integer Num2,Integer Num3) {
		
 if(Num1.compareTo(Num2) > 0 && Num1.compareTo(Num3) > 0) {
System.out.println("The Value  " + Num1 + " Is Maximum in this Case ");
System.out.println();//SPACE
  }
else if(Num2.compareTo(Num1) > 0 && Num2.compareTo(Num3) > 0) {
System.out.println("The Value  " + Num2 +" Is Maximum in this Case");
System.out.println();//SPACE
 }
else {
System.out.println("The Value  " + Num3 +"  Is Maximum in this Case");
System.out.println();//SPACE

	 }
  }
public static void WrapFloat( Float Num1, Float Num2,Float Num3) {
	if(Num1.compareTo(Num2) > 0 && Num1.compareTo(Num3) > 0) {
		System.out.println("The Value  " + Num1 + " Is Maximum in this Case ");
		System.out.println();//SPACE
		  }
		else if(Num2.compareTo(Num1) > 0 && Num2.compareTo(Num3) > 0) {
		System.out.println("The Value  " + Num2 +" Is Maximum in this Case");
		System.out.println();//SPACE
		 }
		else {
		System.out.println("The Value  " + Num3 +"  Is Maximum in this Case");
		System.out.println();//SPACE
 }
}
public static void main(String[] args) {
	
	System.out.println("Welcome to the MAXIMUM NUMBER Program");
	System.out.println();//SPACE
	//Testing The Max Value Result from the example Integer
	System.out.println("Testing Max For given Integer");
	System.out.println();//SPACE
	
	WrapInteger(36, 99 , 50); 
	WrapInteger(55, 22, 85);        //For Integer Value
	 	
	//Testing The Max Value Result from the example Float Integer
	System.out.println("Testing Max For given Float Integer");
	System.out.println();//SPACE
	
	WrapFloat(3.6f, 9.3f, 2.6f);
	WrapFloat(0.9f, 0.3f, 0.6f);  //For float Integer Value
 	

 }
}
