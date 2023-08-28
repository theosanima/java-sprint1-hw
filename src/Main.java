
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        StepTracker stepTracker = new StepTracker(scanner, converter);


        while (true) {
            printMenu();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    stepTracker.changeStepGoal();
                    break;
                case 3:
                    stepTracker.printStatistic();
                    break;
                case 4:
                    System.out.println("Пока!");
                    return;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }

        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("Для ввода количества шагов за день нажмите 1");
        System.out.println("Для изменение цели по количеству шагов за день нажмите 2");
        System.out.println("Для вывода статистики за определенный месяц нажмите 3");
        System.out.println("Для выхода из программы нажмите 4");
    }

}