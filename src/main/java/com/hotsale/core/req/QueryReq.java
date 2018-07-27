package com.hotsale.core.req;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

/**
 * Created by  hyhadmin on 2018/7/23.
 */
public class QueryReq {
    private Integer page;
    private Integer pageSize;
    private Map parameter;

    public Integer getPage() {
        return page!=null ? page : 1;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize != null ? pageSize : 10;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonIgnore
    public Integer getStartRow(){
        return (getPage() - 1) * getPageSize();
    }

    public Map getParameter() {
        return parameter;
    }

    public void setParameter(Map parameter) {
        this.parameter = parameter;
    }
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


}
