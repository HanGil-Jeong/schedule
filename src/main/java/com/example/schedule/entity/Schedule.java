package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

    @Setter
    private Long id;
    private String todo;
    private String password;
    private String writersName;
    private LocalDateTime writtenDate;


    public Schedule(String todo, String password, String writersName, LocalDateTime writtenDate){

        this.todo = todo;
        this.password = password;
        this.writersName = writersName;
        this.writtenDate = writtenDate;
    }

    public void update(String todo, String writersName, LocalDateTime writtenDate){
        this.todo = todo;
        this.writersName = writersName;
        this.writtenDate = writtenDate;
    }

}
