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

public class WsrUsersDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return WsrUsersDao
	 */
	public static WsrUsersDao create()
	{
		return new WsrUsersDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return WsrUsersDao
	 */
	public static WsrUsersDao create(Connection conn)
	{
		return new WsrUsersDaoImpl( conn );
	}

}
