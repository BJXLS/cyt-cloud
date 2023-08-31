package com.bjxls.todo.service.impl;

import java.util.List;
import com.bjxls.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bjxls.todo.mapper.TodoGroupMapper;
import com.bjxls.todo.domain.TodoGroup;
import com.bjxls.todo.service.ITodoGroupService;

/**
 * todo列表Service业务层处理
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
@Service
public class TodoGroupServiceImpl implements ITodoGroupService 
{
    @Autowired
    private TodoGroupMapper todoGroupMapper;

    /**
     * 查询todo列表
     * 
     * @param id todo列表主键
     * @return todo列表
     */
    @Override
    public TodoGroup selectTodoGroupById(Long id)
    {
        return todoGroupMapper.selectTodoGroupById(id);
    }

    /**
     * 查询todo列表列表
     * 
     * @param todoGroup todo列表
     * @return todo列表
     */
    @Override
    public List<TodoGroup> selectTodoGroupList(TodoGroup todoGroup)
    {
        return todoGroupMapper.selectTodoGroupList(todoGroup);
    }

    /**
     * 新增todo列表
     * 
     * @param todoGroup todo列表
     * @return 结果
     */
    @Override
    public int insertTodoGroup(TodoGroup todoGroup)
    {
        todoGroup.setCreateTime(DateUtils.getNowDate());
        return todoGroupMapper.insertTodoGroup(todoGroup);
    }

    /**
     * 修改todo列表
     * 
     * @param todoGroup todo列表
     * @return 结果
     */
    @Override
    public int updateTodoGroup(TodoGroup todoGroup)
    {
        todoGroup.setUpdateTime(DateUtils.getNowDate());
        return todoGroupMapper.updateTodoGroup(todoGroup);
    }

    /**
     * 批量删除todo列表
     * 
     * @param ids 需要删除的todo列表主键
     * @return 结果
     */
    @Override
    public int deleteTodoGroupByIds(Long[] ids)
    {
        return todoGroupMapper.deleteTodoGroupByIds(ids);
    }

    /**
     * 删除todo列表信息
     * 
     * @param id todo列表主键
     * @return 结果
     */
    @Override
    public int deleteTodoGroupById(Long id)
    {
        return todoGroupMapper.deleteTodoGroupById(id);
    }
}
