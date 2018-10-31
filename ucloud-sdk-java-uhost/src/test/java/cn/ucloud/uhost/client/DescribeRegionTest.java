package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.GetRegionParam;
import cn.ucloud.uhost.model.GetRegionResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.Base64;

/**
 * @description:
 * @author: zhuww
 * @date: 2018-10-26 17:44
 **/
public class DescribeRegionTest {

    private UhostClient client;

    private GetRegionParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetRegionParam();
    }

    @Test
    public void describeRegion() {
        try {
            GetRegionResult describeRegionResult = client.getRegion(param);
            System.out.println(describeRegionResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPassword(){
        System.out.println(new String(Base64.getDecoder().decode("tEm6Y/N7FctPTEQAD2CeNrcaSEHXYNg8Hihs7PEaua66Ri+EHRHXxQ==")));
    }
}