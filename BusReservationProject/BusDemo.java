//package BusProject;

import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo
{
    public static void main(String[] args) {

        ArrayList<Bus> Buses=new ArrayList<Bus>();
        ArrayList<Booking> Bookings=new ArrayList<Booking>();
       
        Buses.add(new Bus(1,true,1));
        Buses.add(new Bus(2,false,55));
        Buses.add(new Bus(3,true,35));
        int userOption=1;
        Scanner scanner=new Scanner(System.in);
        for(Bus b:Buses)
        {
            b.displayinfo();
        }

        while(userOption==1)
        {
           
            System.out.println("enter 1 to book and 2 to exit");
            userOption=scanner.nextInt();

            if(userOption==1)
            {
                Booking booking = new Booking();
                if(booking.isAvailable(Bookings,Buses))
                {
                    System.out.println("your booking is confirmed");
                }
                else
                {
                    System.out.println("bus is full try another bus");
                }
            }
        }
    }
}