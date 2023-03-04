public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("args");

        System.out.println(1971 - 2023);

        System.out.println("Привет!");
                System.out.println("Эта строчка должна быть на новой строке!");
        System.out.print("И эта, так как предыдущая команда выполнила переход на новую строку");          
                         System.out.print("--- а это нет, так как просто System.out.print() по");
        System.out.print("сле себя строку не переводит");
    }
}
