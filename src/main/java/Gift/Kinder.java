package Gift;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

public class Kinder extends Box{
    private String size;
    public Kinder(String brand, Integer price, Integer weight, String size) {
        super(brand, price, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + " Размер = " + size + "]";
    }
}
