package by.tms.filter;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

@WebFilter("/*")
@Component
public class AuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String header = request.getHeader(HttpHeaders.AUTHORIZATION);
//        if (header == null) {
//            response.sendRedirect("/user/reg");
//            return;
//        }
//        String encoded = header.substring(6);
//        String[] split = new String(Base64.getDecoder().decode(encoded)).split(":");
//        if(split[1]==)
//        filterChain.doFilter(request, response);
        if (request.getSession().getAttribute("userName") == null && !checkAuthPaths(request)) {
            response.sendRedirect("/user/reg");
        } else {
            filterChain.doFilter(request, response);
        }
    }

    private boolean checkAuthPaths(HttpServletRequest request) {
        String pathInfo = request.getRequestURI();
        return pathInfo.contains("/user/reg")||pathInfo.contains("/user/auth");
    }

}

