//package hello.cookin.security;
//
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Collections;
//
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//
//        // JWT 토큰 추출
//        String token = jwtTokenProvider.resolveToken(request);
//
//        // 유효성 검사
//        if (token != null && jwtTokenProvider.validateToken(token)) {
//            Authentication auth = jwtTokenProvider.getAuthentication(token);
//            SecurityContextHolder.getContext().setAuthentication(auth);
//        }
//
//        // 다음 필터로 넘김 (이거 안 하면 요청이 멈춰버림)
//        filterChain.doFilter(request, response);
//    }
//
//    @Override
//    protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain) throws jakarta.servlet.ServletException, IOException {
//    }
//
//}
