package com.bjxls.todo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.bjxls.common.core.annotation.Excel;
import com.bjxls.common.core.web.domain.BaseEntity;

/**
 * todo列表对象 todo_group
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
public class TodoGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 组Id */
    private Long id;

    /** 组名称 */
    @Excel(name = "组名称")
    private String name;

    /** 删除 */
    private String delFlag;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("userId", getUserId())
            .toString();
    }
}
