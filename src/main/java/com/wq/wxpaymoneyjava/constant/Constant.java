package com.wq.wxpaymoneyjava.constant;

/**
 * Created by Hyman on 2017/2/27.
 */
public class Constant {

    public static final String  DOMAIN= "http://plm.natapp1.cc";

    public static final String APP_ID = "wx5a3ae82e934304d5";//wx47994589b5bb52b7   wx5a3ae82e934304d5  wx47b0cd146f718687

    public static final String APP_SECRET = "6ab0bd3c732f8f18d6ed6e5a4db91e94";//d6b5d975a54574af8a4fa28d77707d85  6ab0bd3c732f8f18d6ed6e5a4db91e94  a07bbb5eca7309205a7c86ec72cca9b5

    public static final String APP_KEY = "12345678901234567891yuanji200603";//这个是给商户号设置的密钥（自己设置的32位） 12345678901234567891yuanji200603

    public static final String MCH_ID = "1483036802";  //商户号

    public static final String URL_UNIFIED_ORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    //统一下单回调url
    public static final String URL_NOTIFY = Constant.DOMAIN + "/hello";//Constant.DOMAIN + "/hello";
    //退款url
    public static final String REFUND_URL_NOTIFY = Constant.DOMAIN + "/refundCallBack";//Constant.DOMAIN + "/hello";

    public static final String TIME_FORMAT = "yyyyMMddHHmmss";

    public static final int TIME_EXPIRE = 2;  //订单过期时间单位是day


    /*------------------------------ REFUND CHANNEL ----------------------------*/
    /** 原路退款 */
    public static final String REFUND_CHANNEL_ORIGINAL = "ORIGINAL";

    /** 退回到余额 */
    public static final String REFUND_CHANNEL_BALANCE = "BALANCE";
    /** 申请退款 */
    public static final String URL_SECAPI_PAY_REFUND = "https://api.mch.weixin.qq.com/secapi/pay/refund";

}
