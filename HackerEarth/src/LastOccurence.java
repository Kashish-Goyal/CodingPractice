/*
*
*
Given an array 'a' having 'n' elements.

Now, given 'q' queries , each query has an integer 'x' , you have to find out the index of last occurrence of the 'x' if it is present in the array else print '-1'.
 *
 *
 */
import java.io.*;
public class LastOccurence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0; test<testCases; test++){
            int size = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int arr[] = new int[100000001];
            for(int index=0; index<size; index++){
                arr[Integer.parseInt(input[index])] = index+1;
            }
            int queries = Integer.parseInt(br.readLine());
            for(int query=0; query<queries; query++) {
                int val = Integer.parseInt(br.readLine());
                if(arr[val]==0){
                    pw.println(-1);
                }else{
                    pw.println(arr[val]);
                }
            }
        }
        br.close();
        pw.flush();
        pw.close();
    }
}