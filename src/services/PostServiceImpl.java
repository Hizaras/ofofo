package services;

import data.models.Post;
import data.repositories.PostRepository;
import data.repositories.PostRepositoryImpl;
import dtos.requests.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements PostService {

    private PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTittle(createPostRequest.getTittle());
        postRepository.save(post);
    }




    @Override
    public void updatePost(int id, String tittle, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return null;
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }
}
