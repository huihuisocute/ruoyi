package com.ruoyi.drugs.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.drugs.domain.TMedicalDrugsInfo;
import com.ruoyi.drugs.service.ITMedicalDrugsInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品管理Controller
 * 
 * @author ruoyi
 * @date 2022-01-04
 */
@RestController
@RequestMapping("/drugs/info")
public class TMedicalDrugsInfoController extends BaseController
{
    @Autowired
    private ITMedicalDrugsInfoService tMedicalDrugsInfoService;

    /**
     * 查询药品管理列表
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        startPage();
        List<TMedicalDrugsInfo> list = tMedicalDrugsInfoService.selectTMedicalDrugsInfoList(tMedicalDrugsInfo);
        return getDataTable(list);
    }

    /**
     * 导出药品管理列表
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:export')")
    @Log(title = "药品管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        List<TMedicalDrugsInfo> list = tMedicalDrugsInfoService.selectTMedicalDrugsInfoList(tMedicalDrugsInfo);
        ExcelUtil<TMedicalDrugsInfo> util = new ExcelUtil<TMedicalDrugsInfo>(TMedicalDrugsInfo.class);
        return util.exportExcel(list, "药品管理数据");
    }

    /**
     * 获取药品管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(tMedicalDrugsInfoService.selectTMedicalDrugsInfoById(id));
    }

    /**
     * 新增药品管理
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:add')")
    @Log(title = "药品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        return toAjax(tMedicalDrugsInfoService.insertTMedicalDrugsInfo(tMedicalDrugsInfo));
    }

    /**
     * 修改药品管理
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:edit')")
    @Log(title = "药品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalDrugsInfo tMedicalDrugsInfo)
    {
        return toAjax(tMedicalDrugsInfoService.updateTMedicalDrugsInfo(tMedicalDrugsInfo));
    }

    /**
     * 删除药品管理
     */
    @PreAuthorize("@ss.hasPermi('drugs:info:remove')")
    @Log(title = "药品管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalDrugsInfoService.deleteTMedicalDrugsInfoByIds(ids));
    }
}
