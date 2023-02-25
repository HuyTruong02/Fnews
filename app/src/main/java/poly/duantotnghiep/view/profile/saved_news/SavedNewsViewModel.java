package poly.duantotnghiep.view.profile.saved_news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.util.FakeNewsInProfileComponent;

public class SavedNewsViewModel extends ViewModel {

    public SavedNewsViewModel() {
        loadSavedNewsList();
    }

    private final MutableLiveData<List<News>> savedNewsList = new MutableLiveData<>();
    public LiveData<List<News>> _savedNewsList = savedNewsList;

    private void loadSavedNewsList() {
        List<News> newsList = FakeNewsInProfileComponent.getList();
        savedNewsList.setValue(newsList);
    }
}
