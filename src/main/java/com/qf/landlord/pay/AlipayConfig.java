package com.qf.landlord.pay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016100100641830";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC1pg0BE76Za+pU6VBCsrBToDeLtYD5yuLov5IHanPedKPmykZQOgIYRGI6J8sSEmZ7F/n+qF/Kv9x3ZDefl6rHkQh+wt1H3ItoOubvLV80+bQVhOCxf+nZtsdyOqJD5plqXPdAIjL7Uns4Vm3TyPS2CsjsgPOZswffWtpeXcK9xLgOsC/d39djpzKqe+7DCl7ThES5iV6T6tsahOMnTIR81vBjsr0GqVwjvl/Im9x6N1LNwFtbgcd1o6jTecC8OQFZHva1kSy3GmYTibaw0MPtudQ9TDN1EFjGn9IdqOOMfL5JVGVbYJyNnbBj1XjurZTmOgCNYcjLBmm6EYQ05kaJAgMBAAECggEAC6higUUxIEuKuHRY0E8Dffp0ViUJ5/4bXfCdgJhWY1p9AlzM8m0moUQSQcU4BSrlJNU/GBbaPvrdPVRTNYzYSwKF1wzOgsQmtkPBemwhBhdYdWEXwoyBB5XxauVUcKMmCWt5+sW3G+YJPm5dkg/9lIlQp80G1UBmKvF7vj6qNt+DZ90lUIyWL7pPPaieNClnm4w5pV6rYwPpHh81Vl8mPMfCf6EzTEz3CoeioWrtpaQIM3RPNtIC2ikxdw48uSUrVxzqDQP49KmOB8FoN8vSNX3GeQscDxFtMEPGdtNDu7uJNFPAYIpa+v3NDlynYwrSXBaEHyhFfpBWjvPxFZDCAQKBgQDn5kY4swhHwMMysF4+omMh9MysLgKJUKCEUBh9DAtSV5vCDa/cZKMKc/2FMyXsgfzLmh1fXK+3NwUn+Mf2V6iQOxVGkjf+muMDGVV5ipg4dnbEvfmQqTwqmZdLt7G0at2AqQpxX3MtKLlhrsF0FVK4hFshda2aRRueRF3cw1/oKQKBgQDIhtfwP0x/6fOFwtvXCLI1JJnSJfvkYG1Eh3OdJ4UVqilUmLzyjsZzUKPu2Uqoep81jTMSsLdsoLtBLIQIg15hhMNg5UOisJNAU3eOwemKiKuhKMwtjv6mGX9pY8p5kecBQYYqvsYlLZQVe+HhkMpnGaGBn4gTU4fhiUUexQq3YQKBgQCx/47m9oTkjpFF1xp/+SUea0iu4KIRxFFxPgmN8jC+g4CK8vaJtLVw0JdIJnp1j1D69tCU4g/+Eb1jcRILhD1ed/tcr99LDpgxSMDTCg7NSCDh4vAsmboU+M+oztcYJO7gUuAxJZLClv+0eu8Cq1tTRkSs6ibWwzTvxopFabG0AQKBgFQeXM9nfkvadFGUYGxgNYGdjPle/b/bw3qP56vxPB7OdvAJ8pk903nkRiCX/n2WktsAFICuqQNkmajJZ8m6cgkujFdFVY4VzG+bk/fK2JFIq9a7KouiBKjg4VXwiqtczS71sbaUuMI30HsCsMrS1lVRpzKdHZQd4k52KwyxU8GBAoGBAM5zWAsI9zyehGfLWYji2fF6besFGr1SyMQeUPWDvdEkfKriU94fvUnvmKRsVnmJK5RPGOvkG4BdNUoVes0q9sv8MX0enBtJhuHT5iKi5A0lIusfnBSsumtf5vZv0Ybg6U4BNCtyn/6USzFmaI4ozHBRh3af9F0hInnlLzOFt1qb";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5bSrBPRj4q7bncT/bFYHGyV6LcIvT8NGwvR/6dZX5WctJ6hsMlSCtcpck1vgXfWixMSmEK0yGq/8yfXwIl44mYy3+l4I0sDg5XBajlHWs74o6B+hCyjyTH8VmhCvvU3SH68NRB5rPD225dPwrs/p9WG1bPwqD0h2w+yK0FgP7xzAuyox5aJj2wuKcPbNQ0dCCE8ITo021OLrKCttjMRz5wHA4eFYLqmeeJT7iWM30eCCJsW7d25Nnu4ZxyZH/ITcDnyhdpz1z/+mC9zKK7sX7i8yHoIparz3lpfdK+QgWv90AZTv9MKJlNUM5M1j1ZEFDGoUDN6GcTsOUI0em8jTnQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/payResult/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

