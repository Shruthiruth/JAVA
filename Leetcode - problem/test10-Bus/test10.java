
import java.util.ArrayList;
import java.util.Scanner;

class test10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Bus> Buses=new ArrayList<>();
        ArrayList<Booking> Bookings=new ArrayList<>();

        Buses.add(new Bus(1,"Glassdoor",54));
         Buses.add(new Bus(2,"A1 Travels",50));
          Buses.add(new Bus(3,"No 1 Travels",45));
           Buses.add(new Bus(4,"Intercity",0));

        int choice = 1;

        while(choice != 4)
        {
            System.out.println("\n1. Show Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. Final Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:

                    for(Bus b:Buses)
                    {
                        b.DisplayInfo();
                    }
                    break;


                case 2:

                    System.out.println("Enter Bus Id:");
                    int id=sc.nextInt();

                    Bus selectedBus=null;
                    for(Bus b:Buses)
                    {
                        if(b.BusId == id)
                        {
                            selectedBus=b;
                            break;
                        }
                    }
                    if(selectedBus == null || selectedBus.AvailableSeat()==0)
                    {
                        System.out.println("Bus not available!");
                        break;
                    }

                      System.out.print("Passenger Type (Male/Female/Child): ");
                    String type = sc.next();

                    Booking booking = new Booking(type, selectedBus);
                    Bookings.add(booking);
                    booking.showTicket();
                    break;

                
                case 3:

                    System.out.println("Final Report:");
                    System.out.println("Total Passenger"+Bookings.size());
                    for(Bus b:Buses)
                    {
                        System.out.println(b.BusName+":"+b.BookedSeat+"/"+b.Capacity);
                    }
                    break;

                case 4:

                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");


            }
        }
    }
}