package com.example.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by htl on 2017/9/20.
 */

public class User extends BaseObservable{

	private static final String TAG = "ViewModel";

	private String name = "fdsf";
//	public ObservableField<String> name = new ObservableField<>();

	private OnSearchListener mOnSearchListener;
	public User(OnSearchListener onSearchListener) {
		mOnSearchListener = onSearchListener;
	}

	@Bindable
	public String getName() {
		return name;
	}

	public void setName(String nsame) {
		this.name = nsame;
		notifyPropertyChanged(BR.name);
	}

	public void  getResult(String name){

//		this.name.set(name);
//		String s = this.name.get();

		this.name = name;

		if(name.equals(name)){
			mOnSearchListener.onSuccess(name);
		}else{
			mOnSearchListener.onError();
		}
	}
}
