package com.example.schedule.repository;

import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository {

    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    @Override
    public Schedule saveSchedule(Schedule schedule) {

        Long scheduleId = scheduleList.isEmpty() ? 1 : Collections.max(scheduleList.keySet()) + 1;
        schedule.setId(scheduleId);

        scheduleList.put(scheduleId, schedule);

        return schedule;
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedules() {


        List<ScheduleResponseDto> AllSchedules = new ArrayList<>();

        for (Schedule schedule : scheduleList.values()) {
            ScheduleResponseDto responseDto = new ScheduleResponseDto(schedule);
            AllSchedules.add(responseDto);
        }

        return AllSchedules;
    }

    @Override
    public Schedule findScheduleById(Long id) {
        return scheduleList.get(id);
    }

    @Override
    public void deleteSchedule(Long id) {

        scheduleList.remove(id);

    }


}
