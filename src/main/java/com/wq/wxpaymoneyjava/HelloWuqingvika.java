package com.wq.wxpaymoneyjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWuqingvika {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,wq!,统一支付，回调成功";
    }


    @RequestMapping("/refundCallBack")
    public String refundCallBack(){
        return "refundCallBack!,申请退款，回调成功";
    }






//
//    /**
//     * 微信小程序支付成功回调函数  网上详细回调例子
//     * @param request
//     * @param response
//     * @throws Exception
//     */
//    @RequestMapping(value = "/weixin/callback")
//    public void wxNotify(HttpServletRequest request,HttpServletResponse response) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream)request.getInputStream()));
//        String line = null;
//        StringBuilder sb = new StringBuilder();
//        while((line = br.readLine()) != null){
//            sb.append(line);
//        }
//        br.close();
//        //sb为微信返回的xml
//        String notityXml = sb.toString();
//        String resXml = "";
//        System.out.println("接收到的报文：" + notityXml);
//
//        Map map = PayUtil.doXMLParse(notityXml);
//
//        String returnCode = (String) map.get("return_code");
//        if("SUCCESS".equals(returnCode)){
//            //验证签名是否正确
//            Map<String, String> validParams = PayUtil.paraFilter(map);  //回调验签时需要去除sign和空值参数
//            String validStr = PayUtil.createLinkString(validParams);//把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串
//            String sign = PayUtil.sign(validStr, Configure.getKey(), "utf-8").toUpperCase();//拼装生成服务器端验证的签名
//            // 因为微信回调会有八次之多,所以当第一次回调成功了,那么我们就不再执行逻辑了
//
//            //根据微信官网的介绍，此处不仅对回调的参数进行验签，还需要对返回的金额与系统订单的金额进行比对等
//            if(sign.equals(map.get("sign"))){
//                /**此处添加自己的业务逻辑代码start**/
//                // bla bla bla....
//                /**此处添加自己的业务逻辑代码end**/
//                //通知微信服务器已经支付成功
//                resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
//                        + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
//            } else {
//                System.out.println("微信支付回调失败!签名不一致");
//            }
//        }else{
//            resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
//                    + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
//        }
//        System.out.println(resXml);
//        System.out.println("微信支付回调数据结束");
//
//        BufferedOutputStream out = new BufferedOutputStream(
//                response.getOutputStream());
//        out.write(resXml.getBytes());
//        out.flush();
//        out.close();
//    }


}
