package com.mlc.url;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UrlShorten {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String longUrl;
    private String shortUrl;

    protected UrlShorten() {
    }

    public UrlShorten(String longUrl, String shortUrl) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UrlShorten [id=" + id + ", longUrl=" + longUrl + ", shortUrl=" + shortUrl + "]";
    }
}
