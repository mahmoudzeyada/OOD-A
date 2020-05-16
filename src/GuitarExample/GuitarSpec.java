// package GuitarExample;

// public class GuitarSpec extends InstrumentSpec {
//     private int numString;

//     public GuitarSpec(int numString, Type type, Wood backWood, Wood topWood, Builder builder, String model) {
//         super(model, type, builder, backWood, topWood);
//         this.numString = numString;
//     }
    
//     public int getNumString() {
//         return numString;
//     }
    
//     @Override
//     public boolean match(InstrumentSpec spec) {
//         if (!super.match(spec)) {
//             return false;
//         }
//         if (!(spec instanceof GuitarSpec)) {
//             return false;
//         }

//         GuitarSpec otherSpec = (GuitarSpec) spec;

//         if (numString != otherSpec.numString) {
//             return false;
//         }

//         return true;
//     }

// }
