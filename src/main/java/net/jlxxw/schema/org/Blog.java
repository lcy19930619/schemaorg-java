package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Blog extends CreativeWork {
    {
        setId("schema:Blog");
        setType("rdfs:Class");

    }

    /**
     * Indicates a post that is part of a [[Blog]]. Note that historically, what we term a "Blog" was once known as a "weblog", and that what we term a "BlogPosting" is now often colloquially referred to as a "blog".
     */
    @JsonProperty("blogPosts")
    private BlogPosting blogPosts;
    /**
     * A posting that is part of this blog.
     */
    @JsonProperty("blogPost")
    private BlogPosting blogPost;
    /**
     * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
     */
    @JsonProperty("issn")
    private String issn;

    public BlogPosting getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(BlogPosting blogPosts) {
        this.blogPosts = blogPosts;
    }

    public BlogPosting getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(BlogPosting blogPost) {
        this.blogPost = blogPost;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}