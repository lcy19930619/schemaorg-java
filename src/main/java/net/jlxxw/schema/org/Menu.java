package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Menu extends CreativeWork {
    public Menu() {
}
    /** A food or drink item contained in a menu or menu section. */
    @JsonProperty("hasMenuItem")
    private MenuItem hasMenuItem;
    /** A subgrouping of the menu (by dishes, course, serving time period, etc.). */
    @JsonProperty("hasMenuSection")
    private MenuSection hasMenuSection;

    public MenuItem getHasMenuItem() { return hasMenuItem; }
    public void setHasMenuItem(MenuItem hasMenuItem) { this.hasMenuItem = hasMenuItem; }
    public MenuSection getHasMenuSection() { return hasMenuSection; }
    public void setHasMenuSection(MenuSection hasMenuSection) { this.hasMenuSection = hasMenuSection; }
}