                public  class String2{
 
        	 
        	public static void main(String args[]){
 
              // assign variable line values of type string
  	        String line = "1,4,3,2,3,7,5,6,9";

              //declare an array of type string to store the values of the string and use //, as the delimiter
                 String itemsOfLine[] = line.split(",");  

              //declaring an array of type string with the size of itemsOfLine array
               int [] numbers = new int[itemsOfLine.length];

              //declaring a temporary memory to store the values compared
      	       int ascendingDescendingNumbers =0; 
      	       System.out.println("original array values");
               for(int i =0; i<numbers.length; i++){
               
            //converting all the values of string array to integers
              numbers[i] = Integer.parseInt(itemsOfLine[i]);
      	             System.out.print(numbers[i]);
                    System.out.println("");
        	}
              //sorting the array in ascending order
          	for(int k=0; k<numbers.length; k++){
 
      	       for (int j=k+1; j<numbers.length ;j++ ) {
      	                           
      	        if(numbers[k] > numbers[j]){
      	        
    	        ascendingDescendingNumbers = numbers[k];
      	        numbers[k] = numbers[j];
      	        numbers[j] = ascendingDescendingNumbers;
      	        }
      	                           
      	       }
      		    }  
      		     System.out.println();
   	             System.out.println("sorted array in ascending order");
   	             for(int i=0;i<numbers.length; i++)
   	             {
   	             System.out.print( numbers[i]+" " );
   	             }
 
 
 	        //descending order
    
  	         for(int k=0; k<numbers.length; k++){
 
      	         for (int j=k+1; j<numbers.length ;j++ ) {
      	                           
      	         if(numbers[k] < numbers[j])
      	         {
      	          ascendingDescendingNumbers = numbers[k];
      	          numbers[k] = numbers[j];
      	          numbers[j] = ascendingDescendingNumbers;
      	           }
      	                           
      	            }
      		      } 
      		     System.out.println();
   	             System.out.println("sorted array in descending order");
   	             for(int i=0;i<numbers.length; i++)
   	             {
                      System.out.print( numbers[i]+" " );
   	              }
        	}
 
        	}


