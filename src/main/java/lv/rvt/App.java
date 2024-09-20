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


        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if ( points < 0) {
            System.out.println("impossible!");
        }
        else if (points <= 49){
            System.out.println("Grade: failed");
        }
        else if (points <= 59){
            System.out.println("Grade: 1");
        }
        else if (points <= 69){
            System.out.println("Grade: 2");
        }
        else if (points <= 79){
            System.out.println("Grade: 3");
        }
        else if (points <= 89){
            System.out.println("Grade: 4");
        }
        else if (points <= 100){
            System.out.println("Grade: 5");
        }
        else {
            System.out.println("Grade: incredible!");
        }
    }

}
