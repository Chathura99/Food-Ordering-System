
import java.util.List;

public class User {
    private String username;
    private List<IceCreamCombination> favoriteCombinations;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<IceCreamCombination> getFavoriteCombinations() {
        return favoriteCombinations;
    }

    public void setFavoriteCombinations(List<IceCreamCombination> favoriteCombinations) {
        this.favoriteCombinations = favoriteCombinations;
    }
}
