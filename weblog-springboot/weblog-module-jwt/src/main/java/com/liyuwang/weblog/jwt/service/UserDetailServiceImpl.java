package com.liyuwang.weblog.jwt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.withUsername("liyuwang")
                .password("$2a$10$n7RJ1q.RnXx5M3O6B0i0he04fZOPjIJpyWcKuicW1bFyFHWhlGose")
                .authorities("ADMIN")
                .build();
    }
}
