import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int year;
        System.out.println("Write a year ");
        year=input.nextInt();

        if(year%100==0){
            if(year%4==0){
                System.out.println("This year is  a leak year");
            }

        } 
        else{
            if(year%4==0){
                System.out.println("This year is  a leak year");

            } else{
                System.out.println("That's not a leap year");
            }
        }

    }
}