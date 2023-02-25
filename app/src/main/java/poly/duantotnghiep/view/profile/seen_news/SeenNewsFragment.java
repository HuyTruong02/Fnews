package poly.duantotnghiep.view.profile.seen_news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import poly.duantotnghiep.databinding.FragmentSeenNewsBinding;
import poly.duantotnghiep.view.profile.NewsAdapter;

public class SeenNewsFragment extends Fragment implements NewsAdapter.OnClickListener {

    private FragmentSeenNewsBinding binding;
    private NewsAdapter newsAdapter;

    public static SeenNewsFragment newInstance() {
        return new SeenNewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentSeenNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupSeenNewsRcv();
        setupViewModel();
    }

    private void setupViewModel() {
        SeenNewsViewModel viewModel = new ViewModelProvider(this).get(SeenNewsViewModel.class);
        viewModel._seenNewsList.observe(getViewLifecycleOwner(), news -> {
            if (news != null) {
                newsAdapter.submitList(news);
            }
        });
    }

    private void setupSeenNewsRcv() {
        newsAdapter = new NewsAdapter(this);
        binding.rcvSeenNews.setAdapter(newsAdapter);
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