package com.team.thebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MyPageController {

    @GetMapping("/mymoti")
    public String MyMoti() {
        return "mypage/mymoti";
    }

    @GetMapping("/myticket")
    public String MyTicket() {
        return "mypage/myticket";
    }

    @GetMapping("/modify")
    public String Modify() {
        return "mypage/modify";
    }
}
