package com.why.project.statusbarcolor;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by HaiyuKing
 * Used activity基类
 */

public class BaseActivity extends AppCompatActivity{

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/*==========Android 状态栏着色=============*/
	public void addStatusBarView() {
		int height;
		height = getStatusBarHeight(this);
		if (height <= 0) {
			return;
		}
		View view = new View(this);
		view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height);
		ViewGroup decorView = (ViewGroup) findViewById(android.R.id.content);
		decorView.addView(view, params);
	}

	/**
	 * 获取状态栏的高度
	 * 19API以上 读取到状态栏高度才有意义
	 */
	public int getStatusBarHeight(Context context) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
			return resourceId > 0 ? context.getResources().getDimensionPixelSize(resourceId) : 0;
		} else {
			return 0;
		}
	}
}
