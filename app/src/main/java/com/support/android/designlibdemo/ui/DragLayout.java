package com.support.android.designlibdemo.ui;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/**
 * Created by lll on 2015/8/3.
 * version：
 * description：自定义一个可拖动item的GridView
 * copyright ：timanetwork
 */
public class DragLayout extends GridView {

    /**
     * 拖动工具类，导入V4包
     */
    private ViewDragHelper mDragHelper;

    public DragLayout(Context context) {
        super(context);
    }

    public DragLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DragLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void initDragView() {
        //创建一个ViewDragHelper
        //第一个参数父容器控件：必须是ViewGroup
        //第二个参数是滑动灵敏度
        //第三个参数是回调函数
        mDragHelper = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() {
            @Override
            public boolean tryCaptureView(View child, int pointerId) {
                return false;
            }
        });
    }



}
