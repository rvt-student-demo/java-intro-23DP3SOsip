package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // // Make your first Hello World app!
        // System.out.println("Once upon a time");




        // // Reference data type
        // String name = "Jānis";
        // // Primitive data type
        // int age = 20;
        // // Primitibe data type
        // boolean isOnline = false;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(isOnline);



        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Ievadi tekstu:");
        // String vards = scanner.nextLine();
        // // String concatenation
        // System.out.println("Jūsu teksts: " + vards);



        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("labdien students!");
        // System.out.println("Ievadiet savu vārdu: ");
        // String name = scanner.nextLine();

        // System.out.println("ievadiet savu uzvārdu: ");
        // String surname = scanner.nextLine();

        // System.out.println("ievadiet savu gruppu: ");
        // String grupa = scanner.nextLine();

        // System.out.println("Students: " + name + " " + surname + ", grupa: " + grupa);



        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Write text abd press enter: ");
        // String input = scanner.nextLine();

        // int inputAsInteger = Integer.valueOf(input);

        // System.out.println("You wrote: " + inputAsInteger);



        // Scanner scanner = new Scanner(System.in);

        // int number1= Integer.valueOf(scanner.nextLine());
        // int number2= Integer.valueOf(scanner.nextLine());
        // // Izvada divu skaitļu summu
        // int summa = number1 + number2;
        // // Izvada divu skaitļa reizinājumu
        // int reiz = number1 * number2;
        // // Izvada skaitļu dalīšanu // 3/2
        // double dalisana = Double.valueOf(number1) / number2;
        // // vai
        // // double dalisana = (double) number1 / number2;
        
        // System.out.println(number1 + " + " + number2 + " = " + summa);
        // System.out.println(number1 + " * " + number2 + " = " + reiz);
        // System.out.println(number1 + " / " + number2 + " = " + dalisana);



        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give speed:");
        // int speed = Integer.valueOf(scanner.nextLine());
        // if (speed > 90) {
        //     System.out.println("Speeding ticket!");
        // }
        // else {
        //     System.out.println("Speed is normal");
        // }


        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give points [0-100]:");
        // int points = Integer.valueOf(scanner.nextLine());
        // if ( points < 0) {
        //     System.out.println("impossible!");
        // }
        // else if (points <= 49){
        //     System.out.println("Grade: failed");
        // }
        // else if (points <= 59){
        //     System.out.println("Grade: 1");
        // }
        // else if (points <= 69){
        //     System.out.println("Grade: 2");
        // }
        // else if (points <= 79){
        //     System.out.println("Grade: 3");
        // }
        // else if (points <= 89){
        //     System.out.println("Grade: 4");
        // }
        // else if (points <= 100){
        //     System.out.println("Grade: 5");
        // }
        // else {
        //     System.out.println("Grade: incredible!");
        // }



        //     Scanner scanner = new Scanner(System.in);

        //     System.out.println("Value of the gift?: ");
        //     int value = Integer.valueOf(scanner.nextLine());

        //     if (value >= 5000 && value < 25000){
        //         System.out.println("Tax: " + (100+(value-5000)*0.08));
        //     }
        //     else if (value >= 25000 && value < 55000){
        //         System.out.println("Tax: " + (1700+(value-25000)*0.10));
        //     }
        //     else if (value >= 55000 && value < 200000){
        //         System.out.println("Tax: " + (4700+(value-55000)*0.12));
        //     }
        //     else if (value >= 200000 && value < 1000000){
        //         System.out.println("Tax: " + (22100+(value-200000)*0.15));
        //     }
        //     else if (value >= 1000000) {
        //         System.out.println("Tax: " + (142100+(value-1000000)*0.17));
        //     }
        //     else {
        //         System.out.println("No tax!");
        //     }



        // Scanner scanner = new Scanner(System.in);
        // int count  = 0;
        // int sum = 0;

        // while (true) {
        //     System.out.println("Input number");
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number != 0) {
        //         sum = sum + number;
        //         count = count + 1;
        //     }
        //     if (number == 0) {
        //         System.out.println("Number of numbers is: " + count);
        //         System.out.println("The sum of the numbers is: " + sum);
        //         break;
        //     }
            
        // }



        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input number");
        // int count = Integer.valueOf(scanner.nextLine());
        // System.out.println();
        // int numbers = 0;
        
        // while (numbers < count+1) {
        //     System.out.println(numbers);
        //     numbers++;
        // }



        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Last number?: ");
        // int lastnumber = Integer.valueOf(scanner.nextLine());
        // int sum = 0;
        // for (int i = 0; i <= lastnumber; i++) {
        //     sum = sum + i;
        // }
        // System.out.println("The sum is: " + sum);

        // Scanner scanner = new Scanner(System.in);
        // for (int x = 10; x < 100; x+=10) {
        //     System.out.println(x);
        // }



        Scanner scanner = new Scanner(System.in);
        int count  = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            System.out.println("Input number");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Avarege: " + (double)sum/count);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            sum = sum + number;
            count = count + 1;
            if (number % 2 == 0) {
                even++;
              } else {
                odd++;
              }
        }
    }

}
