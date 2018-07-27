package com.hotsale.core.utils;

public class Constants {

	public Constants() {
	}

	/** 默认的Spring上下文*/
	public static final String DEFAULT_SPRING_CONTEXT = "applicationContext";

	/** 默认的树结构实体根节点*/
	public static final int DEFAULT_ROOT = -1;

	/** 默认的用户密码*/
	public static final String DEFAULT_PASSWORD = "zhkj123";

	/** 默认的每页记录数 */
	public static final int DEFAULT_PAGESIZE = 10;

	/** 数据有效标识 */
	public static final int VALID = 0;

	/** 数据无效标识 */
	public static final int INVALID = 1;
	
	/****数据不可见****/
	public static final int INVISIBLE = 1;
	
	/**数据可见**/
	public static final int VISIBLE = 0;
	
	/**成功**/
	public static final int SUCCESS = 0;
	
	/**失败**/
	public static final int FAIL = 1;

	/** 日期模式 */
	public static final String DATE_PATTERN_DASH_YEAR_MONTH_DAY = "yyyy-MM-dd";

	/** 日期模式 */
	public static final String DATE_PATTERN_DASH_YEAR_MONTH_DAY_HOUR_MIN_SEC = "yyyy-MM-dd HH:mm:ss";
	
	/** utf8 编码**/
	public static final String ENCODE_UTF8 = "utf-8";
	
	
	/**中台菜单根**/
	public static final int MG_MENU_ROOT = -20;
	
	/**中台会员菜单根**/
	public static final int MEMBER_MENU_ROOT = -21;
	
	/**中台商铺菜单根**/
	public static final int STORE_MENU_ROOT = -22;
	
	/**后台菜单**/
	public static final int BACK_MENU_ROOT = -10;
	
	
	/**会员角色编码***/
	public static final String MEMBER_ROLE_CODE = "MEMBER_ROLE";
	
	/**商铺角色编码***/
	public static final String STORE_ROLE_CODE = "STORE_ROLE";
	
	/**市场管理员角色编码***/
	public static final String MARKET_ROLE_CODE = "MARKET_ROLE";
	
	/**分享链接RSA 加密 公钥***/ 
	public static final String SHARK_PUBLICK_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd/VvjltVug+94TPt3AtqAl/DEMVTbN7jrRVClX6ZmyECAxhb5pw3Nweb5UccBGtDfuticpaAApHrFDiNPGpyI7ThIFoh6ue9gNu0bv7HVJC+NtZBp4cdWBU998J0wlTZHOqOYSWQgw9sHx+ISbMhLkNQz2lmOf0r2RjjFDYDiDwIDAQAB";
	
	/**分享链接RSA 加密 私钥***/ 		 
	public static final String SHARK_PRIVATE_KEY= "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ39W+OW1W6D73hM+3cC2oCX8MQxVNs3uOtFUKVfpmbIQIDGFvmnDc3B5vlRxwEa0N+62JyloACkesUOI08anIjtOEgWiHq572A27Ru/sdUkL421kGnhx1YFT33wnTCVNkc6o5hJZCDD2wfH4hJsyEuQ1DPaWY5/SvZGOMUNgOIPAgMBAAECgYANfrzAnfuxKvfjkL/SFJ5RaakZORWEfCgBgLQ4zAjMssI/vavsu0ZEkxGFrmSPRZkd4znpd4RJScNq3aBKe31vWmIPsKh0ZuYBoKMs0QQ3iwWxbuIzYl0CI69Y2xhG3R26g6Ej7slWok0cp3Z5xoqTYTgMNFNTlZMcyiUMPegEwQJBAND7O5BbwzNiEi1Hp0s8sQI+00VHXvtlzxHl6Q6nhtWob43Oo6CKKc/FfnwsVSq2NfosQzZBwKa8vO0pa4wAZDECQQDBiSQt/9o4Dz9IcYenK9roK/lt1SYhLC6otkr2NlP8Qdrn1xRO+nW8NoKXwQYbLv1cVHZXGqS9Fdgol8rIX1o/AkBG1cF8zv29PvK2UmFMSUgeYLkv9F8ni3zCrlFu3C4B4dPeFzqzQeGmQWT8JfLARX7KS5KEo4jve232XWHM1J0hAkEAgsnsMk3iKdpb+NgIRXgEorv8/zV5ZBeYnJk8xXDnhuT2S5D0/36RDBWGYYmnV72EqN3Hb4vo4oOdpakW+BxAPwJAMnTXykk7kbE5f5W9Hrp3bkUhVT+113Ve1VL8rT1jqw0vCGJsokK4Mxweaan1MXs9mco+0VuXtHZTnBY7fo326g==";

}
