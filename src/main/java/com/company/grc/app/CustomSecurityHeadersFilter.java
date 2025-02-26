package com.company.grc.app;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

@Component
public class CustomSecurityHeadersFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Désactiver X-Frame-Options pour permettre les iframes
        response.setHeader("X-Frame-Options", "ALLOW-FROM http://localhost:8088");

        // Autoriser l'affichage en iframe depuis Superset
        response.setHeader("Content-Security-Policy", "frame-ancestors 'self' http://localhost:8088;");

        filterChain.doFilter(request, response);
    }
}
