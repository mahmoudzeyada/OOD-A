package GuitarExample;
import java.util.LinkedList;

public class Inventory {
    private LinkedList<Instrument> inventory = new LinkedList<Instrument>();

    public void addInstrument(String serialNumber, double price,InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public LinkedList<Instrument> search(InstrumentSpec spec) {
        LinkedList<Instrument> foundInstruments = new LinkedList<Instrument>();
        for (Instrument instrument : inventory) {
            if (spec.match(instrument.getSpec())) {
                foundInstruments.add(instrument);
            }
        }
        return foundInstruments;
    }
}
