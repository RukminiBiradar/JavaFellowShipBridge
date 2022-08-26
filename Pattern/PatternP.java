package arrayPrograms.Pattern;

public class PatternP {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 4/2; j++) {
				if (j==0||i==0&&j==0|j==1|j==2||i==1&&j==2||i==2&&j==1|j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}


