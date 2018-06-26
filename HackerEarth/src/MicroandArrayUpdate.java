/*
*
*
Micro purchased an array A having N integer values. After playing it for a while, he got bored of it and decided to update value of its element. In one second he can increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Micro to find out the minimum amount of time it will take, for him to do so.
 *
 *
 */
import java.io.*;
public class MicroandArrayUpdate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0; test<testCases; test++){
            String input[] = br.readLine().split(" ");
            int val = Integer.parseInt(input[1]);
            String arrStr[] = br.readLine().split(" ");
            int min = val;
            for(int index=0; index<arrStr.length; index++){
                if(min > Integer.parseInt(arrStr[index]))
                    min = Integer.parseInt(arrStr[index]);
            }
            System.out.println(val-min);
        }
    }
}
