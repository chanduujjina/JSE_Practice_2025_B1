
public class UnaryOperatorDemo2 {
	
	public static void main(String[] args) {
	
		 // Unary Operator
		
		//PreIncrement And PostIncrement
		
		int a = 1 ; //2,3
		
		System.out.println( "Print A Before PreIncrement : " + a); // 1
		
		//Increment first Then Assign Value 
		int PreIncrementResult = ++a ; // 2
		
		System.out.println( "Print A After PreIncrement : " + a); // 2
		
		System.out.println( "Print A PreIncrementResult : " + PreIncrementResult); // 2
		
		//Assign First Then Increment The Value
		int postincrementResult = a++ ; //Post Increment 2
		
		System.out.println( "Print A After PostIncrement : " + a); // 3
		
		System.out.println( "Print A postincrementResult : " + postincrementResult); // 2
		
			}
}
