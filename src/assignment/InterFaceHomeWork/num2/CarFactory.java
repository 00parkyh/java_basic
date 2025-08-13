package assignment.InterFaceHomeWork.num2;

public class CarFactory extends Factory implements IWorkingTogether{

    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        int skillnum = 0;
        switch (skill) {
            case 'A' : skillnum = 3; break;
            case 'B' : skillnum = 2; break;
            case 'C' : skillnum = 1; break;
            default: skillnum = 0; break;
        }
        return skillnum * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        return ((CarFactory)partner).makeProducts('B');
    }

}
