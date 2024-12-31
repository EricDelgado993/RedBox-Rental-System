package RedBox;

import model.RentalItem;
import model.Movie;
import model.VideoGame;

import java.util.Scanner;

public class RedBox {

    public static void main(String[] args) {
  
        int flag = 1;
        int selection;
        int rentalChoice;
        int numDays;
                
        Scanner cin = new Scanner(System.in);
        
        RentalItem [] itemList = new RentalItem[9];

        itemList[0] = (new VideoGame("Fallout 76", 2018, 9, 5, "XBOX"));
        itemList[1] = (new VideoGame("Just Cause 4", 2018, 4, 6, "PS4"));
        itemList[2] = (new Movie("First Man", 2019, 5, 7, "BluRay"));
        itemList[3] = (new Movie("Goosebumps 2", 2018, 8, 8, "Standard"));
        itemList[4] = (new Movie("Night School", 2018, 1, 9, "Standard"));
        itemList[5] = (new Movie("Venom", 2018, 3, 10, "BluRay"));
        itemList[6] = (new Movie("Black Panther", 2018, 6, 2, "BluRay"));
        itemList[7] = (new VideoGame("Residen Evil 2", 2018, 7, 4, "PS4"));
        itemList[8] = (new VideoGame("Maddden NFL 19", 2018, 2, 0, "XBOX"));
        
        System.out.println("Welcome to the Redbox Program\n");
        
        do {
            
            System.out.print("Select action:\n" +
                    "[1] Rent\n" +
                    "[2] Return\n" +
                    "[3] Display Items\n" +
                    "[4] Exit\n" +
                    "\nSELECTION: ");
            
            selection = cin.nextInt();
            
            if (selection >= 1 && selection <= 4) {
                
                if (selection == 1) {
                    
                        System.out.println("\nSelect item slot number to rent:\n");

                        for (int i = 0; i < itemList.length; i++) {
                            
                            System.out.print("[" + (i + 1) + "] ");

                            for (int j = 0; j < itemList.length; j++) {

                                if (itemList[j].GetSlotNo() == i + 1) {
                                    
                                    System.out.println(itemList[j].GetTitle());
                                    
                                }

                            }

                        }

                        System.out.println("[0] Exit");

                    do {

                        System.out.print("\nSELECTION: ");

                        rentalChoice = cin.nextInt();

                        if (rentalChoice >= 0 && rentalChoice <= itemList.length) {

                            if (rentalChoice == 0) {

                               flag = 0;
                           }

                            else if (rentalChoice != 0) {

                               for (int i = 0; i < itemList.length; i++) {

                                   if (rentalChoice == itemList[i].GetSlotNo() && itemList[i].GetQTY() != 0) {

                                       itemList[i].Rent();
                                       System.out.println("\n" + itemList[i].GetTitle() + " rented." +
                                       "\nRental rate: $" + String.format("%.2f", itemList[i].ReturnFee(1)) + " per day.");
                                   }

                                   else if (rentalChoice == itemList[i].GetSlotNo() && itemList[i].GetQTY() == 0) {

                                       System.out.println("\n" + itemList[i].GetTitle() + " is out of stock.");
                                   }
                               }
                           }
                        }

                        else {

                            System.out.println("\nINVALID SELECTION input another value.");
                        }

                    } while (flag == 1);

                    flag = 1;
                }

                else if (selection == 2) {

                    System.out.println("\nSelect item slot number to return:\n");

                        for (int i = 0; i < itemList.length; i++) {
                            
                            System.out.print("[" + (i + 1) + "] ");

                            for (int j = 0; j < itemList.length; j++) {

                                if (itemList[j].GetSlotNo() == i + 1) {
                                    
                                    System.out.println(itemList[j].GetTitle());
                                    
                                }

                            }

                        }

                        System.out.println("[0] Exit");
                        
                        do {

                        System.out.print("\nSELECTION: ");

                        rentalChoice = cin.nextInt();

                        if (rentalChoice >= 0 && rentalChoice <= itemList.length) {

                            if (rentalChoice == 0) {

                               flag = 0;
                           }

                            else if (rentalChoice != 0) {

                                do {
                                    
                                    System.out.print("Enter number of days rented: ");

                                    numDays = cin.nextInt();

                                    if (numDays > 0) {
                                        
                                        for (int i = 0; i < itemList.length; i++) {

                                            if (rentalChoice == itemList[i].GetSlotNo()) {

                                                itemList[i].Return();
                                                System.out.println("\n" + itemList[i].GetTitle() + " returned." +
                                                "\nTotal due: $" + String.format("%.2f", itemList[i].ReturnFee(numDays)));
                                                flag = 0;
                                            }
                                        }
                                    }
                                    
                                    else {
                                        
                                        System.out.println("\nINVALID SELCTION input another value.");
                                    }
                               
                                } while(flag == 1);
                                
                                flag = 1;
                           }
                        }

                        else {

                            System.out.println("\nINVALID SELECTION input another value.");
                        }

                    } while (flag == 1);
                        
                    flag = 1;
                }

                else if (selection == 3) {
                
                    for (int i = 0; i < itemList.length; i++) {

                        System.out.println(itemList[i].ToString());
                    }
                }
                            
                else {

                    flag = 0;
                }
            }
                    
            else {
                
                System.out.println("\nINVALID SELECTION input another value.");
            }
            
        } while (flag == 1);
        
    }
    
}
