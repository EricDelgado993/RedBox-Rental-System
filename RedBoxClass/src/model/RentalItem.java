package model;


public abstract class RentalItem {
    
//    private final String title;
//    private int year;
//    private int slotNo;
//    private int QTY;
//    
//    public RentalItem() {
//        
//        title = "NULL";
//        year = 0;
//        slotNo = 0;
//        QTY = 0;
//    }
    
    public abstract String GetTitle();
    public abstract int GetYear();
    public abstract int GetSlotNo();
    public abstract int GetQTY();
    
    public abstract void SetTitle(String title);
    public abstract void SetYear(int year);
    public abstract void SetSlotNo(int slotNo);
    public abstract void SetQTY(int QTY);
    
    public abstract double ReturnFee(int days);
    public abstract void Rent();
    public abstract void Return();
    public abstract String ToString();
}
