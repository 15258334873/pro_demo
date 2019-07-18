package com.pck.dbo;

import lombok.Data;

import java.util.Date;

/**
 * @description: 基础DO
 * <p>
 * 提供了通用类属性：创建时间、创建人、修改时间、修改人
 * </p>
 * @program: pro_demo
 * @author: pancikai
 * @create: 2019/07/18 09:48
 * @version: 1.0
 */
@Data
public class BaseDo {

    /** 创建时间 */
    private Date              createTime;
    /** 创建人 */
    private String            createPerson;
    /** 修改时间 */
    private Date              updateTime;
    /** 修改人 */
    private String            updatePerson;



}
