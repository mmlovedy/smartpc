package com.smartpc.gathering.core.service.impl;

import com.smartpc.gathering.core.dao.ItemMapper;
import com.smartpc.gathering.core.po.ItemPo;
import com.smartpc.gathering.core.service.ItemsService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ItemServiceImpl
 * @Package com.smartpc.gathering.core.service.impl
 * @Description:
 * @date 2017/5/11 下午10:42
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemMapper itemMapper;

    public List<ItemPo> queryAll() {
        return itemMapper.queryItemsAll();
    }

    public List<ItemPo> queryWithPage(int start, int limit) {
        return itemMapper.queryItemsWithPage(new RowBounds(start,limit));
    }

    public ItemPo queryById(Integer id) {
        return itemMapper.queryItemsById(id);
    }
}
