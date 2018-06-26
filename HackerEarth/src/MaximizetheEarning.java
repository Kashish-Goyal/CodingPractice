/*
*
*
Napoleon choosed a city for Advertising his company's product. There are  streets in that city. Each day he travels one street. There are  buildings in a street which are located at points . Each building has some height(Say  meters). Napoleon stands at point . His height is . Now Napoleon starts communicating with the people of each building. He can communicate with people of a particular building only if he can see that building. If he succeed to communicate with any particular building then his boss gives him . i.e. if he communicates with  buildings in a day, then he will earn . Now Napoleon wants to know his maximum Earning for each day.

Note: All the points are on Strainght Line and Napoleon is always standing at point 0.
 *
 *
 */
import java.io.*;
public class MaximizetheEarning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int streets = Integer.parseInt(br.readLine());
        for(int streetNo=0; streetNo<streets; streetNo++){
            String streetDetails[] = br.readLine().split(" ");
            String heights[] = br.readLine().split(" ");
            int currentHeight = 0;
            int buildings = 0;
            for(int index=0; index<heights.length; index++){
                if(Integer.parseInt(heights[index])>currentHeight){
                    currentHeight = Integer.parseInt(heights[index]);
                    buildings++;
                }
            }
            System.out.println(buildings*Integer.parseInt(streetDetails[1]));
        }

    }
}
