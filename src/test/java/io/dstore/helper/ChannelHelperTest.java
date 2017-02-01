package io.dstore.helper;

import io.grpc.internal.ManagedChannelImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by bdolkemeier on 01.02.17.
 */
public class ChannelHelperTest {

    @Test
    public void testGetSslChannelWithHostName() throws Exception {
        ManagedChannelImpl channel = ChannelHelper.getSslChannel("localhost",50051);
        Assert.assertEquals(channel.authority(),"localhost:50051");
    }

    @Test
    public void testGetSslChannelWithIp() throws Exception {
        ManagedChannelImpl channel = ChannelHelper.getSslChannel("127.0.0.1",50051);
        Assert.assertEquals(channel.authority(),"127.0.0.1:50051");
    }
}

