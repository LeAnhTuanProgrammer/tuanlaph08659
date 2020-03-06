package com.poly.repository;

import com.poly.model.Record;
import com.poly.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RecordRepository extends PagingAndSortingRepository<Record, Long> {

//    Page<Record> findAll(Pageable pageable);
//
//    Record findOne(Long id);
//
//    Record findByReason(String reason);
//
//    Page<Record> findAllByReasonContains(String reason, Pageable pageable);
//
//    Page<Record> findAllByStaff(Staff staff, Pageable pageable);
//
//    void delete(Long id);
}
