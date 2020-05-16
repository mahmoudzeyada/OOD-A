// package GuitarExample;

// public class MandolinSpec extends InstrumentSpec{
//   private Style style;

//   public MandolinSpec(Style style, Type type, Wood backWood, Wood topWood, Builder builder, String model) {
//     super(model, type, builder, backWood, topWood);
//     this.style = style;
//   }

//   public Style getStyle() {
//     return style;
//   }

//   public void setStyle(Style style) {
//     this.style = style;
//   }

//   @Override
//   public boolean match(InstrumentSpec spec) {
//     if (!super.match(spec)) {
//       return false;
//   }
//   if (!(spec instanceof MandolinSpec)) {
//       return false;
//   }

//   MandolinSpec otherSpec = (MandolinSpec) spec;

//   if (!otherSpec.style.equals(style)) {
//     return false;
//   }
//   return true;
//   }
// }