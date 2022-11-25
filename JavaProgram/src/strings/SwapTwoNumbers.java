package strings;

public class SwapTwoNumbers {

	
	/*
	 * Swap two numbers
	 * your Salary = 20000
	 * your Superior salary = 50,000
	 * you want to somehow, swap his salary
	 */
	
	/*
	 * How can we do?
	 * 1.Using a third party (variable)
	 * let your salary be yours = 20
	 * your superior's be his = 50
	 * you give yours to a third person, can be called temp
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withUsingThirdVariable();
		System.out.println("-----------------");
		withoutUsingThirdVariable();
	}
	
	public static void withUsingThirdVariable() {
		int superiorSalary = 50;
		int mySalary = 20;
		System.out.println("Before swapping : "+"Mine : "+mySalary+" "+"Superior : "+superiorSalary);
		int temp=mySalary;
		mySalary=superiorSalary;
		superiorSalary=temp;
		System.out.println("After swapping : "+"Mine : "+mySalary+" "+"Superior : "+superiorSalary);
	}
	
	public static void withoutUsingThirdVariable() {
		int superiorSalary = 50;
		int mySalary = 20;
		System.out.println("Before swapping : "+"Mine : "+mySalary+" "+"Superior : "+superiorSalary);
		superiorSalary = superiorSalary + mySalary;
		mySalary = superiorSalary - mySalary;
		superiorSalary = superiorSalary - mySalary;
		System.out.println("After swapping : "+"Mine : "+mySalary+" "+"Superior : "+superiorSalary);
	}

}
