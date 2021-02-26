public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,0,6,8},{9,10,7,11},{13,14,15,12}};
		//System.out.println(arr[0][0]);
		int n = arr.length;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(arr[i][j]==0) {
					int a = arr[i][j-1];
					int b = arr[i][j+1];
					int c = arr[i-1][j];
					int d = arr[i+1][j];
					if(b>arr[i][j]) {
						int temp = arr[i][j];
						arr[i][j] = b;
						b = temp;
					}
					
					else if(d>arr[i][j]) {
						int temp = arr[i][j];
						arr[i][j] = d;
						d = temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
