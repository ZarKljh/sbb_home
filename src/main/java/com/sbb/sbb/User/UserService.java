package com.sbb.sbb.User;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String name, String email, String password){
        SiteUser siteuser = new SiteUser();
        siteuser.setUsername(name);
        siteuser.setEmail(email);
        siteuser.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(siteuser);
        return siteuser;
    }
}
