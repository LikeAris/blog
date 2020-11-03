package com.zb.blog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.commentator_id
     *
     * @mbggenerated
     */
    private Integer commentatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_content
     *
     * @mbggenerated
     */
    private String commentContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_time
     *
     * @mbggenerated
     */
    private Date commentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.to_comment_id
     *
     * @mbggenerated
     */
    private Integer toCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.article_id
     *
     * @mbggenerated
     */
    private Integer articleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.commentator_id
     *
     * @return the value of comment.commentator_id
     *
     * @mbggenerated
     */
    public Integer getCommentatorId() {
        return commentatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.commentator_id
     *
     * @param commentatorId the value for comment.commentator_id
     *
     * @mbggenerated
     */
    public void setCommentatorId(Integer commentatorId) {
        this.commentatorId = commentatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_content
     *
     * @return the value of comment.comment_content
     *
     * @mbggenerated
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_content
     *
     * @param commentContent the value for comment.comment_content
     *
     * @mbggenerated
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_time
     *
     * @return the value of comment.comment_time
     *
     * @mbggenerated
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_time
     *
     * @param commentTime the value for comment.comment_time
     *
     * @mbggenerated
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.to_comment_id
     *
     * @return the value of comment.to_comment_id
     *
     * @mbggenerated
     */
    public Integer getToCommentId() {
        return toCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.to_comment_id
     *
     * @param toCommentId the value for comment.to_comment_id
     *
     * @mbggenerated
     */
    public void setToCommentId(Integer toCommentId) {
        this.toCommentId = toCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.article_id
     *
     * @return the value of comment.article_id
     *
     * @mbggenerated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.article_id
     *
     * @param articleId the value for comment.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentatorId=").append(commentatorId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", toCommentId=").append(toCommentId);
        sb.append(", articleId=").append(articleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}