package com.mars.marspromotion.service.impl;

import com.mars.marspromotion.service.testService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class testServiceImpl implements testService {

    @Override
    public Map<String, Object> getTestData() {
        Map<String, Object> testData = new HashMap<>();

        testData.put("data1 Key", "data1 Value");
        testData.put("data2 Key", "data2 Value");
        testData.put("data3 Key", "data3 Value");
        testData.put("data4 Key", "data4 Value");

        return testData;
    }

}
