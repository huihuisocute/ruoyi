package com.ruoyi.drugs.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.drugs.mapper.TMedicalDrugsInfoMapper;
import com.ruoyi.drugs.domain.TMedicalDrugsInfo;
import com.ruoyi.drugs.service.ITMedicalDrugsInfoService;

/**
 * 药品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-04
 */
@Service
public class TMedicalDrugsInfoServiceImpl implements ITMedicalDrugsInfoService 
{
    @Autowired
    private TMedicalDrugsInfoMapper tMedicalDrugsInfoMapper;

    /**
     * 查询药品管理
     * 
     * @param id 药品管理主键
     * @return 药品管理
     */
    @Override
    public TMedicalDrugsInfo selectTMedicalDrugsInfoById(String id)
    {
        return tMedicalDrugsInfoMapper.selectTMedicalDrugsInfoById(id);
    }

    /**
     * 查询药品管理列表
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 药品管理
     */
    @Override
    public List<TMedicalDrugsInfo> selectTMedicalDrugsInfoList(TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        return tMedicalDrugsInfoMapper.selectTMedicalDrugsInfoList(tMedicalDrugsInfo);
    }

    /**
     * 新增药品管理
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 结果
     */
    @Override
    public int insertTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        tMedicalDrugsInfo.setId(UUID.randomUUID().toString());
        return tMedicalDrugsInfoMapper.insertTMedicalDrugsInfo(tMedicalDrugsInfo);
    }

    /**
     * 修改药品管理
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 结果
     */
    @Override
    public int updateTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        return tMedicalDrugsInfoMapper.updateTMedicalDrugsInfo(tMedicalDrugsInfo);
    }

    /**
     * 批量删除药品管理
     * 
     * @param ids 需要删除的药品管理主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsInfoByIds(String[] ids)
    {
        return tMedicalDrugsInfoMapper.deleteTMedicalDrugsInfoByIds(ids);
    }

    /**
     * 删除药品管理信息
     * 
     * @param id 药品管理主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsInfoById(String id)
    {
        return tMedicalDrugsInfoMapper.deleteTMedicalDrugsInfoById(id);
    }
}
