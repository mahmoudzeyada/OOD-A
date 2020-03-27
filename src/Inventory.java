import com.company.GuitarSpec;
import java.util.LinkedList;

public class Inventory {
    private LinkedList<Guitar> guitars = new LinkedList<Guitar>();

    public void addGuitar(String serialNumber,double price,GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public LinkedList<Guitar> search(GuitarSpec searchGuitar) {
        LinkedList<Guitar> foundGuitars = new LinkedList<Guitar>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if (searchGuitar.match(guitarSpec)) {
                foundGuitars.add(guitar);
            }
        }
        return foundGuitars;
    }


}
