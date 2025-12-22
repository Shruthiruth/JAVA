
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Booking{
    String PassengerName;
    int BusNo;
    Date date;

    public Booking() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of passenger:");
        PassengerName=scanner.next();
        System.out.println("Enter BusNo:");
        BusNo=scanner.nextInt();
        System.out.println("Enter date: dd-MM-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat simpledateformat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=simpledateformat.parse(dateInput);
            System.out.println(dateInput);
        } catch (ParseException e) {
            e.getStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> Bookings,ArrayList<Bus>Buses)
    {
        int capacity = 0;
        for(Bus Bus:Buses)
        {
            if(Bus.getBusNo()==BusNo)
             capacity=Bus.getCapacity();
        } 
        int booked =0;
        for(Booking b:Bookings)
        {
            if(b.BusNo==BusNo && b.date.equals(date))
            {
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}