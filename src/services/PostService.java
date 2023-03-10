package services;

import data.models.Post;
import dtos.requests.CreatePostRequest;

import java.util.Collection;
import java.util.List;

public interface PostService {
    void createPost(CreatePostRequest createPostRequest);

//    void createPost(String tittle, String body);

    void updatePost(int id, String tittle, String body);
    void deletePost(int id);
    Post viewPost(int id);

    List<Post> viewAllPost();
}
