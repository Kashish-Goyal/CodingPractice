/*
*
*
Rash is known about his love for racing sports. He is an avid Formula 1 fan. He went to watch this year's Indian Grand Prix at New Delhi. He noticed that one segment of the circuit was a long straight road. It was impossible for a car to overtake other cars on this segment. Therefore, a car had to lower down its speed if there was a slower car in front of it. While watching the race, Rash started to wonder how many cars were moving at their maximum speed. Formally, you're given the maximum speed of N cars in the order they entered the long straight segment of the circuit. Each car will prefers to move at its maximum speed. If that's not possible because of the front car being slow, it might have to lower its speed. It still moves at the fastest possible speed while avoiding any collisions. For the purpose of this problem, you can assume that the straight segment is infinitely long. Count the number of cars which were moving at their maximum speed on the straight segment. *
 *
 */
import java.io.*;
public class Speed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int test=0; test<testCases; test++){
            int numberOfCars = Integer.parseInt(br.readLine());
            String speeds[] = br.readLine().split(" ");
            int currentMin = Integer.parseInt(speeds[0]);
            int cars = 1;
            for(int index=1; index<speeds.length; index++){
                if(Integer.parseInt(speeds[index])<=currentMin){
                    currentMin = Integer.parseInt(speeds[index]);
                    cars++;
                }
            }
            System.out.println(cars);
        }

    }
}
