package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book extends CreativeWork {
    public Book() {
    }

    /**
     * The ISBN of the book.
     */
    @JsonProperty("isbn")
    private String isbn;
    /**
     * The number of pages in the book.
     */
    @JsonProperty("numberOfPages")
    private Integer numberOfPages;
    /**
     * The edition of the book.
     */
    @JsonProperty("bookEdition")
    private String bookEdition;
    /**
     * Indicates whether the book is an abridged edition.
     */
    @JsonProperty("abridged")
    private Boolean abridged;
    /**
     * The format of the book.
     */
    @JsonProperty("bookFormat")
    private BookFormatType bookFormat;
    /**
     * The illustrator of the book.
     */
    @JsonProperty("illustrator")
    private Person illustrator;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public Boolean getAbridged() {
        return abridged;
    }

    public void setAbridged(Boolean abridged) {
        this.abridged = abridged;
    }

    public BookFormatType getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(BookFormatType bookFormat) {
        this.bookFormat = bookFormat;
    }

    public Person getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(Person illustrator) {
        this.illustrator = illustrator;
    }
}