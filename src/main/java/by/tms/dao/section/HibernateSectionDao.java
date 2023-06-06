package by.tms.dao.section;

import by.tms.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class HibernateSectionDao {
    @Autowired
   private SessionFactory sessionFactory;
    @Transactional
    public List<Section> findAll(){
        Session currentSession = sessionFactory.getCurrentSession();
        List<Section> fromSection = currentSession.createQuery("from Section", Section.class).getResultList();
        return fromSection;
    }
}
