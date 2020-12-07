package org.stronger.learn_mall.service;

import org.springframework.transaction.annotation.Transactional;
import org.stronger.learn_mall.common.api.CommonResult;
import org.stronger.learn_mall.dto.OrderParam;

/**
 * 前台订单管理Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
