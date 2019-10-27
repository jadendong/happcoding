package com.jadendong.happycoding.lambda.cart;

/**
 * Sku 谓词接口
 *
 * @author jaden dong
 */
public interface SkuPredicate {

    /**
     * 不同的判断标准
     * @param sku
     * @return
     */
    boolean test(Sku sku);
}
