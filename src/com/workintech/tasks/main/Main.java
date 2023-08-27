package com.workintech.tasks.main;

import com.workintech.tasks.model.Priority;
import com.workintech.tasks.model.Status;
import com.workintech.tasks.model.Task;
import com.workintech.tasks.model.TaskData;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Trial","Write List","Ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("Trial2","Write List2","Bob", Priority.MED, Status.ASSIGNED);
        Task task3 = new Task("Trial3","Write List3","Carol", Priority.HIGH, Status.IN_PROGRESS);

        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);

        Set<Task> bobsTask = new LinkedHashSet<>();
        bobsTask.add(task2);

        Set<Task> carolsTask = new LinkedHashSet<>();
        carolsTask.add(task3);

        TaskData taskData = new TaskData(annsTask,bobsTask,carolsTask);
        List<Set<Task>> tasks = new ArrayList<>();
        tasks.add(annsTask);
        tasks.add(bobsTask);
        tasks.add(carolsTask);
        System.out.println(taskData.getUnion(tasks));

        taskData.getTasks("all");

    }


}