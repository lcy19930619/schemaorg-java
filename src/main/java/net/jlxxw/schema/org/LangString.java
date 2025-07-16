package net.jlxxw.schema.org;

import java.util.Objects;

public class LangString {
    private String value;
    private String language;

    public LangString() {
    }

    public LangString(String value) {
        this.value = value;
    }

    public LangString(String value, String language) {
        this.value = value;
        this.language = language;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LangString that = (LangString) o;
        return Objects.equals(value, that.value) && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, language);
    }

    @Override
    public String toString() {
        return language == null ? value : ("[" + language + "]: " + value);
    }
}