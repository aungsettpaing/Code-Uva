import java.util.*;
public class P526 {

	static int dp[][]; 
	static String []ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String first = sc.nextLine();
			String second = sc.nextLine();
			int arr[][] = editDistDP(first, second, first.length(), second.length());

			System.out.println(arr[first.length()][second.length()]);
			if(0 != arr[first.length()][second.length()]){
				ans = new String[arr[first.length()][second.length()]];
				printChanges(first, second, ans);
				for(int i=0; i<ans.length; i++)
					System.out.println((i+1)+ans[i]);
				if(sc.hasNext())
					System.out.println();
			}
		}
	}
	
	  
    // Function to print the steps 
    // Some changes to Original Author's code (I give a credit to geeksforgeeks)
    static void printChanges(String s1, String s2, String[] ans) 
    { 
    	int count = 1;
    	int index = ans.length;
        int i = s1.length(); 
        int j = s2.length(); 
  
        // check till the end 
        while (i != 0 && j != 0) {  
            // if characters are same 
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) { 
                i--; 
                j--; 
            } 
            // Replace 
            else if (dp[i][j] == dp[i - 1][j - 1] + 1) { 
                ans[--index] = " Replace " + (j) +","+ s2.charAt(j - 1);
                i--; 
                j--; 
                count++;
            }   
            // Delete the character 
            else if (dp[i][j] == dp[i - 1][j] + 1) { 
                ans[--index] = " Delete " + (j+1);
                i--; 
                count++;
            }   
            // Add the character 
            else if (dp[i][j] == dp[i][j - 1] + 1) { 
            	ans[--index] = " Insert " +(j)+","+ s2.charAt(j - 1);
                j--; 
                count++;
            } 
           
        } 
        
        while(i != 0){
        	ans[--index] = " Delete "+ (j+1);
        	i--;
        	count++;
        }
        while(j != 0){
        	ans[--index] = " Insert " +(j)+","+ s2.charAt(j - 1);
        	j--;
        	count++;
        }
        
    } 

	static int[][] editDistDP(String str1, String str2, int m, int n) 
    { 
        // Create a table to store results of subproblems 
        int DP[][] = new int[m+1][n+1]; 
       
        // Fill d[][] in bottom up manner 
        for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 
                // If first string is empty, only option is to 
                // insert all characters of second string 
                if (i==0) 
                    DP[i][j] = j;  // Min. operations = j 
       
                // If second string is empty, only option is to 
                // remove all characters of second string 
                else if (j==0) 
                    DP[i][j] = i; // Min. operations = i 
       
                // If last characters are same, ignore last char 
                // and recur for remaining string 
                else if (str1.charAt(i-1) == str2.charAt(j-1)) 
                    DP[i][j] = DP[i-1][j-1]; 
       
                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    DP[i][j] = 1 + min(DP[i][j-1],  // Insert 
                    		DP[i-1][j],  // Remove 
                    		DP[i-1][j-1]); // Replace 
            } 
        } 
   
        dp = DP;
        return dp; 
    } 
	
	static int min(int x,int y,int z) 
    { 
        if (x <= y && x <= z) return x; 
        if (y <= x && y <= z) return y; 
        else return z; 
    } 
}
