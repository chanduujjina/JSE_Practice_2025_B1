
public class Task2ifelse {
	public static void main(String [] args) {

		String Lock = "Open";
		String UPI = "Phone Pay";
		int Amount = 100000;

		if (Lock == "Open") {
			if (UPI == "Phone Pay") {
				if (Amount <= 100000) {
					System.out.println(" Your Phone Pay Transaction Succusful,Amount " + Amount + " ");
				} else {
					System.out.println(" Your Transection Failed,Becouse Greaterthan 1L ");
				}

			} else {

				if (Amount <= 100000) {
					System.out.println(" Your Phone Pay Transaction Succusful,Amount " + Amount + " ");
				} else {
					System.out.println(" Your Transection Failed,Becouse Greaterthan 1L ");
				}

			}
		}

		else {
			System.out.println("Plz Unlock Your Phone ");
		}

	}

}
