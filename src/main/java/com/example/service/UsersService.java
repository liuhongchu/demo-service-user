package com.example.service;
import com.example.dao.UsersRepository;
import com.example.po.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by liuhongchun on 2017/10/24.
 */
@Service
public class UsersService {
    @Resource
    private UsersRepository usersRepository;

    @Transactional
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Transactional
    public List<Users> findAll() {
        return (List<Users>) usersRepository.findAll();
    }

    @Transactional
    public Users findAllById(int id) {
        return usersRepository.findOne((long) id);
    }
}
