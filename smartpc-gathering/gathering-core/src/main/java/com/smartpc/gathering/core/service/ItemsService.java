package com.smartpc.gathering.core.service;

import com.smartpc.gathering.core.po.ItemPo;

import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: ItemsService
 * @Package com.smartpc.gathering.core.service
 * @Description: 自定义 items 的相关操作
 * @date 2017/5/11 下午10:39
 */
public interface ItemsService {

    public List<ItemPo> queryAll();

    public List<ItemPo> queryWithPage(int start,int limit);

    public ItemPo queryById(Integer id);
}
