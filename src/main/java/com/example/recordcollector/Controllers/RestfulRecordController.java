package com.example.recordcollector.Controllers;

import com.example.recordcollector.Model.Record;
import com.example.recordcollector.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestfulRecordController {

    @Autowired
    RecordService recordService;

    @GetMapping("/record")
    public Record record(@RequestParam(value = "id", defaultValue = "1") int id){
        return recordService.read(id);
    }

    @GetMapping("/records")
    public List<Record> records(){
        return recordService.readAll();
    }
}
