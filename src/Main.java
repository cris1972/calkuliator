import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Калькулятор умеет выполнять операции сложения,\n" +
                " вычитания, умножения и деления с двумя числами:\n" +
                "a + b, a - b, a * b, a / b. \n " +
                "Данные передаются в одну строку (смотри пример)! \n" +
                "Решения, в которых каждое число и арифметическая операция передаются\n" +
                "с новой строки считаются неверными.");


        System.out.println("введите данные для расчета".toUpperCase());
        while (1 == 1) {
            try {
                Scanner s = new Scanner(System.in);
                String string = s.nextLine();
                String[] arr = string.split(" ");

                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[2]);


            switch (arr[1]) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Error! Enter correct operator");
                    return;

            }
            } catch (Exception e){
                System.out.println("throws Exception ");}
        }

    }
}