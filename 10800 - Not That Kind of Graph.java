import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		char[][] arr;
		for(int t=1; t<=test; t++){
			String str = sc.nextLine();
			
			arr = new char[110][50];
			for(int i=0; i<arr.length; i++)
				Arrays.fill(arr[i], '0');

			int row=49, col=0;
			int lowest = Integer.MAX_VALUE;
			int highest = Integer.MIN_VALUE;
			
			char previous = ' ';
			for(int i=0; i<str.length(); i++){
				char current = str.charAt(i);
				
				if(previous == ' ' && current == 'R') arr[row][col] = '/';
				else if(previous == ' ' && current == 'F') arr[row][col] = '\\';
				else if(previous == ' ' && current == 'C') arr[row][col] = '_';
				else if(previous == 'R' && current == 'R') arr[--row][++col] = '/';
				else if(previous == 'R' && current == 'F') arr[row][++col] = '\\';
				else if(previous == 'R' && current == 'C') arr[--row][++col] = '_';
				else if(previous == 'F' && current == 'R') arr[row][++col] = '/';
				else if(previous == 'F' && current == 'F') arr[++row][++col] = '\\';
				else if(previous == 'F' && current == 'C') arr[row][++col] = '_';
				else if(previous == 'C' && current == 'R') arr[row][++col] = '/';
				else if(previous == 'C' && current == 'F') arr[++row][++col] = '\\';
				else if(previous == 'C' && current == 'C') arr[row][++col] = '_';
					
				previous = current;
				lowest = Math.min(row, lowest);
				highest = Math.max(row, highest);
			}
			
			// Display Output.
			System.out.println("Case #"+t+":");
			
			for(int i=lowest; i<=highest; i++){
				System.out.print("| ");
				
				for(int j=0; j<=col; j++){
					if((arr[i][j] == '/') || (arr[i][j] == '\\') || (arr[i][j] == '_'))
						System.out.print(arr[i][j]);
					else{
						// To exclude extra spaces after / (or) \ (or) _ at the end of each output line
						boolean flag = false;
						for(int k=j; k<=col; k++){
							if(arr[i][k] == '0'){
								flag = true;
								//break;
							}
							else{
								flag = false; break;
							}
						}
						if(!flag)
							System.out.print(" ");
						else continue;
						//System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
			
			System.out.print("+");
			for(int i=0; i<=col+2; i++){
				System.out.print("-");
			}
			System.out.println();
			System.out.println();
		}
	}

}
