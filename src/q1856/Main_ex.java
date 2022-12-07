package q1856;

public class Main_ex {
	public static void main(String[] args) {
		
		int [][] arr = new int [i][j];
		int i, j;
	    int num = 1;
	    for (i = 0; i < n; i++) { // n행만큼 반복
	        if (i % 2 == 0) { // 짝수행이면
	            for (j = 0; j < m; j++) { // 앞에서부터 m열만큼 반복
	                arr[i][j] = num++; // 배열에 수를 넣고 1증가시킨다.
	            }
	        } else { // 짝수행이 아니면(홀수행이면)
	            for (j = m-1; j >= 0; j--) { // 뒤에서 부터 첫 번째 열까지 반복
	                arr[i][j] = num++; // 배열에 수를 넣고 1증가시킨다.
	            }
	        }
	    }
	}
}
