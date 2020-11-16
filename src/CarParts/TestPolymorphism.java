
package CarParts;

import java.util.Scanner;

    class RevCam extends StockItem
    {

        public RevCam(int quantity, double price, String code) {
            super(quantity, price, code);

            this.currentItemQuantity = quantity;
            this.itemPriceWithoutVAT = price;
            this.currentItemCode = code;
            this.currentItemDescription = "DrivCam Reversing Camera";
            this.currentItemType = "Reversing Camera";
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

    class HeadBulb extends StockItem
    {

    public HeadBulb(int quantity, double price, String code) {
        super(quantity, price, code);

        this.currentItemQuantity = quantity;
        this.itemPriceWithoutVAT = price;
        this.currentItemCode = code;
        this.currentItemDescription = "FlashStar Car Headlight Bulb";
        this.currentItemType = "Headlight bulb";
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

    class WipeBlade extends StockItem {

        public WipeBlade(int quantity, double price, String code) {
            super(quantity, price, code);

            this.currentItemQuantity = quantity;
            this.itemPriceWithoutVAT = price;
            this.currentItemCode = code;
            this.currentItemDescription = " Wipe Central Wind Wiper Blades";
            this.currentItemType = "Wiper Blades";
        }

        public String getItemDescription() {
            return this.currentItemDescription;
        }

        public String getItemName() {
            return this.currentItemType;
        }

        public String toString() {

            String out = "Stock code: " + currentItemCode + "\n" + "Stock type: " + currentItemType +
                    "\n" + "Stock description: " + currentItemDescription + "\n" + "Stock price: £" + itemPriceWithoutVAT + "\n" +
                    "Stock price with VAT: £" + itemPriceWithVAT + "\n";

            System.out.print("Printing item stock information: \n");
            System.out.print(out);
            return out;
        }
    }
class TestPolymorphism {
    public void itemInstance(StockItem s){
        System.out.println("Printing item stock information:");
        System.out.println(s);

        }
    public static void main(String[] args) {
        StockItem [] s = new StockItem[4];
        NavSys firstItem = new NavSys(10, 99.99, "NS101");
        RevCam secondItem = new RevCam(10, 65.99, "RC042");
        HeadBulb thirdItem = new HeadBulb(10,8.99, "HB204");
        WipeBlade fourthItem = new WipeBlade(10,32.99, "HB204");
            }
        }





