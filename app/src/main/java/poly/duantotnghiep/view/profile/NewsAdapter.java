package poly.duantotnghiep.view.profile;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import poly.duantotnghiep.data.model.News;
import poly.duantotnghiep.databinding.ItemNewsInProfileBinding;

public class NewsAdapter extends ListAdapter<News, NewsAdapter.ViewHolder> {

    private static final DiffUtil.ItemCallback<News> diff = new DiffUtil.ItemCallback<News>() {
        @Override
        public boolean areItemsTheSame(@NonNull News oldItem, @NonNull News newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull News oldItem, @NonNull News newItem) {
            return oldItem.equals(newItem);
        }
    };
    private final OnClickListener listener;

    public NewsAdapter(NewsAdapter.OnClickListener listener) {
        super(diff);
        this.listener = listener;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemNewsInProfileBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        News news = getItem(position);
        if (news != null) {
            holder.setNews(news, listener);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemNewsInProfileBinding binding;

        public ViewHolder(@NonNull ItemNewsInProfileBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setNews(News news, OnClickListener listener) {
            Glide.with(binding.imvImage).load(news.getImage()).into(binding.imvImage);
            binding.tvTitle.setText(String.valueOf(news.getTitle()));
            binding.tvDescription.setText(news.getDescription());
            binding.tvView.setText(String.valueOf(news.getView()));
            binding.tvTime.setText(String.valueOf(news.getEstablishTime()));

            binding.getRoot().setOnClickListener(view -> listener.onClickItem(news.getId()));
            binding.tvShare.setOnClickListener(view -> listener.onClickShareItem(news.getId()));
            binding.imvShare.setOnClickListener(view -> listener.onClickShareItem(news.getId()));
        }
    }

    public interface OnClickListener {
        void onClickItem(String newsId);

        void onClickShareItem(String newsId);
    }
}
