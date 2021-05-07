package com.example.recordcollector.Service;

import com.example.recordcollector.Model.Record;
import com.example.recordcollector.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    RecordRepository recordRepository;

    public Record Create (Record record){
        return recordRepository.create(record);
    }

    public Record read (int id){
        return recordRepository.read(id);
    }

    public List<Record> readAll (){
        return recordRepository.readAll();
    }

    public void update (Record record){
        recordRepository.update(record);
    }

    public void delete(int id){
        recordRepository.delete(id);
    }
}
