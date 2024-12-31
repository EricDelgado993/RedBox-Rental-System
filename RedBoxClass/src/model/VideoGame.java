package model;


public class VideoGame extends RentalItem {
    
    private String title;
    private int year;
    private int slotNo;
    private int QTY;
    private String console;
    
    public VideoGame() {
        
        title = "NULL";
        year = 0;
        slotNo = 0;
        QTY = 0;
        console = "NULL";
    }
    
    public VideoGame(String title, int year, int slotNo, int QTY, String console) {
    
        this.title = title;
        this.year = year;
        this.slotNo = slotNo;
        this.QTY = QTY;
        this.console = console;
    }
    
    public String GetTitle() {
        
        return title;
    }
    
    public int GetYear() {
        
        return year;
    }
    
    public int GetSlotNo() {
        
        return slotNo;
    }
    
    public int GetQTY() {
        
        return QTY;
    }
    
    public String GetConsole() {
        
        return console;
    }
    
    public void SetTitle(String title) {
        
        this.title = title;
    }
    
    public void SetYear(int year) {
        
        this.year = year;
    }
    
    public void SetSlotNo(int slotNo) {
        
        this.slotNo = slotNo;
    }
    
    public void SetQTY(int QTY) {
        
        this.QTY = QTY;
    }
    
    public void SetConsole(String console) {
        
        this.console = console;
    }
    
    public double ReturnFee(int days) {
        
        double fee = days * 3;
        return fee;
    }
    
    public void Rent() {
        
        QTY--;
    }
    
    public void Return() {
        
        QTY++;
    }
    
     public String ToString() {
        
        String str = "Title: " + title + "\n" +
                     "Year: " + year + "\n" +
                     "Slot No.: " + slotNo + "\n" +
                     "QTY: " + QTY + "\n" +
                     "Console: ";
        
        
        if (console == "PS4") {
            
            str += "PS4\n"; 
        }
        
        else {
            
            str += "XBOX\n";
        }
        
        return str;
    }
     
     public void Copy(VideoGame obj) {
         
         this.SetTitle(obj.GetTitle());
         this.SetYear(obj.GetYear());
         this.SetSlotNo(obj.GetSlotNo());
         this.SetQTY(obj.GetQTY());
         this.SetConsole(obj.GetConsole());     
     }
     
     public boolean Equals(VideoGame obj) {
         
         if (obj.title == title && obj.year == year && obj.slotNo == slotNo && obj.QTY == QTY && obj.console == console) {
             
             return true;
         }
         
         else {
             
             return false;
         }
     }
}