package com.poly.repository;

import com.poly.model.Depart;
import com.poly.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Long> {
//    Page<Staff> findAll(Pageable pageable);

    Staff findByName(String name);
}