public class Sorting_1{
public static void main(String[] main) {
int[] arr = new int[50];
for(int i=0; i<arr.length; i++) {
						
arr[i] = (int)(Math.random()*100);
System.out.print(arr[i] + " "); }
System.out.println(); for(int i=0; i<arr.length; i++) {
if(i==19){
arr[i]= arr[i] + 60; }else if(i==61)
{
arr[i] = arr[i] + 61; }						
System.out.print(arr[i] + " "); } 
 }
   }	
