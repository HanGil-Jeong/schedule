package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private Long id;
    private String password;
    private String todo;
    private String writersName;
    private LocalDateTime writtenDate;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.password = schedule.getPassword();
        this.todo = schedule.getTodo();
        this.writersName = schedule.getWritersName();
        this.writtenDate = schedule.getWrittenDate();
    }

}


