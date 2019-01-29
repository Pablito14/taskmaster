package com.example.taskmaster.Models;

import android.support.annotation.NonNull;
import java.util.ArrayList;

//@Entity
public class Project {

    /**Instance variables*/
//    @NonNull
//    @PrimaryKey(autoGenerate = true)
    private long projectId;
    private String name;
    private String description;
//    private ArrayList<Task> Tasks;

    /**Constructors*/
    public Project(){}
    public Project (String name, String description){
        this.name = name;
        this.description = description;
    }

    /**Getters*/
    public long getProjectId(){return projectId;}
    public String getName(){return name;}
    public String getDescription(){return description;}

    /**Setters*/
    public void setProjectId(@NonNull long projectId) {
        this.projectId = projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
