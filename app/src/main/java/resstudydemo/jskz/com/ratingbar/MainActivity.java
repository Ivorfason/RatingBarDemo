package resstudydemo.jskz.com.ratingbar;

import android.app.Activity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

/**
 * Description: 为售后评分
 * <br/>site: <a href="http://www.jiashuangkuaizi.com">jiashuangkuaizi.com</a>
 * <br/>Copyright (C), 2014, jiashuangkuaizi（加双筷子）
 * <br/>This program is protected by copyright laws.

 */

public class MainActivity extends Activity implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    //===========控件变量==========
    private Button mPointBtn;
    private EditText mPointET;

    private RatingBar mPoint1RB;
    private RatingBar mPoint2RB;
    private RatingBar mPoint3RB;


    //===========初始化============
    //（View初始化，控件事件监听的初始化等）
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

    }

    private void initView() {

        mPointBtn = (Button) this.findViewById(R.id.aci_point_btn);
        mPointET = (EditText) this.findViewById(R.id.aci_point_et);
        mPoint1RB = (RatingBar) this.findViewById(R.id.aci_point1_rb);
        mPoint2RB = (RatingBar) this.findViewById(R.id.aci_point2_rb);
        mPoint3RB = (RatingBar) this.findViewById(R.id.aci_point3_rb);
    }

    private void initListener() {
        mPointBtn.setOnClickListener(this);
        mPoint1RB.setOnRatingBarChangeListener(this);
        mPoint2RB.setOnRatingBarChangeListener(this);
        mPoint3RB.setOnRatingBarChangeListener(this);
    }


    //===========处理点击事件===========
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aci_point_btn:

                break;
        }
    }

    //========处理RatingBar事件========
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        int Rating1 = (int)mPoint1RB.getRating();
        int Rating2 = (int)mPoint2RB.getRating();
        int Rating3 = (int)mPoint3RB.getRating();
        mPointET.setGravity(Gravity.START);
        mPointET.setText("Rating1：" + Rating1 + "\nRating2：" + Rating2 + "\nRating3：" + Rating3);
    }

    //===========逻辑方法===========

    //===========执行异步任务===========

    //===========异步任务回调===========


    //===========其他方法==========
    //（主要是Activity的生命周期方法 -- 除了onCreate方法）

}
