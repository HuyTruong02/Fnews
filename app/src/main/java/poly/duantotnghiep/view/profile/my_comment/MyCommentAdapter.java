package poly.duantotnghiep.view.profile.my_comment;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import poly.duantotnghiep.data.model.Comment;
import poly.duantotnghiep.data.model.CommentAndNews;
import poly.duantotnghiep.databinding.ItemMyCommentInProfileBinding;

public class MyCommentAdapter extends ListAdapter<CommentAndNews, MyCommentAdapter.ViewHolder> {

    private final OnClickListener listener;
    private static final DiffUtil.ItemCallback<CommentAndNews> diff = new DiffUtil.ItemCallback<CommentAndNews>() {
        @Override
        public boolean areItemsTheSame(@NonNull CommentAndNews oldItem, @NonNull CommentAndNews newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull CommentAndNews oldItem, @NonNull CommentAndNews newItem) {
            return oldItem.equals(newItem);
        }
    };

    public MyCommentAdapter(OnClickListener listener) {
        super(diff);
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyCommentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMyCommentInProfileBinding binding = ItemMyCommentInProfileBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCommentAdapter.ViewHolder holder, int position) {
        CommentAndNews commentAndNews = getItem(position);
        if (commentAndNews != null) {
            holder.setComment(commentAndNews, listener);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemMyCommentInProfileBinding binding;

        public ViewHolder(@NonNull ItemMyCommentInProfileBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setComment(CommentAndNews comment, OnClickListener listener) {
            Glide.with(binding.imvImage).load(comment.getNewsImage()).into(binding.imvImage);
            binding.tvComment.setText(comment.getContent());
            binding.tvCommentStatus.setText(getStatusString(comment.getStatus()));
            binding.tvTitle.setText(comment.getNewsTitle());
            binding.getRoot().setOnClickListener(view -> listener.onClickItem(comment.getNewsId()));

            if (comment.getStatus() == Comment.CommentStatus.APPROVED) {
                binding.imvCircle.setImageTintList(ColorStateList.valueOf(Color.GREEN));
            } else if (comment.getStatus() == Comment.CommentStatus.BLOCKED) {
                binding.imvCircle.setImageTintList(ColorStateList.valueOf(Color.RED));
            } else {
                binding.imvCircle.setImageTintList(ColorStateList.valueOf(Color.YELLOW));
            }
        }

        private String getStatusString(Comment.CommentStatus commentStatus) {
            switch (commentStatus) {
                case BLOCKED:
                    return "Bị khóa";
                case PENDING:
                    return "Đang duyệt";
                case APPROVED:
                    return "Đã duyệt";
                default:
                    return "";
            }
        }
    }


    public interface OnClickListener {
        void onClickItem(String newsId);
    }
}
