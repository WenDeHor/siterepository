package com.google.siterepository.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Site {
    @Id
    private String id;
    private String website;
    private String img;

    public Site(String id, String website, String img) {
        this.id = id;
        this.website = website;
        this.img = img;
    }
}
