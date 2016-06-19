/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.dao;

import com.studevs.models.Packages;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author Sajid
 */
public class PackagesDao extends Parent_Dao {

    public List<Packages> getAll() {

        String sql = "Select * from packages";
        return template.query(sql, BeanPropertyRowMapper.newInstance(Packages.class));

    }

}
