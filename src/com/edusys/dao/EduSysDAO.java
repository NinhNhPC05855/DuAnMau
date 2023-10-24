/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import java.util.List;

/**
 *
 * @author DELL
 */


    public abstract class EduSysDAO<EntityType,KeyType>{

        abstract public void insert(EntityType entity);

        abstract public void update(EntityType entity);

        abstract public void delete(KeyType key);

        abstract public List<EntityType>selectAll();

        abstract public EntityType selectById(KeyType key);

        abstract protected List<EntityType>selectBySql(String sql, Object... args);

    }

