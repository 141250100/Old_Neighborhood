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
* @ClassName: Market  
* @Description: 创建一个新的实例 Market.  
* @author 彭冲 
* @date 2018年3月20日  
*    
*/

/**
 * 创建一个新的实例 Market.
 * 
 * @param m_ID
 * @param m_name
 * @param s_ID
 * @param m_image
 * @param m_address
 * @param m_type
 * @param m_tele
 * @param m_email
 * @param m_intro
 * @param m_state
 * @param m_score
 * @param m_date
 */

@Entity
@Table(name = "market")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Market implements Serializable {
	/**
	 * @Fields field:field
	 */
	private static final long serialVersionUID = -5550874273577685972L;
	@Id
	@NonNull
	private String m_ID;
	@NonNull
	private String m_name;
	@NonNull
	private String s_ID;
	@NonNull
	private String m_image;
	@NonNull
	private String m_address;
	@NonNull
	private String m_type;
	@NonNull
	private String m_tele;
	private String m_email;
	private String m_intro;
	@NonNull
	private String m_state;
	@NonNull
	private Integer m_score;
	@Column(columnDefinition = "timestamp not null default now()", updatable = false)
	private Timestamp m_date;

}
