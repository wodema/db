package com.caffeineshawn.db_backend.mapper;

import com.caffeineshawn.db_backend.entity.Order;
import com.caffeineshawn.db_backend.entity.QueryInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface OrderMapper {

    int addOrder(Order order);

    List<HashMap> findAllOrder(QueryInfo queryInfo);

    List<Order> findOrders();

    int findAllOrderCount(QueryInfo queryInfo);

    int deleteOrderById(int order_id);

    int findGoodIdByOrderId(int order_id);

    int addOrderGood(int order_id, int good_id);

    Order findOrderById(int order_id);
}
