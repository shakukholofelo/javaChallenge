public class MultiDimensional5{
						
public static void main(String[] args) {
						
int[][] arr = new int[100][30];
						
System.out.println("Original Array"); for(int i=0; i<arr.length; i++)
{
						
for(int j =0; j<30; j++) 						
{
arr[i][j] = (int)(Math.random()*100); System.out.print(arr[i][j] + " ");						
}						
System.out.println(); }						
System.out.println(); System.out.println("New Array"); System.out.println();
for(int i=0; i<arr.length; i++)						
{
for(int j =0; j<30; j++)
{
if(arr[i][j]%2==0)
{
continue;						
}
else if(arr[i][j]%8==0) {
						
System.out.print(arr[i][j] + " "); }						
else {
System.out.print(arr[i][j] + " "); }
}
System.out.println(); } 
}
}

