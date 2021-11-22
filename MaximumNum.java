package com.TestMaximum;

public class MaximumNum<Type extends Comparable<Type>> {
	public final Type VARIABLE1;
	public final Type VARIABLE2;
	public final Type VARIABLE3;
	
	/*ByUsing Constructor - REAFACTOR-02*/
public MaximumNum(Type Variable1, Type Variable2, Type Variable3) {
		super();
		VARIABLE1 = Variable1;
		VARIABLE2 = Variable2;
		VARIABLE3 = Variable3;
	}

public static <Type extends Comparable <Type>> Type MaxxVal(Type Variable1 , Type Variable2 , Type Variable3 ) {
		 Type MaxxVal = Variable3;
		 
		 if(Variable1.compareTo(Variable2) > 0 && Variable1.compareTo(MaxxVal) > 0) {
		MaxxVal = Variable1;
		System.out.println("TestCase1.1 -"+"The test data has Max Numberin the First position");
		System.out.println("The Value  " + MaxxVal + " Is Maximum in this Case ");
		System.out.println();//SPACE
		  }
		else if(Variable2.compareTo(Variable1) > 0 && Variable2.compareTo(MaxxVal) > 0) {
		MaxxVal = Variable2;
		System.out.println("TestCase1.2 -"+"The test data has Max Number in the Second position");
		System.out.println("The Value  " + MaxxVal +" Is Maximum in this Case");
		System.out.println();//SPACE
		 }
		else {
		System.out.println("TestCase1.3 -"+"The test data has Max Number in the Third position");
		System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
		System.out.println();//SPACE
  }
return MaxxVal;
}
public static void main(String[] args) {
	
	System.out.println("Welcome to the MAXIMUM NUMBER Program");
	System.out.println();//SPACE
	//Testing The Max Value Result from the example Integer
	System.out.println("Testing Max For given Integer");
	System.out.println();//SPACE
	
	MaxxVal(36, 99 , 50); 
	MaxxVal(55, 22, 85);        //For Integer Value
	 	
	//Testing The Max Value Result from the example Float Integer
	System.out.println("Testing Max For given Float Integer");
	System.out.println();//SPACE
	
	MaxxVal(3.6f, 9.3f, 2.6f);
	MaxxVal(0.9f, 0.3f, 0.6f);  //For float Integer Value
 	
	//Testing The Max Value Result from the example String Values
	System.out.println("Testing Max For given Float Integer");
	System.out.println();//SPACE

	MaxxVal("Chocolate", "Candy","M&M");
	MaxxVal("Gogle", "Google","Gooogle" );  //For float String Value
 }
}
