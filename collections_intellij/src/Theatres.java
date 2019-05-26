public class Theatres {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC", 10, 10);
        theatre.printSeats();
        if (theatre.reserveSeat("H15"))
            System.out.println("Seat H6 was successfully reserved");
        else
            System.out.println("Seat H6 could not be reserved");
    }
}
