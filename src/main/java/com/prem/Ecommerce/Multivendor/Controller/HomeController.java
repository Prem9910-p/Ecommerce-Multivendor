package com.prem.Ecommerce.Multivendor.Controller;

import com.prem.Ecommerce.Multivendor.Response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler(){
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setMessage("welcome to the ecommerce multi vender System");
        return apiResponse;
    }
}
