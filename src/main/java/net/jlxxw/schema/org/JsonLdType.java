package net.jlxxw.schema.org;

import java.util.List;
import java.util.Objects;

public class JsonLdType {
    private String singleType;
    private List<String> typeList;

    public JsonLdType() {
    }

    public JsonLdType(String singleType) {
        this.singleType = singleType;
    }

    public JsonLdType(List<String> typeList) {
        this.typeList = typeList;
    }

    public boolean isSingle() {
        return singleType != null;
    }

    public boolean isList() {
        return typeList != null;
    }

    public String getAsString() {
        return singleType;
    }

    public List<String> getAsList() {
        return typeList;
    }

    public void setSingleType(String singleType) {
        this.singleType = singleType;
        this.typeList = null;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
        this.singleType = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonLdType that = (JsonLdType) o;
        return Objects.equals(singleType, that.singleType) && Objects.equals(typeList, that.typeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleType, typeList);
    }

    @Override
    public String toString() {
        return isSingle() ? singleType : String.valueOf(typeList);
    }
}