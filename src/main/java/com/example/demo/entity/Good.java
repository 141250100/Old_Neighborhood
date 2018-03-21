package com.example.demo.entity;
/**  
* @ClassName: Good  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 彭冲 
* @date 2018年3月20日  
*    
*/

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

@Entity
@Table(name = "good")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Good implements Serializable {
	/**
	 * @Fields field:field
	 */

	private static final long serialVersionUID = 5283111757561307823L;
	  
	    /**  
	     * 创建一个新的实例 Good.  
	     *  
	     * @param g_ID
	     * @param g_name
	     * @param m_ID
	     * @param g_price
	     * @param g_amount
	     * @param g_image
	     * @param g_type
	     * @param g_intro
	     * @param g_date  
	     */  
	@Id
	@NonNull
	private String g_ID;
	@NonNull
	private String g_name;
	@NonNull
	private String m_ID;
	@NonNull
	private Double g_price;
	@NonNull
	private String g_amount;
	@NonNull
	private String g_image;
	@NonNull
	private String g_type;
	private String g_intro;
	@Column(columnDefinition = "timestamp not null default now()", updatable = false)
	private Timestamp g_date;
}
