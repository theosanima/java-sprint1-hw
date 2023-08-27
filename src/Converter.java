public class Converter {
    int convertToKm(int steps){
        int kilometers =(steps*75)/100000;
        return kilometers;
    }
    int convertStepsToKilocalories(int steps){
        int kilocalorie = (steps*50)/1000;
        return kilocalorie;
    }
}
