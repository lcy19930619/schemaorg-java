package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DigitalDocumentPermission extends Intangible {
    public DigitalDocumentPermission() {
        setId("schema:DigitalDocumentPermission");
        setType("rdfs:Class");

    }

    /**
     * The type of permission granted the person, organization, or audience.
     */
    @JsonProperty("permissionType")
    private DigitalDocumentPermissionType permissionType;
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     */
    @JsonProperty("grantee")
    private List<AbstractSchema> grantee;

    public DigitalDocumentPermissionType getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(DigitalDocumentPermissionType permissionType) {
        this.permissionType = permissionType;
    }

    public List<AbstractSchema> getGrantee() {
        return grantee;
    }

    public void setGrantee(List<AbstractSchema> grantee) {
        this.grantee = grantee;
    }
}