
package com.qf.controller;
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
    public static String app_id = "2016101300680270";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCAxRc6JBUwhCYf72W1o8srKp0LtVG4CKtxtl4PlnWh57MpkS0FTOYO5G+NwBfoI/UFH5Ed29AE2rxkXFa3/CQfbPC5Orvh8RVwav+23G3X1vtbfHF7ql870h4qMnrE2gJA7BTLt5Wt2M6ZvibisVrkzkagfM5QSmEu/pc5ThK2r0LdVTB/2trUhqfH9TVOa32wmIivkbV3z67ctKdKb/SkHWZ15jP3Quc8wfh0BlVnyrndueIlD9YB2sGlYZ6ul1QSylHV2iVOLXWuwF0z/vNL6x6t+KIhFl2Q3eAJDYxbRanHunBxvvo8RyvQk7QgHnicZcGrk9027P2ms2EvlStXAgMBAAECggEAJ+73OQyflaAlwpmXTTEyfHyGn27nnM7zfBw2J1ddu4wDP8zJzW7/mXa2MZt0zoT4I1Kayku0wwyih+0q53vGKAi8znSsd3EwWOCV1LufRORipwh8mQFI72BGAogNEqcZM9EC0fpo7LTjvUH/BSZDLdnahUKvKK8oXE6PzzGrFAPsLE0WtICCy9ZYptQYzBOIe/L2qKhUxisgfdt3MjAMduhQXkkg1uH1/DnfJJGsAgQ41gu7RdBLKtilFlOyCCNQ0+AruygF+SI6HKHYf/AkVZEmCI/l9XRrsJgSMs49QXRkrXb9c7SeQmH+E2ZIlZT412S8ILEr/Xud1M7mOHdNYQKBgQDTQnE5QW2bpUtfmw6U4zmENULFrIxSirHMz49ZPAm6y8tNhdkveRtgIKIBDuDHJKekJZ8YH3Rbh4VsPszrniaoAtK0NFO5UZXTjPDNywkEcrfak7tVWACvhyee/bXE2KMbDkJ0V0QIIOAcYEM0A/hUmXk86HbXx0iHPwrsP1xyEwKBgQCcCmyef3tp2uzUBqZxQeBYgxnfe8DYsSlJYEeNd/Z94FJoqZhwxHRz770SKyULa2QLQtq8GLVQHa4Pbjq1osm9DUjJ+ic7jaULf7oINTVc3XbV8Sb/oYDh0dbeGs4hTEztuZLaXNwpZACf0jSjbkFEWmuxfCgY2c5XD5P2e6oqLQKBgQC8JZ1u751tlC3nrNG0uhWccE7SfBTQ4mLtVCGHyJelvCCJH17JD+PYndeKd7SqxzNiVns1YbYgWjbyq4+XfFdTJIiBI2U5U7bLHOfNcDjMtFqXmSCrJmAd85HO4IgFEydYTj/TG3EkiBrwSq8vYSXGOpUmMKa/D+XBRd01gEyV7wKBgBW56dfDvkZF4jW/W0tntbn9Pwv76iUBvdLmoe/TpTFvm2nRO1VwNRqzZary8Ox/HmXnABeyhQRLraGeYnRJ3zcAc4MT3oSPO0y3kwpzhiOQ/mvZcOmk7hIDKpywNMU0H332GblntovYzbFzDjs3LcU7pcUHmXmkUfOTSrHGFDJdAoGAQ4YAAk7BIZGqIbObqd4iP0ylG2wPd9Kps/uIrXCDw92gf/YXRDLbgPeF7AQ+XI3fTz5yZxfBxn66gXEEAh14thj7R3v/gl3MUfi1IIlFLDf//IVbI39coVPouPH9TbH0Joa6VSxIgEhprTPvgLnWvscWJe9h5lTnG8x10PQHoFQ=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA/CrCfDYeVN/wO+F+t/GSSqelDD1HUOJdolapAezZtneEn1dlCcS0e5YlZLcAvE9zmptA+bIIC4EqmYkuWwdmcXZqo145zRDrA25NO8ts3n5UAB1lMZ0aJKkoN+pUZcT8h/ewIHFADa4UXoWJ9l0kqVHaHuxWZmlImn5ixKB14jMroCAWEAUohrj9o+qoDyTE+69YQQlDRL+WrhW+DxEjNfM/b/zdJPwMF+FPTVLyqT31HwJ0qtyBJei+P2mzh9XPLXNcYwGIBx1/hGEDRZVRj5zFB/PkZQ6rU3Za9Z78BUj62R+IeT7jvyO4SlZWahiGFC3Jm+MiugchnHTjlQPf3QIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://z2uew3.natappfree.cc/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://z2uew3.natappfree.cc/return";

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



