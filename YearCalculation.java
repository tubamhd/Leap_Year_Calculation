import java.util.Scanner;

public class YearCalculation {
    public static void main(String[] args) {
        int year, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        year = input.nextInt();

        if (year % 4 == 0){
            if (year % 100 != 0){
                System.out.println(year +" a leap year!");
            }else if ((year % 100 == 0) && (year % 400 == 0)){
                System.out.println(year + " a leap year!");
            }else{
                System.out.println(year + " not a leap year!!");
            }
        }else{
            System.out.println(year + " not a leap year!!");
        }


    }
}
