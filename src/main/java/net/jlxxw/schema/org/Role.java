package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Role extends Intangible {
    public Role() {
        setId("schema:Role");
        setType("rdfs:Class");

    }

    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     */
    @JsonProperty("roleName")
    private String roleName;
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /**
     * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
     */
    @JsonProperty("namedPosition")
    private String namedPosition;
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getNamedPosition() {
        return namedPosition;
    }

    public void setNamedPosition(String namedPosition) {
        this.namedPosition = namedPosition;
    }

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }
}