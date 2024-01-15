package mongodbexample.Controller;

import mongodbexample.Models.Student;
import mongodbexample.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/add-student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }


    @GetMapping("/get-student")
    public ResponseEntity<?> getStudent(){
        return  ResponseEntity.ok(this.studentRepository.findAll());
    }
}

