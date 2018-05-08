package com.example.bugra.mapzz.ui.common.RecyclerView;

import android.arch.lifecycle.MutableLiveData;


import com.example.bugra.mapzz.ui.common.BaseViewModel;

import java.util.ArrayList;

public abstract class BaseRecyclerViewModel <Model> extends BaseViewModel {

    public abstract MutableLiveData<ArrayList<Model>> getLiveData();

    public abstract void fetchData();
}
