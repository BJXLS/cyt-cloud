package com.bjxls.todo.service;

import java.util.List;
import com.bjxls.todo.domain.TodoInfo;

/**
 * todo列表Service接口
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
public interface ITodoInfoService 
{
    /**
     * 查询todo列表
     * 
     * @param id todo列表主键
     * @return todo列表
     */
    public TodoInfo selectTodoInfoById(Long id);

    /**
     * 查询todo列表列表
     * 
     * @param todoInfo todo列表
     * @return todo列表集合
     */
    public List<TodoInfo> selectTodoInfoList(TodoInfo todoInfo);

    /**
     * 新增todo列表
     * 
     * @param todoInfo todo列表
     * @return 结果
     */
    public int insertTodoInfo(TodoInfo todoInfo);

    /**
     * 修改todo列表
     * 
     * @param todoInfo todo列表
     * @return 结果
     */
    public int updateTodoInfo(TodoInfo todoInfo);

    /**
     * 批量删除todo列表
     * 
     * @param ids 需要删除的todo列表主键集合
     * @return 结果
     */
    public int deleteTodoInfoByIds(Long[] ids);

    /**
     * 删除todo列表信息
     * 
     * @param id todo列表主键
     * @return 结果
     */
    public int deleteTodoInfoById(Long id);
}
