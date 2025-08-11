package assignment.InterFaceHomeWork.num2;

public abstract class Factory {
    int openHour;
    int closeHour;
    String name;

    Factory(String name,int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return name;
    }

    int getWorkingTime() {
        return closeHour - openHour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int makeProducts(char skill);
}
