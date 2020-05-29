import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String longName = sc.nextLine();
		
		boolean activated = true;

		StringBuilder shortName = new StringBuilder();

		for (int i = 0; i < longName.length(); i++) {
			if (activated) {
				activated = false;
				shortName.append(longName.charAt(i));
				continue;
			}

			if (longName.charAt(i) == '-') {
				activated = true;
			}

		}

		System.out.println(shortName.toString());
	}

}
