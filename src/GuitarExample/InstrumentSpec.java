package GuitarExample;
import java.util.HashMap;
import java.util.Map;

public abstract class InstrumentSpec {
  
  private Map<String, Object> props;

  public InstrumentSpec(Map<String, Object> props) {
    if (this.props == null) {
      this.props = new HashMap<String, Object>();
    } else {
      this.props = props;
    }
  }
  
  public Object getProp(String key) {
    return props.get(key);
  }

  public Map<String, Object> getProps() {
    return props;
  }

  
  public boolean match(InstrumentSpec otherInstrumentSpec) {
    for (String key : getProps().keySet()) {
      if (otherInstrumentSpec.getProp(key) != props.get(key)) {
        return false;
      }
    }
    return true;  
  }
}
  
