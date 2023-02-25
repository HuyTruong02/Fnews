package poly.duantotnghiep.view.profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import poly.duantotnghiep.R;
import poly.duantotnghiep.databinding.FragmentProfileBinding;


public class ProfileFragment extends Fragment implements View.OnClickListener {

    private FragmentProfileBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardSaved:
                break;
            case R.id.cardSeen:
                break;
            case R.id.cardLike:
                break;
            case R.id.cardComment:
                break;
            case R.id.cardEmailLinking:
                break;
            case R.id.cardChangePasswd:
                break;
            case R.id.cardSignOut:
                break;
        }
    }


}