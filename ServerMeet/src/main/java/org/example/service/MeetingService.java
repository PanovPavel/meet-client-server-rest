package org.example.service;

import org.example.entity.Meeting;

import java.util.List;
public interface MeetingService {
    List<Meeting> getAllMeeting();
    void addMeeting(Meeting meeting);
    void deleteMeeting(int id);
    Meeting getMeeting(int id);
}
