  
    /**    
    * @Title: Post.java  
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
    * @ClassName: Post  
    * @Description: TODO(这里用一句话描述这个类的作用)  
    * @author 彭冲 
    * @date 2018年3月21日  
    *    
    */
@Entity
@Table(name = "post")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Post implements Serializable{

	  
	    /**  
	    * @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	    */  
	    
	private static final long serialVersionUID = -4226803885162480336L;
	  
		    /**  
		     * 创建一个新的实例 Post.  
		     *  
		     * @param p_ID
		     * @param p_content
		     * @param p_image
		     * @param u_ID
		     * @param s_ID
		     * @param f_ID
		     * @param p_date  
		     */  
		    
		
	@Id @NonNull
	private String p_ID;
	@NonNull
	private String p_content;
	private String p_image;
	@NonNull
	private String u_ID;
	@NonNull
	private String s_ID;
	@NonNull
	private String f_ID;
	@Column(columnDefinition = "timestamp not null default now()", updatable = false)
	private Timestamp p_date;
}
