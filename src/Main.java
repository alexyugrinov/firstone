// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку в формате ABC без пробелов, где A и C целые числа от 1 до 10 " +
                ", а B - операция +,-,*,/");

        String input = scanner.nextLine();

        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {

        String[] str = input.split("[+\\-*/]");
        String[] arr = new String[] {"1","2","3","4","5","6","7","8","9","10"};

        int x1;
        int x2;

        int indexPlus = input.indexOf("+");
        int indexMinus = input.indexOf("-");
        int indexMultiply = input.indexOf("*");
        int indexDevide = input.indexOf("/");

        String result = "";

        boolean r = input.matches("([1-9]|10)[+\\-*/]([1-9]|10)");
        if(r){
            System.out.println("It is a calculation");
        }
        else{
            throw new Exception("throws Exception");
        }


        if (indexPlus != -1 && Arrays.asList(arr).contains(str[0]) && Arrays.asList(arr).contains(str[1])) {
            x1 = Integer.parseInt(str[0].trim());
            x2 = Integer.parseInt(str[1].trim());
            result = Integer.toString((x1 + x2));
        } else if (indexMinus != -1 && Arrays.asList(arr).contains(str[0]) && Arrays.asList(arr).contains(str[1])) {
            x1 = Integer.parseInt(str[0].trim());
            x2 = Integer.parseInt(str[1].trim());
            result = Integer.toString((x1 - x2));
        } else if (indexMultiply != -1 && Arrays.asList(arr).contains(str[0]) && Arrays.asList(arr).contains(str[1])) {
            x1 = Integer.parseInt(str[0].trim());
            x2 = Integer.parseInt(str[1].trim());
            result = Integer.toString((x1 * x2));
        } else if (indexDevide != -1 && Arrays.asList(arr).contains(str[0]) && Arrays.asList(arr).contains(str[1])) {
            x1 = Integer.parseInt(str[0].trim());
            x2 = Integer.parseInt(str[1].trim());
            result = Integer.toString((x1 / x2));


        }
        return result;



    }

}
