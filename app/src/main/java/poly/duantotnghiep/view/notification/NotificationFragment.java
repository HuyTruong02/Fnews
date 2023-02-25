package poly.duantotnghiep.view.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import poly.duantotnghiep.R;
import poly.duantotnghiep.data.model.Notification;
import poly.duantotnghiep.databinding.FragmentNotificationBinding;


public class NotificationFragment extends Fragment implements NotificationAdapter.OnClickListener {

    private FragmentNotificationBinding binding;
    private NotificationAdapter notificationAdapter;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNotificationBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupNotificationRcv();
        setupViewModel();
        setupBottomSheet();
    }

    private void setupBottomSheet() {
        bottomSheetDialog = new BottomSheetDialog(requireContext(), R.style.SheetDialog);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_notification);
    }

    private void setupViewModel() {
        NotificationViewModel viewModel = new ViewModelProvider(this).get(NotificationViewModel.class);
        viewModel._notificationList.observe(getViewLifecycleOwner(), notifications -> {
            if (notifications != null) {
                notificationAdapter.submitList(notifications);
            }
        });
    }

    private void setupNotificationRcv() {
        notificationAdapter = new NotificationAdapter(this);
        binding.rcvNotification.setAdapter(notificationAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClickItem(Notification notification) {

    }

    @Override
    public void onMore(Notification notification) {
        showBottomSheet();
    }

    private void showBottomSheet() {
        bottomSheetDialog.show();
    }
}