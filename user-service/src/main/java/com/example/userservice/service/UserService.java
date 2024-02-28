package com.example.userservice.service;


import com.example.userservice.mapper.UserMapper;
import com.example.userservice.model.Role;
import com.example.userservice.model.User;
import com.example.userservice.repository.RoleRepository;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.dto.request.SignInRequest;
import com.example.userservice.dto.request.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder encoder;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public boolean save(SignUpRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            throw new RuntimeException("Username đã tồn tại!!!");
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            throw new RuntimeException("Email đã tồn tại!!!");
        }

        User user = userMapper.signUpRequestToUser(signUpRequest);

        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByName("ROLE_USER").orElseThrow());

        user.setPassword(encoder.encode(signUpRequest.getPassword()));
        user.setRoles(roles);

        userRepository.save(user);

        return true;
    }

    public User authentication(SignInRequest signInRequest) {
        User user =
                userRepository.findByUsername(signInRequest.getUsername()).orElseThrow(() -> new RuntimeException(
                        "User khong ton tai"));
//        if(user != null && !encoder.matches(signInRequest.getPassword(), user.getPassword())) {
//            throw new RuntimeException("Sai mat khau");
//
//               if(user!=null && signInRequest.getPassword()!= user.getPassword()){
////            throw new RuntimeException("Sai mat khau");
////        }signInRequest.getPassword()!= user.getPassword()}
        System.out.println(user.getPassword()+" "+signInRequest.getPassword());
        System.out.println("user khac null: "+user!=null);
        System.out.println("pass khac nhau: "+signInRequest.getPassword().equals(user.getPassword()) );
        return user;
    }
}