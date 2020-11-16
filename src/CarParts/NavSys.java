package CarParts;

public class NavSys extends StockItem
{

    public NavSys(int quantity, double price, String code) {
        super(quantity, price, code);

        this.currentItemQuantity = quantity;
        this.itemPriceWithoutVAT = price;
        this.currentItemCode = code;
        this.currentItemDescription = "GeoVision Sat Nav";
        this.currentItemType = "Navigation system";
    }

    public String getItemDescription()
    {
        return this.currentItemDescription;
    }

    public String getItemName()
    {
        return this.currentItemType;
    }

    public String toString()
    {

        String out= "Stock code: " + currentItemCode + "\n" + "Stock type: " + currentItemType +
                "\n" + "Stock description: " + currentItemDescription + "\n" + "Stock price: £" + itemPriceWithoutVAT + "\n" +
                "Stock price with VAT: £" + itemPriceWithVAT+ "\n";

        System.out.print("Printing item stock information: \n");
        System.out.print(out);
        return out;
    }
}

