package poly.duantotnghiep.view.profile.my_comment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import poly.duantotnghiep.databinding.FragmentMyCommentBinding;

public class MyCommentFragment extends Fragment implements MyCommentAdapter.OnClickListener {

    private FragmentMyCommentBinding binding;
    private MyCommentAdapter myCommentAdapter;

    public static MyCommentFragment newInstance() {
        return new MyCommentFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentMyCommentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewModel();
        setupCommentsRcv();
    }

    private void setupViewModel() {
        MyCommentViewModel viewModel = new ViewModelProvider(this).get(MyCommentViewModel.class);
        viewModel._commentList.observe(getViewLifecycleOwner(), commentAndNewsList -> {
            if (commentAndNewsList != null) {
                myCommentAdapter.submitList(commentAndNewsList);
            }
        });
    }

    private void setupCommentsRcv() {
        myCommentAdapter = new MyCommentAdapter(this);
        binding.rcvMyComment.setAdapter(myCommentAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClickItem(String newsId) {

    }
}