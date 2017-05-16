package com.smartpc.gathering.core.dao;

import com.smartpc.gathering.core.po.ItemPo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ItemMapper {

    int insert(ItemPo record);

    ItemPo queryItemsById(int itemid);

    List<ItemPo> queryItemsWithPage(RowBounds rowBounds);

    List<ItemPo> queryItemsAll();
}