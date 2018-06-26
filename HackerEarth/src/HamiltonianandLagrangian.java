/*
*
*
Students have become secret admirers of SEGP. They find the course exciting and the professors amusing. After a superb Mid Semester examination its now time for the results. The TAs have released the marks of students in the form of an array, where arr[i] represents the marks of the ith student.

Since you are a curious kid, you want to find all the marks that are not smaller than those on its right side in the array.
 *
 */
import java.io.*;
public class HamiltonianandLagrangian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(br.readLine());
        String numbers[] = br.readLine().split(" ");
        String output = numbers[numbers.length-1];
        int min = Integer.parseInt(numbers[numbers.length-1]);
        for(int index = numbers.length-2; index>=0; index--){
            if(min <= Integer.parseInt(numbers[index])){
                output = numbers[index] + " "+output;
                min = Integer.parseInt(numbers[index]);
            }
        }
        System.out.println(output);
    }
}
