public class AnimalDemo {
	static int row=3;
	static int column = 4;
	
	public static void main(String[] args) {
		int[][] Mat = {{1,0,0,4},{0,2,0,3},{0,0,3,0},{1,0,2,0}};
		int count=0;
		int i,j,k;
		int size = row*column;
		System.out.println("Sparse matrix is any matrix that has a majority of zero elements\n" + "For example,");
		for(i=0; i<row; i++) {
			for(j=0; j<column; j++) {
				System.out.print("\t" +Mat[i][j]);
				if(Mat[i][j]!=0)
					count++;
			}
			System.out.println();
		}
		System.out.println("Total non-zero elements in above matrix = " +count);
		if(size/2<=count)
			System.out.println("It IS NOT a sparse matrix");
		else
			System.out.println("It IS a sparse matrix");
		k=0;
		int[][] newMat = new int [count][3];
		for(i=0; i<row; i++) {
			for(j=0; j<column; j++) {
				if(Mat[i][j]!=0) {
					newMat[k][0]=i;
					newMat[k][1]=j;
					newMat[k][2]=Mat[i][j];
					k++;
				}
			}
		}
		System.out.println("The non-zero elements with their locations in the matrix above are given below :");
		for(i=0; i<count; i++) {
			for(j=0; j<3; j++)
				System.out.print("\t" +newMat[i][j]);
			System.out.println();
		}
		
		System.out.println("Thank You!");
	}	
}
 