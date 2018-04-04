package Gift;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;


public class KitKat extends Box{
private String taste;

    public KitKat(String brand, Integer price, Integer weight,String taste) {
        super(brand, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "[" + super.toString()+ "  Вкус = " + taste + "]";
    }
}
