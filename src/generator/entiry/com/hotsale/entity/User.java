package com.hotsale.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1532072314293L;


    /**
    * 主键
    * 用户ID
    * isNullAble:0
    */
    private Long userId;

    /**
    * 用户名
    * isNullAble:1
    */
    private String userName;

    /**
    * 
    * isNullAble:0
    */
    private String userPassword;

    /**
    * 
    * isNullAble:1
    */
    private String headerUrl;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer merchant;

    /**
    * 创建时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;


    public void setUserId(Long userId){this.userId = userId;}

    public Long getUserId(){return this.userId;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setUserPassword(String userPassword){this.userPassword = userPassword;}

    public String getUserPassword(){return this.userPassword;}

    public void setHeaderUrl(String headerUrl){this.headerUrl = headerUrl;}

    public String getHeaderUrl(){return this.headerUrl;}

    public void setMerchant(Integer merchant){this.merchant = merchant;}

    public Integer getMerchant(){return this.merchant;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                "userName='" + userName + '\'' +
                "userPassword='" + userPassword + '\'' +
                "headerUrl='" + headerUrl + '\'' +
                "merchant='" + merchant + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> userIdList;

        public List<Long> getUserIdList(){return this.userIdList;}

        private Long userIdSt;

        private Long userIdEd;

        public Long getUserIdSt(){return this.userIdSt;}

        public Long getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> userPasswordList;

        public List<String> getUserPasswordList(){return this.userPasswordList;}


        private List<String> fuzzyUserPassword;

        public List<String> getFuzzyUserPassword(){return this.fuzzyUserPassword;}

        private List<String> rightFuzzyUserPassword;

        public List<String> getRightFuzzyUserPassword(){return this.rightFuzzyUserPassword;}
        private List<String> headerUrlList;

        public List<String> getHeaderUrlList(){return this.headerUrlList;}


        private List<String> fuzzyHeaderUrl;

        public List<String> getFuzzyHeaderUrl(){return this.fuzzyHeaderUrl;}

        private List<String> rightFuzzyHeaderUrl;

        public List<String> getRightFuzzyHeaderUrl(){return this.rightFuzzyHeaderUrl;}
        private List<Integer> merchantList;

        public List<Integer> getMerchantList(){return this.merchantList;}

        private Integer merchantSt;

        private Integer merchantEd;

        public Integer getMerchantSt(){return this.merchantSt;}

        public Integer getMerchantEd(){return this.merchantEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder userIdBetWeen(Long userIdSt,Long userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Long userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Long userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Long userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Long ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<Long> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyUserPassword (List<String> fuzzyUserPassword){
            this.fuzzyUserPassword = fuzzyUserPassword;
            return this;
        }

        public QueryBuilder fuzzyUserPassword (String ... fuzzyUserPassword){
            this.fuzzyUserPassword = solveNullList(fuzzyUserPassword);
            return this;
        }

        public QueryBuilder rightFuzzyUserPassword (List<String> rightFuzzyUserPassword){
            this.rightFuzzyUserPassword = rightFuzzyUserPassword;
            return this;
        }

        public QueryBuilder rightFuzzyUserPassword (String ... rightFuzzyUserPassword){
            this.rightFuzzyUserPassword = solveNullList(rightFuzzyUserPassword);
            return this;
        }

        public QueryBuilder userPassword(String userPassword){
            setUserPassword(userPassword);
            return this;
        }

        public QueryBuilder userPasswordList(String ... userPassword){
            this.userPasswordList = solveNullList(userPassword);
            return this;
        }

        public QueryBuilder userPasswordList(List<String> userPassword){
            this.userPasswordList = userPassword;
            return this;
        }

        public QueryBuilder fetchUserPassword(){
            setFetchFields("fetchFields","userPassword");
            return this;
        }

        public QueryBuilder excludeUserPassword(){
            setFetchFields("excludeFields","userPassword");
            return this;
        }

        public QueryBuilder fuzzyHeaderUrl (List<String> fuzzyHeaderUrl){
            this.fuzzyHeaderUrl = fuzzyHeaderUrl;
            return this;
        }

        public QueryBuilder fuzzyHeaderUrl (String ... fuzzyHeaderUrl){
            this.fuzzyHeaderUrl = solveNullList(fuzzyHeaderUrl);
            return this;
        }

        public QueryBuilder rightFuzzyHeaderUrl (List<String> rightFuzzyHeaderUrl){
            this.rightFuzzyHeaderUrl = rightFuzzyHeaderUrl;
            return this;
        }

        public QueryBuilder rightFuzzyHeaderUrl (String ... rightFuzzyHeaderUrl){
            this.rightFuzzyHeaderUrl = solveNullList(rightFuzzyHeaderUrl);
            return this;
        }

        public QueryBuilder headerUrl(String headerUrl){
            setHeaderUrl(headerUrl);
            return this;
        }

        public QueryBuilder headerUrlList(String ... headerUrl){
            this.headerUrlList = solveNullList(headerUrl);
            return this;
        }

        public QueryBuilder headerUrlList(List<String> headerUrl){
            this.headerUrlList = headerUrl;
            return this;
        }

        public QueryBuilder fetchHeaderUrl(){
            setFetchFields("fetchFields","headerUrl");
            return this;
        }

        public QueryBuilder excludeHeaderUrl(){
            setFetchFields("excludeFields","headerUrl");
            return this;
        }

        public QueryBuilder merchantBetWeen(Integer merchantSt,Integer merchantEd){
            this.merchantSt = merchantSt;
            this.merchantEd = merchantEd;
            return this;
        }

        public QueryBuilder merchantGreaterEqThan(Integer merchantSt){
            this.merchantSt = merchantSt;
            return this;
        }
        public QueryBuilder merchantLessEqThan(Integer merchantEd){
            this.merchantEd = merchantEd;
            return this;
        }


        public QueryBuilder merchant(Integer merchant){
            setMerchant(merchant);
            return this;
        }

        public QueryBuilder merchantList(Integer ... merchant){
            this.merchantList = solveNullList(merchant);
            return this;
        }

        public QueryBuilder merchantList(List<Integer> merchant){
            this.merchantList = merchant;
            return this;
        }

        public QueryBuilder fetchMerchant(){
            setFetchFields("fetchFields","merchant");
            return this;
        }

        public QueryBuilder excludeMerchant(){
            setFetchFields("excludeFields","merchant");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> userIdList;

        public List<Long> getUserIdList(){return this.userIdList;}

        private Long userIdSt;

        private Long userIdEd;

        public Long getUserIdSt(){return this.userIdSt;}

        public Long getUserIdEd(){return this.userIdEd;}

        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> userPasswordList;

        public List<String> getUserPasswordList(){return this.userPasswordList;}


        private List<String> fuzzyUserPassword;

        public List<String> getFuzzyUserPassword(){return this.fuzzyUserPassword;}

        private List<String> rightFuzzyUserPassword;

        public List<String> getRightFuzzyUserPassword(){return this.rightFuzzyUserPassword;}
        private List<String> headerUrlList;

        public List<String> getHeaderUrlList(){return this.headerUrlList;}


        private List<String> fuzzyHeaderUrl;

        public List<String> getFuzzyHeaderUrl(){return this.fuzzyHeaderUrl;}

        private List<String> rightFuzzyHeaderUrl;

        public List<String> getRightFuzzyHeaderUrl(){return this.rightFuzzyHeaderUrl;}
        private List<Integer> merchantList;

        public List<Integer> getMerchantList(){return this.merchantList;}

        private Integer merchantSt;

        private Integer merchantEd;

        public Integer getMerchantSt(){return this.merchantSt;}

        public Integer getMerchantEd(){return this.merchantEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


        public ConditionBuilder userIdBetWeen(Long userIdSt,Long userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public ConditionBuilder userIdGreaterEqThan(Long userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public ConditionBuilder userIdLessEqThan(Long userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public ConditionBuilder userIdList(Long ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<Long> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyUserPassword (List<String> fuzzyUserPassword){
            this.fuzzyUserPassword = fuzzyUserPassword;
            return this;
        }

        public ConditionBuilder fuzzyUserPassword (String ... fuzzyUserPassword){
            this.fuzzyUserPassword = solveNullList(fuzzyUserPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyUserPassword (List<String> rightFuzzyUserPassword){
            this.rightFuzzyUserPassword = rightFuzzyUserPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyUserPassword (String ... rightFuzzyUserPassword){
            this.rightFuzzyUserPassword = solveNullList(rightFuzzyUserPassword);
            return this;
        }

        public ConditionBuilder userPasswordList(String ... userPassword){
            this.userPasswordList = solveNullList(userPassword);
            return this;
        }

        public ConditionBuilder userPasswordList(List<String> userPassword){
            this.userPasswordList = userPassword;
            return this;
        }

        public ConditionBuilder fuzzyHeaderUrl (List<String> fuzzyHeaderUrl){
            this.fuzzyHeaderUrl = fuzzyHeaderUrl;
            return this;
        }

        public ConditionBuilder fuzzyHeaderUrl (String ... fuzzyHeaderUrl){
            this.fuzzyHeaderUrl = solveNullList(fuzzyHeaderUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyHeaderUrl (List<String> rightFuzzyHeaderUrl){
            this.rightFuzzyHeaderUrl = rightFuzzyHeaderUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyHeaderUrl (String ... rightFuzzyHeaderUrl){
            this.rightFuzzyHeaderUrl = solveNullList(rightFuzzyHeaderUrl);
            return this;
        }

        public ConditionBuilder headerUrlList(String ... headerUrl){
            this.headerUrlList = solveNullList(headerUrl);
            return this;
        }

        public ConditionBuilder headerUrlList(List<String> headerUrl){
            this.headerUrlList = headerUrl;
            return this;
        }

        public ConditionBuilder merchantBetWeen(Integer merchantSt,Integer merchantEd){
            this.merchantSt = merchantSt;
            this.merchantEd = merchantEd;
            return this;
        }

        public ConditionBuilder merchantGreaterEqThan(Integer merchantSt){
            this.merchantSt = merchantSt;
            return this;
        }
        public ConditionBuilder merchantLessEqThan(Integer merchantEd){
            this.merchantEd = merchantEd;
            return this;
        }


        public ConditionBuilder merchantList(Integer ... merchant){
            this.merchantList = solveNullList(merchant);
            return this;
        }

        public ConditionBuilder merchantList(List<Integer> merchant){
            this.merchantList = merchant;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder userId(Long userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder userPassword(String userPassword){
            this.obj.setUserPassword(userPassword);
            return this;
        }
        public Builder headerUrl(String headerUrl){
            this.obj.setHeaderUrl(headerUrl);
            return this;
        }
        public Builder merchant(Integer merchant){
            this.obj.setMerchant(merchant);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public User build(){return obj;}
    }

}
