package exercises;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int litres;
    private double pricePerLitres;
    private double discount;
    public double purchaseAmount;

    public PetrolPurchase(String location, String petrolType, int litres, double pricePerLitres, double discountAmount) {
        this.location = location;
        this.petrolType = petrolType;
        this.litres = litres;
        this.pricePerLitres = pricePerLitres;
        discount = discountAmount/100;
    }

    public String getLocation() {
        System.out.println("The location is: " + location);
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        System.out.println("The type of product purchased is: " + petrolType);
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getLitres() {
        System.out.println("The litres is purchased is: " + litres);
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public double getPricePerLitres() {
        System.out.println("The price  per litres is: " + pricePerLitres);
        return pricePerLitres;
    }

    public void setPricePerLitres(double pricePerLitres) {
        this.pricePerLitres = pricePerLitres;
    }

    public double getDiscount() {
        System.out.println("Discount percentage is: " + discount);
        return discount;
    }

    public void setDiscount(double discountAmount) {
        discount = discountAmount/100;
    }


    public double getPurchaseAmount() {
        System.out.println("The purchase amount is: " + purchaseAmount);
        return purchaseAmount;
    }

    public void setPurchaseAmount(int litres, double pricePerLitres, double discountAmount) {
        purchaseAmount = (litres * pricePerLitres) - discountAmount/100;
    }
}
