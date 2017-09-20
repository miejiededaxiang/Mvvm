package com.example.mvvm;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.example.mvvm.databinding.ActivityMainBinding;

/**
 * Created by htl on 2017/9/20.
 */

public class ViewModel implements OnSearchListener{

	private static final String TAG = "ViewModel";
	private ActivityMainBinding mActivityMainBinding;
	private User mUser;

	public ViewModel(ActivityMainBinding activityMainBinding) {
		mActivityMainBinding = activityMainBinding;
		mUser = new User(this);
		mActivityMainBinding.setModel(mUser);
	}

	/**
	 * 在 XML 中Button 的点击方法
	 * @param view
	 */
	public void onClick(View view) {
		Log.d(TAG, "onSearch: ");
		String name = mActivityMainBinding.exName.getText().toString();
		if(!TextUtils.isEmpty(name)){
			mUser.getResult(name);
		}
	}

	@Override
	public void onSuccess(String name) {

//		mUser.name.set(name);
		mUser.setName(name);
//		mActivityMainBinding.tvResult.setText(mUser.getName());
	}

	@Override
	public void onError() {
//		mUser.name.set("失败");
		mUser.setName("失败");
//		mActivityMainBinding.tvResult.setText("失败");

	}
}
