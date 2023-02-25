package poly.duantotnghiep.view.profile.liked_news;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import poly.duantotnghiep.R;
import poly.duantotnghiep.databinding.FragmentLikedNewsBinding;
import poly.duantotnghiep.view.profile.NewsAdapter;
import poly.duantotnghiep.view.profile.saved_news.SavedNewsViewModel;

public class LikedNewsFragment extends Fragment implements NewsAdapter.OnClickListener {

    private FragmentLikedNewsBinding binding;

    private NewsAdapter newsAdapter;

    public static LikedNewsFragment newInstance() {
        return new LikedNewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentLikedNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupLikedNewsRcv();
        setupViewModel();
    }

    private void setupViewModel() {
        LikedNewsViewModel viewModel = new ViewModelProvider(this).get(LikedNewsViewModel.class);
        viewModel._likedNewsList.observe(getViewLifecycleOwner(), news -> {
            if (news != null) {
                newsAdapter.submitList(news);
            }
        });
    }

    private void setupLikedNewsRcv() {
        newsAdapter = new NewsAdapter(this);
        binding.rcvLikedNews.setAdapter(newsAdapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClickItem(String newsId) {

    }

    @Override
    public void onClickShareItem(String newsId) {

    }
}