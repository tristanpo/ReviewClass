package reciewClass06;

public class Patterns {

	public static void main(String[] args) {
		for (int r=1; r<=4; r++) {
			
			for (int col=1; col<=5; col++) {
			
				System.out.print("*");
		}
			System.out.println();
		}		
		System.out.println(" 10X10 square ");
		
	for (int r=1; r<=10; r++) {
			
			for (int col=1; col<=10; col++) {
			
				System.out.print("*");
		}
			System.out.println();
		}	
		System.out.println("-----------------");
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
			System.out.print(c+" ");
			}
			System.out.println();
			}
		System.out.println("------Task------");
		
		for (int r=5; r>=1; r--) {
			for (int c=4; c>=1; c--) {
			System.out.print(r+" ");
			}
			System.out.println();
		}
		
	}

}
