package Gift;

public class Haribo extends Box {
    public Haribo(String brand, Integer price, Integer weight) {
        super(brand, price, weight);
    }
    @Override
    public String toString() {
        return "[" + super.toString()+ " " + "]";
    }
}
