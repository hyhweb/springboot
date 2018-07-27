package com.hotsale.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hotsale.entity.User;
/**
*  @author author
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    int update(User.UpdateBuilder object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}