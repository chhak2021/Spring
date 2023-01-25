package kr.co.farmstory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("board/list")
    public String list(Model model, String group, String cate){

        model.addAttribute("group", group);
        model.addAttribute("cate", cate);

        return "board/list";
    }

    @GetMapping("board/modify")
    public String modify(){
        return "board/modify";
    }

    @GetMapping("board/view")
    public String view(){
        return "board/view";
    }

    @GetMapping("board/write")
    public String write(){
        return "board/write";
    }
}
