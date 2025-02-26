package com.company.grc.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class FrameOptionsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Désactiver X-Frame-Options
        httpResponse.setHeader("X-Frame-Options", "ALLOW-FROM http://localhost:8088");

        // Ajouter Content-Security-Policy pour autoriser Superset
        httpResponse.setHeader("Content-Security-Policy", "frame-ancestors 'self' http://localhost:8088;");

        chain.doFilter(request, response);
    }
}
