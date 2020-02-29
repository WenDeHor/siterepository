package com.google.siterepository.service;

import com.google.siterepository.model.Site;
import com.google.siterepository.persistance.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class SiteService {
    @Autowired
    private WebRepository repository;
    private static List<Site> items = new ArrayList<>();

    static {
        items.add(new Site("Google", "https://www.google.com", "https://www.google.com/search?q=%D0%B3%D1%83%D0%B3%D0%BB&sxsrf=ALeKk03EwtqqhUWfQ6KUQkgIDLVja34vcQ:1582963444897&source=lnms&tbm=isch&sa=X&ved=2ahUKEwivgc2upvbnAhWlAhAIHRzEB20Q_AUoA3oECBUQBQ&biw=736&bih=742&dpr=1.25#imgrc=3tbYO_reFkDrcM"));
        items.add(new Site("yandex", "https://yandex.ua", "https://www.google.com/search?q=%D1%8F%D0%BD%D0%B4%D0%B5%D0%BA%D1%81&sxsrf=ALeKk01KMOovVgj-NAkZUQAShXJfISevsA:1582963578088&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjnrY7upvbnAhXGpIsKHVNiBn8Q_AUoA3oECBgQBQ&biw=736&bih=742#imgrc=alWtwYsxsML9ZM"));
    }

    @PostConstruct
    public void init() {
        repository.saveAll(items);
    }

    public List<Site> findAll() {
        return repository.findAll();
    }
}
