package example.boot.web2;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
  public HelloController() {
        System.out.println("Hello Controller!!");
        }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "hello";
    }

    ///hello?name=k&age=5
    //가능하면 이런 애노테이션 파라메터방식 사용할것
    @GetMapping(path = "/hello2")
    public String sayHello2(@RequestParam(name="name", required = true)String name,
                            @RequestParam(name="age", required = false, defaultValue = "0")int age
                            ){
        return "hello2 " + name + " , " + age;
    }

    ///hello?name=k&age=5
    //가능하면 사용하지 않기
    @GetMapping(path = "/hello3")
    public String sayHello3(HttpServletRequest request) {

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        return "hello3 " + name + " , " + age;
    }

    ///hello?name=k&age=5
    //가능하면 사용하지 않기
    @GetMapping(path = "/hello4")
    public String sayHello4(@ModelAttribute HelloDTO helloDTO) {

        return "hello4 " + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    @PostMapping(path = "/hello5")
    public  String sayHello5(){
        return  "hello5";
    }

    //가능하면 이런 애노테이션 파라메터방식 사용할것
    @PostMapping(path = "/hello6")
    public String sayHello6(@RequestParam(name="name", required = true)String name,
                            @RequestParam(name="age", required = false, defaultValue = "0")int age
    ){
        return "hello6 " + name + " , " + age;
    }

    // 가능하면 이런 애노테이션 파라메터방식 사용할것
    // get방식은 Body에 값을 담아서 보낼 수 없다.
    // post(등록), put(수정) 방식은 body에 값을 담아서 보낼 수 있다.
    // MessageConverter에 의해 mime type을 정의하여 body에 값을 전달 할 수 있다.
    @PostMapping(path = "/hello7")
    public String sayHello7(@RequestBody HelloDTO helloDTO) {

        return "hello7 " + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    @GetMapping(path = "/hello8")
    public HelloDTO sayHello8() {
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setName("Kim");
        helloDTO.setAge(40);
        return helloDTO;
    }
}