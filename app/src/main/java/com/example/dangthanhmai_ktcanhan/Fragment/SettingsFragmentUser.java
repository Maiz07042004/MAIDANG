package com.example.dangthanhmai_ktcanhan.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dangthanhmai_ktcanhan.R;

public class SettingsFragmentUser extends Fragment {
    private View mView;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_settings_user,container,false);
        return mView;
    }

}
