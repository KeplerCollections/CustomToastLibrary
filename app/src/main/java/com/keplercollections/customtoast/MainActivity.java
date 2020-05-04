package com.keplercollections.customtoast;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.keplercollections.customtoastlibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view) {
        switch (view.getId()) {
            case R.id.simple_toast:
                ToastMessage.makeSimpleToast(getApplicationContext(), getString(R.string.simple_toast)).show();
                break;
            case R.id.warning_toast:
                ToastMessage.makeWarningToast(getApplicationContext(), getString(R.string.warning_toast)).show();
                break;
            case R.id.error_toast:
                ToastMessage.makeErrorToast(getApplicationContext(), getString(R.string.error_toast)).show();
                break;
            case R.id.success_toast:
                ToastMessage.makeSuccessToast(getApplicationContext(), getString(R.string.success_toast)).show();
                break;
            case R.id.info_toast:
                ToastMessage.makeInfoToast(getApplicationContext(), getString(R.string.info_taost)).show();
                break;
        }
    }
}
