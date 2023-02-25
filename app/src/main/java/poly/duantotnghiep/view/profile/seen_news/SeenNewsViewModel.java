package poly.duantotnghiep.view.profile.seen_news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.util.FakeNewsInProfileComponent;

public class SeenNewsViewModel extends ViewModel {
    public SeenNewsViewModel() {
        loadSeenNewsList();
    }

    private final MutableLiveData<List<News>> seenNewsList = new MutableLiveData<>();
    public LiveData<List<News>> _seenNewsList = seenNewsList;

    private void loadSeenNewsList() {
        List<News> newsList = FakeNewsInProfileComponent.getList();
        seenNewsList.setValue(newsList);
    }
}