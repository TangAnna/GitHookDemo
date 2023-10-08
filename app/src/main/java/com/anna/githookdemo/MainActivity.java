package com.anna.githookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anna.githookdemo.ui.main.MainFragment;

/**
 * description:
 * time: ${DATE} ${TIME}.
 * author: TangAnna
 * email: tang_an@murongtech.com
 * copyright: 北京沐融科信息科技技股份有限公司
 * @author tanganna
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
