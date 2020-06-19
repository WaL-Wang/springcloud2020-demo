package com.wal.springcloud.controller;

import com.wal.commons.entity.Payment;
import com.wal.commons.vo.Res;
import com.wal.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public Res<?> creat(@RequestBody Payment payment) {
        int result = paymentService.create(payment);

        if (result > 0) {
            return new Res<>(200, "插入数据库成功,serverPort: " + serverPort, result);
        } else {
            return new Res<>(444, "插入数据库失败,serverPort: " + serverPort, null);
        }
    }

    @GetMapping("/get/{id}")
    public Res<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new Res<>(200,"查询成功,serverPort: "+serverPort,payment);
        }else{
            return new Res<>(444,"没有对应记录,查询ID: "+id,null);
        }
    }

}
