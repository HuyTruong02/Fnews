package poly.duantotnghiep.view.profile.change_password;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import poly.duantotnghiep.R;

public class ChangeNewPasswordFragment extends Fragment {

    private ChangeNewPasswordViewModel mViewModel;

    public static ChangeNewPasswordFragment newInstance() {
        return new ChangeNewPasswordFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_change_new_password, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ChangeNewPasswordViewModel.class);
        // TODO: Use the ViewModel
    }

}