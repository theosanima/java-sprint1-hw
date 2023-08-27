public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(){
        for (int i = 1; i <= days.length; i++) {
            System.out.println(i + " день: " + days[i-1]);
        }
    }

    int sumStepsFromMonth(){
        int sumSteps=0;
        for (int i = 0; i < days.length; i++) {
            sumSteps+=days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if(days[i]>maxSteps){
                maxSteps=days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i]>goalByStepsPerDay){
                currentSeries++;
                if (currentSeries>finalSeries){
                    finalSeries=currentSeries;
                }
            }
        }
        return finalSeries;
    }
}
