public class Main {
    public static void main(String[] args) {
        byte temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице  " + temperature + " градусов, можно идти без шапки.");
        }

        if (temperature < 5) {
            System.out.println("На улице  " + temperature + " градусов, нужно надеть шапку.");
        }


    }
}