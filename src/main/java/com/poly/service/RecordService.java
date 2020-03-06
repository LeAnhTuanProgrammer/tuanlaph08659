package com.poly.service;

import com.poly.model.Record;
import com.poly.model.Staff;

import java.util.Optional;

public interface RecordService {
    Iterable<Record> findAll();

    Optional<Record> findById(Long id);

    void save(Record record);

    void delete(Long id);
}
