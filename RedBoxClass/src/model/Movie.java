package model;


public class Movie extends RentalItem {
    
    private String title;
    private int year;
    private int slotNo;
    private int QTY;
    private String media;
    
    public Movie() {
        
        title = "NULL";
        year = 0;
        slotNo = 0;
        QTY = 0;
        media = "NULL";
    }
    
    public Movie(String title, int year, int slotNo, int QTY, String media) {
    
        this.title = title;
        this.year = year;
        this.slotNo = slotNo;
        this.QTY = QTY;
        this.media = media;
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
    
    public String GetMedia() {
        
        return media;
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
    
    public void SetMedia(String media) {
        
        this.media = media;
    }
    
    public double ReturnFee(int days) {
        
        double fee;
        
        if (media == "Standard") {
            
            fee = days * 1.75;
        }
        
        else {
            
            fee = days * 2.00;
        }
        
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
                     "Media: ";
        
        if (media == "BluRay") {
            
            str += "BluRay\n"; 
        }
        
        else {
            
            str += "DVD\n";
        }
        
        return str;
    }
    
    public void Copy(Movie obj) {
         
         this.SetTitle(obj.GetTitle());
         this.SetYear(obj.GetYear());
         this.SetSlotNo(obj.GetSlotNo());
         this.SetQTY(obj.GetQTY());
         this.SetMedia(obj.GetMedia());    
     }
     
     public boolean Equals(Movie obj) {
         
         if (obj.title == title && obj.year == year && obj.slotNo == slotNo && obj.QTY == QTY && obj.media == media) {
             
             return true;
         }
         
         else {
             
             return false;
         }
     }
}