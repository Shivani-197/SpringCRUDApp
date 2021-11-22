package com.shivani.SpringBootCrud.Service;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.LEAST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.shivani.SpringBootCrud.bean.Subject;

import com.shivani.SpringBootCrud.Repository.SubjectRepository;



@Service
public class SubjectService {

    @Autowired
    public SubjectRepository subjectRepo;

    public List<Subject> getAllSubjects(){

        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
        
    }

    public void addSubject(Subject subject){
        subjectRepo.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        subjectRepo.save(subject);
     
    }

    public void deleteSubject(String id) {
        subjectRepo.deleteById(id);


    }

}
