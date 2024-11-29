package com.example.dangthanhmai_ktcanhan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.dangthanhmai_ktcanhan.Fragment.HomeFragmentUser;
import com.example.dangthanhmai_ktcanhan.Fragment.ListFragmentUser;
import com.example.dangthanhmai_ktcanhan.Fragment.PersonFragmentUser;
import com.example.dangthanhmai_ktcanhan.Fragment.SettingsFragmentUser;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragmentUser();
            case 1:
                return new ListFragmentUser();
            case 2:
                return new PersonFragmentUser();
            case 3:
                return new SettingsFragmentUser();
            default:
                return new HomeFragmentUser();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
