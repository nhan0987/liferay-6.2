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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequestModel;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequestSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ControlRequest service. Represents a row in the &quot;vr_controlrequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ControlRequestImpl}.
 * </p>
 *
 * @author huymq
 * @see ControlRequestImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequestModel
 * @generated
 */
@JSON(strict = true)
public class ControlRequestModelImpl extends BaseModelImpl<ControlRequest>
	implements ControlRequestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a control request model instance should use the {@link vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest} interface instead.
	 */
	public static final String TABLE_NAME = "vr_controlrequest";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "confirmedinspectionid", Types.BIGINT },
			{ "requestnumber", Types.VARCHAR },
			{ "corporationname", Types.VARCHAR },
			{ "controlcontent", Types.VARCHAR },
			{ "controldeadline", Types.TIMESTAMP },
			{ "remarks", Types.VARCHAR },
			{ "attachedfile", Types.BIGINT },
			{ "signname", Types.VARCHAR },
			{ "signtitle", Types.VARCHAR },
			{ "signplace", Types.VARCHAR },
			{ "signdate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table vr_controlrequest (id LONG not null primary key,confirmedinspectionid LONG,requestnumber VARCHAR(75) null,corporationname VARCHAR(75) null,controlcontent VARCHAR(75) null,controldeadline DATE null,remarks VARCHAR(75) null,attachedfile LONG,signname VARCHAR(75) null,signtitle VARCHAR(75) null,signplace VARCHAR(75) null,signdate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_controlrequest";
	public static final String ORDER_BY_JPQL = " ORDER BY controlRequest.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_controlrequest.id ASC";
	public static final String DATA_SOURCE = "vrDataSource";
	public static final String SESSION_FACTORY = "vrSessionFactory";
	public static final String TX_MANAGER = "vrTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ControlRequest toModel(ControlRequestSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ControlRequest model = new ControlRequestImpl();

		model.setId(soapModel.getId());
		model.setConfirmedInspectionId(soapModel.getConfirmedInspectionId());
		model.setRequestNumber(soapModel.getRequestNumber());
		model.setCorporationName(soapModel.getCorporationName());
		model.setControlContent(soapModel.getControlContent());
		model.setControlDeadLine(soapModel.getControlDeadLine());
		model.setRemarks(soapModel.getRemarks());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setSignName(soapModel.getSignName());
		model.setSignTitle(soapModel.getSignTitle());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ControlRequest> toModels(ControlRequestSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ControlRequest> models = new ArrayList<ControlRequest>(soapModels.length);

		for (ControlRequestSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest"));

	public ControlRequestModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ControlRequest.class;
	}

	@Override
	public String getModelClassName() {
		return ControlRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("confirmedInspectionId", getConfirmedInspectionId());
		attributes.put("requestNumber", getRequestNumber());
		attributes.put("corporationName", getCorporationName());
		attributes.put("controlContent", getControlContent());
		attributes.put("controlDeadLine", getControlDeadLine());
		attributes.put("remarks", getRemarks());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long confirmedInspectionId = (Long)attributes.get(
				"confirmedInspectionId");

		if (confirmedInspectionId != null) {
			setConfirmedInspectionId(confirmedInspectionId);
		}

		String requestNumber = (String)attributes.get("requestNumber");

		if (requestNumber != null) {
			setRequestNumber(requestNumber);
		}

		String corporationName = (String)attributes.get("corporationName");

		if (corporationName != null) {
			setCorporationName(corporationName);
		}

		String controlContent = (String)attributes.get("controlContent");

		if (controlContent != null) {
			setControlContent(controlContent);
		}

		Date controlDeadLine = (Date)attributes.get("controlDeadLine");

		if (controlDeadLine != null) {
			setControlDeadLine(controlDeadLine);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	@Override
	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	@JSON
	@Override
	public String getRequestNumber() {
		if (_requestNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestNumber;
		}
	}

	@Override
	public void setRequestNumber(String requestNumber) {
		_requestNumber = requestNumber;
	}

	@JSON
	@Override
	public String getCorporationName() {
		if (_corporationName == null) {
			return StringPool.BLANK;
		}
		else {
			return _corporationName;
		}
	}

	@Override
	public void setCorporationName(String corporationName) {
		_corporationName = corporationName;
	}

	@JSON
	@Override
	public String getControlContent() {
		if (_controlContent == null) {
			return StringPool.BLANK;
		}
		else {
			return _controlContent;
		}
	}

	@Override
	public void setControlContent(String controlContent) {
		_controlContent = controlContent;
	}

	@JSON
	@Override
	public Date getControlDeadLine() {
		return _controlDeadLine;
	}

	@Override
	public void setControlDeadLine(Date controlDeadLine) {
		_controlDeadLine = controlDeadLine;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@JSON
	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	@JSON
	@Override
	public String getSignName() {
		if (_signName == null) {
			return StringPool.BLANK;
		}
		else {
			return _signName;
		}
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;
	}

	@JSON
	@Override
	public String getSignTitle() {
		if (_signTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _signTitle;
		}
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	@JSON
	@Override
	public String getSignPlace() {
		if (_signPlace == null) {
			return StringPool.BLANK;
		}
		else {
			return _signPlace;
		}
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	@JSON
	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ControlRequest.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ControlRequest toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ControlRequest)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ControlRequestImpl controlRequestImpl = new ControlRequestImpl();

		controlRequestImpl.setId(getId());
		controlRequestImpl.setConfirmedInspectionId(getConfirmedInspectionId());
		controlRequestImpl.setRequestNumber(getRequestNumber());
		controlRequestImpl.setCorporationName(getCorporationName());
		controlRequestImpl.setControlContent(getControlContent());
		controlRequestImpl.setControlDeadLine(getControlDeadLine());
		controlRequestImpl.setRemarks(getRemarks());
		controlRequestImpl.setAttachedFile(getAttachedFile());
		controlRequestImpl.setSignName(getSignName());
		controlRequestImpl.setSignTitle(getSignTitle());
		controlRequestImpl.setSignPlace(getSignPlace());
		controlRequestImpl.setSignDate(getSignDate());

		controlRequestImpl.resetOriginalValues();

		return controlRequestImpl;
	}

	@Override
	public int compareTo(ControlRequest controlRequest) {
		int value = 0;

		if (getId() < controlRequest.getId()) {
			value = -1;
		}
		else if (getId() > controlRequest.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ControlRequest)) {
			return false;
		}

		ControlRequest controlRequest = (ControlRequest)obj;

		long primaryKey = controlRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<ControlRequest> toCacheModel() {
		ControlRequestCacheModel controlRequestCacheModel = new ControlRequestCacheModel();

		controlRequestCacheModel.id = getId();

		controlRequestCacheModel.confirmedInspectionId = getConfirmedInspectionId();

		controlRequestCacheModel.requestNumber = getRequestNumber();

		String requestNumber = controlRequestCacheModel.requestNumber;

		if ((requestNumber != null) && (requestNumber.length() == 0)) {
			controlRequestCacheModel.requestNumber = null;
		}

		controlRequestCacheModel.corporationName = getCorporationName();

		String corporationName = controlRequestCacheModel.corporationName;

		if ((corporationName != null) && (corporationName.length() == 0)) {
			controlRequestCacheModel.corporationName = null;
		}

		controlRequestCacheModel.controlContent = getControlContent();

		String controlContent = controlRequestCacheModel.controlContent;

		if ((controlContent != null) && (controlContent.length() == 0)) {
			controlRequestCacheModel.controlContent = null;
		}

		Date controlDeadLine = getControlDeadLine();

		if (controlDeadLine != null) {
			controlRequestCacheModel.controlDeadLine = controlDeadLine.getTime();
		}
		else {
			controlRequestCacheModel.controlDeadLine = Long.MIN_VALUE;
		}

		controlRequestCacheModel.remarks = getRemarks();

		String remarks = controlRequestCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			controlRequestCacheModel.remarks = null;
		}

		controlRequestCacheModel.attachedFile = getAttachedFile();

		controlRequestCacheModel.signName = getSignName();

		String signName = controlRequestCacheModel.signName;

		if ((signName != null) && (signName.length() == 0)) {
			controlRequestCacheModel.signName = null;
		}

		controlRequestCacheModel.signTitle = getSignTitle();

		String signTitle = controlRequestCacheModel.signTitle;

		if ((signTitle != null) && (signTitle.length() == 0)) {
			controlRequestCacheModel.signTitle = null;
		}

		controlRequestCacheModel.signPlace = getSignPlace();

		String signPlace = controlRequestCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			controlRequestCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			controlRequestCacheModel.signDate = signDate.getTime();
		}
		else {
			controlRequestCacheModel.signDate = Long.MIN_VALUE;
		}

		return controlRequestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", confirmedInspectionId=");
		sb.append(getConfirmedInspectionId());
		sb.append(", requestNumber=");
		sb.append(getRequestNumber());
		sb.append(", corporationName=");
		sb.append(getCorporationName());
		sb.append(", controlContent=");
		sb.append(getControlContent());
		sb.append(", controlDeadLine=");
		sb.append(getControlDeadLine());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmedInspectionId</column-name><column-value><![CDATA[");
		sb.append(getConfirmedInspectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestNumber</column-name><column-value><![CDATA[");
		sb.append(getRequestNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationName</column-name><column-value><![CDATA[");
		sb.append(getCorporationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlContent</column-name><column-value><![CDATA[");
		sb.append(getControlContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlDeadLine</column-name><column-value><![CDATA[");
		sb.append(getControlDeadLine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ControlRequest.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ControlRequest.class
		};
	private long _id;
	private long _confirmedInspectionId;
	private String _requestNumber;
	private String _corporationName;
	private String _controlContent;
	private Date _controlDeadLine;
	private String _remarks;
	private long _attachedFile;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private ControlRequest _escapedModel;
}