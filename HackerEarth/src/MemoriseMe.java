/*
*
*
Arijit is a brilliant boy. He likes memory games. He likes to participate alone but this time he has to have a partner. So he chooses you.

In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.

Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).
 *
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.io.*;
public class MemoriseMe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        Map input = new HashMap();
        String inputString[] = br.readLine().split(" ");
        for(int i=0; i<inputSize; i++){
            int tempInput = Integer.parseInt(inputString[i]);
            if(input.get(tempInput)==null){
                input.put(tempInput,1);
            }else{
                input.put(tempInput,(Integer)input.get(tempInput)+1);
            }
        }
        int numberOfQueries = Integer.parseInt(br.readLine());
        for(int i=0; i<numberOfQueries; i++){
            int query = Integer.parseInt(br.readLine());
            if(input.get(query)==null){
                System.out.println("NOT PRESENT");
            }else{
                System.out.println(input.get(query));
            }
        }
    }
}
