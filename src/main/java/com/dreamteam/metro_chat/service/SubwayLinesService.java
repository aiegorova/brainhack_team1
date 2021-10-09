package com.dreamteam.metro_chat.service;

import com.dreamteam.metro_chat.models.SubwayLine;
import com.dreamteam.metro_chat.repository.SubwayLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubwayLinesService {

    @Autowired
    private final SubwayLinesRepository subwayLinesRepository;

    public SubwayLinesService(SubwayLinesRepository subwayLinesRepository){
        this.subwayLinesRepository = subwayLinesRepository;
    }

    public List<SubwayLine> findAll(){
        return subwayLinesRepository.findAll();
    }

}
