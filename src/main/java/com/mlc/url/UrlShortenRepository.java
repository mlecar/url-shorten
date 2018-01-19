package com.mlc.url;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UrlShortenRepository extends CrudRepository<UrlShorten, Long> {

    UrlShorten findByShortUrl(String shortUrl);

    List<UrlShorten> findByLongUrl(String longUrl);

}
