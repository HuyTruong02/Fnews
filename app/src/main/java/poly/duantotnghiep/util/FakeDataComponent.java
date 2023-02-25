package poly.duantotnghiep.util;

import java.util.ArrayList;
import java.util.List;

import poly.duantotnghiep.data.model.Comment;
import poly.duantotnghiep.data.model.CommentAndNews;
import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.data.model.Notification;

public class FakeDataComponent {

    public static List<Notification> getNotificationList() {
        List<Notification> notifications = new ArrayList<>();

        Notification notification = new Notification(
                "1",
                "Bình luận : \"fsdif sdofh\" đã được phê duyệt",
                System.currentTimeMillis(),
                Notification.NotificationType.COMMENT_REQUEST,
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                false
        );

        Notification notification1 = new Notification(
                "1",
                "Bình luận : \"fsdif sdofh\" đã được phê duyệt",
                System.currentTimeMillis(),
                Notification.NotificationType.TAG_COMMENT,
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                false
        );
        Notification notification2 = new Notification(
                "1",
                "Bình luận : \"fsdif sdofh\" đã được phê duyệt",
                System.currentTimeMillis(),
                Notification.NotificationType.LIKED_COMMENT,
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                false
        );

        Notification notification3 = new Notification(
                "1",
                "Bình luận : \"fsdif sdofh\" đã được phê duyệt",
                System.currentTimeMillis(),
                Notification.NotificationType.COMMENT_REQUEST,
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                true
        );

        notifications.add(notification);
        notifications.add(notification1);
        notifications.add(notification2);
        notifications.add(notification3);
        notifications.add(notification);
        notifications.add(notification1);
        notifications.add(notification2);
        notifications.add(notification3);
        notifications.add(notification);
        notifications.add(notification1);
        notifications.add(notification2);
        notifications.add(notification3);
        notifications.add(notification);
        notifications.add(notification1);
        notifications.add(notification2);
        notifications.add(notification3);

        return notifications;
    }

    public static List<CommentAndNews> getCommentAndNewsList() {
        List<CommentAndNews> list = new ArrayList<>();
        CommentAndNews commentAndNews = new CommentAndNews(
                "1",
                "1",
                "1",
                "Tôi đẹp thế nào đâu",
                "2",
                "2",
                Comment.CommentStatus.APPROVED,
                "Mumbai local train",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg"
        );

        CommentAndNews commentAndNews1 = new CommentAndNews(
                "1",
                "1",
                "1",
                "Tôi đẹp thế nào đâu",
                "2",
                "2",
                Comment.CommentStatus.PENDING,
                "Mumbai local train 1",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg"
        );

        CommentAndNews commentAndNews2 = new CommentAndNews(
                "1",
                "1",
                "1",
                "Tôi đẹp thế nào đâu",
                "2",
                "2",
                Comment.CommentStatus.BLOCKED,
                "Mumbai local train 2",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg"
        );

        list.add(commentAndNews);
        list.add(commentAndNews1);
        list.add(commentAndNews);
        list.add(commentAndNews1);
        list.add(commentAndNews2);
        return list;
    }

    public static List<News> getNewsList() {
        List<News> list = new ArrayList<>();
        News news = new News("1",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                "Mumbai local train",
                "Local  train services, considered as the lifeline o....",
                100,
                System.currentTimeMillis());
        News news1 = new News("2",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                "Mumbai local train 2",
                "Local  train services, considered as the lifeline o....",
                10,
                System.currentTimeMillis());
        News news2 = new News("3",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                "Mumbai local train 3",
                "Local  train services, considered as the lifeline o....",
                107,
                System.currentTimeMillis());
        News news3 = new News("4",
                "https://2.img-dpreview.com/files/p/E~C1000x0S4000x4000T1200x1200~articles/3925134721/0266554465.jpeg",
                "Mumbai local train 4",
                "Local  train services, considered as the lifeline o....",
                98,
                System.currentTimeMillis());

        list.add(news);
        list.add(news2);
        list.add(news3);
        list.add(news1);
        list.add(news3);
        list.add(news);
        return list;
    }


}
