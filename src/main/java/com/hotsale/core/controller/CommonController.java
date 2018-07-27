package com.hotsale.core.controller;


import com.hotsale.core.entity.BaseEntity;
import com.hotsale.core.res.ApiResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 通用控制器
 * Created by Administrator on 2017/4/26.
 */
@RestController
public abstract class CommonController<T extends BaseEntity> extends BaseController {

   /* @ApiOperation(value="查看", notes="查看")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET )
    public abstract ApiResult get(@PathVariable Long id) ;

//
//    @ApiOperation(value="所有列表", notes="列表")
//    @RequestMapping(value = "/list", method = RequestMethod.POST)
//    public  abstract  ApiResult list(@RequestBody String json);
*/

    @ApiOperation(value="分页列表", notes="分页列表")
    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public  abstract ApiResult pageList(@RequestBody String json);

    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public abstract  ApiResult save(@RequestBody String json) ;

   /* @ApiOperation(value="更新", notes="更新")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public abstract  ApiResult update(@RequestBody String json) ;*/


  /*  @ApiOperation(value="删除多个", notes="删除多个")
    @RequestMapping(value = "/delByIds", method = RequestMethod.POST)
    public abstract ApiResult delByIds(@RequestBody String json);*/

    protected void setPaging(Map<String,Object> parameters){
        Integer page = (Integer)parameters.get("page");
        Integer pageSize = (Integer)parameters.get("pageSize");
        if(page==null) page=1;
        if (pageSize==null) pageSize= 20;
        parameters.put("startRow", (page-1) * pageSize);
    }

}
