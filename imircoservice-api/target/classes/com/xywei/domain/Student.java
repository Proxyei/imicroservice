package com.xywei.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 项目中没有用到！
 * 测试lombok居然没有用？
 * @author nuller
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Data
public class Student implements Serializable{

	
	private static final long serialVersionUID = -7801486365570641004L;
	
	private Long id;
	private String name;
	private String dbSource;
	
	
}
