package com.jadendong.happycoding.lambda.cart;

/**
 * 根据sku的总价是否超出2000作为判断标准
 *
 * @author jaden dong
 */
public class SkuTotalPricePredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return sku.getTotalPrice() > 2000;
    }
}
