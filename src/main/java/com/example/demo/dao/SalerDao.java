  
    /**    
    * @Title: SalerDao.java  
    * @Package com.example.demo.dao  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author 彭冲 
    * @date 2018年3月21日  
    * @version V1.0    
    */  
    
package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Saler;

/**  
    * @ClassName: SalerDao  
    * @Description: 本接口继承了jpa提供的JpaRepository
    * @author 彭冲 
    * @date 2018年3月21日  
    *    
    */

public interface SalerDao extends JpaRepository<Saler, Serializable> {

}
