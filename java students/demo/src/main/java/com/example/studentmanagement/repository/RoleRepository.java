package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName); // 自定义查询方法，按角色名称查找
}