
public class PCComponent {
    public String name;
    public double price;
    public double idNum;

    public double getCost() {
        return price;
    }
    public String toString() {
        return name + ": $" + price;
    }
    
}



