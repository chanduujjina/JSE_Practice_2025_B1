
public class LogicalOperatorsDemo1 {
	
       public static void main (String ar[]){
	 
	   boolean a = true ;
	   
	   boolean b = true ;
	   
	   boolean c = a && b ;
	   
	   System.out.println( c );
	   
	   int d = 10 ;
	   
	   int e = 10 ;
	   
	   boolean f = d == e && e == d ; // Logical And (&&) Operator
	   
	   System.out.println( "Logical And (&&) Operator = " + f );
	   
	   boolean g = d > e || e > d ; // Logical Or (||) Operator
	   
	   System.out.println( "Logical Or (||) Operator = " + g );
	   
	   boolean h = !(d>e) ;
	   
	   System.out.println("Logical Not (!) Operator = " + h);
    	   
		}


}
