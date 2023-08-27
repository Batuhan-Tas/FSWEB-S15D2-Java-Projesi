package com.workintech.tasks.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> bobsTasks;

    public TaskData(Set<Task> annsTasks,Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.carolsTasks = carolsTasks;
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getTasks(String name){
        if(name.equals("ann")) {
            return annsTasks;
        }else if(name.equals("carol")){
            return carolsTasks;
        }else if(name.equals("bob")) {
            return bobsTasks;
        } else if(name.equals("all")){
            Set<Task> totals = new HashSet<>();
            totals.addAll(annsTasks);
            totals.addAll(carolsTasks);
            totals.addAll(bobsTasks);
            return totals;
        } else{
            return null;
        }



    }

    public Set<Task> getUnion (List<Set<Task>> taskList){
        Set<Task> totals = new HashSet<>();
        for(Set<Task> task : taskList){
            totals.addAll(task);
        }
        return totals;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;

    }

    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> difference = new HashSet<>(first);
        difference.removeAll(second);
        return difference;
    }



}

