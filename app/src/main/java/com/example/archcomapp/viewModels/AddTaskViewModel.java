package com.example.archcomapp.viewModels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.archcomapp.database.AppDatabase;
import com.example.archcomapp.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;


    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }
    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
