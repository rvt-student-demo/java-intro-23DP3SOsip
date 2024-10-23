package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

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



                                                                                            // Uzdevums 0
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


                                                                            // summa reizinasana dalisana
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


        
                                                                                // speeding ticket
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give speed:");
        // int speed = Integer.valueOf(scanner.nextLine());
        // if (speed > 90) {
        //     System.out.println("Speeding ticket!");
        // }
        // else {
        //     System.out.println("Speed is normal");
        // }



                                                                                // Grades and Points
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


                                                                                     // Gift tax
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


                                                                        // Number and sum of numbers
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


                                                                                // Counting
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input number");
        // int count = Integer.valueOf(scanner.nextLine());
        // System.out.println();
        // int numbers = 0;
        
        // while (numbers < count+1) {
        //     System.out.println(numbers);
        //     numbers++;
        // }



                                                                            // Sum of a sequence
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



                                                            // Repeating, breaking and remembering (5 parts)
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input number");
        // int count  = 0;
        // int sum = 0;
        // int even = 0;
        // int odd = 0;
        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == -1) {;
        //         System.out.println("Thx! Bye!");
        //         System.out.println("Sum: " + sum);
        //         System.out.println("Numbers: " + count);
        //         System.out.println("Avarege: " + (double)sum/count);
        //         System.out.println("Even: " + even);
        //         System.out.println("Odd: " + odd);
        //         break;
        //     }
        //     sum = sum + number;
        //     count = count + 1;
        //     if (number % 2 == 0) {
        //         even++;
        //       } else {
        //         odd++;
        //       }
        // }

        

        // #1
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("How many times?");
        // int times = Integer.valueOf(scanner.nextLine());
        // printText(times);
        
                                                                            // Divisible by three
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Write beginning number: ");
        // int first = Integer.valueOf(scanner.nextLine());
        // System.out.println("Write end number: ");
        // int second = Integer.valueOf(scanner.nextLine());
        // System.out.println();
        // divisibleByThreeInRange(first, second);


                                                                            // Star sign (4 parts)
        // Stars.printStars(5);
        // Stars.printSquare(4);
        // Stars.printRectangle(17, 3);
        // Stars.printTriangle(4);

                                                                        // Advanced astrology (3 parts)
        // Stars.printSpaces(5);
        // Stars.printRightTriangle(4);
        // Stars.christmasTree(4);

                                                                            // Third element in list
        // ArrayList<String> wordList = new ArrayList<>();
        // wordList.add("Tomas");
        // wordList.add("Emma");
        // wordList.add("Aleks");
        // wordList.add("Marry");
        // System.out.println(wordList.get(2));
        // wordList.remove(0);
        // System.out.println(wordList.get(2));


                                                                            //Second plus third
        // Scanner numbers = new Scanner(System.in);
        // ArrayList<Integer> numberList = new ArrayList<>();

        // System.out.println("ievadi ciparus: ");
        // while (true){
        //     int cipari = Integer.valueOf(numbers.nextLine());
        //     if (cipari == 0){
        //         break;
        //     }
        //     else {
        //         numberList.add(cipari);
        //     }
        // }
        // int sum = 0;
        // for (Integer i : numberList) {
        //     sum += i;
        // }

        // System.out.println(numberList);
        // System.out.println("Summa: " + sum);
        // System.out.println("Second plus third: " + (numberList.get(1) + numberList.get(2)));


                                                                        // Only these numbers
        Scanner numbers = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("ievadi ciparus: ");
        while (true){
            int cipari = Integer.valueOf(numbers.nextLine());
            if (cipari == -1){
                break;
            }
            else {
                numberList.add(cipari);
            }
        }
        System.out.println("Saraksta izmers: "+ numberList.size());
        System.out.println("From where?");
        int m1 = Integer.valueOf(numbers.nextLine());
        System.out.println("To where?");
        int m2 = Integer.valueOf(numbers.nextLine());
        for (int i = m1; i <= m2; i++) {
            System.out.println("Your numbers from the array: "+ numberList.get(i));
        }
    }
        //     #1
        //     public static void printText(int times) {
        //     for(int count = 0; count < times; count++) {
        //         System.out.println("In a hole in the ground there lived a method");
        //     }
        // }

                                                                            // Divisible by three
        // public static void divisibleByThreeInRange(int beginning, int end){
        //     for (int i = beginning; i <= end; i++) {
        //         if (i % 3 == 0) {
        //             System.out.println(i);
        //         }
        //     }
        // }
}
