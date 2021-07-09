package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Layout1 extends LinearLayout {
    ImageView imageView;
    TextView textView;
    TextView textView2;
    //생성자1
    public Layout1(Context context) {
        super(context);
        init(context);
    }
    //생성자2
    public Layout1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
    //함수 - 인플레이
    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        inflater.inflate(R.layout.layout1, this, true);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
    }

    public void setImageView(int resId){
        imageView.setImageResource(resId);;
    }
    public void setTextView(String text){
        textView.setText(text);
    }
    public void setTextView2(String text2){
        textView2.setText(text2);
    }
}
