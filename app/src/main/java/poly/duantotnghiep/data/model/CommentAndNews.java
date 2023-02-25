package poly.duantotnghiep.data.model;

import java.util.Objects;

public class CommentAndNews extends Comment {

    private String newsTitle;
    private String newsImage;


    public CommentAndNews(String id, String userId, String newsId, String content, String numberOfLike, String targetCommentId, CommentStatus status, String newsTitle, String newsImage) {
        super(id, userId, newsId, content, numberOfLike, targetCommentId, status);
        this.newsTitle = newsTitle;
        this.newsImage = newsImage;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommentAndNews that = (CommentAndNews) o;
        return Objects.equals(getNewsTitle(), that.getNewsTitle()) && Objects.equals(getNewsImage(), that.getNewsImage());
    }

}
