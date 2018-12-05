import java.util.*;
import java.io.*;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		char matrix[][] = new char[length][length];
		
		//read matrix
		for(int i=0; i<length; i++){
			String str = sc.nextLine();
			matrix[i] = str.toCharArray();
		}
		
		String s = "";
		
		while(true){
			String word = sc.nextLine();
			if(word.equals("0")) break;

			boolean flag = true;
			
			check:
			for(int i=0; i<length; i++){
				for(int j=0; j<length; j++){
					//System.out.println(matrix[i][j]);
					s = "";
					// Horizontal searching
					if(j+word.length() <= length){
						for(int k=j; k<j+word.length(); k++)
							s += matrix[i][k];
						//System.out.println("H "+s+" and "+word);
						if(s.equals(word)){
							System.out.println((i+1)+","+(j+1)+" "+(i+1)+","+(j+word.length()));
							flag = true;
							break check;
						}
						else if(new StringBuffer(s).reverse().toString().equals(word)){
							System.out.println((i+1)+","+(j+word.length())+" "+(i+1)+","+(j+1));
							flag = true;
							break check;
						}
						else flag = false;
					}
					
					s = "";
					// Vertical Searching
					if(i+word.length() <= length){
						for(int k=i; k<i+word.length(); k++)
							s += matrix[k][j];
						//System.out.println("V "+s+" and "+word);
						if(s.equals(word)){
							System.out.println((i+1)+","+(j+1)+" "+(i+word.length())+","+(j+1));
							flag = true;
							break check;
						}
						else flag = false;
					}
					
					s = "";
					// Diagonal Searching ?1????????
					if((j+word.length() <= length) && (i+word.length() <= length)){
							int index = i;
							for(int m=j; m<j+word.length(); m++)
								s += matrix[index++][m];
						
							//System.out.println("D1 "+s+" and "+word);
							if(s.equals(word)){
								System.out.println((i+1)+","+(j+1)+" "+(i+word.length())+","+(j+word.length()));
								flag = true;
								break check;
							}
							else if(new StringBuffer(s).reverse().toString().equals(word)){
								System.out.println((i+word.length())+","+(j+word.length())+" "+(i+1)+","+(j+1));
								flag = true;
								break check;
							}
							else flag = false;
						
					}
					
					s = "";
					// Diagonal Searching ?2???
					if((j-word.length()+1 >= 0) && (i+word.length() <= length)){
							int index = i;
							for(int m=j; m>=j-word.length()+1; m--)
								s += matrix[index++][m];
						
							//System.out.println("D2 "+s+" and "+word);
							if(s.equals(word)){
								System.out.println((i+1)+","+(j+1)+" "+(i+word.length())+","+(j-word.length()+2));
								flag = true;
								break check;
							}
							else if(new StringBuffer(s).reverse().toString().equals(word)){
								System.out.println((i+word.length())+","+(j-word.length()+2)+" "+(i+1)+","+(j+1));
								flag = true;
								break check;
							}
							else flag = false;
						
					}
					
				}
			}
			if(!flag) System.out.println("Not found");
		}
	}

}
