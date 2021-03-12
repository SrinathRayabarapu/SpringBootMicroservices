package com.srinath.user.user.service.services;

import com.srinath.user.user.service.entities.User;
import com.srinath.user.user.service.repositories.UserRepository;
import com.srinath.user.user.service.vos.Department;
import com.srinath.user.user.service.vos.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Calling repository to save user : {}", user);
        return userRepository.save(user);
    }

    public ResponseTemplateVO findUserByIdWithDepartment(Long userId) {

        ResponseTemplateVO vo = new ResponseTemplateVO();

        log.info("Fetching User by id : {}", userId);

        User user = userRepository.findUserById(userId);
        vo.setUser(user);

        log.info("Fetching Department by id : {}", user.getDepartmentId());
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);

        vo.setDepartment(department);
        return vo;
    }

}
