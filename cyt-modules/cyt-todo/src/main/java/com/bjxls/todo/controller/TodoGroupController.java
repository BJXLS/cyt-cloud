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
import com.bjxls.todo.domain.TodoGroup;
import com.bjxls.todo.service.ITodoGroupService;
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
public class TodoGroupController extends BaseController
{
    @Autowired
    private ITodoGroupService todoGroupService;

    /**
     * 查询todo列表列表
     */
    @RequiresPermissions("todo:todo:list")
    @GetMapping("/list")
    public TableDataInfo list(TodoGroup todoGroup)
    {
        startPage();
        List<TodoGroup> list = todoGroupService.selectTodoGroupList(todoGroup);
        return getDataTable(list);
    }

    /**
     * 导出todo列表列表
     */
    @RequiresPermissions("todo:todo:export")
    @Log(title = "todo列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TodoGroup todoGroup)
    {
        List<TodoGroup> list = todoGroupService.selectTodoGroupList(todoGroup);
        ExcelUtil<TodoGroup> util = new ExcelUtil<TodoGroup>(TodoGroup.class);
        util.exportExcel(response, list, "todo列表数据");
    }

    /**
     * 获取todo列表详细信息
     */
    @RequiresPermissions("todo:todo:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(todoGroupService.selectTodoGroupById(id));
    }

    /**
     * 新增todo列表
     */
    @RequiresPermissions("todo:todo:add")
    @Log(title = "todo列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TodoGroup todoGroup)
    {
        return toAjax(todoGroupService.insertTodoGroup(todoGroup));
    }

    /**
     * 修改todo列表
     */
    @RequiresPermissions("todo:todo:edit")
    @Log(title = "todo列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TodoGroup todoGroup)
    {
        return toAjax(todoGroupService.updateTodoGroup(todoGroup));
    }

    /**
     * 删除todo列表
     */
    @RequiresPermissions("todo:todo:remove")
    @Log(title = "todo列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(todoGroupService.deleteTodoGroupByIds(ids));
    }
}
