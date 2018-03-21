  
    /**    
    * @Title: User.java  
    * @Package com.example.demo.entity  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author 彭冲 
    * @date 2018年3月21日  
    * @version V1.0    
    */  
    
package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.NonNull;

/**  
    * @ClassName: User  
    * @Description: 创建一个新的实例 User.
    * @author 彭冲 
    * @date 2018年3月21日  
    *    
    */

public class User implements Serializable{
	    /**  
	    * @Fields field:field  
	    */  
	    
	private static final long serialVersionUID = -1369148652554782331L;
	@Id @NonNull
	private String u_ID;
	
}
