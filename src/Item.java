public class Item {
    private int itemId;
    private String name;
    private String producer;
    private double price;

    public String toString(){
        return ("ID: "+this.itemId+"\t Name: "+this.name+"\t Producer: "+this.producer+"\t Price: "+this.price);
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(int itemId, String name, String producer, double price) {
        this.itemId = itemId;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public Item() {
    }
}
