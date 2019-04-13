package com.example.notesapp.syahrinka.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import  com.example.notesapp.syahrinka.R;

public class SettingFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
