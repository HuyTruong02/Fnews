package poly.duantotnghiep.data.model;

import java.util.Objects;

public class Comment {
    private String id;
    private String userId;
    private String newsId;
    private String content;
    private String numberOfLike;
    private String targetCommentId;
    private CommentStatus status;

    public Comment(String id, String userId, String newsId, String content, String numberOfLike, String targetCommentId, CommentStatus status) {
        this.id = id;
        this.userId = userId;
        this.newsId = newsId;
        this.content = content;
        this.numberOfLike = numberOfLike;
        this.targetCommentId = targetCommentId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(String numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public String getTargetCommentId() {
        return targetCommentId;
    }

    public void setTargetCommentId(String targetCommentId) {
        this.targetCommentId = targetCommentId;
    }

    public CommentStatus getStatus() {
        return status;
    }

    public void setStatus(CommentStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(getNewsId(), comment.getNewsId()) && Objects.equals(getContent(), comment.getContent()) && Objects.equals(getNumberOfLike(), comment.getNumberOfLike()) && Objects.equals(getStatus(), comment.getStatus());
    }

    public enum CommentStatus {
        PENDING, APPROVED, BLOCKED
    }

}
