package com.hotsale.base.controller.web;

import com.alibaba.fastjson.JSON;
import com.hotsale.base.entity.User;
import com.hotsale.base.service.UserService;
import com.hotsale.core.controller.CommonController;
import com.hotsale.core.req.QueryReq;
import com.hotsale.core.res.ApiResult;
import com.hotsale.core.res.PageList;
import com.hotsale.core.utils.ValidatorUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.groups.Default;

/**
 * Created by  hyhadmin on 2018/7/26.
 */
@RestController
@RequestMapping("/api/user")
public class UserController extends CommonController {

    @Autowired
    UserService userService;

    @Override
    public ApiResult pageList(String json) {
        try {
            QueryReq queryReq = JSON.parseObject(json, QueryReq.class);
            PageList<User> pageList = userService.pageList(queryReq);
            return  ApiResult.success(pageList);
        } catch (Exception e) {
            return  ApiResult.fail(e.toString());
        }


    }

    @Override
    public ApiResult save(@RequestBody(required = false) String json) {
        try {
            User user = JSON.parseObject(json, User.class);
            String errorMsg = ValidatorUtil.validate(user, User.AddGroup.class, Default.class);
            if (StringUtils.isNotEmpty(errorMsg)) {
                return ApiResult.fail(errorMsg);
            } else {
                return userService.save(user);
            }
        } catch (Exception e) {
            return  ApiResult.fail(e.toString());
        }
    }
}
