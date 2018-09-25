package com.chainbox.io.mock.controller;

import com.chainbox.io.mock.entities.Record;
import com.chainbox.io.mock.services.Records;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
public class records {

    private final Records recordService;

    public records(Records recordService) {
        this.recordService = recordService;
    }

    @GetMapping
    public Record addRecord(@RequestBody Record record){
        return recordService.addRecord(record);
    }

    @PostMapping
    public Page fetchRecords(Pageable pageable){
        return recordService.fetchAll(pageable);
    }
}
