package com.example.controller;

import com.example.config.ApiResult;
import com.example.po.Userauths;
import com.example.po.Users;
import com.example.service.UserauthsService;
import com.example.service.UsersService;
import com.example.service.impl.UserauthsServiceImpl;
import com.example.service.impl.UsersServiceImpl;
import com.example.util.UuidUtil;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by liuhongchun on 2017/10/24.
 */
@RestController
@Controller
@RequestMapping("/users")
public class UserController {
    @Resource
    private UsersService usersService;
    @Resource
    private UserauthsService userauthsService;

    /** http://127.0.0.1:8080/users/createUser*/
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true)
    @RequestMapping(value="/createUser", method=RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok",response=ApiResult.class),
            @ApiResponse(code = 400, message = "Parameter error"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")})
    public ApiResult createUser() {
        Users users = new Users();
        users.setNickname("张三疯");
        users.setAvatar("http://pic22.nipic.com/20120714/5885276_120417457189_2.jpg");
        users.setAge(28);
        users.setEmail("627751877@qq.com");
        users.setMobile("18616814695");
        users.setSex(1);
        users.setStatus(0);
        users.setInsettime(new Date());
        users.setUpdatetime(new Date());
        usersService.save(users);
        if (users.getId()!=0){
            Userauths userauths = new Userauths();
            userauths.setUser_id(users.getId());
            userauths.setToken(UuidUtil.getUUID());
            userauths.setPassworld("1231231212");
            userauths.setIdentity_type("手机");
            userauths.setVerified("0");
            userauths.setIdentifier("");
            userauths.setInserttime(new Date());
            userauths.setUpdatetime(new Date());
            userauthsService.save(userauths);
        }
        ApiResult result = new ApiResult();
        result.setCode(ApiResult.SUCCESS);
        result.setMessage("success");
        return result;
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/deleteUser/{id}", method=RequestMethod.DELETE)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Ok",response=ApiResult.class),
            @ApiResponse(code = 400, message = "Parameter error"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")})
    public ApiResult deleteUser(@PathVariable Long id) {
        ApiResult result = new ApiResult();
        result.setCode(ApiResult.SUCCESS);
        result.setMessage("success");
        return result;
    }
}
