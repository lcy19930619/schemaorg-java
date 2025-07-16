package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class MenuItem extends Intangible {
    public MenuItem() {
}
    /** An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
       */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /** Nutrition information about the recipe or menu item. */
    @JsonProperty("nutrition")
    private NutritionInformation nutrition;
    /** Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc. */
    @JsonProperty("suitableForDiet")
    private RestrictedDiet suitableForDiet;
    /** Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item. */
    @JsonProperty("menuAddOn")
    private List<AbstractSchema> menuAddOn;

    public List<AbstractSchema> getOffers() { return offers; }
    public void setOffers(List<AbstractSchema> offers) { this.offers = offers; }
    public NutritionInformation getNutrition() { return nutrition; }
    public void setNutrition(NutritionInformation nutrition) { this.nutrition = nutrition; }
    public RestrictedDiet getSuitableForDiet() { return suitableForDiet; }
    public void setSuitableForDiet(RestrictedDiet suitableForDiet) { this.suitableForDiet = suitableForDiet; }
    public List<AbstractSchema> getMenuAddOn() { return menuAddOn; }
    public void setMenuAddOn(List<AbstractSchema> menuAddOn) { this.menuAddOn = menuAddOn; }
}