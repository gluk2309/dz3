public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int replenishment = 1000;
        int percent = replenishment / 100;

        if (replenishment >= 1000) {
            System.out.print("Ваш баланс ");
            System.out.println(replenishment + percent + balance);
            System.out.print("Ваши бонусы ");
            System.out.println(percent);
        } else {
            System.out.print("Ваш баланс ");
            System.out.println(replenishment + balance);
        }

    }
}