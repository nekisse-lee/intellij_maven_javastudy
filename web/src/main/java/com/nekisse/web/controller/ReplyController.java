package com.nekisse.web.controller;

import com.nekisse.web.domain.ReplyVO;
import com.nekisse.web.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("replies")
public class ReplyController {

    @Autowired
    private ReplyService service;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestBody ReplyVO vo) {
        ResponseEntity<String> entity = null;
        try {
            service.create(vo);
            entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity  = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return  entity;
    }





}
