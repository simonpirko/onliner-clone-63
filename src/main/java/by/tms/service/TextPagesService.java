package by.tms.service;

import by.tms.dao.HibernateTextPagesDao;
import by.tms.entity.TextPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextPagesService {
    @Autowired
    private HibernateTextPagesDao textPagesDao;
    public TextPages findByUrl(String url){
       return textPagesDao.findByUrl(url);
    }
}
