//Command Line Program
package CommandLine;

public class Command_Line_Args {
	//Main method that takes input in command line
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum is" + sum);
	}
}
