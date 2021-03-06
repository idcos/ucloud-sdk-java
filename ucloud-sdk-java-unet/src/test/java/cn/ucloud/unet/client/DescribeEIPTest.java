package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.DescribeEIPParam;
import cn.ucloud.unet.model.DescribeEIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-25 19:02
 **/
public class DescribeEIPTest {

    private UnetClient client;

    private DescribeEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeEIPParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void describeEIP() {
        try {
            DescribeEIPResult result = client.describeEIP(param);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}