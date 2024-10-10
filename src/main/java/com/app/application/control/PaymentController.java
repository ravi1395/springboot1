package com.app.application.control;

import com.app.application.NoMatchingPaymentException;
import com.app.application.model.Payment;
import com.app.application.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService service;



//    @GetMapping("/getPayment")
//    public Payment getPayment(){
//        return repo.findById(1L).get();
//
//
//    }

//    @GetMapping(produces = {MediaType.APPLICATION_JASON_VALUE, MediaType.APPLICATION_JASON_VALUE})
//    public List<Payment> getPaymentsByCountry throws NoMatchingPaymentException(@RequestParam(value = "country", required = false) String country){
//
//            return service.getAll();
//
//    }

    @GetMapping("/getAll")
    public List<Payment> getPayments(){
            return service.getAll();

    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable Long id) throws NoMatchingPaymentException {
        return service.getById(id);
    }

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment){

        return service.addPayment(payment);
    }


//    @PatchMapping("/{id}")
//    public Payment Patch(@RequestBody Map<String, Object> data){
//
//        //put this in service
//        if(data.containsKey("country")){
//            .....
//        }
//    }
}
