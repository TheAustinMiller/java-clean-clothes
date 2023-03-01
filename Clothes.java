import java.util.ArrayList;
import java.util.List;

public class Clothes {
    private ArrayList<Clothing> list;

    public Clothes() {
        list = new ArrayList<Clothing>();
    }

    public int getClothesSize() {
        return list.size();
    }

    public Clothing getItem(int index) {
        return list.get(index);
    }

    public void addClothing(Clothing clothing) {
        list.add(clothing);
    }

    public void removeClothing(Clothing clothing) {
        list.remove(clothing);
    }
}
