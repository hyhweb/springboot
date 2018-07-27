package com.hotsale.core.dao;

import com.hotsale.core.req.QueryReq;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  hyhadmin on 2018/7/24.
 */
public interface BaseDao<T, PK extends Serializable>  {
    /**
     * 增加对象
     *
     * @param obj
     */
    public void add(T obj);

    /**
     * 修改对象
     *
     * @param obj
     */
//    public <V extends T> int update(V obj);

    /**
     * 根据主键删除对象
     *
     * @param pk
     */
//    public int delete(PK pk);

    /**
     * 根据一组主键删除对象
     */
//    public int deleteByIds(List<PK> IDS);

    /**
     * 根据主键得到某个对象
     *
     * @param pk
     */
//    public <V extends T> V get(PK pk);

    /**
     * 根据一组ID获得一组对象
     */
//    public <V extends T> List<V> getByIds(List<PK> ids);

    /**
     * 根据条件查询数据条件
     *
     * @param query
     * @return
     */
    public Long count(QueryReq query);

    /**
     * 根据条件查询数据
     *
     * @param query
     * @return
     */
//    public <V extends T> List<V> queryAll(QueryReq query);

    /**
     * 根据条件查询数据
     *
     * @param query
     * @return
     */
    public <V extends T> List<V> pageList(QueryReq query);
}
