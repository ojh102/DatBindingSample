package com.github.ojh.datbindingsample;

import android.view.View;
import android.widget.Toast;

/**
 * Created by 01071724654 on 2016-07-21.
 */
public class MyData {
    public final String text;

    public MyData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String text() {
        return text;
    }

    public void onClickMyData(View view) {
        Toast.makeText(view.getContext(), "MyData!", Toast.LENGTH_SHORT).show();
    }
}
