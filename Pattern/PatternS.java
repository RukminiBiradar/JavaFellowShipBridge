package arrayPrograms.Pattern;

public class PatternS {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {
				if((i==0&&j==0|j==1|j==2|j==3)|(i==1&&j==0)||(i==2&&j==0|j==1)||(i==3&&j==2)||(i==4&&j==0|j==1|j==2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

