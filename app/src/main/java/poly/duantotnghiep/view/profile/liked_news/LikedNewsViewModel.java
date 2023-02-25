package poly.duantotnghiep.view.profile.liked_news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.util.FakeDataComponent;

public class LikedNewsViewModel extends ViewModel {

    public LikedNewsViewModel() {
        loadSeenList();
    }

    private final MutableLiveData<List<News>> likedNewsList = new MutableLiveData<>();
    public LiveData<List<News>> _likedNewsList = likedNewsList;

    public void loadSeenList() {
        List<News> newsList = FakeDataComponent.getNewsList();
        likedNewsList.setValue(newsList);
    }
}