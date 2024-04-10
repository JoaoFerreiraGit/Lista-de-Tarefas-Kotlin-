package com.codartch.lista_de_tarefas.ui.viewmodel

import Task
import androidx.lifecycle.*
import com.codartch.lista_de_tarefas.data.repository.TaskRepository
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(private val repository: TaskRepository) : ViewModel() {

    val allTasks: LiveData<List<Task>> = repository.allTasks.asLiveData()

    fun insert(task: Task) = viewModelScope.launch {
        repository.insert(task)
    }

    fun update(task: Task) = viewModelScope.launch {
        repository.update(task)
    }

    fun delete(task: Task) = viewModelScope.launch {
        repository.delete(task)
    }
}
