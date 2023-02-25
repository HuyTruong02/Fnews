package poly.duantotnghiep.view.profile.my_comment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.CommentAndNews;
import poly.duantotnghiep.util.FakeDataComponent;

public class MyCommentViewModel extends ViewModel {
    public MyCommentViewModel() {
        loadCommentList();
    }

    private final MutableLiveData<List<CommentAndNews>> commentList = new MutableLiveData<>();
    public LiveData<List<CommentAndNews>> _commentList = commentList;

    public void loadCommentList() {
        List<CommentAndNews> newsList = FakeDataComponent.getCommentAndNewsList();
        commentList.setValue(newsList);
    }
}