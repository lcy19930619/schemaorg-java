package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class CookAction extends CreateAction {
    public CookAction() {
}
    /** A sub property of instrument. The recipe/instructions used to perform the action. */
    @JsonProperty("recipe")
    private AbstractSchema recipe;
    /** A sub property of location. The specific food establishment where the action occurred. */
    @JsonProperty("foodEstablishment")
    private List<Place> foodEstablishment;
    /** A sub property of location. The specific food event where the action occurred. */
    @JsonProperty("foodEvent")
    private AbstractSchema foodEvent;

    public AbstractSchema getRecipe() { return recipe; }
    public void setRecipe(AbstractSchema recipe) { this.recipe = recipe; }
    public List<Place> getFoodEstablishment() { return foodEstablishment; }
    public void setFoodEstablishment(List<Place> foodEstablishment) { this.foodEstablishment = foodEstablishment; }
    public AbstractSchema getFoodEvent() { return foodEvent; }
    public void setFoodEvent(AbstractSchema foodEvent) { this.foodEvent = foodEvent; }
}