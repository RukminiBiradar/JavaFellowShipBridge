package Day3;

public class LineComp {
	

	public void getLength() {
		 int x1 = 5;
        int x2 = 10;
        int y1 = 5;
        int y2 = 2;
        int Line = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
        System.out.println( "Length of line is: "+Line);
	}
	
	public void findEqual() {
		int x1 = 5;
		int x2 = 10;
		int x3 = 5;
		int x4 = 2;
		int y1 = 5;
		int y2 = 10;
		int y3 = 5;
		int y4 = 2;
		
		int lineOne = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int lineTwo = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		
		String lengthOne = String.valueOf(lineOne);
		String lengthTwo = String.valueOf(lineTwo);
		
		System.out.println("Length of first Line :"+lineOne);
		System.out.println("Length of Second Line :" +lineTwo);
		System.out.println(lengthOne.equals(lengthTwo));
		public void checkCompareLine() {
		
		int x1 = 5;
		int x2 = 10;
		int x3 = 15;
		int x4 = 20;
		int y1 = 55;
		int y2 = 100;
		int y3 = 25;
		int y4 = 28;
	}
		public static void main(String args[])
		{
		
		int x2,x1,y1,y2,x3,x4,y4,y3;
		Integer lineOne = ((((x2-x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		Integer lineTwo = ((((x4-x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		
		System.out.println("Length of Line One is " + lineOne); 
		System.out.println("Length of Line Two is " +lineTwo);
		

			if(lineOne.compareTo(lineTwo) > 0){
				System.out.println("Line one is greater:" + lineOne);

		}
		
			 if(lineTwo.compareTo(lineOne) > 0){

            System.out.println("Line Two is greater:" + lineTwo);

           }
			 if(lineOne.compareTo(lineTwo) == 0){

	             System.out.println("both Lines are equal");

			 }
		}
	}
		
	








