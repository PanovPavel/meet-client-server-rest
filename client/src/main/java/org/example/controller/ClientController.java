package org.example.controller;

import org.example.communicat.MeetingCommunicat;
import org.example.entity.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
    @Autowired
    MeetingCommunicat meetingCommunicat;

    @RequestMapping("/")
    public String showMainPage(Model model){
        model.addAttribute("meetingsList", meetingCommunicat.listMeeting());
        return "index";
    }
    @RequestMapping("/addNewMeeting")
    public String showFormAddNewEmployee(Model model){
        model.addAttribute("meeting", new Meeting());
        return "addNewMeeting";
    }
    @RequestMapping("/saveMeeting")
    public String saveMeeting(@ModelAttribute("meeting") Meeting meeting){
        meetingCommunicat.addMeeting(meeting);
        return "redirect:/";
    }
    @RequestMapping("/deleteMeeting")
    public String deleteMeeting(@RequestParam("meetId") int id, Model model){
        meetingCommunicat.deleteMeeting(id);
        return "redirect:/";
    }
    @RequestMapping("/updateMeeting")
    public String updateMeeting(@RequestParam("meetId") int id, Model model){
        Meeting meeting = meetingCommunicat.getMeeting(id);
        model.addAttribute("meeting", meeting);
        return "/addNewMeeting";
    }
    @RequestMapping("/style")
    public String addCss(){
        return "style";
    }



}
