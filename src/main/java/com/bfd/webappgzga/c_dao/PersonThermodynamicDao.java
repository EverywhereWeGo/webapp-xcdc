/**
 * PersonThermodynamicDao.java
 * com.bfd.webappxcdc.c_dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2019年3月20日 		lenovo
 *
 * Copyright (c) 2019, TNT All Rights Reserved.
*/

package com.bfd.webappgzga.c_dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bfd.webappgzga.vo.CarActivityVO;
import com.bfd.webappgzga.vo.PersonActivityVO;

/**
 * ClassName:PersonThermodynamicDao
 * describe
 *
 * @author   zhujinyu
 * @version  
 * @since    Ver 1.1
 * @Date	 2019年3月20日		上午10:11:14
 *
 */
@Mapper
public interface PersonThermodynamicDao {

	/**
	 * 
	 * getCarActivity:(獲取24小時內的車輛活躍度)
	 * TODO
	 *
	 * @param  @return    设定文件
	 * @return List<CarActivityVO>    DOM对象
	 */
	List<CarActivityVO> getCarActivity();
	/**
	 * 
	 * getPersonActivity:(获取最近10天的重点人员活跃度)
	 * 
	 *
	 * @param  @return    设定文件
	 * @return List<PersonActivityVO>    DOM对象
	 */
	List<PersonActivityVO> getPersonActivity();
	
	

}

