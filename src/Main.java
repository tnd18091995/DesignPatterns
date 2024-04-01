public class Main {
    public static void main(String[] args) {
        SingletonEX A = SingletonEX.getInstance("VIP");
        System.out.println(A);
        SingletonEX B = SingletonEX.getInstance("NOVIP");
        System.out.println(B);
    }
}
