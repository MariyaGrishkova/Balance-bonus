public class main {
    public static void main (String[] args) {
        int balance = 100;
        int replenishment = 1800;
        int factor = 20;
        int bonus = replenishment / factor;
        int total = balance + replenishment + bonus;
        System.out.println(total);
    }
}
