package poly.duantotnghiep.data.model;

import java.util.Objects;

public class Notification {
    private String id;
    private String content;
    private long time;
    private NotificationType notificationType;
    private String image;
    private boolean seen;

    public Notification(String id, String content, long time, NotificationType notificationType, String image, boolean seen) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.notificationType = notificationType;
        this.image = image;
        this.seen = seen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return getTime() == that.getTime() && isSeen() == that.isSeen() && Objects.equals(getContent(), that.getContent()) && Objects.equals(getImage(), that.getImage());
    }

    public enum NotificationType {
        NEW_NEWS, COMMENT_REQUEST, TAG_COMMENT, LIKED_COMMENT
    }
}
