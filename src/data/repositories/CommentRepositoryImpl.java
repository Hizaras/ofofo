package data.repositories;

import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{

    private List<Comment> commentDb = new ArrayList<>();
    @Override
    public Comment save(Comment comment) {
        commentDb.add(comment);
        return comment;
    }

    @Override
    public Comment findById(int id) {
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public long count() {
        return commentDb.size();
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(int id) {

    }
}
