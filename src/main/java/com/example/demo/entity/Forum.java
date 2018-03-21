  
    /**    
    * @Title: Forum.java  
    * @Package com.example.demo.entity  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author 彭冲 
    * @date 2018年3月21日  
    * @version V1.0    
    */  
    
package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**  
    * @ClassName: Forum  
    * @Description: TODO(这里用一句话描述这个类的作用)  
    * @author 彭冲 
    * @date 2018年3月21日  
    *    
    */
@Entity
@Table(name = "forum")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Forum implements Serializable{

	  
	    /**  
	    * @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	    */  
	    
	private static final long serialVersionUID = 3997112552581632919L;
	
	  
		    /**  
		     * 创建一个新的实例 Forum.  
		     *  
		     * @param f_ID
		     * @param f_title
		     * @param f_content
		     * @param f_image
		     * @param u_ID
		     * @param s_ID
		     * @param f_view
		     * @param f_like
		     * @param f_isSticky
		     * @param f_date  
		     */  
		    
	@Id @NonNull
	private String f_ID;
	@NonNull
	private String f_title;
	@NonNull
	private String f_content;
	private String f_image;
	@NonNull
	private String u_ID;
	@NonNull
	private String s_ID;
	@NonNull
	private Integer f_view;
	@NonNull
	private Integer f_like;
	@NonNull
	private Integer f_isSticky;
	@Column(columnDefinition = "timestamp not null default now()", updatable = false)
	private Timestamp f_date;
	
}
