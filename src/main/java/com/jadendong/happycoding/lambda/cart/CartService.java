package com.jadendong.happycoding.lambda.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务类
 *
 * @author jaden dong
 */
public class CartService {

    /**
     * 加入购物车中的商品信息
     */
    private static List<Sku> cartSkuList = new ArrayList<Sku>() {
        {
            add(new Sku(654032, "无人机",
                    4999.00, 1,
                    4999.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(642934, "VR一体机",
                    2299.00, 1,
                    2299.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(645321, "纯色衬衫",
                    409.00, 3,
                    1227.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(654327, "牛仔裤",
                    528.00, 1,
                    528.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(675489, "跑步机",
                    2699.00, 1,
                    2699.00, SkuCategoryEnum.SPORTS));

            add(new Sku(644564, "Java编程思想",
                    79.80, 1,
                    79.80, SkuCategoryEnum.BOOKS));

            add(new Sku(678678, "Java核心技术",
                    149.00, 1,
                    149.00, SkuCategoryEnum.BOOKS));

            add(new Sku(697894, "算法",
                    78.20, 1,
                    78.20, SkuCategoryEnum.BOOKS));

            add(new Sku(696968, "TensorFlow进阶指南",
                    85.10, 1,
                    85.10, SkuCategoryEnum.BOOKS));
        }
    };

    /**
     * 获取商品信息列表
     *
     * @return
     */
    public static List<Sku> getCartSkuList() {
        return cartSkuList;
    }

    /**
     * version 1.0
     * 找出购物车中所有的电子产品
     *
     * @param cartSkuList
     * @return
     */
    public static List<Sku> filterElectronicsSku(List<Sku> cartSkuList) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (SkuCategoryEnum.ELECTRONICS.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据传入的商品类型参数，找出购物车中同种类型的商品列表
     *
     * @param cartSkuList
     * @param category
     * @return
     */
    public static List<Sku> filterSkuByCategory(List<Sku> cartSkuList, SkuCategoryEnum category) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (category.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据商品类型或总价来过滤商品
     *
     * @param cartSkuList
     * @param category
     * @param totalPrice
     * @param categoryOrPrice - true: 根据商品类型, false: 根据总价
     * @return
     */
    public static List<Sku> filterSku(List<Sku> cartSkuList, SkuCategoryEnum category,
                                      Double totalPrice, Boolean categoryOrPrice) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            // 如果根据商品类型判断，sku类型与输入类型比较
            // 如果根据商品总价判断，sku总价与输入总价比较
            if ((categoryOrPrice && category.equals(sku.getSkuCategory()) ||
                    (!categoryOrPrice && sku.getTotalPrice() > totalPrice))) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据不同的sku判断标准过滤
     *
     * @param cartSkuList
     * @param skuPredicate 不同的判断标准策略
     * @return
     */
    public static List<Sku> filterSku(List<Sku> cartSkuList, SkuPredicate skuPredicate) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (skuPredicate.test(sku)) {
                result.add(sku);
            }
        }
        return result;
    }
}
