public class Arrays4 {
						
public static void main(String[] args)								
{int[] arr = new int[50]; 
for(int i=0; i<arr.length; i++) {
arr[i] = (int)(Math.random()*100);

System.out.print(arr[i] + " "); 
}

System.out.println();
for( int i=0; i<arr.length; i++) {						
arr[i] = arr[i] + 1;
System.out.print(arr[i]+" "); } 
}					
}	
