// Below each comment, add the code indicated.  I already have code to display a description of each item in the output.
package SecondSemester;

public class ForEach
{
	public static void main(String[] args)
	{
		// Use arrays (not ArrayLists) for this project
        // Declare and initialize array variable "intArray" to hold the values: 5,3,12,9,7
        
        int[] intArray = {5, 3 , 12, 9 , 7};



		// Display intArray using a for-each loop
		System.out.println("\n*******************************************************");
        System.out.println("intArray displayed using for each loop loop\n");
        
        for(int i: intArray){
            System.out.print(i + " ");
        }



		// Sum of the elements of intArray is calculated and displayed using a for-each loop
		System.out.println("\n*******************************************************");
        System.out.println("Sum of the elements of intArray\n");

        int sum = 0;
        for(int i: intArray){
            sum = sum + i;
        }System.out.println(sum);


		// Count the number of elements in intArray that are between 5 and 10, inclusive.  Display the result: ___ elements are between 5 and 10
		System.out.println("\n***********************************************************");
		System.out.println("Counting number of items between 5 and 10.\n");

        int count = 0;
        for(int i: intArray){
            if(i >= 5 && i <= 10){
                count++;
            }
        }System.out.print(count);



		// Search intArray for the number 7 using a for-each loop. Display "7 was found" or "7 was not found"
		System.out.println("\n***********************************************************");
        System.out.println("Search intArray for the number 7 using a for-each loop.\n");
        
        boolean checker;
        for(int i: intArray){
            if(i == 7){
                checker = true;                
            }else{
                checker = false;
            }
        }
        if(checker = true){
            System.out.println("7 was found");
        }else{
            System.out.println("7 was not found");
        }

        // Declare and initialize array variable "words" to hold the values: "keys", "camera", "vacation", "magic", "minivan"
        
        String[] words = {"keys", "camera", "vacation", "magic", "minivan"};

		// Display words using a for-each loop
		System.out.println("\n*******************************************************");
        System.out.println("Words displayed using for each loop\n");
        
        for(String i: words){
            System.out.print(i + " ");
        }

		// Length of each element of words is displayed
		System.out.println("\n*******************************************************");
        System.out.println("Length of each word in the array is: \n");
        
        for(String i: words){
            System.out.println(" Length of "  + i + " = " + i.length());
        }

		/* Count and display each element in words that start with "m".  Display the result.
		   For example, the output might be:
		   magic
		   minivan
		   2 words start with m
		*/
		System.out.println("\n***********************************************************");
        System.out.println("Words that start with m.\n");
    
        for(String i: words){
            if(i.startsWith("m")){
                System.out.println(i + " ");
            }
        }    

	}
}