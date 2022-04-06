package com.ruoyi.drugs.mapper;

import java.util.List;
import com.ruoyi.drugs.domain.TMedicalDrugsInfo;

/**
 * 药品管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-01-04
 */
public interface TMedicalDrugsInfoMapper 
{
    /**
     * 查询药品管理
     * 
     * @param id 药品管理主键
     * @return 药品管理
     */
    public TMedicalDrugsInfo selectTMedicalDrugsInfoById(String id);

    /**
     * 查询药品管理列表
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 药品管理集合
     */
    public List<TMedicalDrugsInfo> selectTMedicalDrugsInfoList(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 新增药品管理
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 结果
     */
    public int insertTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 修改药品管理
     * 
     * @param tMedicalDrugsInfo 药品管理
     * @return 结果
     */
    public int updateTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 删除药品管理
     * 
     * @param id 药品管理主键
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoById(String id);

    /**
     * 批量删除药品管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoByIds(String[] ids);
}
