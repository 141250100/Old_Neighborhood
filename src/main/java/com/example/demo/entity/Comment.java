  
    /**    
    * @Title: Comment.java  
    * @Package com.example.demo.entity  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author 彭冲 
    * @date 2018年3月20日  
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
 * @ClassName: Comment
 * @Description: 创建一个新的实例 Comment.
 * @author 彭冲
 * @date 2018年3月20日
 * 
 */
@Entity
@Table(name = "comment")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Comment implements Serializable{
	    /**  
	    * @Fields field:field
	    */  
	    
	private static final long serialVersionUID = -237773653442972999L;
	  
		    /**  
		     * 创建一个新的实例 Comment.  
		     *  
		     * @param c_ID
		     * @param m_ID
		     * @param u_ID
		     * @param c_image
		     * @param c_content
		     * @param c_star
		     * @param c_date  
		     */  
		    

	@Id @NonNull
	private String c_ID;
	@NonNull
	private String m_ID;
	@NonNull
	private String u_ID;
	private String c_image;
	@NonNull
	private String c_content;
	@NonNull
	private Integer c_star;
	@Column(columnDefinition = "timestamp not null default now()", updatable = false)
	private Timestamp c_date;


}
