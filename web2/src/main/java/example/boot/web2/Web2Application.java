package example.boot.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Web2Application{
    public static void main(String[] args) {
        SpringApplication.run(Web2Application.class, args);
        //이거 실행되면
        //Web2Application.class <- 이 설정파일을 읽어드린다.
    }
}
