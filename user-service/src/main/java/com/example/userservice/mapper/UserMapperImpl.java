package com.example.userservice.mapper;


import javax.annotation.processing.Generated;

import com.example.userservice.dto.request.SignUpRequest;
import com.example.userservice.model.User;
import org.springframework.stereotype.Component;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-02-05T11:49:25+0700",
        comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User signUpRequestToUser(SignUpRequest signUpRequest) {
        if ( signUpRequest == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( signUpRequest.getUsername() );
        user.setEmail( signUpRequest.getEmail() );
        user.setPassword( signUpRequest.getPassword() );

        return user;
    }
}
