package com.ekeguan.collectanimationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ekeguan.collectanimationdemo.utils.ScaleAnimatorUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.iv_collect)
    ImageView ivCollect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        initData();
        initEventListener();
    }

    private void initView() {
        ivCollect.setSelected(false);
    }

    private void initData() {}

    private void initEventListener() {
        ivCollect.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_collect:
                if (ivCollect.isSelected()==false){
                    ivCollect.setImageResource(R.drawable.collect_yes);
                    ivCollect.setSelected(true);
                    ScaleAnimatorUtils.setScalse(ivCollect);
                    Toast.makeText(this,"收藏成功",Toast.LENGTH_SHORT).show();
                }else{
                    ivCollect.setImageResource(R.drawable.collect_no);
                    ivCollect.setSelected(false);
                    ScaleAnimatorUtils.setScalse(ivCollect);
                    Toast.makeText(this,"取消收藏",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
