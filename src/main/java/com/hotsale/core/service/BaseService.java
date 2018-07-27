package com.hotsale.core.service;

import com.hotsale.core.entity.BaseEntity;
import com.hotsale.core.req.QueryReq;
import com.hotsale.core.res.ApiResult;
import com.hotsale.core.res.PageList;

import java.io.Serializable;

/**
 * Created by  hyhadmin on 2018/7/24.
 */
public interface BaseService<T extends BaseEntity, ID extends Serializable> {
    String generateUID();

    /**
     * 根据查询条件，查询并返回实体的列表
     * @param queryReq 查询条件
     * @return
     */
  //  public ApiResult list(QueryReq queryReq);

    /**
     * 根据查询条件，分页查询并返回实体的分页结果
     * @param BaseReq 查询条件
     * @return
     */
    public <V extends T> PageList<V> pageList(QueryReq BaseReq);

    /**
     * 根据主键，查询并返回一个实体对象
     * @param id 主键id
     * @return
     */
  //  public ApiResult get(ID id);

    /**
     * 根据主键数组，查询并返回一组实体对象
     * @param ids 主键数组，数组中的主键值应当无重复值，如有重复值时，则返回的列表长度可能小于传入的数组长度
     * @return
     */
//    public ApiResult getByIds(List<ID> ids);

    /**
     * 根据主键数组，删除数组特定的{classInfo.firstUpperName}记录
     * @param ids 主键数组，数组中的主键值应当无重复值，如有重复值时，则返回的列表长度可能小于传入的数组长度
     * @return
     */
//    public ApiResult delByIds(List<ID> ids);

    /**
     * 根据主键，删除特定的实体记录
     * @param id 主键id
     * @return
     */
//    public ApiResult del(ID id);

    /**
     * 新增一条实体记录，执行成功后传入对象及返回对象的主键属性值不为null
     * @param entity 新增的实体数据（如果无特殊需求，新增对象的主键值请保留为null）
     * @return
     */
    public ApiResult save(T entity);

    /**
     * 根据主键，更新一条实体记录
     * @param entity 更新的实体数据，且其主键不能为空
     * @return
     */
//    public ApiResult update(T entity);
}
