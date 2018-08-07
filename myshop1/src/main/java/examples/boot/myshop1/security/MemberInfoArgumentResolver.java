package examples.boot.myshop1.security;

import examples.boot.myshop1.domain.Member;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MemberInfoArgumentResolver implements HandlerMethodArgumentResolver {

    // parameter가 N개면 N번 호출된다.
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        if(parameter.getParameterType() == MemberInfo.class)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return null;
    }
}
