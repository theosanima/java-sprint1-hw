
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        StepTracker stepTracker = new StepTracker(scanner,converter);

        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
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