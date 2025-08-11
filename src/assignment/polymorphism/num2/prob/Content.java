package assignment.polymorphism.num2.prob;

public abstract class Content {
    String title;
    int price;

    Content() {

    }
    Content(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void totalPrice() ;

    public void show() {
        System.out.println(getTitle()+"비디오의 가격은 "+getPrice()+"원 입니다.");
    }
}
