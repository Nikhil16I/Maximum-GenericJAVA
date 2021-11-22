package com.TestMaximum;

public class MaximumNum<Type extends Comparable<Type>> {
	public final Type VARIABLE1;
	public final Type VARIABLE2;
	public final Type VARIABLE3;
	public final Type VARIABLE4;
	public final Type VARIABLE5;
	
	/*ByUsing Constructor*/
	public MaximumNum(Type Variable1, Type Variable2, Type Variable3, Type Variable4, Type Variable5) {
		super();
		VARIABLE1 = Variable1;
		VARIABLE2 = Variable2;
		VARIABLE3 = Variable3;
		VARIABLE4 = Variable4;
		VARIABLE5 = Variable5;
	}
	public static <Type extends Comparable <Type>> Type MaxxVal(Type Variable1 , Type Variable2 , Type Variable3,Type Variable4,Type Variable5) {
		Type MaxxVal = Variable5;
		
		if(Variable1.compareTo(Variable2) > 0 && Variable1.compareTo(Variable3) > 0 && Variable1.compareTo(Variable4)>0 && Variable1.compareTo(MaxxVal)>0) {
			MaxxVal = Variable1;
			System.out.println("The Value  " + MaxxVal + " Is Maximum in this Case ");
			System.out.println();//SPACE
		}
		else if(Variable2.compareTo(Variable1) > 0 && Variable2.compareTo(MaxxVal) > 0) {
			MaxxVal = Variable2;
			System.out.println("The Value  " + MaxxVal +" Is Maximum in this Case");
			System.out.println();//SPACE
		}
		else if(Variable3.compareTo(Variable1)>0 && Variable3.compareTo(Variable2)>0 && Variable3.compareTo(Variable4)>0 && Variable3.compareTo(MaxxVal)>0){
			MaxxVal = Variable3;		
			System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
			System.out.println();//SPACE
		}
		else if(Variable4.compareTo(Variable1)>0 && Variable4.compareTo(Variable2)>0 && Variable4.compareTo(Variable3)>0 && Variable4.compareTo(MaxxVal)>0){
			MaxxVal = Variable4;
			System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
			System.out.println();//SPACE
		}
		else {
			MaxxVal=Variable5;
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
		
		MaxxVal(36, 99 , 50,49,61); 
		MaxxVal(55, 22, 85,52,88);        //For Integer Value
		
		//Testing The Max Value Result from the example Float Integer
		System.out.println("Testing Max For given Float Integer");
		System.out.println();//SPACE
		
		MaxxVal(3.6f, 9.3f, 2.6f,5.0f,2.1f);
		MaxxVal(0.9f, 0.3f, 0.6f,0.7f,0.5f);  //For float Integer Value
		
		//Testing The Max Value Result from the example String Values
		System.out.println("Testing Max For given Float Integer");
		System.out.println();//SPACE
		
		MaxxVal("Chocolate", "Candy","M&M","Wonka","Perk");
		MaxxVal("Gogle", "Google","Gooogle","Goooogle","Gooooogle" );  //For float String Value
	}
	
}
	

