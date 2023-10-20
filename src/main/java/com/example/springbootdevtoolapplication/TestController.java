package com.example.springbootdevtoolapplication;

import com.example.springbootdevtoolapplication.Entity.Address;
import com.example.springbootdevtoolapplication.Entity.Student;
import com.example.springbootdevtoolapplication.Service.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    Information info;

    @Autowired
    Student student;
    @GetMapping("/student")
    public ResponseEntity<List<Student>> test()
    {
        try{
            return ResponseEntity.of(Optional.of(info.getAll()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getById(@PathVariable("id") int id)
    {
        try{
            List<Student> lists = info.getAll();
            for(int i=0;i< lists.size();i++)
            {
                Student students = lists.get(i);
                if(students.getRollnumber()==id)
                {
                    return ResponseEntity.of(Optional.of(students));
                }
            }
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).build();

        }
    }

    @PostMapping("/student")
    public ResponseEntity<List<Student>> postmethod(@RequestBody Student student)
    {
        try{
            info.addStudent(student);
            return ResponseEntity.of(Optional.of(info.getAll()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status((HttpStatus.INTERNAL_SERVER_ERROR)).build();
        }

    }
    @PutMapping("/student/{id}")
    public ResponseEntity<List<Student>> putmethod(@PathVariable int id,@RequestBody Student student)
    {
        try{
            info.addStudentById(student,id);
            return ResponseEntity.of(Optional.of(info.getAll()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status((HttpStatus.INTERNAL_SERVER_ERROR)).build();
        }

    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Void> deletemethod(@PathVariable("id") int id)
    {
        try{
            info.delete(id);
            return ResponseEntity.ok().build();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status((HttpStatus.INTERNAL_SERVER_ERROR)).build();

        }
    }


}