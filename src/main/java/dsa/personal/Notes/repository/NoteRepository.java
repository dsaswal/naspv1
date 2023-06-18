package dsa.personal.Notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dsa.personal.Notes.entity.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Timestamp;
import java.util.List;
// import dsa.personal.Notes.entity.Tag;
// import dsa.personal.Notes.entity.Topic;

public interface NoteRepository extends JpaRepository<Note, Long> {
    private static final Logger logger = LoggerFactory.getLogger(NoteRepository.class);
    List<Note> findByTitle(String title);

    List<Note> findByTitleLike(String title);
    
    List<Note> findByTitleContainingIgnoreCaseOrDetailsContainingIgnoreCase(String title, String details);

    List<Note> findByCreatedTimeAfter(Timestamp time);
    
    // List<Note> findByTagId(Integer tagId);

    // List<Note> findByQBE(Note note);
}
