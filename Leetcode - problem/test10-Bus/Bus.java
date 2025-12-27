class Bus
{
    int BusId;
    String BusName;
    int Capacity;
    int BookedSeat = 0;

    public Bus(int id,String name,int cap) {
        this.BusId = id;
        this.BusName = name;
        this.Capacity = cap;
    }

    int AvailableSeat()
    {
        return Capacity-BookedSeat;
    }

    void DisplayInfo(){

        System.out.println(BusId +"" + BusName + " " + "Total seat" + Capacity + "avaliable seat"+ AvailableSeat());
    }

    
}