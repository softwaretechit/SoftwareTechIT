package com.softwaretechit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SnippetYT {

    @SerializedName("resourceId")
    @Expose
    private ResourceId resourceId;

    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("thumbnails")
    @Expose
    private ThumbnailsYT thumbnails;

    public SnippetYT() {
    }

    public SnippetYT(String publishedAt, String title, String description, ThumbnailsYT thumbnails) {
        this.publishedAt = publishedAt;
        this.title = title;
        this.description = description;
        this.thumbnails = thumbnails;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ThumbnailsYT getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(ThumbnailsYT thumbnails) {
        this.thumbnails = thumbnails;
    }

    public SnippetYT(ResourceId resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceId getResourceId() {
        return resourceId;
    }

    public void setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
    }
}
