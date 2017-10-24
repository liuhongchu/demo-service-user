package com.example.dao;

import com.example.po.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by liuhongchun on 2017/10/24.
 */
public interface UsersRepository extends CrudRepository<Users, Long> {
}
