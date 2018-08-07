package example.boot.web2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boards")
public class BoardAPIController {

    @GetMapping
    public String boards(){
        return "boards";
    }

    // 매번 변하는값을 받을때 PathVariable 사용함.
    @GetMapping("/{id}")
    public String boards(@PathVariable(name = "id") int id)
    {
        return "boards " + id;
    }
}
