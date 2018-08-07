package examples.boot.myshop1.config;

import examples.boot.myshop1.security.MemberInfoArgumentResolver;
import examples.boot.myshop1.utils.LogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration // java config 클래스는
public class WebConfig implements WebMvcConfigurer {

    //Override 할때는 Alt + Insert key를 누르면 패널이 뜬다. 찾아서 추가하면 끝.
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //사용자가 작성한 인터셉터를 추가한다.
        registry.addInterceptor(new LogInterceptor());
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new MemberInfoArgumentResolver());
    }
}
