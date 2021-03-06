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
import java.util.Date;

public class Service implements Serializable
{
	/** 
	 * This attribute maps to the column service_ID in the service table.
	 */
	protected int serviceId;

	/** 
	 * This attribute maps to the column service_name in the service table.
	 */
	protected String serviceName;

	/** 
	 * This attribute maps to the column service_WSDL in the service table.
	 */
	protected String serviceWsdl;

	/** 
	 * This attribute maps to the column home_URL in the service table.
	 */
	protected String homeUrl;

	/** 
	 * This attribute maps to the column description in the service table.
	 */
	protected String description;

	/** 
	 * This attribute maps to the column owl_URL in the service table.
	 */
	protected String owlUrl;

	/** 
	 * This attribute maps to the column user_rating in the service table.
	 */
	protected float userRating;

	/** 
	 * This attribute represents whether the primitive attribute userRating is null.
	 */
	protected boolean userRatingNull = true;

	/** 
	 * This attribute maps to the column exe_duration in the service table.
	 */
	protected double exeDuration;

	/** 
	 * This attribute represents whether the primitive attribute exeDuration is null.
	 */
	protected boolean exeDurationNull = true;

	/** 
	 * This attribute maps to the column cost in the service table.
	 */
	protected float cost;

	/** 
	 * This attribute represents whether the primitive attribute cost is null.
	 */
	protected boolean costNull = true;

	/** 
	 * This attribute maps to the column rating_user_count in the service table.
	 */
	protected int ratingUserCount;

	/** 
	 * This attribute represents whether the primitive attribute ratingUserCount is null.
	 */
	protected boolean ratingUserCountNull = true;

	/** 
	 * This attribute maps to the column invoke_request_count in the service table.
	 */
	protected int invokeRequestCount;

	/** 
	 * This attribute represents whether the primitive attribute invokeRequestCount is null.
	 */
	protected boolean invokeRequestCountNull = true;

	/** 
	 * This attribute maps to the column invoke_success_count in the service table.
	 */
	protected int invokeSuccessCount;

	/** 
	 * This attribute represents whether the primitive attribute invokeSuccessCount is null.
	 */
	protected boolean invokeSuccessCountNull = true;

	/** 
	 * This attribute maps to the column execute_success_count in the service table.
	 */
	protected int executeSuccessCount;

	/** 
	 * This attribute represents whether the primitive attribute executeSuccessCount is null.
	 */
	protected boolean executeSuccessCountNull = true;

	/** 
	 * This attribute maps to the column published_date in the service table.
	 */
	protected Date publishedDate;

	/** 
	 * This attribute maps to the column checked_by_admin in the service table.
	 */
	protected boolean checkedByAdmin = false;

	/** 
	 * This attribute maps to the column publisher in the service table.
	 */
	protected int publisher = 0;

	/**
	 * Method 'Service'
	 * 
	 */
	public Service()
	{
	}

	/**
	 * Method 'getServiceId'
	 * 
	 * @return int
	 */
	public int getServiceId()
	{
		return serviceId;
	}

	/**
	 * Method 'setServiceId'
	 * 
	 * @param serviceId
	 */
	public void setServiceId(int serviceId)
	{
		this.serviceId = serviceId;
	}

	/**
	 * Method 'getServiceName'
	 * 
	 * @return String
	 */
	public String getServiceName()
	{
		return serviceName;
	}

