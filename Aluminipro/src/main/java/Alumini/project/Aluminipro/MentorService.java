package Alumini.project.Aluminipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class MentorService {

    @Autowired
    MentorRepository repo;

    public MentorRegistration save(@NonNull MentorRegistration mentor) {

        return repo.save(mentor);
    }
}