
public class UnaryOperatorDemo1 {
	
	public static void main(String[] args) {
	
		 // Unary Operator
		
		//PreIncrement And PostIncrement
		
		int a = 9 ; //10,11
		
		System.out.println( "Print A Before PreIncrement : " + a); //9
		
		//Increment first Then Assign Value 
		int PreIncrementResult = ++a ; //10 
		
		System.out.println( "Print A After PreIncrement : " + a); //10
		
		System.out.println( "Print A PreIncrementResult : " + PreIncrementResult); //10
		
		//Assign First Then Increment The Value
		int postincrementResult = a++ ; //Post Increment 10
		
		System.out.println( "Print A After PostIncrement : " + a); //11
		
		System.out.println( "Print A postincrementResult : " + postincrementResult); //10
		
			}
}
