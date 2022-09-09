import java.util.Scanner;

public class hw {
    public static void main(String [] args ) {
        Scanner scan = new Scanner(System.in);
        String name;
        String city;
        String school;
        String lastname;
        float hours;
        byte age;
        float hours2;
        float hours3;
        float hours4;
        float hours5;
        System.out.println("Hello! Please type your name");
        name = scan.nextLine(); //getting information from user
        System.out.println("And last name");
        lastname = scan.nextLine();
        System.out.println("Please, type where are you from.");
        city = scan.nextLine();
        System.out.println("Great, enter your University/School name");
        school = scan.nextLine();
        System.out.println("Please, type in your age.");
        age = scan.nextByte();
        System.out.println("Enter the amount of hours a day you have spent in classes ");
        hours = scan.nextFloat();
        System.out.println("And time you spent on doing homework on weekdays");
        hours2 = scan.nextFloat();
        System.out.println("Awesome, please add time you spent on doing homework on weekends");
        hours4 = scan.nextFloat();
        System.out.println("Also, type the amount of hours of free time on weekdays");
        hours3 = scan.nextFloat();
        System.out.println("And the last one: enter how many hours of free time you have on weekends");
        hours5 = scan.nextFloat();
        float ratio = ((hours+hours2)*300+hours4*120)/((hours3)*300+hours5*120);
        System.out.print("Dear "+ name +" "+ lastname+", "+ age + ", from "+ city+ ", you have spent " + (int)((hours+hours2)*300+hours4*120));
        System.out.println(" minutes on work and " +(int)((hours3)*300+hours5*120) + " on rest this week, studying at " +school);
        System.out.println(" Your work to rest ratio is " +ratio);
    }
}
