package com.xdisx.xdisxgateway.fallback;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @RequestMapping(value = "/contract", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public Map<String, Object> fallbackContract() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
        response.put("data", null);
        response.put("serviceDown", "The contract service is temporarily unavailable. Please try again later.");
        return response;
    }

    @RequestMapping(value = "/customer", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public Map<String, Object> fallbackCustomer() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
        response.put("data", null);
        response.put("serviceDown", "The customer service is temporarily unavailable. Please try again later.");
        return response;
    }

    @RequestMapping(value = "/product", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public Map<String, Object> fallbackProduct() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
        response.put("data", null);
        response.put("serviceDown", "The product service is temporarily unavailable. Please try again later.");
        return response;
    }
}
