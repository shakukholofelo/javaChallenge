public class MultiDimensional3{
						
public static void main(String[] args)								
{ int i=0,j=0;
int[] arr = new int[50]; 
while(i<arr.length) {
arr[i] = (int)(Math.random()*100);
int  even = arr[i]%2;
int divisible = arr[i]%11;

System.out.print(arr[i] + " "); 

switch (even){
case 0 :
System.out.println(arr[i] +  " ");
break;
}
switch (divisible){
case 0 :
System.out.println(arr[i] +  " ");
break;
}
i++; 
}	
System.out.println();				
}
}

