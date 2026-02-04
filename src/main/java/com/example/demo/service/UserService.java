package com.example.demo.service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    final private UserRepository userRepository;
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

               Optional<UserEntity> user= userRepository.findById(userId);
              if(user.isPresent()){
                  UserEntity newUser=user.get();
                  return new UserDto(newUser.getBadgeNum(),
                          newUser.getSsn(),
                          newUser.getName(),
                          newUser.getGender(),
                          newUser.getTitle(),
                          newUser.getDefaultDeptId(),
                          newUser.getCardNo());
              }
    };
}
