package com.hotsale.core.res;


import com.hotsale.core.constant.Global;
import com.hotsale.core.entity.CreateUpdateEntity;
import org.apache.commons.lang3.time.DateFormatUtils;

public class CreateUpdateEntityRes extends CreateUpdateEntity {

    public String getCreateTimeText(){
        return getCreateTime()!=null ? DateFormatUtils.format(getCreateTime(), Global.DATE_TIME_PATTERN) : "";
    }

//    public String getUpdateTimeText(){
//        return getUpdateTime()!=null ? DateFormatUtils.format(getUpdateTime(), Global.DATE_TIME_PATTERN) : "";
//    }


}
