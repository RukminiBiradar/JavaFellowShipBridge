package arrayPrograms.Pattern;

public class PatternD {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= 4-1; j++) {
				if (j==0||i==0&&j==1|j==2||i==4&&j==1|j==2||j==3&&i==1|i==2|i==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}


