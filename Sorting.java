
/**
 * Write a description of class Sorting here.
 *
 * @author Jacinto
 * @version 2.20.19
 */
import java.lang.Math;
public class Sorting
{
    int[] sortArray = new int[10];
    public void fillArray(){
        for(int i = 0; i < sortArray.length; i++){
            int rand = (int)(Math.random()*99)+1;
            sortArray[i] = rand;
        }
    }

    public void bubbleSort(){
        int bigger;
        for(int j = 0; j < sortArray.length; j++){
            for(int i = 0; i < sortArray.length-(j+1); i++){
                if(sortArray[i] <= sortArray[i+1]){
                    bigger = sortArray[i+1];
                    sortArray[i+1] = sortArray[i];
                    sortArray[i] = bigger;

                }
            }
        }
    }
    
    public void inserstionSortIncreasing(){
        int smallest;
        for(int i = 1; i < sortArray.length; i++){
            int comparingIndex = 0;
            for(int j = 0; j < i; j++){
                System.out.println(sortArray[i] + " is comparing to " + sortArray[j]);
                if(sortArray[i] < sortArray[j]){
                    smallest = sortArray[i];
                    add(smallest,j);
                }
            }
        }
    }
    public void add(int num, int index){

        for(int i = sortArray.length-1; i > index; i--){
            sortArray[i] = sortArray[i-1];
        }
        sortArray[index] = num; 
    }
    public void selectionSortIncreasing(){
        int finalIndex = sortArray.length-1;
        for(int j = 0; j < sortArray.length; j++){
            int largest = 0;
            int largestIndex = 0;
            int notLargest;
            for(int i = 0; i < finalIndex+1; i++){
                if(sortArray[i] >= largest){
                    largest = sortArray[i];
                    largestIndex = i;
                }
            }
            // System.out.println("Largest: " + largest + " Switches with index: " + finalIndex);
            sortArray[largestIndex] = sortArray[finalIndex];
            sortArray[finalIndex] = largest;
            finalIndex--;
        }
    }
    
}
