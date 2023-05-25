package by.tms.dao;

import by.tms.entity.TextPages;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Component
public class HibernateTextPagesDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public TextPages findByUrl(String url) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<TextPages> query = currentSession.createQuery("from TextPages where url = :url", TextPages.class);
        query.setParameter("url", url);
        TextPages singleResult = query.getSingleResult();
        return singleResult;
    }
}
