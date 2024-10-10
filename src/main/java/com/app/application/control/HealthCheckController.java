package com.app.application.control;

import com.app.application.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public Map<String, String> health(){

        return Map.of("Status", "ok");
    }

    @GetMapping("/test")
    public ResponseEntity<Payment> test(){
        return ResponseEntity.ok().body(null);
    }
}
