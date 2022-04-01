package org.example.dao;

import org.example.entity.Organizer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class OrganizerImpl implements OrganizerDao{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    @Transactional
    public Organizer getOrganizer(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Organizer.class, id);
    }

    @Override
    @Transactional
    public List<Organizer> listOrganizer() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Organizer ").getResultList();
    }
}
