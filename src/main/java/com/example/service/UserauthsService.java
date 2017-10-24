package com.example.service;
import com.example.dao.UserauthsRepository;
import com.example.po.Userauths;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by liuhongchun on 2017/10/24.
 */
@Service
public class UserauthsService {
    @Resource
    private UserauthsRepository userauthsRepository;

    @Transactional
    public Userauths save(Userauths userauths) {
        return userauthsRepository.save(userauths);
    }
    @Transactional
    public List<Userauths> findAll() {
        return (List<Userauths>) userauthsRepository.findAll();
    }
    @Transactional
    public Userauths findAllById(int id) {
        return userauthsRepository.findOne((long) id);
    }
}
