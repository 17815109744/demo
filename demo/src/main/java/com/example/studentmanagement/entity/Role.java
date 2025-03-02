package com.example.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles") // 指定表名
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roleName; // 角色名称，例如 "学生"、"教师"、"管理员"

    // 构造函数
    public Role() {}

    public Role(String roleName) {
        this.roleName = roleName;
    }

    // Getter 和 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}