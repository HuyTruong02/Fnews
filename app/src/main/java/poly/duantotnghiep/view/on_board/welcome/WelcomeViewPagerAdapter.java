package poly.duantotnghiep.view.on_board.welcome;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WelcomeViewPagerAdapter extends FragmentStateAdapter {

    public WelcomeViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Welcome1Fragment();
            case 1:
                return new Wellcome2Fragment();
            case 2:
                return new Wellcome3Fragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
