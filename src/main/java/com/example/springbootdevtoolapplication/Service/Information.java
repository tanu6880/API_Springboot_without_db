package com.example.springbootdevtoolapplication.Service;


import com.example.springbootdevtoolapplication.Entity.Address;
import com.example.springbootdevtoolapplication.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Information {

    Student student = new Student();
    private static List<Address> address_list = new ArrayList<>();
    static {
        address_list.add(new Address(1,"a-52","santosh nagar 1st","Borkheda","kota","rajashthan",324002));
        address_list.add(new Address(2,"a-53","ramgopal nagar ","ajmer","ajmer","rajashthan",324046));
        address_list.add(new Address(3,"a-54","ramesh nagar 2nd","sea","beach","goa",544002));
    }

    private static List<Student> student_list = new ArrayList<>();
    static {
        student_list.add(new Student(1,"Tanu saini",address_list.get(0),869058588));
        student_list.add(new Student(2,"Lavisha saini",address_list.get(1),469058588));
        student_list.add(new Student(3,"Himanshu saini",address_list.get(2),269058588));
    }

    public List<Student> addStudent(Student student)
    {
        student_list.add(student);
        return student_list;
    }

    public void addStudentById(Student student,int id)
    {
        for(int i=0;i<student_list.size();i++)
        {
            Student students = student_list.get(i);
            if(students.getRollnumber()==id)
            {
                student_list.add(i+1,student);
            }
        }
    }

    public void delete(int id)
    {
        for(int i=0;i<student_list.size();i++)
        {
            Student students = student_list.get(i);
            if(students.getRollnumber()==id)
            {
                student_list.clear();
            }
        }
    }

    public List<Student> getAll()
    {
        return student_list;
    }

}
