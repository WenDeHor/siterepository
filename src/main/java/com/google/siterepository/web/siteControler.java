package com.google.siterepository.web;

import com.google.siterepository.model.Site;
import com.google.siterepository.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bigsite")
public class siteControler {
    @Autowired
    private SiteService siteService;
    public List<Site> getListOfSite(){
        return siteService.findAll();
    }
}
