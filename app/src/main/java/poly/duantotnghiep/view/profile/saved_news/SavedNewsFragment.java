package poly.duantotnghiep.view.profile.saved_news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import poly.duantotnghiep.databinding.FragmentSavedNewsBinding;
import poly.duantotnghiep.view.profile.NewsAdapter;


public class SavedNewsFragment extends Fragment implements NewsAdapter.OnClickListener {
    private FragmentSavedNewsBinding binding;
    private NewsAdapter newsAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSavedNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupSavedNewsRcv();
        setupViewModel();
    }

    private void setupViewModel() {
        SavedNewsViewModel viewModel = new ViewModelProvider(this).get(SavedNewsViewModel.class);
        viewModel._savedList.observe(getViewLifecycleOwner(), news -> {
            if (news != null) {
                newsAdapter.submitList(news);
            }
        });
    }

    private void setupSavedNewsRcv() {
        newsAdapter = new NewsAdapter(this);
        binding.rcvSavedNews.setAdapter(newsAdapter);
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