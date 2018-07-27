package com.hotsale.core.res;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class PageList<T> {

    private List<T> data;

    private Long count;

    public PageList() {
    }

    public PageList(List<T> rows, Long total) {
        this.data = rows;
        this.count = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PageList{" +
                "data=" + data +
                ", count=" + count +
                '}';
    }
}
