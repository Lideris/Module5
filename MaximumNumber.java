import java.util.Arrays;

/**
 * Created by ua1gribovskiy on 20.01.2016.
 */
public class MaximumNumber {

   public static void main (String [] args) {

        int [] masiv = {1, 3, 5, 9, 8, 7};



       int max = masiv [0];
       for(int arrElement:masiv) {
           System.out.println( arrElement);
       }
           for(int i = 0; i<masiv.length; i++){

           if(max<masiv[i])
               max = masiv[i];
                  }
       System.out.println("Max: " +max);


}}
