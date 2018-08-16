import java.io.*;
import java.util.*;
class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=testcase; i>0; i--){
			String cipher = br.readLine();
			char matrix[][];
			StringBuilder sb = new StringBuilder();
			if(isPerfectSquare(cipher.length())){
				// Place input string into matrix.
				int size = (int) Math.sqrt(cipher.length());
				matrix = new char[size][size];
				int index = 0;
				for(int row=0; row<size; row++){
					for(int col=0; col<size; col++){
						matrix[row][col] = cipher.charAt(index++);
					}
				}
				// Make the decipher text.
				for(int col=0; col<size; col++){
					for(int row=0; row<size; row++){
						sb.append(matrix[row][col]);
					}
				}
				// Print output.
				System.out.println(sb);
			}
			else{
				System.out.println("INVALID");
			}
		}
	}

	static boolean isPerfectSquare(double num){
		// Get the square root of given number;
		double sqrt = Math.sqrt(num);
		// Return.
		return ((sqrt - Math.floor(sqrt)) == 0);
	}
}
