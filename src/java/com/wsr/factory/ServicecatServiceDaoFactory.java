/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.wsr.factory;

import java.sql.Connection;
import com.wsr.dao.*;
import com.wsr.jdbc.*;

public class ServicecatServiceDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ServicecatServiceDao
	 */
	public static ServicecatServiceDao create()
	{
		return new ServicecatServiceDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ServicecatServiceDao
	 */
	public static ServicecatServiceDao create(Connection conn)
	{
		return new ServicecatServiceDaoImpl( conn );
	}

}
