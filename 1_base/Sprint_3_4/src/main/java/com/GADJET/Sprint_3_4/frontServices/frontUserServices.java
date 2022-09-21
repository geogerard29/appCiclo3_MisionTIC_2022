package com.GADJET.Sprint_3_4.frontServices;

import com.GADJET.Sprint_3_4.entities.User;
import com.GADJET.Sprint_3_4.repositories.transactionRepository;
import com.GADJET.Sprint_3_4.repositories.userRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class frontUserServices {

    private userRepository userRepository2;

    public frontUserServices(userRepository userRepository2) {
        this.userRepository2 = userRepository2;
    }

    public User createUser(User newUser){
        return this.userRepository2.save(newUser);
        }

    public User findUserByEmail(String email){
        return this.userRepository2.findByEmail(email);
    }

    public User getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");

        User user = findUserByEmail(email);
        if(user==null){
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");

            User newUser = new User(name=name, email=email, image=image, auth0Id=auth0Id);
            return createUser(newUser);
        }
        return user;
    }
}
