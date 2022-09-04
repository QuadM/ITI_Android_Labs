import java.util.Scanner;

// problems: 1 4 8 - 4 6 7
// ---------------------------- ©QuadM ------------------------------------//
public class TaskOne {

    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                problemOne();
                break;
            case "2":
                problemTwo();
                break;
            case "3":
                problemThree();
                break;
            case "4":
                problemFour();
                break;
            case "5":
                problemFive();
                break;
            case "6":
                problemSix();
                break;
            default:
                break;
        }
    }

    // --------------------------------------------------------------------//
    // ------------------------ Chineese Zodiac ---------------------------//
    public static void problemOne() {
        String[] zodiacSigns = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep" };
        Scanner s = new Scanner(System.in);
        String input = "";
        for (;;) {
            System.out.print("\npress Enter to exit or\nEnter a year:");
            input = s.nextLine();
            try {
                int signNo = Integer.parseInt(input);
                System.out.println(zodiacSigns[signNo % 12]);
            } catch (Exception e) {
                if (input == "")
                    break;
                System.out.println(e);
                System.out.println("Please insert numbers that represent years.");
            }
        }
    }

    // --------------------------------------------------------------------//
    // --------------- Find the number of days in months ------------------//
    public static void problemTwo() {
        // 2024
        Scanner s = new Scanner(System.in);
        int month, year;
        int[] months = { 31, (0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String input = "";
        for (;;) {
            System.out.print("\npress Enter to exit \n");
            System.out.print("\nInput format ( month/year ):");
            input = s.next();

            try {
                if (input == "")
                    break;
                input = input.trim();
                month = Integer.parseInt(input.split("/")[0]);
                year = Integer.parseInt(input.split("/")[1]);
                months[1] = (year - 2024) % 4 == 0 ? 29 : 28; // is leap
                System.out.println("No of months: " + months[month - 1]);

            } catch (Exception e) {
                if (input == "")
                    break;
                System.out.println(e);
                System.out.println("Please insert numbers that represent years.");
            }
        }
    }

    // --------------------------------------------------------------------//
    // -------------------- Solve Quadratic Equations ---------------------//
    public static void problemThree() {
        // 2024
        Scanner s = new Scanner(System.in);
        String input = "";
        double a, b, c,
                roots[] = { 0, 0 };
        for (;;) {
            System.out.print("\npress Enter to exit \n");
            System.out.print("\nInput format ( a b c ):");
            input = s.nextLine();

            try {

                a = Integer.parseInt(input.split(" ")[0]);
                b = Integer.parseInt(input.split(" ")[1]);
                c = Integer.parseInt(input.split(" ")[2]);
                double insideRoot;
                insideRoot = (Math.pow(b, 2)) - 4 * a * c;
                roots[0] = ((-b) + Math.pow(insideRoot, 0.5)) / (2 * a);
                roots[1] = ((-b) - Math.pow(insideRoot, 0.5)) / (2 * a);
                System.out.println(Double.isNaN(roots[0]) ? "The Equation has no real roots."
                        : (roots[1] == roots[0] ? "The equation has one root " + roots[0]
                                : "The equation has two roots " + roots[0] + " and " + roots[1]));
            } catch (ArithmeticException e) {
                System.out.println("The Equation has no real roots.");
                continue;
            } catch (Exception e) {
                if (input == "")
                    break;
                System.out.println(e);

            }
        }
    }

    // --------------------------------------------------------------------//
    // ------------------------- Display Pyramid --------------------------//
    public static void problemFour() {
        // 2024
        Scanner s = new Scanner(System.in);
        String input = "";
        int numberOfLines;
        for (;;) {
            System.out.print("\npress Enter to exit \n");
            System.out.print("\nEnter the number of lines: ");
            input = s.nextLine();

            try {
                numberOfLines = Integer.parseInt(input);
                for (int row = 1; row <= numberOfLines; row++) {
                    for (int column = numberOfLines; column > 1; column--) {
                        System.out.print(column > row ? " " : column);
                    }
                    for (int column = 1; column <= row; column++) {
                        System.out.print(column);
                    }
                    System.out.println("");
                }
            } catch (Exception e) {
                if (input == "")
                    break;
                System.out.println(e);

            }
        }
    }

    // --------------------------------------------------------------------//
    // ----------------------- Display Prime numbers ----------------------//
    public static void problemFive() {

        int count = 0;

        int n, i, flag = 0;
        for (n = 2; n <= 250; n++) {
            flag = 0;
            if (n == 0 || n == 1)
                flag = 1;
            for (i = 2; i <= Math.sqrt(n); i++) {
                // if n is divisible by i, then n is not prime
                // change flag to 1 for non-prime number
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            // flag is 0 for prime numbers
            if (flag == 0) {
                System.out.print(n + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println("");
            }

        }

    }

    // --------------------------------------------------------------------//
    // ---------------------- Display Perfect number ----------------------//
    public static void problemSix() {

        int count = 0;

        int n, i;
        for (n = 2; n < 10000; n++) {
            int divisors = 0;
            for (i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisors += i;
                }
            }
            // flag is 0 for prime numbers
            // System.out.println("n: :" + n + " Div :" + divisors);
            if (divisors == n) {
                System.out.print(n + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println("");
            }

        }

    }
}
// ---------------------------- ©QuadM ------------------------------------//