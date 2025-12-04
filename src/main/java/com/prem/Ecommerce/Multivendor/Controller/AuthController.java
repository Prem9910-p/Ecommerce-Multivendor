package com.prem.Ecommerce.Multivendor.Controller;

import com.prem.Ecommerce.Multivendor.Modal.User;
import com.prem.Ecommerce.Multivendor.Repository.UserRepository;
import com.prem.Ecommerce.Multivendor.Response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    private final UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest request){

        User user=new User();
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        User savedUser=userRepository.save(user);
        return  ResponseEntity.ok(savedUser);
    }
}
