/*
*
*
Sumit is given an array A of size N, where Ai represents the happiness sumit get by eating the i-th dish. Sumit will eat all the dishes in a series of steps. In each step, sumit pick a non empty subset of the remaining dishes and eat them. The happiness sumit get from eating these dishes is the size of the subset multiplied by the sum of the individual happiness from the dishes in the subset. Sumit want to maximize the happiness he get from the entire feast, which is the sum of happiness in each step.
 *
 *
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumitsHappiness {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0; test<testCases; test++) {
            int size = Integer.parseInt(br.readLine());
            String inputString[] = br.readLine().split(" ");
            ArrayList<Long> input = new ArrayList<Long>();
            long sum=0;
            int count=0;
            for (int i = 0; i < size; i++) {
                Long val = Long.parseLong(inputString[i]);
                if(val>=0){
                    sum+=val;
                    count++;
                }else{
                    input.add(val);
                }

            }
            Collections.sort(input, Collections.reverseOrder());
            int flag = -1;
            for (int i = 0; i < input.size(); i++) {
                if(((sum+input.get(i))*(count+1))>=((sum*count)+input.get(i))){
                    sum+=input.get(i);
                    count++;
                }else {
                    flag = i;
                    break;
                }
            }
            if(flag!=-1){
                sum = sum*count;
                for(int i=flag; i<input.size();i++){
                    sum+=input.get(i);
                }
                System.out.println(sum);
            }else
                System.out.println(sum*count);
        }
    }
}
