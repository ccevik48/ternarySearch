/*
 * Purpose/Description: This program is to implement 
 *       a recursive search function in Java using 
 *       ternary search for a given sorted array; the run time 
 *       complexity in this case is O(log3(n)) because for n elements,
 *       n*(1/3)^k = 1, -> n = 3^k, -> log3(n) = k.
 */
package asg2_p1;
/**
 *
 * @author Can
 */
public class ASG2_P1 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tSearch arr = new tSearch();
        
        //initialize sorted array with values
        int A[] = { 2, 3, 5, 7, 11, 13, 14, 16, 17, 19, 23, 29};
        int lookFor = 7;  //number to look for in the array
        
        int number = arr.ternarySearch(A , 0, A.length-1, lookFor);
        
        if (number == -1){  //if not present in array
            System.out.println("The element "+lookFor+ " is not present.");
        }
        else{
        System.out.println("The element " + lookFor + " is in position " +
                "["+number+"]");
        }
        
        
    }

}
