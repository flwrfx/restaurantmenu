public class MenuItem {

    private boolean isNew;
    private double price;
    private String description;
    private String category;


    public MenuItem(double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;//default new?
    }

    public double getPrice(){return price;}
    public void setPrice(double newPrice){newPrice = price;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public void setIsNew(boolean nNew){nNew = isNew;}


}
