package poly.duantotnghiep.view.profile.saved_news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.util.FakeNewsInProfileComponent;

public class SavedNewsViewModel extends ViewModel {

    public SavedNewsViewModel() {
        loadSavedList();
    }

    private final MutableLiveData<List<News>> savedList = new MutableLiveData<>();
    public LiveData<List<News>> _savedList = savedList;

    public void loadSavedList() {
        List<News> newsList = FakeNewsInProfileComponent.getList();
        savedList.setValue(newsList);
    }
}
