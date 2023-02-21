package data.repositories;

import data.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentRepositoryImplTest {
    CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    public void saveNewComment_countShouldBeOne_Test(){
        Comment comment = new Comment();
        comment.setBody("My Comment");
        comment.setTittle("Comment tittle");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());
    }

    @Test
    public void saveNewComment_findById_shouldReturnSavedCommentTest(){
        Comment comment = new Comment();
        comment.setBody("My Comment");
        comment.setTittle("Comment tittle");
        commentRepository.save(comment);
        assertEquals(1L, commentRepository.count());

        Comment savedComment = commentRepository.findById(1);
        assertEquals();
    }
}