public class Main {
    public static void main(String[] args) {
        byte totalSeats = 102;
        byte seats = 60;
        byte passengers = 85;
        int standingPlaces = totalSeats - seats;
        if (passengers >= seats && passengers <= totalSeats) {
            int freeStandingPlaces = totalSeats - passengers;
            System.out.println ("Если в вагон сядут " + passengers + " пассажиров, то в вагоне останется " + freeStandingPlaces + " стоячих мест.");
        } else {
            int freeSeats = seats - passengers;
            System.out.println ("Если в вагон сядут " + passengers + " пассажиров, то в вагоне останется " + freeSeats + " сидячих мест, и " + standingPlaces + " стоячих мест.");
        }





    }
}