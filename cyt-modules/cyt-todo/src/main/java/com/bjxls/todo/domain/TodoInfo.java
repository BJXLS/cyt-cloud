package com.bjxls.todo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.bjxls.common.core.annotation.Excel;
import com.bjxls.common.core.web.domain.BaseEntity;

/**
 * todo列表对象 todo_info
 * 
 * @author BJXLS
 * @date 2023-08-31
 */
public class TodoInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** todo名称 */
    @Excel(name = "todo名称")
    private String name;

    /** todo组id */
    @Excel(name = "todo组id")
    private Long groupId;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 删除 */
    private String delFlag;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

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
    public void setGroupId(Long groupId) 
    {
        this.groupId = groupId;
    }

    public Long getGroupId() 
    {
        return groupId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("groupId", getGroupId())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("type", getType())
            .toString();
    }
}
