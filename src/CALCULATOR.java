import java.util.Scanner;
public class CALCULATOR {
    public static void main(String[] args){
        char operator;
        double n1, n2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("АААААААА, ТЫ! ВЫБЕРИ ЧТО, ТЫ, ХОЧЕШЬ СДЕЛАТЬ С ЧИСЛОМ? \n\nСЛОЖИТЬ (+)\nВЫЧЕСТЬ (-)\nУМНОЖИТЬ (*)\nРАЗДЕЛИТЬ (/)");
            operator = input.next().charAt(0);
            System.out.println("ВВЕДИ ПЕРВОЕ ЧИСЛО!");
            n1 = input.nextDouble();
            System.out.println("А ВТОРОЕ, КАКОЕ?");
            n2 = input.nextDouble();
            switch (operator) {
                case '+' -> System.out.println(n1 + n2);
                case '-' -> System.out.println(n1 - n2);
                case '*' -> System.out.println(n1 * n2);
                case '/' -> System.out.println(n1 / n2);
                default -> System.out.println("ДЕБИЛ! ТЫ САМ ПОНИМАЕШЬ ЧТО ПРОСИШЬ?");}}}}
