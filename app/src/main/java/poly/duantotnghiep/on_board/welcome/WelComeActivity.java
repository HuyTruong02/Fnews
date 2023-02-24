package poly.duantotnghiep.on_board.welcome;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import poly.duantotnghiep.R;
import poly.duantotnghiep.databinding.ActivityWellComeBinding;

public class WelComeActivity extends FragmentActivity {

    private ActivityWellComeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWellComeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupViewPager();
        setupIndicatorWithViewPager();
        setupSkipPage();
        setupNextPage();
    }

    private void setupViewPager() {
        Drawable colorIndicator = ResourcesCompat.getDrawable(getResources(), R.drawable.bg_color_circle, null);
        Drawable nonColorIndicator = ResourcesCompat.getDrawable(getResources(), R.drawable.bg_circle, null);
        binding.viewpager.setAdapter(new WelcomeViewPagerAdapter(this));
        binding.viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        binding.v1.setBackground(colorIndicator);
                        binding.v2.setBackground(nonColorIndicator);
                        binding.v3.setBackground(nonColorIndicator);
                        binding.tvSkip.setVisibility(View.VISIBLE);
                        binding.tvNext.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        binding.v1.setBackground(nonColorIndicator);
                        binding.v2.setBackground(colorIndicator);
                        binding.v3.setBackground(nonColorIndicator);
                        binding.tvSkip.setVisibility(View.VISIBLE);
                        binding.tvNext.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        binding.v1.setBackground(nonColorIndicator);
                        binding.v2.setBackground(nonColorIndicator);
                        binding.v3.setBackground(colorIndicator);
                        binding.tvSkip.setVisibility(View.GONE);
                        binding.tvNext.setVisibility(View.GONE);
                        break;
                }
            }
        });
    }

    private void setupIndicatorWithViewPager() {
        binding.v1.setOnClickListener(view -> binding.viewpager.setCurrentItem(0));
        binding.v2.setOnClickListener(view -> binding.viewpager.setCurrentItem(1));
        binding.v3.setOnClickListener(view -> binding.viewpager.setCurrentItem(2));
    }

    private void setupNextPage() {
        binding.tvNext.setOnClickListener(view -> {
            if (binding.viewpager.getCurrentItem() < 2) {
                binding.viewpager.setCurrentItem(binding.viewpager.getCurrentItem() + 1);
            }
        });
    }

    private void setupSkipPage() {
        binding.tvSkip.setOnClickListener(view -> binding.viewpager.setCurrentItem(2));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}