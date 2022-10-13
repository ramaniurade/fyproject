package com.fyproject.main.fyproject.service;

import com.fyproject.main.fyproject.entity.UserDetailsEntity;
import com.fyproject.main.fyproject.model.UserDetails;
import com.fyproject.main.fyproject.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;
    public String saveUser(UserDetails userDetails) {
        try {
            UserDetailsEntity entity = new UserDetailsEntity(userDetails.getEmail(), userDetails.getPassword());
            userDetailsRepository.save(entity);
            return "SUCCESS";
        }catch (Exception e){
            return "FAILURE";
        }
    }

    public String getUser(String email) {
        return userDetailsRepository.findById(email).get().getPassword();
    }
}
