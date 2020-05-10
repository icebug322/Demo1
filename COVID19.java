import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final Scanner sc = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception {

try {
		int n = Integer.parseInt(br.readLine());
		int solution[][] = new int[n][2];
		int test = 0 , arr[] = new int[8];

		

		for(int i = 0 ; i<n ; i++ ) {
			
			test = Integer.parseInt(br.readLine());
			for(int j = 0 ; j<test ; j++ ) {
				arr[j] = sc.nextInt();	
			}
			compute( arr , test , solution , i );

			
		}
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<2 ; j++ )
				System.out.print(solution[i][j] + " ");
			System.out.println();
		}
    }
    catch(Exception e){
        return ;
    }

	}


	static void compute(int arr[] ,int test, int sol[][] , int k ){
		int sp = 1 , min = test , max = 0 ;
		for(int i = 0 ; i < test ; i++ ){
			for(int j = i ; j<test-1 ; j++ ){
				if(arr[j+1]-arr[j] <= 2 ) {
					sp++;
				}else
					break;
			}
			for(int j = i ; j>0; j--){
				if(arr[j]-arr[j-1] <=2 ) {
					sp++;
				}else
					break;
			}

			if(min > sp ) {
				min = sp;
			}
			if(max < sp){
				max = sp;
			}
			sp = 1 ;
		}
		sol[k][0] = min ;
	        sol[k][1] = max ;	
	}

}

