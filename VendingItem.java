/**
*Represents items purchaseable at VendingMachine.java
*
*@author dcamejo3
*/
public enum VendingItem {
    Lays(1.50),
    Doritos(1.50),
    Coke(2.50),
    Ramblin_Reck_Toy(180.75),
    Rubiks_Cube(30.00),
    Rat_Cap(15.00),
    FASET_Lanyard(10.00),
    Graphing_Calculator(120.00),
    UGA_Diploma(0.10),
    Pie(3.14),
    Clicker(55.55),
    Cheetos(1.25),
    Sprite(2.50),
    Red_Bull(4.75),
    Ramen(3.15);


    private final double price;

    /**
    *Constructor, takes in an enum's price. Allows the price
    *to be used elsewhere.
    *
    *@param price, price of the item as stated on the enunm\
    */
    private VendingItem(double price) {
        this.price = price;
    }

    /**
    *@return the enum's price
    */
    public double getPrice() {
        return price;
    }

    /**
    *@return the enum's name and price in a string format
    */
    public String toString() {
        return name() + ": $" + getPrice();
    }

}