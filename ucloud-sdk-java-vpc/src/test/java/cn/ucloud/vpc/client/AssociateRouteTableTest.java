package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.AssociateRouteTableParam;
import cn.ucloud.vpc.model.AssociateRouteTableResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:22
 **/
public class AssociateRouteTableTest {


    private VPCClient client;

    private AssociateRouteTableParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AssociateRouteTableParam("cn-bj2","subnet-5c232h","routetable-pxtsmf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void associateRouteTable() {
        try {
            AssociateRouteTableResult associateRouteTableResult = client.associateRouteTable(param);
            System.out.println(associateRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}