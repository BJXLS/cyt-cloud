package com.bjxls.todo.service.impl;

import java.util.List;
import com.bjxls.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bjxls.todo.mapper.TodoInfoMapper;
import com.bjxls.todo.domain.TodoInfo;
import com.bjxls.todo.service.ITodoInfoService;

/**
 * todo列表Service业务层处理
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
@Service
public class TodoInfoServiceImpl implements ITodoInfoService 
{
    @Autowired
    private TodoInfoMapper todoInfoMapper;

    /**
     * 查询todo列表
     * 
     * @param id todo列表主键
     * @return todo列表
     */
    @Override
    public TodoInfo selectTodoInfoById(Long id)
    {
        return todoInfoMapper.selectTodoInfoById(id);
    }

    /**
     * 查询todo列表列表
     * 
     * @param todoInfo todo列表
     * @return todo列表
     */
    @Override
    public List<TodoInfo> selectTodoInfoList(TodoInfo todoInfo)
    {
        return todoInfoMapper.selectTodoInfoList(todoInfo);
    }

    /**
     * 新增todo列表
     * 
     * @param todoInfo todo列表
     * @return 结果
     */
    @Override
    public int insertTodoInfo(TodoInfo todoInfo)
    {
        todoInfo.setCreateTime(DateUtils.getNowDate());
        return todoInfoMapper.insertTodoInfo(todoInfo);
    }

    /**
     * 修改todo列表
     * 
     * @param todoInfo todo列表
     * @return 结果
     */
    @Override
    public int updateTodoInfo(TodoInfo todoInfo)
    {
        todoInfo.setUpdateTime(DateUtils.getNowDate());
        return todoInfoMapper.updateTodoInfo(todoInfo);
    }

    /**
     * 批量删除todo列表
     * 
     * @param ids 需要删除的todo列表主键
     * @return 结果
     */
    @Override
    public int deleteTodoInfoByIds(Long[] ids)
    {
        return todoInfoMapper.deleteTodoInfoByIds(ids);
    }

    /**
     * 删除todo列表信息
     * 
     * @param id todo列表主键
     * @return 结果
     */
    @Override
    public int deleteTodoInfoById(Long id)
    {
        return todoInfoMapper.deleteTodoInfoById(id);
    }
}
