package com.codartch.lista_de_tarefas.data.repository

import Task
import TaskDao
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class TaskRepository(private val taskDao: TaskDao) {

    val allTasks: LiveData<List<Task>> = taskDao.getAllTasks()

    @WorkerThread
    suspend fun insert(task: Task) {
        taskDao.insert(task)
    }

    @WorkerThread
    suspend fun update(task: Task) {
        taskDao.update(task)
    }

    @WorkerThread
    suspend fun delete(task: Task) {
        taskDao.delete(task)
    }
}