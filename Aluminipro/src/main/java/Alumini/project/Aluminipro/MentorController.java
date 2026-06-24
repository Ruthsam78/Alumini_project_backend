package Alumini.project.Aluminipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mentor")
public class MentorController {

    @Autowired
    MentorService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestBody @NonNull MentorRegistration mentor) {

        MentorRegistration saved =
                service.save(mentor);

        return ResponseEntity.ok(saved);
    }
}
