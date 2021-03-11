package com.srinath.department.service.services;

import com.srinath.department.service.entities.Department;
import com.srinath.department.service.repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Calling repository to save department : {}", department);
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Calling repository to find departmentId : {}", departmentId);
        return departmentRepository.findDepartmentById(departmentId);
    }

}