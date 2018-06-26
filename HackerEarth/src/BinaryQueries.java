/*
*
*
Some problems appear hard though they are very easy. Today Aakash is stuck in a range query problem. He has been given an array with only numbers 0 and 1. There are two types of queries -

0 L R : Check whether the number formed from the array elements L to R is even or odd and print EVEN or ODD respectively. Number formation is the binary number from the bits status in the array L to R

1 X : Flip the Xth bit in the array
 *
 *
 */

import java.io.*;

public class BinaryQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputDetails[] = br.readLine().split(" ");
        int inputSize = Integer.parseInt(inputDetails[0]);
        int numberOfQuieries = Integer.parseInt(inputDetails[1]);
        int input[] = new int[inputSize+1];
        String inputString[] = br.readLine().split(" ");
        for(int i=0; i<inputSize; i++){
            input[i+1] = Integer.parseInt(inputString[i]);
        }
        for(int i=0; i<numberOfQuieries; i++){
            String query[] = br.readLine().split(" ");
            int queryType = Integer.parseInt(query[0]);
            if(queryType==0){
                int val = Integer.parseInt(query[2]);
                if(input[val]==0) {
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
            }else{
                int val = Integer.parseInt(query[1]);
                input[val]^=1;
            }
        }
    }
}
