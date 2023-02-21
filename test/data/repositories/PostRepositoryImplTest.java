package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepositoryImplTest {
PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
}

    @Test
    public void saveNewPost_countShouldBeOne_Test(){
        Post post = new Post();
        post.setBody("Our post body");
        post.setTittle("our post tittle");

        postRepository.save(post);

        assertEquals(1L, postRepository.count());
    }
    @Test
    public void saveNewPost_findById_shouldReturnSavedPostTest(){
        Post post = new Post();
        post.setBody("Our post body");
        post.setTittle("our post tittle");

        postRepository.save(post);

        assertEquals(1L, postRepository.count());
        Post savedPost = postRepository.findById(1);
        assertEquals(post, savedPost);

        Post post2 = new Post();
        postRepository.save(post2);
        assertEquals(post2, postRepository.findById(2));

    }
    @Test
    public void saveNewPost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setTittle("Our post tittle");
        post.setBody("Our post body");
        postRepository.save(post);

        Post updatedPost = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("Updated body");
        updatedPost.setTittle("Updated tittle");
        postRepository.save(updatedPost);
        assertEquals(1L, postRepository.count());
        assertEquals(post, postRepository.findById(1));
        assertEquals("Updated body", post.getBody());
        assertEquals("Updated tittle", post.getTittle());
    }

    @Test
    public void deleteItem_countIsZeroTest(){
        Post post = new Post();
        post.setTittle("Our post tittle");
        post.setBody("Our post body");
        postRepository.save(post);

        assertEquals(1L, postRepository.count());
        postRepository.delete(1);
        assertEquals(0L, postRepository.count());
    }
}