	/**
	 * Method 'setServiceName'
	 * 
	 * @param serviceName
	 */
	public void setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
	}

	/**
	 * Method 'getServiceWsdl'
	 * 
	 * @return String
	 */
	public String getServiceWsdl()
	{
		return serviceWsdl;
	}

	/**
	 * Method 'setServiceWsdl'
	 * 
	 * @param serviceWsdl
	 */
	public void setServiceWsdl(String serviceWsdl)
	{
		this.serviceWsdl = serviceWsdl;
	}

	/**
	 * Method 'getHomeUrl'
	 * 
	 * @return String
	 */
	public String getHomeUrl()
	{
		return homeUrl;
	}

	/**
	 * Method 'setHomeUrl'
	 * 
	 * @param homeUrl
	 */
	public void setHomeUrl(String homeUrl)
	{
		this.homeUrl = homeUrl;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Method 'getOwlUrl'
	 * 
	 * @return String
	 */
	public String getOwlUrl()
	{
		return owlUrl;
	}

	/**
	 * Method 'setOwlUrl'
	 * 
	 * @param owlUrl
	 */
	public void setOwlUrl(String owlUrl)
	{
		this.owlUrl = owlUrl;
	}

	/**
	 * Method 'getUserRating'
	 * 
	 * @return float
	 */
	public float getUserRating()
	{
		return userRating;
	}

	/**
	 * Method 'setUserRating'
	 * 
	 * @param userRating
	 */
	public void setUserRating(float userRating)
	{
		this.userRating = userRating;
		this.userRatingNull = false;
	}

	/**
	 * Method 'setUserRatingNull'
	 * 
	 * @param value
	 */
	public void setUserRatingNull(boolean value)
	{
		this.userRatingNull = value;
	}

	/**
	 * Method 'isUserRatingNull'
	 * 
	 * @return boolean
	 */
	public boolean isUserRatingNull()
	{
		return userRatingNull;
	}

	/**
	 * Method 'getExeDuration'
	 * 
	 * @return double
	 */
	public double getExeDuration()
	{
		return exeDuration;
	}

	/**
	 * Method 'setExeDuration'
	 * 
	 * @param exeDuration
	 */
	public void setExeDuration(double exeDuration)
	{
		this.exeDuration = exeDuration;
		this.exeDurationNull = false;
	}

	/**
	 * Method 'setExeDurationNull'
	 * 
	 * @param value
	 */
	public void setExeDurationNull(boolean value)
	{
		this.exeDurationNull = value;
	}

	/**
	 * Method 'isExeDurationNull'
	 * 
	 * @return boolean
	 */
	public boolean isExeDurationNull()
	{
		return exeDurationNull;
	}

	/**
	 * Method 'getCost'
	 * 
	 * @return float
	 */
	public float getCost()
	{
		return cost;
	}

	/**
	 * Method 'setCost'
	 * 
	 * @param cost
	 */
	public void setCost(float cost)
	{
		this.cost = cost;
		this.costNull = false;
	}

	/**
	 * Method 'setCostNull'
	 * 
	 * @param value
	 */
	public void setCostNull(boolean value)
	{
		this.costNull = value;
	}

	/**
	 * Method 'isCostNull'
	 * 
	 * @return boolean
	 */
	public boolean isCostNull()
	{
		return costNull;
	}

	/**
	 * Method 'getRatingUserCount'
	 * 
	 * @return int
	 */
	public int getRatingUserCount()
	{
		return ratingUserCount;
	}

	/**
	 * Method 'setRatingUserCount'
	 * 
	 * @param ratingUserCount
	 */
	public void setRatingUserCount(int ratingUserCount)
	{
		this.ratingUserCount = ratingUserCount;
		this.ratingUserCountNull = false;
	}

	/**
	 * Method 'setRatingUserCountNull'
	 * 
	 * @param value
	 */
	public void setRatingUserCountNull(boolean value)
	{
		this.ratingUserCountNull = value;
	}

	/**
	 * Method 'isRatingUserCountNull'
	 * 
	 * @return boolean
	 */
	public boolean isRatingUserCountNull()
	{
		return ratingUserCountNull;
	}

	/**
	 * Method 'getInvokeRequestCount'
	 * 
	 * @return int
	 */
	public int getInvokeRequestCount()
	{
		return invokeRequestCount;
	}

	/**
	 * Method 'setInvokeRequestCount'
	 * 
	 * @param invokeRequestCount
	 */
	public void setInvokeRequestCount(int invokeRequestCount)
	{
		this.invokeRequestCount = invokeRequestCount;
		this.invokeRequestCountNull = false;
	}

	/**
	 * Method 'setInvokeRequestCountNull'
	 * 
	 * @param value
	 */
	public void setInvokeRequestCountNull(boolean value)
	{
		this.invokeRequestCountNull = value;
	}

	/**
	 * Method 'isInvokeRequestCountNull'
	 * 
	 * @return boolean
	 */
	public boolean isInvokeRequestCountNull()
	{
		return invokeRequestCountNull;
	}

	/**
	 * Method 'getInvokeSuccessCount'
	 * 
	 * @return int
	 */
	public int getInvokeSuccessCount()
	{
		return invokeSuccessCount;
	}

	/**
	 * Method 'setInvokeSuccessCount'
	 * 
	 * @param invokeSuccessCount
	 */
	public void setInvokeSuccessCount(int invokeSuccessCount)
	{
		this.invokeSuccessCount = invokeSuccessCount;
		this.invokeSuccessCountNull = false;
	}

	/**
	 * Method 'setInvokeSuccessCountNull'
	 * 
	 * @param value
	 */
	public void setInvokeSuccessCountNull(boolean value)
	{
		this.invokeSuccessCountNull = value;
	}

	/**
	 * Method 'isInvokeSuccessCountNull'
	 * 
	 * @return boolean
	 */
	public boolean isInvokeSuccessCountNull()
	{
		return invokeSuccessCountNull;
	}

	/**
	 * Method 'getExecuteSuccessCount'
	 * 
	 * @return int
	 */
	public int getExecuteSuccessCount()
	{
		return executeSuccessCount;
	}

	/**
	 * Method 'setExecuteSuccessCount'
	 * 
	 * @param executeSuccessCount
	 */
	public void setExecuteSuccessCount(int executeSuccessCount)
	{
		this.executeSuccessCount = executeSuccessCount;
		this.executeSuccessCountNull = false;
	}

	/**
	 * Method 'setExecuteSuccessCountNull'
	 * 
	 * @param value
	 */
	public void setExecuteSuccessCountNull(boolean value)
	{
		this.executeSuccessCountNull = value;
	}

	/**
	 * Method 'isExecuteSuccessCountNull'
	 * 
	 * @return boolean
	 */
	public boolean isExecuteSuccessCountNull()
	{
		return executeSuccessCountNull;
	}

	/**
	 * Method 'getPublishedDate'
	 * 
	 * @return Date
	 */
	public Date getPublishedDate()
	{
		return publishedDate;
	}

	/**
	 * Method 'setPublishedDate'
	 * 
	 * @param publishedDate
	 */
	public void setPublishedDate(Date publishedDate)
	{
		this.publishedDate = publishedDate;
	}

	/**
	 * Method 'isCheckedByAdmin'
	 * 
	 * @return boolean
	 */
	public boolean isCheckedByAdmin()
	{
		return checkedByAdmin;
	}

	/**
	 * Method 'setCheckedByAdmin'
	 * 
	 * @param checkedByAdmin
	 */
	public void setCheckedByAdmin(boolean checkedByAdmin)
	{
		this.checkedByAdmin = checkedByAdmin;
	}

	/**
	 * Method 'getPublisher'
	 * 
	 * @return int
	 */
	public int getPublisher()
	{
		return publisher;
	}

	/**
	 * Method 'setPublisher'
	 * 
	 * @param publisher
	 */
	public void setPublisher(int publisher)
	{
		this.publisher = publisher;
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
		
		if (!(_other instanceof Service)) {
			return false;
		}
		
		final Service _cast = (Service) _other;
		if (serviceId != _cast.serviceId) {
			return false;
		}
		
		if (serviceName == null ? _cast.serviceName != serviceName : !serviceName.equals( _cast.serviceName )) {
			return false;
		}
		
		if (serviceWsdl == null ? _cast.serviceWsdl != serviceWsdl : !serviceWsdl.equals( _cast.serviceWsdl )) {
			return false;
		}
		
		if (homeUrl == null ? _cast.homeUrl != homeUrl : !homeUrl.equals( _cast.homeUrl )) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
			return false;
		}
		
		if (owlUrl == null ? _cast.owlUrl != owlUrl : !owlUrl.equals( _cast.owlUrl )) {
			return false;
		}
		
		if (userRating != _cast.userRating) {
			return false;
		}
		
		if (userRatingNull != _cast.userRatingNull) {
			return false;
		}
		
		if (exeDuration != _cast.exeDuration) {
			return false;
		}
		
		if (exeDurationNull != _cast.exeDurationNull) {
			return false;
		}
		
		if (cost != _cast.cost) {
			return false;
		}
		
		if (costNull != _cast.costNull) {
			return false;
		}
		
		if (ratingUserCount != _cast.ratingUserCount) {
			return false;
		}
		
		if (ratingUserCountNull != _cast.ratingUserCountNull) {
			return false;
		}
		
		if (invokeRequestCount != _cast.invokeRequestCount) {
			return false;
		}
		
		if (invokeRequestCountNull != _cast.invokeRequestCountNull) {
			return false;
		}
		
		if (invokeSuccessCount != _cast.invokeSuccessCount) {
			return false;
		}
		
		if (invokeSuccessCountNull != _cast.invokeSuccessCountNull) {
			return false;
		}
		
		if (executeSuccessCount != _cast.executeSuccessCount) {
			return false;
		}
		
		if (executeSuccessCountNull != _cast.executeSuccessCountNull) {
			return false;
		}
		
		if (publishedDate == null ? _cast.publishedDate != publishedDate : !publishedDate.equals( _cast.publishedDate )) {
			return false;
		}
		
		if (checkedByAdmin != _cast.checkedByAdmin) {
			return false;
		}
		
		if (publisher != _cast.publisher) {
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
		_hashCode = 29 * _hashCode + serviceId;
		if (serviceName != null) {
			_hashCode = 29 * _hashCode + serviceName.hashCode();
		}
		
		if (serviceWsdl != null) {
			_hashCode = 29 * _hashCode + serviceWsdl.hashCode();
		}
		
		if (homeUrl != null) {
			_hashCode = 29 * _hashCode + homeUrl.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		if (owlUrl != null) {
			_hashCode = 29 * _hashCode + owlUrl.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(userRating);
		_hashCode = 29 * _hashCode + (userRatingNull ? 1 : 0);
		long temp_exeDuration = Double.doubleToLongBits(exeDuration);
		_hashCode = 29 * _hashCode + (int) (temp_exeDuration ^ (temp_exeDuration >>> 32));
		_hashCode = 29 * _hashCode + (exeDurationNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(cost);
		_hashCode = 29 * _hashCode + (costNull ? 1 : 0);
		_hashCode = 29 * _hashCode + ratingUserCount;
		_hashCode = 29 * _hashCode + (ratingUserCountNull ? 1 : 0);
		_hashCode = 29 * _hashCode + invokeRequestCount;
		_hashCode = 29 * _hashCode + (invokeRequestCountNull ? 1 : 0);
		_hashCode = 29 * _hashCode + invokeSuccessCount;
		_hashCode = 29 * _hashCode + (invokeSuccessCountNull ? 1 : 0);
		_hashCode = 29 * _hashCode + executeSuccessCount;
		_hashCode = 29 * _hashCode + (executeSuccessCountNull ? 1 : 0);
		if (publishedDate != null) {
			_hashCode = 29 * _hashCode + publishedDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (checkedByAdmin ? 1 : 0);
		_hashCode = 29 * _hashCode + publisher;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ServicePk
	 */
	public ServicePk createPk()
	{
		return new ServicePk(serviceId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.wsr.dto.Service: " );
		ret.append( "serviceId=" + serviceId );
		ret.append( ", serviceName=" + serviceName );
		ret.append( ", serviceWsdl=" + serviceWsdl );
		ret.append( ", homeUrl=" + homeUrl );
		ret.append( ", description=" + description );
		ret.append( ", owlUrl=" + owlUrl );
		ret.append( ", userRating=" + userRating );
		ret.append( ", exeDuration=" + exeDuration );
		ret.append( ", cost=" + cost );
		ret.append( ", ratingUserCount=" + ratingUserCount );
		ret.append( ", invokeRequestCount=" + invokeRequestCount );
		ret.append( ", invokeSuccessCount=" + invokeSuccessCount );
		ret.append( ", executeSuccessCount=" + executeSuccessCount );
		ret.append( ", publishedDate=" + publishedDate );
		ret.append( ", checkedByAdmin=" + checkedByAdmin );
		ret.append( ", publisher=" + publisher );
		return ret.toString();
	}

        public float getRating(){
            if (ratingUserCount == 0.0f){
                return 0.0f;
            }else{
                return userRating/ratingUserCount;
            }
        }
        
}
