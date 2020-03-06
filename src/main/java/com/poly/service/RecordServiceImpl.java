package com.poly.service;

import com.poly.model.Depart;
import com.poly.model.Record;
import com.poly.repository.DepartRepository;
import com.poly.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class RecordServiceImpl implements RecordService{
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Iterable<Record> findAll() {
        return  recordRepository.findAll();
    }

    @Override
    public Optional<Record> findById(Long id) {
        return recordRepository.findById(id);
    }

    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }

    @Override
    public void delete(Long id) {
        recordRepository.deleteById(id);
    }
}
