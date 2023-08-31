package com.bjxls.todo.mapper;

import java.util.List;
import com.bjxls.todo.domain.TodoGroup;

/**
 * todo列表Mapper接口
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
public interface TodoGroupMapper 
{
    /**
     * 查询todo列表
     * 
     * @param id todo列表主键
     * @return todo列表
     */
    public TodoGroup selectTodoGroupById(Long id);

    /**
     * 查询todo列表列表
     * 
     * @param todoGroup todo列表
     * @return todo列表集合
     */
    public List<TodoGroup> selectTodoGroupList(TodoGroup todoGroup);

    /**
     * 新增todo列表
     * 
     * @param todoGroup todo列表
     * @return 结果
     */
    public int insertTodoGroup(TodoGroup todoGroup);

    /**
     * 修改todo列表
     * 
     * @param todoGroup todo列表
     * @return 结果
     */
    public int updateTodoGroup(TodoGroup todoGroup);

    /**
     * 删除todo列表
     * 
     * @param id todo列表主键
     * @return 结果
     */
    public int deleteTodoGroupById(Long id);

    /**
     * 批量删除todo列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTodoGroupByIds(Long[] ids);
}
