package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

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
        // Scanner numbers = new Scanner(System.in);
        // ArrayList<Integer> numberList = new ArrayList<>();

        // System.out.println("ievadi ciparus: ");

        // while (true) {
        //     try {
        //         int cipari = Integer.valueOf(numbers.nextLine());
        //         if (cipari == -1) {
        //             break;
        //         } else {
        //             numberList.add(cipari);
        //         }
        //     } catch (NumberFormatException e) {
        //         System.out.println("Nepareiza ievadīšana. Lūdzu, ievadiet derīgu veselu skaitli.");
        //     }
        // }

        // System.out.println("Saraksta izmers: " + numberList.size());

        // try {
        //     System.out.println("From where?");
        //     int m1 = Integer.valueOf(numbers.nextLine());

        //     System.out.println("To where?");
        //     int m2 = Integer.valueOf(numbers.nextLine());

        //     for (int i = m1; i <= m2; i++) {
        //         System.out.println("Jūsu skaitļi no masīva: " + numberList.get(i));
        //     }
        // } catch (NumberFormatException e) {
        //     System.out.println("Nepareiza ievadīšana. Lūdzu, ievadiet derīgu veselu skaitli.");
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("Indekss ir ārpus diapazona. Lūdzu, ievadiet derīgus indeksus masīva lieluma robežās.");
        // }


                                                                                // Print in range
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(3);
        // numbers.add(2);
        // numbers.add(6);
        // numbers.add(-1);
        // numbers.add(5);
        // numbers.add(1);

        // System.out.println("The numbers in the range [0, 5]");
        // printNumbersInRange(numbers, 0, 5);

        // System.out.println("The numbers in the range [3, 10]");
        // printNumbersInRange(numbers, 3, 10);


                                                                            //Work with array
        // Random random = new Random();
        // int[] numbers = new int[10];
        // for (int r = 0; r < 10; r++) {
        //     numbers[r] = random.nextInt(10);
        // }
            
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i]+ " ");
        // }
        // int sum = 0;
        // int liel = numbers[0];
        // int maz = numbers[0];
        // for (int number : numbers){
        //     if (number < maz) {
        //         maz = number;
        //     }
        //     if (number > liel) {
        //         liel = number;
        //     }
        //     sum += number;
        // }

        // System.out.println();
        // System.out.println("Mazākais: "+ maz);
        // System.out.println("Lielakais: "+ liel);
        // System.out.println("Summa: "+ sum);
        // System.out.println("AVG: "+ (1.0 * sum/numbers.length));
        
        
                                                                                //Variable swap
        // int[] intArr = {2,9};
        
        // int temp = intArr[0];

        // intArr[0] = intArr[1];
        // intArr[1] = temp;


        // for (int i = 0; i < intArr.length; i++){
        //     System.out.print(intArr[i]+ " ");
        // }


                                                                                    //Bubble Sort
        // int[] masivs = {4,1,5,8,9,0,2,7,3,6};
        // BubbleSort(masivs);
        

                                                                                   //Personal details
        // Scanner reader = new Scanner(System.in);
        // int sum = 0;
        // int count = 0;
        // String longest = ""; 
        // while (true) {
        //     String input = reader.nextLine();
        //     if (input.equals("q")) {
        //         break;
        //     }
        
        //     String[] parts = input.split(",");
        //     sum = sum + Integer.valueOf(parts[1]);
        //     count = count + 1;
            
        //     for (String part : parts){
        //         if(part.length() >= longest.length()){
        //             longest = part;
        //         }
        //     }
        // }
        // System.out.println("Lielakais vards: "+ longest);
        // if (count > 0) {
        //     System.out.println("AVG dzimasanas diena: " + (1.0 * sum / count));
        // }


                                                                                // Your first account
        // Account artosAccount = new Account("Arto's account", 100.00);
        // Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        // System.out.println("Initial state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);

        // artosAccount.withdraw(20);
        // System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        // artosSwissAccount.deposit(200);
        // System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        // System.out.println("End state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);


                                                                            // Your first bank transfer
        // Account name1 = new Account("Matthews account", 1000);
        // Account name2 = new Account("My account", 0);
        // name1.withdraw(100);
        // name2.deposit(100);
        // System.out.println();
        // System.out.println(name1);
        // System.out.println("-----------------------------------");
        // System.out.println(name2);


                                                                                    // Person
        //  Person matti = new Person("Matti");
        //  Person juhana = new Person("Juhana");
        //  Person toms = new Person("Tomas");
        //  Person eduards = new Person("Eduards");

        //  matti.setHeight(180);
        //  matti.setWeight(86);
    
        //  juhana.setHeight(175);
        //  juhana.setWeight(64);

        //  toms.setHeight(173);
        //  toms.setWeight(60);

        // eduards.setHeight(178);
        // eduards.setWeight(75);

        // System.out.println(matti);
        // System.out.println(juhana);
        // System.out.println(toms);
        // System.out.println(eduards);


                                                                                    // Product
        // Product banana = new Product("Banana", 1.1, 13);
        // banana.printProduct();


                                                                                // Decreasing counter
        // DecreasingCounter part1 = new DecreasingCounter(10);

        // part1.printValue();

        // part1.decrement();
        // part1.printValue();

        // part1.decrement();
        // part1.printValue();
        // System.out.println();

        // DecreasingCounter part2 = new DecreasingCounter(2);

        // part2.printValue();

        // part2.decrement();
        // part2.printValue();

        // part2.decrement();
        // part2.printValue();

        // part2.decrement();
        // part2.printValue();
        // System.out.println();

        // DecreasingCounter part3 = new DecreasingCounter(100);

        // part3.printValue();

        // part3.reset();
        // part3.printValue();

        // part3.decrement();
        // part3.printValue();


                                                                                            //Statistics (4 parts)
        // Statistics statistics1 = new Statistics();
        // statistics1.addNumber(3);
        // statistics1.addNumber(5);
        // statistics1.addNumber(1);
        // statistics1.addNumber(2);
        // System.out.println("Count: " + statistics1.getCount());
        // System.out.println("Sum: " + statistics1.sum());
        // System.out.println("Average: " + statistics1.average());
        // System.out.println();

        // Statistics odd = new Statistics();
        // Statistics even = new Statistics();
        // Statistics statistics2 = new Statistics();
        // Scanner cip = new Scanner(System.in);
        // while (true){
        //     int input = Integer.valueOf(cip.nextLine());
        //     if (input == -1){
        //         break;
        //     }
        //     statistics2.addNumber(input);
            
        //     if (input % 2 == 0){
        //         even.addNumber(input);
        //     }
        //     else {
        //         odd.addNumber(input);
        //     }
        // }
        // System.out.println("Sum: "+ statistics2.sum());
        // System.out.println("Even: "+ even.sum());
        // System.out.println("Odd: "+ odd.sum());

        
                                                                            //Payment Card  (6 parts)
        // PaymentCard card1 = new PaymentCard(50);
        // System.out.println(card1);

        // card1.eatAffordably();
        // System.out.println(card1);

        // card1.eatHeartily();
        // card1.eatAffordably();
        // System.out.println(card1);
        // System.out.println();

        // PaymentCard card2 = new PaymentCard(5);
        // System.out.println(card2);

        // card2.eatHeartily();
        // System.out.println(card2);

        // card2.eatHeartily();
        // System.out.println(card2);
        // System.out.println();

        // PaymentCard card3 = new PaymentCard(10);
        // System.out.println(card3);

        // card3.addMoney(15);
        // System.out.println(card3);

        // card3.addMoney(10);
        // System.out.println(card3);

        // card3.addMoney(200);
        // System.out.println(card3);
        // System.out.println();

        // PaymentCard card4 = new PaymentCard(10);
        // System.out.println("Paul: " + card4);
        // card4.addMoney(-15);
        // System.out.println("Paul: " + card4);
        // System.out.println();

        // PaymentCard paulsCard = new PaymentCard(20);
        // PaymentCard mattsCard = new PaymentCard(30);
        // paulsCard.eatHeartily();
        // mattsCard.eatAffordably();
        // System.out.println("Paul: "+paulsCard);
        // System.out.println("Matt: "+mattsCard);
        // paulsCard.addMoney(20);
        // mattsCard.eatHeartily();
        // System.out.println("Paul: "+paulsCard);
        // System.out.println("Matt: "+mattsCard);
        // paulsCard.eatAffordably();
        // paulsCard.eatAffordably();
        // mattsCard.addMoney(50);s
        // System.out.println("Paul: "+paulsCard);
        // System.out.println("Matt: "+mattsCard);


                                                                                    //Book
        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Book> books = new ArrayList<>();
        
        // while (true) {
        //     System.out.print("Title: ");
        //     String title = scanner.nextLine();
        //         if (title.isEmpty()) {
        //             break;
        // }
        
        // System.out.print("Pages: ");
        // int pages = Integer.parseInt(scanner.nextLine());
        
        // System.out.print("Publication year: ");
        // int publicationYear = Integer.parseInt(scanner.nextLine());
        
        // books.add(new Book(title, pages, publicationYear));
        // }
        
        // System.out.print("What information will be printed? ");
        // String choice = scanner.nextLine();
        
        // if (choice.equals("everything")) {
        //     for (Book book : books) {
        //         System.out.println(book);
        //     }
        // } else if (choice.equals("name")) {
        //     for (Book book : books) {
        //         System.out.println(book.getTitle());
        //     }
        // }


                                                                            // Constructor Overload
        // Product tapeMeasure = new Product("Tape measure");
        // Product plaster = new Product("Plaster", "home improvement section");
        // Product tyre = new Product("Tyre", 5);

        // System.out.println(tapeMeasure);
        // System.out.println(plaster);
        // System.out.println(tyre);


                                                                                    // One Minute
        // Timer timer = new Timer();

        // while (true) {
        //     System.out.println(timer);
        //     timer.advance();
        //     try {
        //         Thread.sleep(10);
        //     } 
        //     catch (Exception e) {
            
        //     }
        // }


                                                                                //HealthStation (3 parts)
        // HealthStation childrensHospital = new HealthStation();

        // Person ethan = new Person("Ethan", 1, 110, 7);
        // Person peter = new Person("Peter", 33, 176, 85);
    
        // System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        // System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    
        // childrensHospital.feed(ethan);
        // childrensHospital.feed(ethan);
        // childrensHospital.feed(ethan);
    
        // System.out.println("");
    
        // System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        // System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        // System.out.println();
        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(peter);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);

        // System.out.println("weighings performed: " + childrensHospital.weighings());


                                                                        //Card payments (4 sections)
        // PaymentCard petesCard = new PaymentCard(10);
        // System.out.println("money " + petesCard.balance());
        // boolean wasSuccessful = petesCard.takeMoney(8);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());
        // wasSuccessful = petesCard.takeMoney(4);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());
        // System.out.println();


        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // double change = unicafeExactum.eatAffordably(10);
        // System.out.println("remaining change " + change);
        // change = unicafeExactum.eatAffordably(5);
        // System.out.println("remaining change " + change);
        // change = unicafeExactum.eatHeartily(4.3);
        // System.out.println("remaining change " + change);
        // System.out.println(unicafeExactum);
        // System.out.println();


        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // double change = unicafeExactum.eatAffordably(10);
        // System.out.println("remaining change: " + change);
        // PaymentCard annesCard = new PaymentCard(7);
        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // System.out.println(unicafeExactum);


        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // System.out.println(unicafeExactum);
        // PaymentCard annesCard = new PaymentCard(2);
        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // unicafeExactum.addMoneyToCard(annesCard, 100);
        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
        // System.out.println(unicafeExactum);

                                                                            //Identical twins
        // SimpleDate date = new SimpleDate(24, 3, 2017);
        // SimpleDate date2 = new SimpleDate(23, 7, 2017);
        
        // Person leo = new Person("Leo", date, 62, 9);
        // Person lily = new Person("Lily", date2, 65, 8);
        
        // if (leo.equals(lily)) {
        //     System.out.println("Is this quite correct?");
        // }
        
        // Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
        
        // if (leo.equals(leoWithDifferentWeight)) {
        //     System.out.println("Is this quite correct?");
        // }

                                                                                // Box
        // Box box = new  Box( 2.5, 5.0, 6.0 ) ;
        // System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
        // System.out.println( "topArea: "  + box.topArea() );

        // System.out.println("Box dimensions: " + "width: " + box.width() + " height: " + box.height() +  " length: " + box.lenght());

        // Box smallerBox = box.smallerBox(box);
        // System.out.println("Smaller Box dimensions: " + "width: " + smallerBox.width() + " height: " + smallerBox.height() + "length: " + smallerBox.lenght());

        // Box biggerBox = box.biggerBox(box);
        // System.out.println("Bigger Box dimensions: " + "width: " + biggerBox.width() + " height: " + biggerBox.height() + "length: " + biggerBox.lenght());

        // System.out.println("Does the original box nest inside the bigger box? " + box.nests(biggerBox));
        // System.out.println("Does the smaller box nest inside the original box? " + smallerBox.nests(box));

                                                                            // Person and subclasses (5 parts)
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        System.out.println();

        Student ollie1 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie1);
        ollie1.study();
        System.out.println(ollie1);
        System.out.println();

        Teacher ada1 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko1 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada1);
        System.out.println(esko1);
        Student ollie2 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        int i = 0;
        while (i < 25) {
          ollie2.study();
          i = i + 1;
        }
        System.out.println(ollie2);
        System.out.println();
        
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
    
        printPersons(persons);

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

                                                                            // Print in range
        // public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        //     for(int number : numbers){
        //         if (number >= lowerLimit && number <= upperLimit){
        //             System.out.println(number);
        //         }
        //     }
        // }
        
        
                                                                                //Bubble Sort
        // public static int[] BubbleSort(int[] array) {
        //     int length = array.length;
        //     for (int i = 0; i < length; i++){
        //         for (int j = 0; j<length-1; j++){
        //             if (array[j]> array[j+1]){
        //                 int temp = array[j];
        //                 array[j] = array[j+1];
        //                 array[j+1] = temp;
        //             }
        //         }
        //     }
        //     for (int i = 0; i < array.length; i++){
        //         System.out.print(array[i]+" ");
        //     }
        //     return array;
        // }

                                                                            //Person and subclasses (5 parts)
        public static void printPersons(ArrayList<Person> persons) {
            for (Person person : persons) {
              System.out.println(person);
            }
          }
}