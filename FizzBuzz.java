public  class FizzBuzz{
        	 
        	public static void main(String args[]){

            //initialising the number to 0
            int number =0;

            //loop iterates until number is 100
             while(number <=100){
              
              //checks if the number is divisible by both 5 and 3 and output the solution
        	if( number%3==0 && number%5 ==0)
               {
        	 System.out.println(" Fizz Buzz");
 
	         }
	         
                 //checks if the number is divisible by both 5 and 3 and output the solution
        	  else if(number%3 ==0)
                 {         	
	           System.out.println(" Fizz");

        	  }         
                  //checks if the number is divisible by both 5 and 3 and output the solution
                    else if(number%5 ==0)
                 {   System.out.println(" Buzz");
                 }
        	       
        	     	number++;
                    }
                     }
                      }

