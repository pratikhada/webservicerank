/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.wsr.dto;

import com.wsr.dao.*;
import com.wsr.factory.*;
import com.wsr.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class ServiceCategory implements Serializable
{
	/** 
	 * This attribute maps to the column SC_ID in the service_category table.
	 */
	protected int scId;

	/** 
	 * This attribute maps to the column category_name in the service_category table.
	 */
	protected String categoryName;

	/**
	 * Method 'ServiceCategory'
	 * 
	 */
	public ServiceCategory()
	{
	}

	/**
	 * Method 'getScId'
	 * 
	 * @return int
	 */
	public int getScId()
	{
		return scId;
	}

	/**
	 * Method 'setScId'
	 * 
	 * @param scId
	 */
	public void setScId(int scId)
	{
		this.scId = scId;
	}

	/**
	 * Method 'getCategoryName'
	 * 
	 * @return String
	 */
	public String getCategoryName()
	{
		return categoryName;
	}

	/**
	 * Method 'setCategoryName'
	 * 
	 * @param categoryName
	 */
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ServiceCategory)) {
			return false;
		}
		
		final ServiceCategory _cast = (ServiceCategory) _other;
		if (scId != _cast.scId) {
			return false;
		}
		
		if (categoryName == null ? _cast.categoryName != categoryName : !categoryName.equals( _cast.categoryName )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + scId;
		if (categoryName != null) {
			_hashCode = 29 * _hashCode + categoryName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ServiceCategoryPk
	 */
	public ServiceCategoryPk createPk()
	{
		return new ServiceCategoryPk(scId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.wsr.dto.ServiceCategory: " );
		ret.append( "scId=" + scId );
		ret.append( ", categoryName=" + categoryName );
		return ret.toString();
	}

}