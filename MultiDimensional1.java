public class MultiDimensional1{

public static void main(String[] args) {
					
				
int[][] arr = new int[100][30]; 
System.out.println("Original Array"); 
for(int i=0; i<arr.length; i++)
{						
for(int j =0; j<30; j++) {
arr[i][j] = (int)(Math.random()*100);
System.out.print(arr[i][j] + " "); }						
System.out.println(); }
System.out.println();
 System.out.println("New Array"); 
System.out.println();
for(int i=0; i<arr.length; i++)
						
{
for(int j =0; j<30; j++)						
{
System.out.print((arr[i][j] + 1) + " ");						
}						
System.out.println(); } 
}
}	

