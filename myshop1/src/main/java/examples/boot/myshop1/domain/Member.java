package examples.boot.myshop1.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Member {

    private  Long id;
    private  String name;
    private  String email;
    private  String password;
}
