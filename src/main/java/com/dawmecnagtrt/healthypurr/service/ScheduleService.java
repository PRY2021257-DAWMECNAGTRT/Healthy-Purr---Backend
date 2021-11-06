package com.dawmecnagtrt.healthypurr.service;

import com.dawmecnagtrt.healthypurr.dto.Schedule.CreateScheduleDto;
import com.dawmecnagtrt.healthypurr.dto.Schedule.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> getAll();
    ScheduleDto getSchedule(Integer id);
    ScheduleDto createSchedule(CreateScheduleDto dto) throws Exception;
}
