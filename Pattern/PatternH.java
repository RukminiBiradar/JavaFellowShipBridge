package arrayPrograms.Pattern;

public class PatternH {
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j<= 6; j++) {
			if ( j == 0 || j ==6||i==3)
			System.out.print("*");
				else
			System.out.print(" ");
		}
	
			System.out.println();

	}
	}
}

