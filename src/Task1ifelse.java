
public class Task1ifelse {
	
	public static void main(String[] args) {

		int age = 46;
		String gender = "Woman";
		String name = "Manasa";

		if (age <= 5) {

			System.out.println("Hey " + name + " Your Age Is " + age + ",Go To Play Ground");
		}

		else if (age <= 15) {

			System.out.println("Hey " + name + " Your Age Is " + age + " Go To School");
		}

		else if (age <= 23) {

			System.out.println("Hey " + name + " Your Age Is " + age + " Do Must A Dgree ");
		}

		else if (age <= 45) {

			if (gender == "man") {
				System.out.println("Hey " + name + " Your Age Is " + age + " Do Must A Dgree ");
			} else {
				System.out.println("Hey " + name + " Your Age Is " + age + " Try To Marry ");
			}
		}

		else if (age <= 46) {

			System.out.println("Hey "+name+" Enjoy Your Remaining Life");
		}
	}

}
