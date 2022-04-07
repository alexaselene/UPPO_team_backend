package com.uppoteam.ecommercemariaharo.jwt.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;


public class JwtFilter extends GenericFilterBean {
	public static String secret = "Maria-Haro-ecommerce";
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String authHeader = httpServletRequest.getHeader("authorization");
		
		if (("POST".equals(httpServletRequest.getMethod())) ||
				("GET".equals(httpServletRequest.getMethod())) ||
				("PUT".equals(httpServletRequest.getMethod())) ||
				("DELETE".equals(httpServletRequest.getMethod()))
				){
			if (authHeader == null || !authHeader.startsWith("Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjb2xpbmRpYW5hNmNAZ21haWwuY29tIiwicm9sZSI6InVzZXIiLCJpYXQiOjE2NDkzNDE0MDksImV4cCI6MTY0OTM3NzQwOX0.QfqapkFYNEBQe7_49Rsb-_j2Bob52JCe1RjeS_8wAG8") ) {
				throw new ServletException("1. Invalid Token!");
				}//if authHeader
			String token = authHeader.substring(7);
			try {
				Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
				request.setAttribute("claims", claims);
				}catch (SignatureException | MalformedJwtException e) {
					throw new ServletException("2. Invalid Token.");
					}//catch
			}//if Methods
		chain.doFilter(request, response);
		} //doFilter
}//class JwtFilter
