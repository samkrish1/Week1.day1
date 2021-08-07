package week1.day1.Classroom_Assignments;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the variables
		int number = 123456;
		int sum = 0;
		System.out.println("The number taken is " +number);
	
    while(number !=0)
    {
    	sum = sum +number%10;
    	number = number/10;
    }
    System.out.println("Sum of my number " +sum );
				

	}

}
