
import java.util.*;
//import java.io.*;
class Codechef {

	public static void main(String args[] ) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
	    int n = sc.nextInt();
	    sc.nextLine();
		String s , s1 , s2 ;
		for(int i = 0 ;  i<n;  i++) {
		 s = sc.nextLine();
		s1 = s ;
	    s2 = s ;

		s1 = s1 + s1.charAt(0);
		s1 = s1.substring(1);
		s2 = s2.charAt(s2.length()-1) + s2 ;
		s2 = s2.substring(0,s2.length()-1);
	
		if(s1.matches(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
		}
	}
}
