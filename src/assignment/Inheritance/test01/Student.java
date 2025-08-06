package assignment.Inheritance.test01;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    Student(String name, String subject,int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public static void main(String[] args) {
        Student stu = new Student("장동건", "jspprogram", 500000);
        Student stu1 = new Student("청명", "javaprogram", 1000000);
        Student stu2 = new Student("소운휘", "cprogram", 350000);
        stu.calcReturnFee();
        stu.print();

        stu1.calcReturnFee();
        stu1.print();

        stu2.calcReturnFee();
        stu2.print();
    }

    public void calcReturnFee() {

        if (this.subject.equals("javaprogram")) {
            this.returnFee = fee*0.75;
        } else if (this.subject.equals("jspprogram")) {
            this.returnFee = fee*0.8;
        } else {
            System.out.println("그런 과정명은 없습니다");
        }
    }

    public void print() {
        if (this.returnFee>0) {
            System.out.println(this.name +"씨의 과정명은 " +this.subject+" 이고 교육비는 " +this.fee +" 이며 환급금은 "+this.returnFee+" 입니다.");
        }

    }


}