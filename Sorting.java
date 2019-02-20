
/**
 * Write a description of class Sorting here.
 *
 * @author Jacinto
 * @version 2.20.19
 */
import java.lang.Math;
public class Sorting
{
    int[] sortArray = new int[40];
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

    public void inserstionSort(){
    }

    public void selectionSort(){
        int finalIndex;
    }
}
