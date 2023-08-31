package com.bjxls.todo.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bjxls.common.log.annotation.Log;
import com.bjxls.common.log.enums.BusinessType;
import com.bjxls.common.security.annotation.RequiresPermissions;
import com.bjxls.todo.domain.TodoInfo;
import com.bjxls.todo.service.ITodoInfoService;
import com.bjxls.common.core.web.controller.BaseController;
import com.bjxls.common.core.web.domain.AjaxResult;
import com.bjxls.common.core.utils.poi.ExcelUtil;
import com.bjxls.common.core.web.page.TableDataInfo;

/**
 * todo列表Controller
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
@RestController
@RequestMapping("/todo")
public class TodoInfoController extends BaseController
{
    @Autowired
    private ITodoInfoService todoInfoService;

    /**
     * 查询todo列表列表
     */
    @RequiresPermissions("todo:todo:list")
    @GetMapping("/list")
    public TableDataInfo list(TodoInfo todoInfo)
    {
        startPage();
        List<TodoInfo> list = todoInfoService.selectTodoInfoList(todoInfo);
        return getDataTable(list);
    }

    /**
     * 导出todo列表列表
     */
    @RequiresPermissions("todo:todo:export")
    @Log(title = "todo列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TodoInfo todoInfo)
    {
        List<TodoInfo> list = todoInfoService.selectTodoInfoList(todoInfo);
        ExcelUtil<TodoInfo> util = new ExcelUtil<TodoInfo>(TodoInfo.class);
        util.exportExcel(response, list, "todo列表数据");
    }

    /**
     * 获取todo列表详细信息
     */
    @RequiresPermissions("todo:todo:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(todoInfoService.selectTodoInfoById(id));
    }

    /**
     * 新增todo列表
     */
    @RequiresPermissions("todo:todo:add")
    @Log(title = "todo列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TodoInfo todoInfo)
    {
        return toAjax(todoInfoService.insertTodoInfo(todoInfo));
    }

    /**
     * 修改todo列表
     */
    @RequiresPermissions("todo:todo:edit")
    @Log(title = "todo列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TodoInfo todoInfo)
    {
        return toAjax(todoInfoService.updateTodoInfo(todoInfo));
    }

    /**
     * 删除todo列表
     */
    @RequiresPermissions("todo:todo:remove")
    @Log(title = "todo列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(todoInfoService.deleteTodoInfoByIds(ids));
    }
}
