/*03/22/2019 - Implements a theatre seating system. Uses Collections.binarysearch method to reserve seats*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private String seatNum;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow)
    {
        char rowNum = 'A';

        this.theatreName = theatreName;
        for (int i = 1; i <= numRows; i++)
        {
            for (int x = 1; x <= seatsPerRow; x++)
            {
                seatNum = String.format("%s%s", rowNum, x);
                Seat seat = new Seat(seatNum);
                seat.setReservedInd("N");
                seats.add(seat);
            }
            rowNum++;
        }
    }

    public void printSeats()
    {
        for (Seat seat : seats)
            System.out.println(seat.getSeatNum() + " ==> " + seat.getReservedInd());
    }

    public boolean reserveSeat(String seatNum)
    {
        boolean reservedInd = false;

        System.out.println("Reserving seat " + seatNum);
        Seat requestedSeat = new Seat(seatNum);
        // Using binarysearch instead of enhanced for loop
        int seatFound = Collections.binarySearch(seats, requestedSeat, null);
        if (seatFound >= 0)
        {
            if (!requestedSeat.isReserved())
            {
                requestedSeat.setReservedInd("Y");
                reservedInd = true;
            }
            else
                System.out.println("Seat " + seatNum + " is already reserved");
        }
        else
            System.out.println("Seat " + seatNum + " does not exist");

        /*
        for (Seat seat : seats)
        {
            System.out.print(".");
            if ((seat.getSeatNum().equals(seatNum)) && !(seat.isReserved()))
            {
                seat.setReservedInd("Y");
                reservedInd = true;
                System.out.println(seat.getSeatNum() + " ==> " + seat.getReservedInd());
                break;
            }
        }
        */
        return reservedInd;
    }
}