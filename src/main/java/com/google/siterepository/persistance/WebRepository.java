package com.google.siterepository.persistance;

import com.google.siterepository.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebRepository  extends MongoRepository<Site, String> {
//    @Autowired
//    private MongoTemplate mongoTemplate;
//    public List<Site> findAll(){
//        return mongoTemplate.findAll(Site.class);
//    }

}
