package poly.duantotnghiep.view.notification;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import poly.duantotnghiep.R;
import poly.duantotnghiep.data.model.Notification;
import poly.duantotnghiep.databinding.ItemNotificationBinding;
import poly.duantotnghiep.util.TimeUtility;

public class NotificationAdapter extends ListAdapter<Notification, NotificationAdapter.ViewHolder> {

    private final OnClickListener listener;
    private static final DiffUtil.ItemCallback<Notification> diff = new DiffUtil.ItemCallback<Notification>() {
        @Override
        public boolean areItemsTheSame(@NonNull Notification oldItem, @NonNull Notification newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Notification oldItem, @NonNull Notification newItem) {
            return oldItem.equals(newItem);
        }
    };

    protected NotificationAdapter(@NonNull OnClickListener listener) {
        super(diff);
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNotificationBinding binding = ItemNotificationBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewHolder holder, int position) {
        Notification notification = getItem(position);
        if (notification != null) {
            holder.setNotification(notification, listener);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemNotificationBinding binding;

        public ViewHolder(ItemNotificationBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setNotification(Notification notification, OnClickListener listener) {
            Glide.with(binding.imvImage).load(notification.getImage()).into(binding.imvImage);
            binding.tvContent.setText(notification.getContent());
            binding.tvTime.setText(TimeUtility.getTimeString(binding.tvTime.getContext(), notification.getTime()));

            if (notification.isSeen()) {
                binding.getRoot().setBackgroundColor(Color.WHITE);
            }

            switch (notification.getNotificationType()) {
                case COMMENT_REQUEST:
                case NEW_NEWS:
                    binding.imvNotifyType.setImageDrawable(
                            ResourcesCompat.getDrawable(binding.imvNotifyType.getResources(), R.drawable.img_notified_inform, null)
                    );
                    break;
                case LIKED_COMMENT:
                    binding.imvNotifyType.setImageDrawable(
                            ResourcesCompat.getDrawable(binding.imvNotifyType.getResources(), R.drawable.img_notified_like, null)
                    );
                    break;
                case TAG_COMMENT:
                    binding.imvNotifyType.setImageDrawable(
                            ResourcesCompat.getDrawable(binding.imvNotifyType.getResources(), R.drawable.img_notified_tag, null)
                    );
                    break;
            }

            binding.imvMore.setOnClickListener(view -> listener.onMore(notification));
            binding.getRoot().setOnClickListener(view -> listener.onClickItem(notification));
        }
    }

    public interface OnClickListener {
        void onClickItem(Notification notification);

        void onMore(Notification notification);
    }
}
