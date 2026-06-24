package Alumini.project.Aluminipro;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MentorRepository
        extends MongoRepository<MentorRegistration, String> {

}