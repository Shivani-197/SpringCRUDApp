package com.shivani.SpringBootCrud.Repository;

import com.shivani.SpringBootCrud.bean.Subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {
    
        
}
