package arrayPrograms.Pattern;

import java.util.Scanner;

public class PatternV {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int n=input.nextInt();
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= n; j++) {
				if (i==0&&j==0|j==n-1||i==1&&j==1|j==3||i==2&&j==2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}


