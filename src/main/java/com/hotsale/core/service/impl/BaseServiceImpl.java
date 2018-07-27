package com.hotsale.core.service.impl;

import com.hotsale.core.dao.BaseDao;
import com.hotsale.core.entity.BaseEntity;
import com.hotsale.core.req.QueryReq;
import com.hotsale.core.res.ApiResult;
import com.hotsale.core.res.PageList;
import com.hotsale.core.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by  hyhadmin on 2018/7/24.
 */
@Transactional(readOnly = true)
@Lazy
public abstract class BaseServiceImpl<T extends BaseEntity, ID extends Serializable> implements BaseService<T,ID> {
    protected static Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    private BaseDao<T,ID> baseDao;

   /* protected boolean isAdmin(){
        return  LoginUserContext.getCurrentUser().getIsAdmin();
    }

    protected Long getFilterCompanyId(){
        UserRes currentUser = LoginUserContext.getCurrentUser();
        logger.info("currentUser:"+currentUser);
        if(currentUser!=null && !currentUser.getIsAdmin() && currentUser.getCompanyType()!=null && CompanyType.PLATFORM.ordinal() != currentUser.getCompanyType()){
            return currentUser.getCompanyId();
        }
        return null;
    }

    protected String getSalt(){
        return generateUID().substring(0,16);
    }*/

    public String generateUID() {
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

/*    public static Map<String, Object> toMap(Object obj) {
        return BeanUtil.beanTtoMap(obj);
    }*/

    /**
     * 根据查询条件，查询并返回t的列表
     * @param queryReq 查询条件
     * @return
     */
//    @Override
//    public ApiResult list(QueryReq queryReq) {
//        //直接调用Dao方法进行查询
//        List<T> list = baseDao.queryAll(queryReq);
//        return  ApiResult.success(list==null ? new ArrayList<T>() : list);
//
//    }

    /**
     * 根据查询条件，分页查询并返回t的分页结果
     * @param query 查询条件
     * @return
     */
    @Override
    public <V extends T> PageList<V> pageList(QueryReq query) {
        //调用dao查询满足条件的分页数据
        List<V> list = baseDao.pageList(query);
        //调用dao统计满足条件的记录总数
        Long rowCount = baseDao.count(query);
        return  new PageList<V>(list,rowCount);
    }

    /**
     * 根据主键，查询并返回一个t对象
     * @param id 主键id
     * @return
     */
//    public ApiResult get(ID id) {
//        //调用dao，根据主键查询
//        return ApiResult.success(baseDao.get(id));
//    }

    /**
     * 根据主键数组，查询并返回一组t对象
     * @param ids 主键数组，数组中的主键值应当无重复值，如有重复值时，则返回的列表长度可能小于传入的数组长度
     * @return
     */
//    public ApiResult getByIds(List<ID>  ids) {
//        return ApiResult.success(baseDao.getByIds(ids));
//    }

    /**
     * 根据主键数组，删除数组特定的t记录
     * @param ids 主键数组，数组中的主键值应当无重复值，如有重复值时，则返回的列表长度可能小于传入的数组长度
     * @return
     */
  //  @Transactional(readOnly = false)
//    public ApiResult delByIds(List<ID> ids) {
//
//        //调用Dao执行删除，并判断删除语句执行结果
//        final int count = baseDao.deleteByIds(ids);
//        if (count <= 0) {
//            return ApiResult.fail("删除失败");
//        }
//        return ApiResult.success(count);
//
//    }

    /**
     * 根据主键，删除特定的t记录
     * @param id 主键id
     * @return
     */
//    @Override
//    @Transactional(readOnly = false)
//    public ApiResult del(ID id) {
//        //调用Dao执行删除，并判断删除语句执行结果
//        final int count = baseDao.delete(id);
//        if (count <= 0) {
//            return ApiResult.fail("删除失败");
//        }
//        return ApiResult.success(count);
//
//    }

    /**
     * 新增一条t记录，执行成功后传入对象及返回对象的主键属性值不为null
     * @param t 新增的t数据（如果无特殊需求，新增对象的主键值请保留为null）
     * @return
     */
    @Transactional(readOnly = false)
    public ApiResult save(T t) {

        if(t==null)
            return ApiResult.fail("数据不能为空");
        //fillCreatorInfo(t);
        //调用Dao执行插入操作
        baseDao.add(t);
        return ApiResult.success();


    }


    /**
     * 根据主键，更新一条t记录
     * @param t 更新的t数据，且其主键不能为空
     * @return
     */
//    @Transactional(readOnly = false)
//    public ApiResult update(T t) {
//        if(t==null)
//            return ApiResult.fail("数据不能为空");
//      //  fillUpdaterInfo(t);
//        //调用Dao执行更新操作，并判断更新语句执行结果
//        int count = baseDao.update(t);
//        return ApiResult.success(t);
//    }

    /**
     * 填充创建者信息
     * @param o
     */
  /*  protected static void fillCreatorInfo(Object o){
        if( o instanceof CreateUpdateEntity){
            CreateUpdateEntity entity = (CreateUpdateEntity)o;
            UserRes currentUser = LoginUserContext.getCurrentUser();
            if(currentUser!=null){
                entity.setCreaterId(currentUser.getUserId());
                entity.setCreaterName(currentUser.getLoginName());
                entity.setUpdaterId(currentUser.getUserId());
                entity.setUpdaterName(currentUser.getLoginName());
            }
            Date date = new Date();
            entity.setCreateTime(date);
            entity.setUpdateTime(date);
        }
    }

    protected  void fillUpdaterInfo(Object o){
        if( o instanceof CreateUpdateEntity){
            CreateUpdateEntity entity = (CreateUpdateEntity)o;
            UserRes currentUser = LoginUserContext.getCurrentUser();
            if(currentUser !=null){
                entity.setUpdaterId(currentUser.getUserId());
                entity.setUpdaterName(currentUser.getLoginName());
            }
            Date date = new Date();
            entity.setUpdateTime(date);
        }
    }*/
}
