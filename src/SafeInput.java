import java.util.Scanner;

public class SafeInput
{
    /**
     * Get an integer value within a specified range of low to high
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low Low value for a range low - high
     * @param high hihg value for a range low - high
     * @return return an int value within a low to high range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean going = true;

        do {
            System.out.println(prompt + " [" + low + " - " + high + "]:");
            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    //  System.out.println("You said your fav num is: " + retVal);
                    going = false;
                } else {
                    System.out.println("You said your fav num is: " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Must enter valid int " + trash);
            }

        } while (going);
        return retVal;


    }
    /**
     * Gets an int
     *
     * @param pipe Scanner for console input
     * @param prompt Asks what to input
     * @return Returns int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean going = true;

        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                going = false;
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Must enter valid int " + trash);
            }

        } while (going);
        return retVal;

    }
    public static int doubleIt(int num)
    {
        int doubledVal = num * 2;
        return doubledVal;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean going = true;

        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                going = false;
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Must enter valid int " + trash);
            }

        } while (going);
        return retVal;

    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean going = true;

        do {
            System.out.println(prompt + " [" + low + " - " + high + "]:");
            if(pipe.hasNextDouble()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    //  System.out.println("You said your fav num is: " + retVal);
                    going = false;
                } else {
                    System.out.println("You said your fav num is: " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else
            {
                trash = pipe.nextLine();
                System.out.println("Must enter valid int: " + trash);
            }

        } while (going);
        return retVal;


    }
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
        String retVal = "";
        boolean going = true;

        do {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() > 0)
            {
                going = false;
            }

            else
            {
                System.out.println("Must enter at least 1 character");
            }

        } while (going);
        return retVal;

    }
    /**
     *
     * @param pipe The scanner
     * @param prompt the prompt
     * @return returns y or n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        String answer = "";
        boolean going = true;

        do {
            System.out.println(prompt + ": ");
            answer = pipe.nextLine();
            if (answer.length() > 0 && answer.equalsIgnoreCase("Y"))
            {
                going = false;
                retVal = true;
            }

            else if (answer.length() > 0 && answer.equalsIgnoreCase("N"))
            {
                retVal = false;
                going = false;
            }
            else
            {
                System.out.println("Must enter valid response");
            }

        } while (going);
        return retVal;
    }
    /**
     *
     * @param pipe scanner
     * @param prompt prompt
     * @param regExPattern pattern in regex form
     * @return returns string pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String retVal = "";
        boolean running = true;

        do {
            System.out.println("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.matches(regExPattern))
            {
                running = false;

            } else
            {
                System.out.println("\nInvalid Input: " + retVal + "\n" + "Please match the pattern: " + regExPattern);
            }

        } while (running);
        return retVal;

    }
    /**
     *
     * @param msg Message you want to display
     */
    public static void prettyHeader(String msg){

        int a = msg.length();


        for (int count = 0; count <= 60; count++)
            System.out.print("*");
        System.out.println();
        for (int count = 0; count < 3; count++)
            System.out.print("*");

        int space = 54 - a;

        if (space % 2 == 0)
        {
            for (int j = 0; j < space / 2; j++)
                System.out.print(" ");
            System.out.print(msg);
            for (int i = 0; i < space / 2 + 1; i++)
                System.out.print(" ");
        }
        else
        {
            for (int j = 0; j < space / 2 + 1; j++)
                System.out.print(" ");
            System.out.print(msg);
            for (int i = 0; i < space / 2 + 1; i++)
                System.out.print(" ");
        }

        for (int count = 0; count < 3; count++)
            System.out.print("*");
        System.out.println();
        for (int count = 0; count <= 60; count++)
            System.out.print("*");

    }
    public static double CtoF(double celsius){
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;

    }
}
