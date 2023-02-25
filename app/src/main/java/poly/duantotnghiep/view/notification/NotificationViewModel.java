package poly.duantotnghiep.view.notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import poly.duantotnghiep.data.model.Notification;
import poly.duantotnghiep.util.FakeDataComponent;

public class NotificationViewModel extends ViewModel {
    public NotificationViewModel() {
        loadNotificationList();
    }

    private final MutableLiveData<List<Notification>> notificationList = new MutableLiveData<>();
    public LiveData<List<Notification>> _notificationList = notificationList;

    public void loadNotificationList() {
        List<Notification> newsList = FakeDataComponent.getNotificationList();
        notificationList.setValue(newsList);
    }
}
