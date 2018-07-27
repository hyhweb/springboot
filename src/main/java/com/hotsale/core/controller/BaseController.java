package com.hotsale.core.controller;

import com.alibaba.fastjson.JSON;
import com.hotsale.core.req.QueryReq;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/11.
 */

@RestController
public class BaseController {

  //  protected final Logger logger = Logger.getLogger(getClass());

    @Autowired







    public static String encodeDownloadFilename(String filename, String agent) throws IOException {
        if(agent.contains("Firefox")){ // 火狐浏览器
            filename = "=?UTF-8?B?"+ Base64.encodeBase64String(filename.getBytes("utf-8"))+"?=";
        }else{ // IE及其他浏览器
            filename = URLEncoder.encode(filename,"utf-8");
        }
        return filename;
    }

   /* public void doExport(HttpServletRequest request, HttpServletResponse response, ExportService export, String fileName) {
        try {
            if(StringUtils.isBlank(fileName)){
                fileName = export.getDefaultFileName();
            }
            String ua = request.getHeader("UserDao-Agent");
            String excelName =  encodeDownloadFilename(fileName+export.getSuffixName(),ua);
            response.setContentType("text/html");
            response.setHeader("Content-Disposition", "attachment;filename=" + excelName);
            response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
            response.setHeader("Content-Encoding", "UTF-8");
            Long s = System.currentTimeMillis();
            export.write(response.getOutputStream());
            Long e = System.currentTimeMillis();
            logger.info("导出时间---"+(e-s));
        } catch (Exception e) {
            logger.debug("导出文件失败::"+e);
        }
    }*/


    public QueryReq buildQueryReq(String json){
        QueryReq queryReq = JSON.parseObject(json, QueryReq.class);
        removeBlank(queryReq);
        if(queryReq==null){
            queryReq = new QueryReq();
        }
        Map<String,Object> map =queryReq.getParameter();
        if(map==null)
            queryReq.setParameter(new HashMap<>());
      /*  UserRes currentUser = LoginUserContext.getCurrentUser();
        if(currentUser!=null && !currentUser.getIsAdmin()){
            queryReq.getParameter().put("applyCompanyId",currentUser.getCompanyId());
            queryReq.getParameter().put("companyType",currentUser.getCompanyType());
        }*/
        return queryReq;
    }

    //去除查询条件为空字符串的属性
    protected void removeBlank(QueryReq queryReq){
        if(queryReq != null){
            Map<String,Object> map =(Map)queryReq.getParameter();
            if(map!=null && !map.isEmpty()){
                Iterator<String> iterator = map.keySet().iterator();
                while (iterator.hasNext()){
                    String key = iterator.next();
                    Object v = map.get(key);
                    if(v!=null && v instanceof String){
                        if(StringUtils.isBlank((String)v)){
                            iterator.remove();
                        }
                    }

                }
            }
        }
    }
}
