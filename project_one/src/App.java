import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    // 1. Напишите программу, которая выведет на экран
    // "Hello Programming!" (без кавычек) на 2 строках, по слову на каждой (см.
    // пример вывода)
    System.out.println("Hello, Programming!");

    // 2. Напишите программу, которая выводит на экран строку "Hello, Java!" (без
    // кавычек)
    System.out.println("Hello, Java!");

    // 3. Создайте две переменные: целого типа a и действительного b, равные 5 и 0.4
    // соответственно. Выведите построчно на экран их сумму, разность, произведение
    // и частное.

    int a3 = 5;
    double b3 = 0.4;
    var sum3 = a3 + b3;
    var subtraction3 = a3 - b3;
    var multiplication3 = a3 * b3;
    var division3 = a3 / b3;

    System.out.println(sum3);
    System.out.println(subtraction3);
    System.out.println(multiplication3);
    System.out.println(division3);

    // 4. Напишите программу, которая считывает три целых числа и выводит их
    // произведение.
    Scanner sc4 = new Scanner(System.in);

    byte number4A = sc4.nextByte();
    byte number4B = sc4.nextByte();
    byte number4C = sc4.nextByte();

    System.out.println(number4A * number4B * number4C);

    /*
     * 5.
     * Напишите программу, которая считывает целое число и выводит текст,
     * аналогичный приведенному в примере. Пробелы, знаки препинания, заглавные и
     * строчные буквы важны!
     * 
     * Вводится целое число, по модулю не превосходящее 10000.
     * Выведите сначала фразу "The next number for the number ", затем введенное
     * число, затем слово " is ", окруженное пробелами, затем формулу для следующего
     * за введенным числа, наконец, знак точки без пробела. Аналогично в следующей
     * строке для предыдущего числа.
     */

    Scanner sc5 = new Scanner(System.in);

    int numb5A = sc5.nextInt();
    var numb5B = numb5A + 1;
    var numb5C = numb5A - 1;

    System.out.print("The next number for the number " + numb5A + " is " + numb5B + "/n"
        + "The previous number for the number" + numb5A + " is " + numb5C);
  }
}
