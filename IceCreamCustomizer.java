
import java.util.List;

public class IceCreamCustomizer {
    public NewIceCreamCombination createCombination(String name, List<String> flavors, List<String> toppings, List<String> syrups) {
        NewIceCreamCombination combination = new NewIceCreamCombination();
        combination.setName(name);
        combination.setFlavors(flavors);
        combination.setToppings(toppings);
        combination.setSyrups(syrups);
        return combination;
    }
}
