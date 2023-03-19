public class Main {
    public static void main(String[] args) {

        int ticket = 105; // Цена билета
        int mile = 1; // Бонус мили
        int money = 20; // Сумма расчета бонуса

        System.out.printf("Начислено милей : " + String.valueOf(ticket / money * mile));

    }
}
