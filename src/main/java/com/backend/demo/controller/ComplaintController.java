package com.backend.demo.controller;

import com.backend.demo.entity.Complaint;
import com.backend.demo.service.RabbitMQProducer;
//import com.backend.demo.service.RedisService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "http://localhost:5173")
public class ComplaintController {
    private static final Logger logger = LogManager.getLogger(ComplaintController.class);

    private final RabbitMQProducer rabbitMQProducer;
  //private final RedisService redisService;

    public ComplaintController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
        //this.redisService = redisService;
    }

    @PostMapping
    public String createComplaint(@RequestBody Complaint complaint) {
        logger.info("Received complaint creation request: {}", complaint);
        rabbitMQProducer.sendComplaint(complaint);
        logger.info("Complaint submitted successfully!");
        return "Complaint submitted successfully!";
    }

//    @GetMapping("/top")
//    public List<Object> getTopComplaints() {
//        logger.info("Fetching top complaints.");
//        //return redisService.getTopComplaints();
//    }
}
