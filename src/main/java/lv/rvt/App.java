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



        Scanner scanner = new Scanner(System.in);
        
        System.out.println("labdien students!");
        System.out.println("Ievadiet savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("ievadiet savu uzvārdu: ");
        String surname = scanner.nextLine();

        System.out.println("ievadiet savu gruppu: ");
        String grupa = scanner.nextLine();

        System.out.println("Students: " + name + " " + surname + ", grupa: " + grupa);
    }

}
