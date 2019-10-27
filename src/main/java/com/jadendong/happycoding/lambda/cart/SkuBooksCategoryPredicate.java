package com.jadendong.happycoding.lambda.cart;

/**
 * 对 sku 的商品类型为图书类的判断标准
 *
 * @author jaden dong
 */
public class SkuBooksCategoryPredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}
