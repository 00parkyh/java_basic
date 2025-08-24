package java_advanced.day13.exceptionEx.num2;

public class CardPayment extends Payment{
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    CardPayment(String shopName,String productName,long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName,productName,productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }
    @Override
    public void pay() throws PayException {
        if (productPrice <=0 || monthlyInstallment<0) {
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        } else {
            toString();
        }

    }
    public String toString() {
        return """
                신용카드가 정상적으로 지불되었습니다.
                [ 신용카드 결제 정보 ]
                상점명 : %s
                상품명 : %s
                상품가격 : %d
                신용카드번호 : %s
                할부개월 : %s
                """.formatted(shopName,productName,productPrice,cardNumber,monthlyInstallment);
    }
}
