package org.example.dao;

import org.example.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    Organizer getOrganizer(int id);
    List<Organizer> listOrganizer();
}
