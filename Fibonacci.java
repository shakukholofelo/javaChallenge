public  class Fibonacci{
        	 
        public static void main(String args[]){
  	int  num1 = 0,num2 = 1,num3;
           
               //printing out the two values
     	System.out.println(num1+" "+num2);      
	for(int i =0; i< 40;i++){

             //adding the two values num1 and num2       
        	num3 = num1 + num2;

              //outputting the sum
             System.out.println(num3);
             //assigning num2 the new value to num1           
                num1 = num2;

          //assigning num3 the new value to num2
             num2 =num3;
 
        	}
 
 
        	}
 
        	}


 

