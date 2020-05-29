import java.util.Scanner;
import java.util.Stack;

public class Symmetric {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int set = 1;

		while (true) {
			int amount = sc.nextInt();
			if (amount == 0) {
				break;
			}

			System.out.println("SET " + (set++));
			Stack<String> stack = new Stack<>();

			for (int i = 0; i <= amount; i++) {
				String name = sc.nextLine();

				if (i%2 == 0) {
					stack.push(name);
				} else {
					System.out.println(name);
				}
			}


			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
			}


		}
		
	}

}
