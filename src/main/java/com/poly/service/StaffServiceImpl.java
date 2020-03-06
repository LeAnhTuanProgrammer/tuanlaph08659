package com.poly.service;


import com.poly.model.Staff;
import com.poly.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Iterable<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Optional<Staff> findById(Long id) {
        return staffRepository.findById(id);
    }

    @Override
    public Staff findByName(String name) {
        return staffRepository.findByName(name);
    }

    @Override
    public void save(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void delete(Long id) {
        staffRepository.deleteById(id);
    }
}

