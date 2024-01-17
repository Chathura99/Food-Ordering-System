Promotion
import java.util.List;

public class Promotion {
    private List<Promotion> currentPromotionsOnOrder;

    public Promotion() {
    }

    public List<Promotion> getCurrentPromotionsOnOrder() {
        return currentPromotionsOnOrder;
    }

    public void setCurrentPromotions(List<Promotion> currentPromotionsOnOrder) {
        this.currentPromotionsOnOrder = currentPromotionsOnOrder;
    }
}
