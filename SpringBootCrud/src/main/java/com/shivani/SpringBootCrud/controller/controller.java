package com.shivani.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shivani.SpringBootCrud.Service.SubjectService;
import com.shivani.SpringBootCrud.bean.Subject;

@RestController
public class controller {
    @Autowired
    private SubjectService subjectservice;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return subjectservice.getAllSubjects();
        
        
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/subjects")
    public void addSubject(@RequestBody Subject subject){

        subjectservice.addSubject(subject);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){

        subjectservice.updateSubject(id,subject);
    }

    public void deleteSubject(@PathVariable String id){
        subjectservice.deleteSubject(id);
    

    }

    
}
