public class Seat implements Comparable<Seat>
{
    private final String seatNum;
    private String reservedInd;

    public Seat(String seatNum)
    {
        this.seatNum = seatNum;
        this.reservedInd = "N";
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNum.compareToIgnoreCase(seat.getSeatNum());
    }

    public String getSeatNum()
    {
        return seatNum;
    }

    public void setReservedInd(String reservedInd)
    {
        this.reservedInd = reservedInd;
    }

    public String getReservedInd()
    {
        return this.reservedInd;
    }

    public boolean isReserved()
    {
        if (reservedInd.equals("N"))
        {
            return false;
        }
        return true;
    }
}
