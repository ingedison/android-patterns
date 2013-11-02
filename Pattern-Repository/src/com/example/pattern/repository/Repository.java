package com.example.pattern.repository;

import java.util.List;

import android.content.Context;

public class Repository {
	
	private Context context;
	private CommentsDataAccessObject commentDataSource;
	
	public Repository(Context context) {
	    this.context = context;
	    commentDataSource = new CommentsDataAccessObject(context);
	    commentDataSource.open();
	}
	
	public Comment createComment(String comment) {
		return commentDataSource.createComment(comment);
	}
	
	public Comment getComment(long commentId){
		return commentDataSource.getComment(commentId);
	}
	
	public void deleteComment(Comment comment) {
		commentDataSource.deleteComment(comment);
	}

	public List<Comment> getAllComments() {
		return commentDataSource.getAllComments();
	}

	public void open() {
		commentDataSource.open();
		
	}

	public void close() {
		commentDataSource.close();
	}
	
}
