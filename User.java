
import java.util.List;

public class User {
    private String username;
    private List<NewIceCreamCombination> favoriteIceCombinations;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<IceCreamCombination> getFavoriteIceCombinations() {
        return favoriteIceCombinations;
    }

    public void setFavoriteIceCombinations(List<NewIceCreamCombination> favoriteIceCombinations) {
        this.favoriteIceCombinations = favoriteIceCombinations;
    }
}
