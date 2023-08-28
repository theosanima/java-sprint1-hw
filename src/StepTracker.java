import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    Converter converter;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan, Converter conv) {
        scanner = scan;
        converter = conv;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Введен неверный номер месяца");
            return;
        }
        System.out.println("Введите номер дня");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay < 1 || numberOfDay > 30) {
            System.out.println("Введен неверный номер дня");
            return;
        }
        System.out.println("Введите количество шагов");
        int numberOfStep = scanner.nextInt();
        if (numberOfStep < 1) {
            System.out.println("Введено неверное количество шагов");
            return;
        }
        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[numberOfDay - 1] = numberOfStep;
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель шагов:");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Неверное число для количества шагов");
            return;
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();
        if (month > 12 || month < 0) {
            return;
        }
        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth(); // вывод общей статистики по дням
        System.out.println("Сумма шагов за месяц: " + sumSteps);  // вывод суммы шагов за месяц
        System.out.println("Максимально шагов за месяц : " + monthData.maxSteps());// вывод максимального пройденного количества шагов за месяц
        System.out.println("Количество шагов за месяц в среднем  : " + sumSteps / 30);// вывод среднего пройденного количества шагов за месяц
        System.out.println("Километров пройдено : " + converter.convertToKm(sumSteps));  // вывод пройденной за месяц дистанции в км
        System.out.println("Калорий сожжено за месяц : " + converter.convertStepsToKilocalories(sumSteps)); // вывод количества сожжённых килокалорий за месяц
        System.out.println("Лучшая серия дней по шагам: " + monthData.bestSeries(goalByStepsPerDay));       // вывод лучшей серии
        System.out.println(); //дополнительный перенос строки
    }
}

