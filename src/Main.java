public class Main {
    public static void main(String[] args) {
        byte age = 8;
        if ( age < 5) {
            System.out.println ("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if ( age >= 5 && age < 14) {
            System.out.println ("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println ("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }




    }
}