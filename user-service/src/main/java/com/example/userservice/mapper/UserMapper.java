package com.example.userservice.mapper;


import com.example.userservice.model.User;
import com.example.userservice.dto.request.SignUpRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User signUpRequestToUser(SignUpRequest signUpRequest);
}
