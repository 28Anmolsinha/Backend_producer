//package com.backend.demo.service;
//
//import com.backend.demo.entity.Complaint;
//import com.backend.demo.repository.ComplaintRepository;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class ComplaintService {
//    private static final Logger logger = LogManager.getLogger(ComplaintService.class);
//
//    private final ComplaintRepository complaintRepository;
//
//    public ComplaintService(ComplaintRepository complaintRepository) {
//        this.complaintRepository = complaintRepository;
//    }
//
//    public List<Complaint> getAllComplaints() {
//        logger.info("Fetching all complaints from database.");
//        return complaintRepository.findAll();
//    }
//}
