
public class UnaryOperatorDemo4 {
	
	public static void main(String[] args) {
	
		 // Unary Operator
		
		//PreDecrement And PostDecrement
		
		int a = 1 ; // 0,-1
		
		System.out.println( "Print A Before PreDecrement : " + a); // 1
		
		//Decrement first Then Assign Value 
		int PreDecrementResult = --a ; // 0
		
		System.out.println( "Print A After PreDecrement : " + a); // 0
		
		System.out.println( "Print A PreDecrementResult : " + PreDecrementResult); // 0
		
		//Assign First Then Decrement The Value
		int postDecrementResult = a-- ; //Post Decrement 0
		
		System.out.println( "Print A After PostDecrement : " + a); // -1
		
		System.out.println( "Print A postDecrementResult : " + postDecrementResult); // 0
		
			}
}
