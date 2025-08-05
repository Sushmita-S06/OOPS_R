package wrapperclasses;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Converting Integer to int (modern way)
		        Integer a = Integer.valueOf(3); // or simply: Integer a = 3;

		        int i = a.intValue(); // explicit conversion
		        int j = a; // unboxing — compiler handles this

		        System.out.println(a + " " + i + " " + j);
		

	}

}
