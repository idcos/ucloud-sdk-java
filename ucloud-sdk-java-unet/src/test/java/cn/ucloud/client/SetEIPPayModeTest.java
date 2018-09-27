package cn.ucloud.client;

import cn.ucloud.model.SetEIPPayModeParam;
import cn.ucloud.model.SetEIPPayModeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 14:31
 **/
public class SetEIPPayModeTest {


    private UnetClient client;

    private SetEIPPayModeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new SetEIPPayModeParam("cn-bj2","eip-44ayct","Traffic",2);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void setEIPPayMode() {
        try {
            SetEIPPayModeResult setEIPPayModeResult = client.setEIPPayMode(param);
            System.out.println(setEIPPayModeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}