package com.example.cnadmin.yibiaopan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public DashboardView dashboard_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dashboard_View = (DashboardView) findViewById(R.id.dashboard_View);

        dashboard_View.setRadius(142);//设置绘制的图形整体的大小
        dashboard_View.setArcColor(getResources().getColor(android.R.color.black));//设置刻度的颜色
        dashboard_View.setTextColor(Color.parseColor("#212121"));
        dashboard_View.setBgColor(getResources().getColor(android.R.color.white));//设置view的背景颜色
        dashboard_View.setStartAngle(150);//设置图形绘制的角度
        dashboard_View.setPointerRadius(90);//设置指针的长度
        dashboard_View.setCircleRadius(8);//设置指针的大小
        dashboard_View.setSweepAngle(240);//设置刻度盘整体绘制的大小
        dashboard_View.setBigSliceCount(12);//设置刻度绘制的密度
        dashboard_View.setMaxValue(50);//设置刻度值的大小
        dashboard_View.setRealTimeValue((float) 36);//设置指针的位置
        dashboard_View.setMeasureTextSize(14);//设置刻度值文本的大小
        dashboard_View.setHeaderRadius(80);//单位显示的Y轴的位置
        dashboard_View.setHeaderTitle("℃");//设置单位
        dashboard_View.setHeaderTextSize(18);//设置单位和当前值显示的大小
        dashboard_View.setStripeWidth(20);//颜色条幅的宽度
        dashboard_View.setStripeMode(DashboardView.StripeMode.OUTER);//颜色条幅显示的方式（共3种）


        List<HighlightCR> highlight = new ArrayList<>();
        highlight.add(new HighlightCR(150, 100, Color.parseColor("#4CAF50")));
        highlight.add(new HighlightCR(250, 80, Color.parseColor("#FFEB3B")));
        highlight.add(new HighlightCR(330, 60, Color.parseColor("#F44336")));
        dashboard_View.setStripeHighlightColorAndRange(highlight);
    }

}
