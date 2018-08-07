package examples.boot.myshop1.controller.api;

import examples.boot.myshop1.security.MemberInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberApiController {

    //http://localhost:8080/api/members
    @GetMapping
    public String members(MemberInfo memberInfo){

        // memberInfo 에 id=1, email= 이메일주소를 세팅해서 넣어주도록 하고 싶다.
        System.out.println("member :" + memberInfo);
        System.out.println("members!!!");
        return "members";
    }
}
