package com.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private Long id;
    private String todo;
    private String writersName;
    private LocalDateTime writtenDate;

}
