# RedBox Rental System

## Project Overview
This project simulates a RedBox rental machine that offers video games and movies for rental. The system is designed using Java object-oriented programming principles, specifically employing an abstract class, inheritance, and polymorphism. The program allows users to rent and return items, while managing item quantities and rental fees. The rental rates differ for video games and movies, with movies having separate rates for BluRay and DVD formats.

---

## 📁 **Program Files**
- [RentalItem.java](https://github.com/EricDelgado993/RedBox-Rental-System/blob/main/RedBoxClass/src/model/RentalItem.java)
- [Movie.java](https://github.com/EricDelgado993/RedBox-Rental-System/blob/main/RedBoxClass/src/model/Movie.java)
- [VideoGame.java](https://github.com/EricDelgado993/RedBox-Rental-System/blob/main/RedBoxClass/src/model/VideoGame.java)
- [TestDriver.java](https://github.com/EricDelgado993/RedBox-Rental-System/blob/main/RedBoxClass/src/RedBox/RedBox.java)

---

## Features

### Abstract Class: `RentalItem`
- **Title**: Name of the rental item.
- **Year of Release**: Year the item was released.
- **Slot Number**: Vending machine slot number.
- **Quantity Available**: Number of available items for rent.

#### Methods:
- **Abstract `getRentalFee(int days)`**: Computes and returns the rental fee based on the number of days the item is rented.
- **`incrementQuantity()`**: Increments the quantity of the rental item.
- **`decrementQuantity()`**: Decrements the quantity of the rental item when rented or returned.

### Subclasses:
1. **`VideoGame`**:
   - Additional Attribute: `Console` (e.g., XBOX, PS4).
   - Rental Rate: $3.00 per day for any console.
   
2. **`Movie`**:
   - Additional Attribute: `Format` (BluRay or Standard DVD).
   - Rental Rate: $2.00 per day for BluRay, $1.75 per day for Standard DVD.

### User Interaction:
- **Renting Items**: Users input the slot number to rent an item. If the item is available, the rental fee is displayed and the quantity is updated.
- **Returning Items**: Users input the slot number and rental duration. The system calculates and displays the rental fee based on the number of days the item was rented.
- **Error Handling**: Handles illegal entry, out-of-stock cases, and displays appropriate messages.

### Additional Features:
- **Display Items**: Before the program terminates, all items and their available quantities are displayed.
- **Illegal Entry and Out of Stock**: The program checks for invalid slot numbers and insufficient stock.

---

### Code Implementation:
- **RentalItem Class**: Abstract class with core attributes and methods.
- **VideoGame and Movie Classes**: Subclasses implementing specific behavior for each type of item.
- **Main Program**: Interacts with the user to simulate renting and returning items from the RedBox machine.
