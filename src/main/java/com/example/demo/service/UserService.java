package com.example.demo.service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<UserDto> getUsersService(){
       return userRepository.findAll().stream().map(user->{

           return new UserDto(
                   user.getBadgeNum(),
                   user.getSsn(),
                   user.getName(),
                   user.getGender(),
                   user.getTitle(),
                   user.getDefaultDeptId(),
                   user.getCardNo()
           );
       }).toList();
    }

    public UserDto getUserById(int userId){

               UserEntity user= userRepository.findById(userId);
    };
}
