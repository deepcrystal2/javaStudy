package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {


        ProductOrder tofu = new ProductOrder();
            tofu.productName = "두부";
            tofu.price = 5000;
            tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
            kimchi.productName = "김치";
            kimchi.price = 5000;
            kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
            coke.productName = "콜라";
            coke.price = 1500;
            coke.quantity = 2;

        ProductOrder[] orders = new ProductOrder[]{tofu,kimchi,coke};

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : "+ order.productName + ", 가격 : "+order.price+", 수량 : "+order.quantity);
            totalAmount +=  order.price * order.quantity;
        }

        System.out.println("총 결제금액 : " + totalAmount);

    }









}
