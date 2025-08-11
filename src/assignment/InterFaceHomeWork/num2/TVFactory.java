package assignment.InterFaceHomeWork.num2;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        int skillnum = 0;
        switch (skill) {
            case 'A' : skillnum = 8; break;
            case 'B' : skillnum = 5; break;
            case 'C' : skillnum = 3; break;
            default: skillnum = 1; break;
        }
        return skillnum * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        return makeProducts('C');
    }
}
