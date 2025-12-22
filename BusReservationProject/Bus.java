//package BusProject;

public class Bus{
    private int BusNo;
    private Boolean AC;
    private int Capacity;

    public Bus(int No,boolean ac,int size) {
        this.BusNo=No;
        this.AC=ac;
        this.Capacity=size;

    }    

    public int getBusNo() {
        return BusNo;
    }

    public void setBusNo(int BusNo) {
        this.BusNo = BusNo;
    }

    public Boolean getAC() {
        return AC;
    }

    public void setAC(Boolean AC) {
        this.AC = AC;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }
    public void displayinfo()
    {
        System.out.println("BusNO: "+BusNo+" AC: "+AC+" Total Capacity : "+Capacity);
    }
}