package examples.boot.myshop1.utils;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //request.setAttribute("start", System.nanoTime());
        LogContext.time.set(System.nanoTime());
        System.out.println("preHandle :" + handler);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        //long start = (long)request.getAttribute("start");
        long start = LogContext.time.get();
        long end = System.nanoTime();

        System.out.println("postHandle :" + handler + " : " +  (end - start));
    }
}
