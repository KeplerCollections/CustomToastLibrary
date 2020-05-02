package com.keplercollections.customtoastlibrary;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class ToastMessage {

    private static Toast makeText(@NonNull Context context, int background_resource, @NonNull CharSequence text) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.info_toast, null);

        TextView textview = layout.findViewById(R.id.text);
        textview.setText(text);
        textview.setBackgroundResource(background_resource);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        return toast;
    }

    public static Toast makeErrorToast(@NonNull Context context, @NonNull CharSequence text) {
        return makeText(context,R.drawable.rect_with_corner_fill_trans_stroke_red,text);
    }

    public static Toast makeWarningToast(@NonNull Context context, @NonNull CharSequence text) {
        return makeText(context,R.drawable.rect_with_corner_fill_trans_stroke_yellow,text);
    }

    public static Toast makeSuccessToast(@NonNull Context context, @NonNull CharSequence text) {
        return makeText(context,R.drawable.rect_with_corner_fill_trans_stroke_green,text);
    }

    public static Toast makeNormalToast(@NonNull Context context, @NonNull CharSequence text) {
        return makeText(context,R.drawable.rect_with_corner_fill_trans_stroke_black,text);
    }
}
