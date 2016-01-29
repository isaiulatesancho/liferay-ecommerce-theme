/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.ecommerce.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ShoppingOrder service. Represents a row in the &quot;rivetlogic_ecommerce_ShoppingOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderImpl}.
 * </p>
 *
 * @author isaiulate
 * @see ShoppingOrder
 * @see com.rivetlogic.ecommerce.model.impl.ShoppingOrderImpl
 * @see com.rivetlogic.ecommerce.model.impl.ShoppingOrderModelImpl
 * @generated
 */
public interface ShoppingOrderModel extends BaseModel<ShoppingOrder>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Shopping Order model instance should use the {@link ShoppingOrder} interface instead.
	 */

	/**
	 * Returns the primary key of this Shopping Order.
	 *
	 * @return the primary key of this Shopping Order
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Shopping Order.
	 *
	 * @param primaryKey the primary key of this Shopping Order
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the order ID of this Shopping Order.
	 *
	 * @return the order ID of this Shopping Order
	 */
	public long getOrderId();

	/**
	 * Sets the order ID of this Shopping Order.
	 *
	 * @param orderId the order ID of this Shopping Order
	 */
	public void setOrderId(long orderId);

	/**
	 * Returns the group ID of this Shopping Order.
	 *
	 * @return the group ID of this Shopping Order
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this Shopping Order.
	 *
	 * @param groupId the group ID of this Shopping Order
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this Shopping Order.
	 *
	 * @return the company ID of this Shopping Order
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this Shopping Order.
	 *
	 * @param companyId the company ID of this Shopping Order
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this Shopping Order.
	 *
	 * @return the user ID of this Shopping Order
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this Shopping Order.
	 *
	 * @param userId the user ID of this Shopping Order
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Shopping Order.
	 *
	 * @return the user uuid of this Shopping Order
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Shopping Order.
	 *
	 * @param userUuid the user uuid of this Shopping Order
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this Shopping Order.
	 *
	 * @return the user name of this Shopping Order
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this Shopping Order.
	 *
	 * @param userName the user name of this Shopping Order
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this Shopping Order.
	 *
	 * @return the create date of this Shopping Order
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this Shopping Order.
	 *
	 * @param createDate the create date of this Shopping Order
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this Shopping Order.
	 *
	 * @return the modified date of this Shopping Order
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this Shopping Order.
	 *
	 * @param modifiedDate the modified date of this Shopping Order
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the order status of this Shopping Order.
	 *
	 * @return the order status of this Shopping Order
	 */
	@AutoEscape
	public String getOrderStatus();

	/**
	 * Sets the order status of this Shopping Order.
	 *
	 * @param orderStatus the order status of this Shopping Order
	 */
	public void setOrderStatus(String orderStatus);

	/**
	 * Returns the customer email of this Shopping Order.
	 *
	 * @return the customer email of this Shopping Order
	 */
	@AutoEscape
	public String getCustomerEmail();

	/**
	 * Sets the customer email of this Shopping Order.
	 *
	 * @param customerEmail the customer email of this Shopping Order
	 */
	public void setCustomerEmail(String customerEmail);

	/**
	 * Returns the customer name of this Shopping Order.
	 *
	 * @return the customer name of this Shopping Order
	 */
	@AutoEscape
	public String getCustomerName();

	/**
	 * Sets the customer name of this Shopping Order.
	 *
	 * @param customerName the customer name of this Shopping Order
	 */
	public void setCustomerName(String customerName);

	/**
	 * Returns the customer phone of this Shopping Order.
	 *
	 * @return the customer phone of this Shopping Order
	 */
	@AutoEscape
	public String getCustomerPhone();

	/**
	 * Sets the customer phone of this Shopping Order.
	 *
	 * @param customerPhone the customer phone of this Shopping Order
	 */
	public void setCustomerPhone(String customerPhone);

	/**
	 * Returns the shipping address1 of this Shopping Order.
	 *
	 * @return the shipping address1 of this Shopping Order
	 */
	@AutoEscape
	public String getShippingAddress1();

	/**
	 * Sets the shipping address1 of this Shopping Order.
	 *
	 * @param shippingAddress1 the shipping address1 of this Shopping Order
	 */
	public void setShippingAddress1(String shippingAddress1);

	/**
	 * Returns the shipping address2 of this Shopping Order.
	 *
	 * @return the shipping address2 of this Shopping Order
	 */
	@AutoEscape
	public String getShippingAddress2();

	/**
	 * Sets the shipping address2 of this Shopping Order.
	 *
	 * @param shippingAddress2 the shipping address2 of this Shopping Order
	 */
	public void setShippingAddress2(String shippingAddress2);

	/**
	 * Returns the shipping city of this Shopping Order.
	 *
	 * @return the shipping city of this Shopping Order
	 */
	@AutoEscape
	public String getShippingCity();

	/**
	 * Sets the shipping city of this Shopping Order.
	 *
	 * @param shippingCity the shipping city of this Shopping Order
	 */
	public void setShippingCity(String shippingCity);

	/**
	 * Returns the shipping postal code of this Shopping Order.
	 *
	 * @return the shipping postal code of this Shopping Order
	 */
	@AutoEscape
	public String getShippingPostalCode();

	/**
	 * Sets the shipping postal code of this Shopping Order.
	 *
	 * @param shippingPostalCode the shipping postal code of this Shopping Order
	 */
	public void setShippingPostalCode(String shippingPostalCode);

	/**
	 * Returns the shipping state province of this Shopping Order.
	 *
	 * @return the shipping state province of this Shopping Order
	 */
	@AutoEscape
	public String getShippingStateProvince();

	/**
	 * Sets the shipping state province of this Shopping Order.
	 *
	 * @param shippingStateProvince the shipping state province of this Shopping Order
	 */
	public void setShippingStateProvince(String shippingStateProvince);

	/**
	 * Returns the shipping country of this Shopping Order.
	 *
	 * @return the shipping country of this Shopping Order
	 */
	@AutoEscape
	public String getShippingCountry();

	/**
	 * Sets the shipping country of this Shopping Order.
	 *
	 * @param shippingCountry the shipping country of this Shopping Order
	 */
	public void setShippingCountry(String shippingCountry);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.rivetlogic.ecommerce.model.ShoppingOrder shoppingOrder);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rivetlogic.ecommerce.model.ShoppingOrder> toCacheModel();

	@Override
	public com.rivetlogic.ecommerce.model.ShoppingOrder toEscapedModel();

	@Override
	public com.rivetlogic.ecommerce.model.ShoppingOrder toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}