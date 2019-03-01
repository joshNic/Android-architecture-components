package com.example.archcomapp.viewModelFactories;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.archcomapp.activities.AddTaskActivity;
import com.example.archcomapp.database.AppDatabase;
import com.example.archcomapp.viewModels.AddTaskViewModel;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final AppDatabase mDb;
    private final int mTaskId;

    public AddTaskViewModelFactory(AppDatabase database, int taskId){
        mDb = database;
        mTaskId = taskId;
    }
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass){
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
