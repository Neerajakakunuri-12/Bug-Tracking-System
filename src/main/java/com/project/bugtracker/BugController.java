package com.project.bugtracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BugController {

    private List<Bug> bugList = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/bugform")
    public String reportBugForm(Model model) {
        model.addAttribute("bug", new Bug());
        return "bugform";
    }

    @PostMapping("/report")
    public String submitBug(@ModelAttribute Bug bug) {
        bug.setId(bugList.size() + 1);
        bugList.add(bug);
        return "redirect:/buglist";
    }

    @GetMapping("/buglist")
    public String bugList(Model model) {
        model.addAttribute("bugList", bugList);
        return "buglist";
    }
}
