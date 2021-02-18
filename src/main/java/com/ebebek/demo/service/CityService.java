package com.ebebek.demo.service;

import com.ebebek.demo.model.dto.CityDto;
import com.ebebek.demo.model.request.CityRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    public List<String> getAllTurkishCityRegionCombinations(CityRequest req) {
        List<String> combinationList = new ArrayList<>();
        for(CityDto dto : req.getRequestList()) {
            combinationList.addAll(dto.getCounties().stream().map(e -> dto.getName().concat("/").concat(e)).collect(Collectors.toList()));
        }
        return combinationList;
    }

}
