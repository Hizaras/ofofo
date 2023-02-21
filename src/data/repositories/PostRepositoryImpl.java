package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository{

    private List<Post> postDb = new ArrayList<>();
    @Override
    public Post save(Post post) {
        if (post.getId() != 0) update (post);
        else {
            post.setId(postDb.size()+1);
            postDb.add(post);
            return post;
        }
        return post;
    }
    private void update(Post post){
        Post savedPost = findById(post.getId());
        savedPost.setTittle(post.getTittle());
        savedPost.setBody(post.getBody());
    }

    @Override
    public long count() {
        return postDb.size();
    }

    @Override
    public Post findById(int id) {
        for (Post post: postDb) if (post.getId()==id) return post;
        return null;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void delete(int id) {
    postDb.remove(id-1);
    }
}
