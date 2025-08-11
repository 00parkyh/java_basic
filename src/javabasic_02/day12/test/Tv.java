package javabasic_02.day12.test;

public class Tv {
    String color;
    boolean power;
    int channel;

    Tv() {
        color = "black";
        power = false;
        channel = 0;
    }
    public void power() {

        if (!power) {
            power = true;
        } else {
            power = false;
        }
    }
    public void channelUp() {
        this.channel = channel+1;
    }
    public void channelDown() {
        this.channel = channel-1;
    }
    public void print() {
        System.out.printf("color : %s\tpower : %s\tchannel : %d\n",this.color,this.power,this.channel);
    }
}
