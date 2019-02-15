package Container;
import java.util.Scanner;
public class Container {

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int [] array = new int [10];
		int sum = 0;
		//store the input to the array
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i<array.length; i++) {
				array[i] = input.nextInt();
			}
		
		for(int p: array)
			sum += p;
		System.out.println(sum);
		input.close();
		}
	}
