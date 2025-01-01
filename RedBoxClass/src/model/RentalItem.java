package model;


public abstract class RentalItem {
    
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
