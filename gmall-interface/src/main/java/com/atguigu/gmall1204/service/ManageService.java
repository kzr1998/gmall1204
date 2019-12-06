package com.atguigu.gmall1204.service;

import com.atguigu.gmall1204.bean.BaseAttrInfo;
import com.atguigu.gmall1204.bean.BaseCatalog1;
import com.atguigu.gmall1204.bean.BaseCatalog2;
import com.atguigu.gmall1204.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
     List<BaseCatalog1>getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);
}
