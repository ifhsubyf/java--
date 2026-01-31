//Шарыгина Надежда Б763-2
//вариант 11 глава 1 А
//5. Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("введите числа в качестве аргументов ком.строки");
            return;
        }
        int sum = 0;
        int pr = 1;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
                pr *= num;
            } catch (NumberFormatException e) {
                System.out.printf("'%s' не является целым числом\n", arg);
            }
        }
        System.out.println("сумма: " + sum);
        System.out.println("произведение: " + pr);
    }
}
