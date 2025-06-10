
public class UnaryOperatorDemo3 {
	
	public static void main(String[] args) {
	
		 // Unary Operator
		
		//PreDecrement And PostDecrement
		
		int a = 9 ; // 8,7
		
		System.out.println( "Print A Before PreDecrement : " + a); // 9
		
		//Decrement first Then Assign Value 
		int PreDecrementResult = --a ; // 8 
		
		System.out.println( "Print A After PreDecrement : " + a); //8
		
		System.out.println( "Print A PreDecrementResult : " + PreDecrementResult); // 8
		
		//Assign First Then Decrement The Value
		int postDecrementResult = a-- ; //Post Decrement 8
		
		System.out.println( "Print A After PostDecrement : " + a); // 7
		
		System.out.println( "Print A postDecrementResult : " + postDecrementResult); // 8
		
			}
}
