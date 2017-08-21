package com.why.project.statusbarcolor;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*==========Android 状态栏着色=============*/
		addStatusBarView();
	}

}
