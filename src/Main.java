import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! Вы находитесь в конвертере валют." +
                "К сожалению, сейчас Вы можете конвертировать только рубли в доллары. Другие валюты будут добавлены позднее");
        System.out.println("Введите текущий курс (использую запятую): ");
        double kurs = scanner.nextDouble();
        System.out.println("Введите сумму в рублях: ");
        double rubl = scanner.nextDouble();
        double dollar;
        dollar = rubl / kurs;

        System.out.println("Курс доллара: " + kurs);
        System.out.println("Количество рублей: " + rubl);
        System.out.format("Итого: " + "%.2f%n", dollar);
        }
}
