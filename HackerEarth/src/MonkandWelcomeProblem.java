/*
*
*
Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C.
 ;
Now, Monk will proceed further when you solve this one. So, go on and solve it :)
 *
 *
 */
import java.io.*;
public class MonkandWelcomeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String array1[] = br.readLine().split(" ");
        String array2[] = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            System.out.printf(Integer.parseInt(array1[i])+Integer.parseInt(array2[i])+" ");
        }
    }
}
