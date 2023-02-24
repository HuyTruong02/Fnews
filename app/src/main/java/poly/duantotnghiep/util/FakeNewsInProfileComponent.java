package poly.duantotnghiep.util;

import java.util.ArrayList;
import java.util.List;

import poly.duantotnghiep.data.model.News;

public class FakeNewsInProfileComponent {

    public static List<News> getList() {
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
