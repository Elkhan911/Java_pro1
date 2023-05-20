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
    Scanner value4 = new Scanner(System.in);

    byte number4A = value4.nextByte();
    byte number4B = value4.nextByte();
    byte number4C = value4.nextByte();

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

    Scanner value5 = new Scanner(System.in);

    int numb5A = value5.nextInt();
    var numb5B = numb5A + 1;
    var numb5C = numb5A - 1;

    System.out.println("The next number for the number " + numb5A + " is " + numb5B + ". ");
    System.out.println("The previous number for the number " + numb5A + " is " + numb5C + ".");

    /*
     * 6.
     * На одной строчке через пробел записаны два целых числа: длина и ширина
     * прямоугольника. Вычислите его площадь и периметр (именно в таком порядке).
     * Результаты выведите в две строки.
     */

    Scanner value6 = new Scanner(System.in);

    int sideA6 = value6.nextInt();
    int sideB6 = value6.nextInt();

    // Площадь
    var S6 = sideA6 * sideB6;

    // Периметр
    var P6 = (sideA6 + sideB6) * 2;

    System.out.println(S6);
    System.out.println(P6);

    /*
     * 7. Дано целое число n. Выведите следующее за ним четное число. При решении
     * этой задачи нельзя использовать условную инструкцию if и циклы.
     * Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у
     * чётных и у нечётных чисел.
     */

    Scanner value7 = new Scanner(System.in);
    int numb7 = value7.nextInt();
    var result7 = numb7 + 2 - (numb7 % 2);

    System.out.println(numb7);
    System.out.println(result7);

    /*
     * 8. Дано произвольное положительное натуральное число. Найдите его последнюю
     * цифру.
     */

    Scanner value8 = new Scanner(System.in);
    int result8 = value8.nextInt() % 10;

    System.out.println(result8);

    /*
     * 9. С клавиатуры вводятся два числа. Выведите на экран большее из них
     */

    Scanner value9 = new Scanner(System.in);

    int numb9A = value9.nextInt();
    int numb9B = value9.nextInt();

    if (numb9A > numb9B) {
      System.out.println(numb9A);
    } else {
      System.out.println(numb9B);
    }

    /*
     * 10. С клавиатуры построчно вводятся три строки. Необходимо определить, все ли
     * они равны. Если да, то вывести "Yes", в противном случае - "No".
     */

    Scanner value10 = new Scanner(System.in);

    String str10A = value10.nextLine();
    String str10B = value10.nextLine();
    String str10C = value10.nextLine();

    if (str10A.equals(str10B) && str10B.equals(str10C) && str10C.equals(str10A)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    /*
     * 11. Напишите программу, которая считывает 2 действительных числа и выводит их
     * частное. Если это невозможно, то выводит слово "Error"
     */

    Scanner value11 = new Scanner(System.in);

    int numb11A = value11.nextInt();
    int numb11B = value11.nextInt();

    if (numb11A % numb11B == 0 && numb11B != 0) {
      System.out.println(numb11A / numb11B);
    } else {
      System.out.println("Error");
    }

    /*
     * 12. Напишите программу, которая считывает действительное число и выводит
     * значение в два раза меньше.
     */

    Scanner value12 = new Scanner(System.in);
    float numb12 = value12.nextFloat();

    System.out.println(numb12 / 2);

    /*
     * 13. Вася приехал в Америку и он очень любит кофе. В Америке приобрести этот
     * напиток можно лишь лицам достигшим возраста 21 год. Напишите программу,
     * которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт
     * ли Вася сегодня кофе?
     */

    Scanner value13 = new Scanner(System.in);
    int age13 = value13.nextInt();
    System.out.println(age13 >= 21 ? "Yes" : "No");

    /*
     * 14. Вводится два целых числа.
     * Найдите квадрат суммы чисел
     */

    Scanner value14 = new Scanner(System.in);

    int numb14A = value14.nextInt();
    int numb14B = value14.nextInt();

    var c = Math.pow(numb14A + numb14B, 2);

    System.out.println(c);

    /*
     * 15. Пользователь вводит натуральное число. Необходимо вывести все четные
     * числа, не превосходящие этого числа.
     */

    Scanner value15 = new Scanner(System.in);
    int numb15 = value15.nextInt();

    int counter15 = 2;

    while (counter15 < numb15) {
      counter15 += 2;
      System.out.println(counter15);
    }

    /*
     * 16. Напишите программу, которая выведет слово "Привет" - 10 раз
     */

    for (int i = 1; i <= 10; i++) {
      System.out.println("Привет");
    }

    /*
     * 17. Напишите программу, которая находит сумму натуральных чисел от 1 до n,
     * где n вводится с клавиатуры.
     */

    Scanner value17 = new Scanner(System.in);
    int numb17 = value17.nextInt();
    var sum17 = 0;

    for (int i = 1; i < numb17; i++) {
      sum17 += i;
      System.out.println(sum17);
    }

    /*
     * 18. Создайте массив, в котором будут храниться значения. Выведите эти
     * значения на экран
     */

    int array18[] = { 11, 2, 13, 4 };

    for (var i = 0; i < array18.length; i++) {
      System.out.println(array18[i]);
    }

    // https://stepik.org/lesson/399116/step/4?unit=388206

    /*
     * 19. Создайте массив, в котором будут храниться значения. Выведите эти
     * значения на в квадрате
     */

    int array19[] = { 10, 11, 12, 13 };

    for (var i = 0; i < array19.length; i++) {
      System.out.println(Math.pow(array19[i], 2));
    }

    /*
     * 20. Создайте массив, в котором будут храниться значения в виде строк.
     * Выведите эти значения в обратном порядке
     */

    String array20[] = { "привет", "добрый", "мир" };

    for (var i = array20.length - 1; i >= 0; i--) {
      System.out.println(array20[i]);
    }

    /*
     * 21. Создайте массив, в котором будут храниться значения в виде чисел.
     * Выведите первое и последнее значение. Выведите сумму этих значений
     */

    int[] array21 = { 10, 20, 30, 40, 50 };

    System.out.println(array21[0]);
    System.out.println(array21[array21.length - 1]);
    var sum21 = array21[0] + array21[array21.length - 1];
    System.out.println(sum21);

    /*
     * 22. Создайте массив, состоящий из целых чисел. Нумерация элементов начинается
     * с 0.
     * Напишите программу, которая выведет четные элементы массива
     */

    int[] array22 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    for (int i = 0; i < array22.length; i++) {
      if (array22[i] % 2 == 0 && array22[i] != 0) {
        System.out.println(array22[i]);
      }
    }

    /*
     * 23. Создайте массив, состоящий из строк.
     * Напишите программу, которая выведет элементы массива с НЕЧЕТНЫМИ ИНДЕКСАМИ.
     */

    String[] array23 = { "привет", "добрый", "и", "красивый", "мир", "!" };

    for (var i = 0; i < array23.length; i++) {

      if (i % 2 != 0) {
        System.out.println(array23[i]);
      }
    }



  /*
   * 1p. Объяви метод multiply с двумя параметрами — целыми числами a и b. В теле
   * метода в переменной result сохрани результат их умножения. Метод должен
   * печатать текст: «Результат умножения - <число>».
   */
  public void multiply(int a, int b) {
    int result = a * b;
    System.out.println("Результат умножения - " + result);

  }

  /*
   * 2p. Объяви метод getAgeCar с двумя параметрами: carName и year. Метод должен
   * выводить в консоль: "<марка машины> <год> года выпуска".
   */

  public void getAgeCar(String carName, int year) {
    System.out.println(carName + " " + year + " года выпуска");
  }

  /*
   * 3p. Допиши метод sayHello, который будет приветствовать студентов на курсе.
   * Он принимает строковый параметр name — имя студента — и выводит в
   * консоль
   * строку Добро пожаловать на курс, имя_студента!. Вызывать метод не нужно
   */

  public void sayHello(String name) {
    System.out.println("Добро пожаловать на курс, " + name + "!");
  }

  /*
   * 4p. Метод printAverageRating выводит в консоль средний балл студента за три
   * семестра. В него передаются средние оценки, например: printAverageRating(4.8,
   * 4.5, 3.9);.
   * Допиши метод calculateAverageRating, который будет рассчитывать средний балл
   * за три семестра и возвращать его значение.
   */

  public void printAverageRating(double firstSemesterRating, double secondSemesterRating, double thirdSemesterRating) {
    double averageRating = calculateAverageRating(firstSemesterRating, secondSemesterRating, thirdSemesterRating);
    System.out.println("Средний балл по итогам трёх семестров " + averageRating);
  }

  public double calculateAverageRating(double a, double b, double c) {
    return (a + b + c) / 3;
  }

  /*
   * 5p. В приложении прогноза погоды хранятся переменные со средней температурой
   * воздуха на сегодня и завтра. Объяви переменную isColder: пусть она проверяет,
   * будет ли завтра холоднее, чем сегодня. Выведи её на экран.
   */

double todayWeather = 25.5; // погода на сегодня
double tomorrowWeather = 32.3; // погода на завтра

boolean isColder = todayWeather>tomorrowWeather;
System.out.println(isColder);



}
}