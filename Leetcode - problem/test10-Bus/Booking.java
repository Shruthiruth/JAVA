
import java.time.LocalDateTime;

class Booking
{
    static int TicketCounter = 1000;

    int TicketId;
    String PassengerType;
    String BusName;
    int SeatNumber;
    LocalDateTime dateTime;

    public Booking(String ptype,Bus bus) {

        TicketId = TicketCounter++;
        PassengerType =ptype;
        BusName=bus.BusName;
        SeatNumber=bus.BookedSeat+1;
        dateTime=LocalDateTime.now();
        bus.BookedSeat++;


    }
    
    void showTicket() {
        System.out.println("\n---- TICKET DETAILS ----");
        System.out.println("Ticket ID : " + TicketId);
        System.out.println("Date      : " + dateTime);
        System.out.println("Passenger : " + PassengerType);
        System.out.println("Bus Name  : " + BusName);
        System.out.println("Seat No   : " + SeatNumber);
    }

    
}