package com.jadendong.happycoding.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

/**
 * @author jaden dong
 */
public class Version6Test {

    @Test
    public void filterSku() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品总价大于2000的商品
        List<Sku> result = CartService.filterSku(
                cartSkuList, sku -> sku.getTotalPrice() > 2000);

        System.out.println(JSON.toJSONString(
                result, true));
    }

}
