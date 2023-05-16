package by.tms.service;

import by.tms.dao.HibernateSectionDao;
import by.tms.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SectionService {
    @Autowired
    private HibernateSectionDao sectionDao;

    public List<Section> findAll() {
        return sectionDao.findAll();
    }
}
