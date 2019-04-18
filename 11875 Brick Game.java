import java.util.*;
public class BrickGame_11875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i=1; i<=testcase; i++) {
			
			int N = sc.nextInt();
			int index = N / 2 + 1;
			int age = 11;
			for(int j=0; j<index; j++) {
				age = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Case "+i+": "+age);
		}
	}

}
