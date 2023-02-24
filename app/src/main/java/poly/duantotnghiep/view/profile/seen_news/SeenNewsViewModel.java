package poly.duantotnghiep.view.profile.seen_news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.util.FakeNewsInProfileComponent;

public class SeenNewsViewModel extends ViewModel {
    public SeenNewsViewModel() {
        loadSeenList();
    }

    private final MutableLiveData<List<News>> seenList = new MutableLiveData<>();
    public LiveData<List<News>> _seenList = seenList;

    public void loadSeenList() {
        List<News> newsList = FakeNewsInProfileComponent.getList();
        seenList.setValue(newsList);
    }
}