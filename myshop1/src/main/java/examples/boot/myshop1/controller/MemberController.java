package examples.boot.myshop1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {
    @GetMapping
    public String members(ModelMap modelMap){ //view 까지 데이터가 전달된다.
        modelMap.addAttribute("count", 500);

        //List<MemberInfo> member = new List<MemberInfo>();


        return "members"; // view name 을 리턴한다. resources/templates/members.html 파일이 있어야한다.
    }
}
