public class Main {
    public static void main(String[] args) {
        byte age = 12;
        if ( age >= 2 && age < 7) {
            System.out.println ("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if ( age >= 7 && age < 18) {
            System.out.println ("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if ( age >= 18 && age < 24) {
            System.out.println ("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if ( age >= 24 ) {
            System.out.println ("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        if ( age < 2 ) {
            System.out.println ("Если возраст человека равен " + age + ", то ему не нужно никуда ходить.");
        }



    }
}