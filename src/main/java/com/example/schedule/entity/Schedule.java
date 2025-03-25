package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

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

}
