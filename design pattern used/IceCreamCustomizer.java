
import java.util.ArrayList;
import java.util.List;

public class IceCreamCustomizer {
    private String name;
    private List<String> flavors = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> syrups = new ArrayList<>();

    public IceCreamCustomizer setName(String name) {
        this.name = name;
        return this;
    }

    public IceCreamCustomizer addFlavor(String flavor) {
        this.flavors.add(flavor);
        return this;
    }

    public IceCreamCustomizer addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public IceCreamCustomizer addSyrup(String syrup) {
        this.syrups.add(syrup);
        return this;
    }

    public IceCreamCombination build() {
        return new IceCreamCombination(name, flavors, toppings, syrups);
    }
}
