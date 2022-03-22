package org.example.dao;

import org.example.entity.Meeting;

import java.util.List;

public interface DaoMeeting {
    List<Meeting> getAllMeeting();
    void addMeeting(Meeting meeting);
    void deleteMeeting(int id);
    Meeting getMeeting(int id);
}
