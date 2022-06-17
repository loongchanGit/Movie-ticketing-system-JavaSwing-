package com.crc.service;

import java.util.List;

import com.crc.entity.Comment;

public interface CommentService {
	public boolean addComment(Comment comment);
	public boolean delComment(int conId);
	   public boolean updateComment(Comment comment);
	   public List<Comment> queryAllCommentByuId(int uId);
	   public List<Comment> queryAllCommentBymId(int mId);
	   public Comment queryComment(Comment comment);
}
