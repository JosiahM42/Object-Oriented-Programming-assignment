package CarParts;

public class StockItem {
    //declaration of a scanner
    //Scanner input = new Scanner(System.in);

    //declaration and initialisation of global variables
    public String currentItemCode = " ", currentItemType = " ", currentItemDescription =  " " ;
    public int currentItemQuantity = 0;
    public double itemPriceWithoutVAT = 0.00, itemPriceWithVAT = 0.00;
    public final double VAT = 17.5;

    //this is the constructor for StockItem class (the derived class
    public StockItem(int quantity, double price, String code)
    {
        //the following variables are just being assigned to new variables inside the main
        this.currentItemQuantity = quantity;
        this.itemPriceWithoutVAT = price;
        this.currentItemCode = code;

        //Outputs to the console
        System.out.println("creating a new stock item with " + quantity
                + " units, priced at £" + price + " per unit, with item code "
                + code);
    }

    public String getItemDescription()
    {
        return this.currentItemDescription = "Unknown Item description";
    }

    public String getItemName()
    {
        return this.currentItemType = "Unknown item name";
    }

    public void addStock(int increase)
    {
        Boolean addStockTrueOrFalse = true;
        while(addStockTrueOrFalse)
        {


            if (increase < 1 || (this.currentItemQuantity + increase) > 100) {
                System.out.println("Total units in stock: " + this.currentItemQuantity);
                System.out.println("Increasing stock by: 0");
                System.out.println("Invalid stock quantity added");
                addStockTrueOrFalse = false;
            } else {
                this.currentItemQuantity = this.currentItemQuantity + increase;
                System.out.println("Total units in stock: " + this.currentItemQuantity);
                System.out.println("Increasing stock by: " + this.currentItemQuantity);
                addStockTrueOrFalse= false;
            }
        }
    }

    public void sellStock(int decrease)
    {
        Boolean sellStockTrueOrFalse = true;
        while(sellStockTrueOrFalse)
        {


            if (decrease < 1 || (this.currentItemQuantity - decrease) < 1) {
                System.out.println("Invalid stock quantity deducted");
            } else {
                this.currentItemQuantity = this.currentItemQuantity - decrease;
                System.out.println("Sold 2 units");
                System.out.println("Total units in stock: " + this.currentItemQuantity);
                sellStockTrueOrFalse = false;
            }
        }
    }

    public double getVAT() {
        return this.VAT;
    }

    //Sets a new price for each item
    public void setPrice(double newPrice)
    {
        itemPriceWithoutVAT = newPrice;
        double stockPrice = itemPriceWithoutVAT;
        System.out.println("Set new price £" + newPrice + " per unit");
        setPriceVAT();
    }
    public void setPriceVAT()
    {
        double change = (1+(this.VAT/100));
        double itemPriceVAT = this.itemPriceWithVAT;
        double itemPrice = this.itemPriceWithoutVAT;
        itemPriceVAT = itemPrice * change;
        this.itemPriceWithVAT = Math.round(itemPriceVAT * 100.00) /100.00;
    }

    public String toString()
    {
        String out= "Stock code: " + currentItemCode + "\n" + "Stock type: " + currentItemType +
                "\n" + "Stock description: " + currentItemDescription + "\n" + "Stock price: £" + itemPriceWithoutVAT + "\n" +
                "Stock price with VAT: £" + itemPriceWithVAT+ "\n";
        System.out.print(out);
        return out;
    }

}
