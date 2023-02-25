package poly.duantotnghiep.data.model;

import java.util.Objects;


public class News {

    private String id;
    private String image;
    private String title;
    private String description;
    private long view;
    private long establishTime;

    public News(String id, String image, String title, String description, long view, long establishTime) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.view = view;
        this.establishTime = establishTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public long getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(long establishTime) {
        this.establishTime = establishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return getView() == news.getView() && getEstablishTime() == news.getEstablishTime() && Objects.equals(getImage(), news.getImage()) && Objects.equals(getTitle(), news.getTitle()) && Objects.equals(getDescription(), news.getDescription());
    }
}

