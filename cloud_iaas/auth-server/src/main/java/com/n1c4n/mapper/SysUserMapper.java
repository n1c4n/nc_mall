package com.n1c4n.mapper;

import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.n1c4n.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 系统用户(SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-28 16:26:46
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<SysUser> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<SysUser> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<SysUser> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<SysUser> entities);


@Select("select DISTINCT  m.perms from `sys_menu` as m \n" +
        "join `sys_role_menu` as rm on m.menu_id = rm.menu_id\n" +
        "join `sys_user_role` as ur on rm.role_id = ur.role_id\n" +
        "where user_id = 1 and m.type = 2")
    Set<String> selectPermsByUserId(Long userId);
}

