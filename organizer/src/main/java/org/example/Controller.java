package org.example;

import org.example.dao.OrganizerDao;
import org.example.dao.OrganizerImpl;
import org.example.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    OrganizerDao organizerDao;

    @GetMapping("api/organizer")
    public List<Organizer> showOrganizer(){
        return organizerDao.listOrganizer();
    }

    @GetMapping("api/organizer/{id}")
    public Organizer getOrganizer(@PathVariable int id){
        return organizerDao.getOrganizer(id);
    }
}
