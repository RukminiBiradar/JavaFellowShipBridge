package arrayPrograms.Pattern;

public class PatternQ {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 4; j++) {
				if (j == 0&&i==0|i==1|i==2|i==3 ||j==4||i==0||i==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
