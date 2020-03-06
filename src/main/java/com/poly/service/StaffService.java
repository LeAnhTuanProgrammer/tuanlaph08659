package com.poly.service;

import com.poly.model.Staff;

import java.util.Optional;

public interface StaffService {
    Iterable<Staff> findAll();

    Optional<Staff> findById(Long id);
    Staff findByName(String name);
    void save(Staff staff);

    void delete(Long id);

    //  Iterable<Staffs> findAllByDepart(Depart depart);
}
