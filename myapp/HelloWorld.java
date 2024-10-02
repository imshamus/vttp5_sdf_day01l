
package myapp;

/* import java.io.Console; */

public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("hello, world");

        /* Console cons = System.console(); */
        /* String name = cons.readLine("What is your name? ");

        if(name.length() > 0) {
            System.out.println("Your name is: " + name);

            String sport = cons.readLine("What is the sport that you do? ");

            if (sport.toUpperCase().equals("SWIMMING")){
                System.out.println("Nice water sport!");
            }
            else if (sport.toUpperCase().equals("SOCCER")){
                System.out.println("Goal!!!");
            }
            else {
                System.out.println("You have not key in a sport.");
            }
        }
        else {
            System.err.println("You have not told me your name?");
        }

        String replacedName = name.replace('a', 'e'); // string or char?
        System.out.printf("Your name... %s \n", replacedName);

        String valueString = cons.readLine("Enter your score between 0 to 100: ");
        Integer score = Integer.parseInt(valueString); // convert string to int

        switch (score) {
            case 100:

                System.out.println("Perfect Score");
                break; // very impt

            case 99:
            case 98:
            case 97:
            case 96:
            case 95:

                System.out.println("Score A!");
                break; // very impt

            default:

                System.out.println("Not Acceptanle!");
                break;
        }

        int i = 0;
        while (i < score) { // evaluate first thn do
            System.out.println(i + ",");
            i++; // i = i + 1;
            // i = i + 2 and so on

        do { 
            System.out.print(i + ",");
            i++; // i = i + 1 , what is do while loop? perform task inside once first thn evaluate
        } while (i < score);

        Integer[] numbers = new Integer[5];

        for(int j = 0; j < numbers.length; j++) {
            Integer inputNumber = Integer.parseInt(cons.readLine("Enter your %d number: ", j)); // convert str to int
            numbers[j] = inputNumber;
        }

        for(Integer pI : numbers) { // for each number in the number array, print out
            System.out.println(pI);
        }
        } */

            if (args.length > 0) 
            {
                String[] names = new String[5];

                int x = 0;

                while (x < args.length) {
                    names[x] = args[x];
                    x++;

                    if (x>4) {
                        break;
                    }
                                }

                for (int y=0; y<names.length;y++){
                    System.out.printf("Name[%d]: %s", y, names[y]); // %d is integer
                }
            }
            
            else 

            {
                System.out.println("No argument passed");
            }

        }

    }