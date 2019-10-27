package com.jadendong.happycoding.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

/**
 * @author jaden dong
 */
public class Version1Test {

    @Test
    public void filterElectronicsSku() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        List<Sku> result = CartService.filterElectronicsSku(cartSkuList);

        System.out.println(JSON.toJSONString(result, true));
    }
}
