package arrayPrograms.Pattern;

public class PatternW {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 4; j++) {
				if (j==0||(i==2&&j==2)||(i==3&&j==1|j==3)||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}


