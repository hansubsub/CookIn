//package hello.cookin.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    public SecurityConfig(JwtTokenProvider jwtTokenProvider) {
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/api/users/login", "/api/users/register").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .addFilter(new JwtAuthenticationFilter(jwtTokenProvider));
//
//        return http.build();
//    }
//}
