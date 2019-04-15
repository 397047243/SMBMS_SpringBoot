package cn.xrz.smbms.service.impl;


import cn.xrz.smbms.dao.RoleMapper;
import cn.xrz.smbms.pojo.Role;
import cn.xrz.smbms.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;

	@Override
	public List<Role> getRoleList() {
		return this.roleMapper.getRoleList();
	}
}
