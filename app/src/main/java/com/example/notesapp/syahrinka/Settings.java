package com.example.notesapp.syahrinka;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.notesapp.syahrinka.Constant;

public class Settings {

    SharedPreferences preferences;

    public Settings(Context context) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static float getTextSize(String textSize, String s) {
        return 0;
    }

    public String getUser() {
        return preferences.getString(Constant.SESSION, null);
    }

    public void setUser(String user) {
        preferences.edit()
                .putString(Constant.SESSION, user)
                .apply();
    }

    public void removeUser() {
        preferences.edit()
                .remove(Constant.SESSION)
                .apply();
    }

    public int getLayoutMode() {
        return preferences.getInt(Constant.LAYOUT_MODE, Constant.LAYOUT_MODE_LIST);
    }

    public void setLayoutMode(int layout) {
        preferences.edit()
                .putInt(Constant.LAYOUT_MODE, layout)
                .apply();
    }

    public float getTextSize() {
        String textSize = preferences.getString(Constant.PREF_TEXT_SIZE, "20");
        return Float.parseFloat(textSize);
    }
}