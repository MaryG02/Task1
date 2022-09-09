import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class App {
    public static void main(String [] args ) throws IOException{
        String str;
        String hours;
        BufferedReader in=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter the name");
        str = in.readLine();
        System.out.println("Enter the amount of hours spent");
        hours = in.readLine();
        int x;
        x= Integer.parseInt(hours);
        int y;
        y = x*3600;
        System.out.println("Dear "+ str + " you spent "+ y + " seconds on your hometask");
        if(x > 5)
        {
            System.out.println("Wow, that's a lot!");
        }
        if(x <= 1)
        {
            System.out.println("Are you a speedrunner or a procrastinator?");
        }
    }
}