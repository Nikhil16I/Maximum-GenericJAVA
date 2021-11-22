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
public Type	MaxxValResult() {
	Type MaxNum =MaximumNum.MaxxValResult(VARIABLE1, VARIABLE2, VARIABLE3, VARIABLE4, VARIABLE5);
	printMaxResult(MaxNum); 
	return MaxNum;
	/*printmaxresult mentioned instead of printmax*/
}
         /*Printing the Maximum Value */
public void printMaxResult(Type MaxxVal) {      
	System.out.println("printing-> "+MaxxVal+ " is Maximum Value"); 
}
	public static <Type extends Comparable <Type>> Type MaxxValResult(Type Variable1 , Type Variable2 , Type Variable3,Type Variable4,Type Variable5) {
		Type MaxxVal = Variable5;
		
		if(Variable1.compareTo(Variable2) > 0 && Variable1.compareTo(Variable3) > 0 && Variable1.compareTo(Variable4)>0 && Variable1.compareTo(MaxxVal)>0) {
			MaxxVal = Variable1;
			System.out.println();//SPACE
			System.out.println("The Value  " + MaxxVal + " Is Maximum in this Case ");
		}
		else if(Variable2.compareTo(Variable1) > 0 && Variable2.compareTo(MaxxVal) > 0) {
			MaxxVal = Variable2;
			System.out.println();//SPACE
			System.out.println("The Value  " + MaxxVal +" Is Maximum in this Case");
		}
		else if(Variable3.compareTo(Variable1)>0 && Variable3.compareTo(Variable2)>0 && Variable3.compareTo(Variable4)>0 && Variable3.compareTo(MaxxVal)>0){
			MaxxVal = Variable3;
			System.out.println();//SPACE
			System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
		}
		else if(Variable4.compareTo(Variable1)>0 && Variable4.compareTo(Variable2)>0 && Variable4.compareTo(Variable3)>0 && Variable4.compareTo(MaxxVal)>0){
			MaxxVal = Variable4;
			System.out.println();//SPACE
			System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
		}
		else {
			MaxxVal=Variable5;
			System.out.println();//SPACE
			System.out.println("The Value  " + MaxxVal +"  Is Maximum in this Case");
		}
		return MaxxVal;
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to the MAXIMUM NUMBER Program");
		
		
		MaximumNum<Integer> IntVal = new MaximumNum<Integer>(36, 99 , 50,49,61); 
		IntVal.MaxxValResult();        //For Integer Value
		
		
		
		MaximumNum<Float> floatVal = new MaximumNum<Float>(3.6f, 9.3f, 2.6f,5.0f,2.1f);
		floatVal.MaxxValResult();  //For float Integer Value
		
		
		
		MaximumNum<String> StringVal = new MaximumNum<String>("Chocolate", "Candy","M&M","Wonka","Perk");
		StringVal.MaxxValResult();  //For float String Value
	}
	
}
	

