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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AssessmentofImporterControlClp extends BaseModelImpl<AssessmentofImporterControl>
	implements AssessmentofImporterControl {
	public AssessmentofImporterControlClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentofImporterControl.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentofImporterControl.class.getName();
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("importercode", getImportercode());
		attributes.put("importername", getImportername());
		attributes.put("importeraddress", getImporteraddress());
		attributes.put("representative", getRepresentative());
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("importercodereference", getImportercodereference());
		attributes.put("F1Code", getF1Code());
		attributes.put("F1Name", getF1Name());
		attributes.put("F1Value", getF1Value());
		attributes.put("F1Mark", getF1Mark());
		attributes.put("F2Code", getF2Code());
		attributes.put("F2Name", getF2Name());
		attributes.put("F2Value", getF2Value());
		attributes.put("F2Mark", getF2Mark());
		attributes.put("F3Code", getF3Code());
		attributes.put("F3Name", getF3Name());
		attributes.put("F3Value", getF3Value());
		attributes.put("F3Mark", getF3Mark());
		attributes.put("F4Code", getF4Code());
		attributes.put("F4Name", getF4Name());
		attributes.put("F4Value", getF4Value());
		attributes.put("F4Mark", getF4Mark());
		attributes.put("F5Code", getF5Code());
		attributes.put("F5Name", getF5Name());
		attributes.put("F5Value", getF5Value());
		attributes.put("F5Mark", getF5Mark());
		attributes.put("F6Code", getF6Code());
		attributes.put("F6Name", getF6Name());
		attributes.put("F6Value", getF6Value());
		attributes.put("F6Mark", getF6Mark());
		attributes.put("F7Code", getF7Code());
		attributes.put("F7Name", getF7Name());
		attributes.put("F7Value", getF7Value());
		attributes.put("F7Mark", getF7Mark());
		attributes.put("F8Code", getF8Code());
		attributes.put("F8Name", getF8Name());
		attributes.put("F8Value", getF8Value());
		attributes.put("F8Mark", getF8Mark());
		attributes.put("F9Code", getF9Code());
		attributes.put("F9Name", getF9Name());
		attributes.put("F9Value", getF9Value());
		attributes.put("F9Mark", getF9Mark());
		attributes.put("F10Code", getF10Code());
		attributes.put("F10Name", getF10Name());
		attributes.put("F10Value", getF10Value());
		attributes.put("F10Mark", getF10Mark());
		attributes.put("F11Code", getF11Code());
		attributes.put("F11Name", getF11Name());
		attributes.put("F11Value", getF11Value());
		attributes.put("F11Mark", getF11Mark());
		attributes.put("F12Code", getF12Code());
		attributes.put("F12Name", getF12Name());
		attributes.put("F12Value", getF12Value());
		attributes.put("F12Mark", getF12Mark());
		attributes.put("F13Code", getF13Code());
		attributes.put("F13Name", getF13Name());
		attributes.put("F13Value", getF13Value());
		attributes.put("F13Mark", getF13Mark());
		attributes.put("F14Code", getF14Code());
		attributes.put("F14Name", getF14Name());
		attributes.put("F14Value", getF14Value());
		attributes.put("F14Mark", getF14Mark());
		attributes.put("F15Code", getF15Code());
		attributes.put("F15Name", getF15Name());
		attributes.put("F15Value", getF15Value());
		attributes.put("F15Mark", getF15Mark());
		attributes.put("F16Code", getF16Code());
		attributes.put("F16Name", getF16Name());
		attributes.put("F16Value", getF16Value());
		attributes.put("F16Mark", getF16Mark());
		attributes.put("F17Code", getF17Code());
		attributes.put("F17Name", getF17Name());
		attributes.put("F17Value", getF17Value());
		attributes.put("F17Mark", getF17Mark());
		attributes.put("F18Code", getF18Code());
		attributes.put("F18Name", getF18Name());
		attributes.put("F18Value", getF18Value());
		attributes.put("F18Mark", getF18Mark());
		attributes.put("F19Name", getF19Name());
		attributes.put("F19Code", getF19Code());
		attributes.put("F19Value", getF19Value());
		attributes.put("F19Mark", getF19Mark());
		attributes.put("F20Code", getF20Code());
		attributes.put("F20Name", getF20Name());
		attributes.put("F20Value", getF20Value());
		attributes.put("F20Mark", getF20Mark());
		attributes.put("F21Code", getF21Code());
		attributes.put("F21Name", getF21Name());
		attributes.put("F21Value", getF21Value());
		attributes.put("F21Mark", getF21Mark());
		attributes.put("F22Code", getF22Code());
		attributes.put("F22Name", getF22Name());
		attributes.put("F22Value", getF22Value());
		attributes.put("F22Mark", getF22Mark());
		attributes.put("F23Code", getF23Code());
		attributes.put("F23Name", getF23Name());
		attributes.put("F23Value", getF23Value());
		attributes.put("F23Mark", getF23Mark());
		attributes.put("SumMark", getSumMark());
		attributes.put("maker", getMaker());
		attributes.put("checker", getChecker());
		attributes.put("approver", getApprover());
		attributes.put("makermodified", getMakermodified());
		attributes.put("checkermodified", getCheckermodified());
		attributes.put("approvermodified", getApprovermodified());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessmentyear", getAssessmentyear());
		attributes.put("evaluationperiod", getEvaluationperiod());
		attributes.put("latestassessment", getLatestassessment());
		attributes.put("synchdate", getSynchdate());
		attributes.put("nextassessmentid", getNextassessmentid());
		attributes.put("nextassessmentyear", getNextassessmentyear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String importercode = (String)attributes.get("importercode");

		if (importercode != null) {
			setImportercode(importercode);
		}

		String importername = (String)attributes.get("importername");

		if (importername != null) {
			setImportername(importername);
		}

		String importeraddress = (String)attributes.get("importeraddress");

		if (importeraddress != null) {
			setImporteraddress(importeraddress);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String importercodereference = (String)attributes.get(
				"importercodereference");

		if (importercodereference != null) {
			setImportercodereference(importercodereference);
		}

		String F1Code = (String)attributes.get("F1Code");

		if (F1Code != null) {
			setF1Code(F1Code);
		}

		String F1Name = (String)attributes.get("F1Name");

		if (F1Name != null) {
			setF1Name(F1Name);
		}

		String F1Value = (String)attributes.get("F1Value");

		if (F1Value != null) {
			setF1Value(F1Value);
		}

		Double F1Mark = (Double)attributes.get("F1Mark");

		if (F1Mark != null) {
			setF1Mark(F1Mark);
		}

		String F2Code = (String)attributes.get("F2Code");

		if (F2Code != null) {
			setF2Code(F2Code);
		}

		String F2Name = (String)attributes.get("F2Name");

		if (F2Name != null) {
			setF2Name(F2Name);
		}

		String F2Value = (String)attributes.get("F2Value");

		if (F2Value != null) {
			setF2Value(F2Value);
		}

		Double F2Mark = (Double)attributes.get("F2Mark");

		if (F2Mark != null) {
			setF2Mark(F2Mark);
		}

		String F3Code = (String)attributes.get("F3Code");

		if (F3Code != null) {
			setF3Code(F3Code);
		}

		String F3Name = (String)attributes.get("F3Name");

		if (F3Name != null) {
			setF3Name(F3Name);
		}

		String F3Value = (String)attributes.get("F3Value");

		if (F3Value != null) {
			setF3Value(F3Value);
		}

		Double F3Mark = (Double)attributes.get("F3Mark");

		if (F3Mark != null) {
			setF3Mark(F3Mark);
		}

		String F4Code = (String)attributes.get("F4Code");

		if (F4Code != null) {
			setF4Code(F4Code);
		}

		String F4Name = (String)attributes.get("F4Name");

		if (F4Name != null) {
			setF4Name(F4Name);
		}

		String F4Value = (String)attributes.get("F4Value");

		if (F4Value != null) {
			setF4Value(F4Value);
		}

		Double F4Mark = (Double)attributes.get("F4Mark");

		if (F4Mark != null) {
			setF4Mark(F4Mark);
		}

		String F5Code = (String)attributes.get("F5Code");

		if (F5Code != null) {
			setF5Code(F5Code);
		}

		String F5Name = (String)attributes.get("F5Name");

		if (F5Name != null) {
			setF5Name(F5Name);
		}

		String F5Value = (String)attributes.get("F5Value");

		if (F5Value != null) {
			setF5Value(F5Value);
		}

		Double F5Mark = (Double)attributes.get("F5Mark");

		if (F5Mark != null) {
			setF5Mark(F5Mark);
		}

		String F6Code = (String)attributes.get("F6Code");

		if (F6Code != null) {
			setF6Code(F6Code);
		}

		String F6Name = (String)attributes.get("F6Name");

		if (F6Name != null) {
			setF6Name(F6Name);
		}

		String F6Value = (String)attributes.get("F6Value");

		if (F6Value != null) {
			setF6Value(F6Value);
		}

		Double F6Mark = (Double)attributes.get("F6Mark");

		if (F6Mark != null) {
			setF6Mark(F6Mark);
		}

		String F7Code = (String)attributes.get("F7Code");

		if (F7Code != null) {
			setF7Code(F7Code);
		}

		String F7Name = (String)attributes.get("F7Name");

		if (F7Name != null) {
			setF7Name(F7Name);
		}

		String F7Value = (String)attributes.get("F7Value");

		if (F7Value != null) {
			setF7Value(F7Value);
		}

		Double F7Mark = (Double)attributes.get("F7Mark");

		if (F7Mark != null) {
			setF7Mark(F7Mark);
		}

		String F8Code = (String)attributes.get("F8Code");

		if (F8Code != null) {
			setF8Code(F8Code);
		}

		String F8Name = (String)attributes.get("F8Name");

		if (F8Name != null) {
			setF8Name(F8Name);
		}

		String F8Value = (String)attributes.get("F8Value");

		if (F8Value != null) {
			setF8Value(F8Value);
		}

		Double F8Mark = (Double)attributes.get("F8Mark");

		if (F8Mark != null) {
			setF8Mark(F8Mark);
		}

		String F9Code = (String)attributes.get("F9Code");

		if (F9Code != null) {
			setF9Code(F9Code);
		}

		String F9Name = (String)attributes.get("F9Name");

		if (F9Name != null) {
			setF9Name(F9Name);
		}

		String F9Value = (String)attributes.get("F9Value");

		if (F9Value != null) {
			setF9Value(F9Value);
		}

		Double F9Mark = (Double)attributes.get("F9Mark");

		if (F9Mark != null) {
			setF9Mark(F9Mark);
		}

		String F10Code = (String)attributes.get("F10Code");

		if (F10Code != null) {
			setF10Code(F10Code);
		}

		String F10Name = (String)attributes.get("F10Name");

		if (F10Name != null) {
			setF10Name(F10Name);
		}

		String F10Value = (String)attributes.get("F10Value");

		if (F10Value != null) {
			setF10Value(F10Value);
		}

		Double F10Mark = (Double)attributes.get("F10Mark");

		if (F10Mark != null) {
			setF10Mark(F10Mark);
		}

		String F11Code = (String)attributes.get("F11Code");

		if (F11Code != null) {
			setF11Code(F11Code);
		}

		String F11Name = (String)attributes.get("F11Name");

		if (F11Name != null) {
			setF11Name(F11Name);
		}

		String F11Value = (String)attributes.get("F11Value");

		if (F11Value != null) {
			setF11Value(F11Value);
		}

		Double F11Mark = (Double)attributes.get("F11Mark");

		if (F11Mark != null) {
			setF11Mark(F11Mark);
		}

		String F12Code = (String)attributes.get("F12Code");

		if (F12Code != null) {
			setF12Code(F12Code);
		}

		String F12Name = (String)attributes.get("F12Name");

		if (F12Name != null) {
			setF12Name(F12Name);
		}

		String F12Value = (String)attributes.get("F12Value");

		if (F12Value != null) {
			setF12Value(F12Value);
		}

		Double F12Mark = (Double)attributes.get("F12Mark");

		if (F12Mark != null) {
			setF12Mark(F12Mark);
		}

		String F13Code = (String)attributes.get("F13Code");

		if (F13Code != null) {
			setF13Code(F13Code);
		}

		String F13Name = (String)attributes.get("F13Name");

		if (F13Name != null) {
			setF13Name(F13Name);
		}

		String F13Value = (String)attributes.get("F13Value");

		if (F13Value != null) {
			setF13Value(F13Value);
		}

		Double F13Mark = (Double)attributes.get("F13Mark");

		if (F13Mark != null) {
			setF13Mark(F13Mark);
		}

		String F14Code = (String)attributes.get("F14Code");

		if (F14Code != null) {
			setF14Code(F14Code);
		}

		String F14Name = (String)attributes.get("F14Name");

		if (F14Name != null) {
			setF14Name(F14Name);
		}

		String F14Value = (String)attributes.get("F14Value");

		if (F14Value != null) {
			setF14Value(F14Value);
		}

		Double F14Mark = (Double)attributes.get("F14Mark");

		if (F14Mark != null) {
			setF14Mark(F14Mark);
		}

		String F15Code = (String)attributes.get("F15Code");

		if (F15Code != null) {
			setF15Code(F15Code);
		}

		String F15Name = (String)attributes.get("F15Name");

		if (F15Name != null) {
			setF15Name(F15Name);
		}

		String F15Value = (String)attributes.get("F15Value");

		if (F15Value != null) {
			setF15Value(F15Value);
		}

		Double F15Mark = (Double)attributes.get("F15Mark");

		if (F15Mark != null) {
			setF15Mark(F15Mark);
		}

		String F16Code = (String)attributes.get("F16Code");

		if (F16Code != null) {
			setF16Code(F16Code);
		}

		String F16Name = (String)attributes.get("F16Name");

		if (F16Name != null) {
			setF16Name(F16Name);
		}

		String F16Value = (String)attributes.get("F16Value");

		if (F16Value != null) {
			setF16Value(F16Value);
		}

		Double F16Mark = (Double)attributes.get("F16Mark");

		if (F16Mark != null) {
			setF16Mark(F16Mark);
		}

		String F17Code = (String)attributes.get("F17Code");

		if (F17Code != null) {
			setF17Code(F17Code);
		}

		String F17Name = (String)attributes.get("F17Name");

		if (F17Name != null) {
			setF17Name(F17Name);
		}

		String F17Value = (String)attributes.get("F17Value");

		if (F17Value != null) {
			setF17Value(F17Value);
		}

		Double F17Mark = (Double)attributes.get("F17Mark");

		if (F17Mark != null) {
			setF17Mark(F17Mark);
		}

		String F18Code = (String)attributes.get("F18Code");

		if (F18Code != null) {
			setF18Code(F18Code);
		}

		String F18Name = (String)attributes.get("F18Name");

		if (F18Name != null) {
			setF18Name(F18Name);
		}

		String F18Value = (String)attributes.get("F18Value");

		if (F18Value != null) {
			setF18Value(F18Value);
		}

		Double F18Mark = (Double)attributes.get("F18Mark");

		if (F18Mark != null) {
			setF18Mark(F18Mark);
		}

		String F19Name = (String)attributes.get("F19Name");

		if (F19Name != null) {
			setF19Name(F19Name);
		}

		String F19Code = (String)attributes.get("F19Code");

		if (F19Code != null) {
			setF19Code(F19Code);
		}

		String F19Value = (String)attributes.get("F19Value");

		if (F19Value != null) {
			setF19Value(F19Value);
		}

		Double F19Mark = (Double)attributes.get("F19Mark");

		if (F19Mark != null) {
			setF19Mark(F19Mark);
		}

		String F20Code = (String)attributes.get("F20Code");

		if (F20Code != null) {
			setF20Code(F20Code);
		}

		String F20Name = (String)attributes.get("F20Name");

		if (F20Name != null) {
			setF20Name(F20Name);
		}

		String F20Value = (String)attributes.get("F20Value");

		if (F20Value != null) {
			setF20Value(F20Value);
		}

		Double F20Mark = (Double)attributes.get("F20Mark");

		if (F20Mark != null) {
			setF20Mark(F20Mark);
		}

		String F21Code = (String)attributes.get("F21Code");

		if (F21Code != null) {
			setF21Code(F21Code);
		}

		String F21Name = (String)attributes.get("F21Name");

		if (F21Name != null) {
			setF21Name(F21Name);
		}

		String F21Value = (String)attributes.get("F21Value");

		if (F21Value != null) {
			setF21Value(F21Value);
		}

		Double F21Mark = (Double)attributes.get("F21Mark");

		if (F21Mark != null) {
			setF21Mark(F21Mark);
		}

		String F22Code = (String)attributes.get("F22Code");

		if (F22Code != null) {
			setF22Code(F22Code);
		}

		String F22Name = (String)attributes.get("F22Name");

		if (F22Name != null) {
			setF22Name(F22Name);
		}

		String F22Value = (String)attributes.get("F22Value");

		if (F22Value != null) {
			setF22Value(F22Value);
		}

		Double F22Mark = (Double)attributes.get("F22Mark");

		if (F22Mark != null) {
			setF22Mark(F22Mark);
		}

		String F23Code = (String)attributes.get("F23Code");

		if (F23Code != null) {
			setF23Code(F23Code);
		}

		String F23Name = (String)attributes.get("F23Name");

		if (F23Name != null) {
			setF23Name(F23Name);
		}

		String F23Value = (String)attributes.get("F23Value");

		if (F23Value != null) {
			setF23Value(F23Value);
		}

		Double F23Mark = (Double)attributes.get("F23Mark");

		if (F23Mark != null) {
			setF23Mark(F23Mark);
		}

		Double SumMark = (Double)attributes.get("SumMark");

		if (SumMark != null) {
			setSumMark(SumMark);
		}

		String maker = (String)attributes.get("maker");

		if (maker != null) {
			setMaker(maker);
		}

		String checker = (String)attributes.get("checker");

		if (checker != null) {
			setChecker(checker);
		}

		String approver = (String)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		Date makermodified = (Date)attributes.get("makermodified");

		if (makermodified != null) {
			setMakermodified(makermodified);
		}

		Date checkermodified = (Date)attributes.get("checkermodified");

		if (checkermodified != null) {
			setCheckermodified(checkermodified);
		}

		Date approvermodified = (Date)attributes.get("approvermodified");

		if (approvermodified != null) {
			setApprovermodified(approvermodified);
		}

		String assessmentid = (String)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		String assessmentyear = (String)attributes.get("assessmentyear");

		if (assessmentyear != null) {
			setAssessmentyear(assessmentyear);
		}

		String evaluationperiod = (String)attributes.get("evaluationperiod");

		if (evaluationperiod != null) {
			setEvaluationperiod(evaluationperiod);
		}

		Date latestassessment = (Date)attributes.get("latestassessment");

		if (latestassessment != null) {
			setLatestassessment(latestassessment);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}

		String nextassessmentid = (String)attributes.get("nextassessmentid");

		if (nextassessmentid != null) {
			setNextassessmentid(nextassessmentid);
		}

		String nextassessmentyear = (String)attributes.get("nextassessmentyear");

		if (nextassessmentyear != null) {
			setNextassessmentyear(nextassessmentyear);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assessmentofImporterControlRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportercode() {
		return _importercode;
	}

	@Override
	public void setImportercode(String importercode) {
		_importercode = importercode;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setImportercode", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					importercode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportername() {
		return _importername;
	}

	@Override
	public void setImportername(String importername) {
		_importername = importername;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setImportername", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					importername);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporteraddress() {
		return _importeraddress;
	}

	@Override
	public void setImporteraddress(String importeraddress) {
		_importeraddress = importeraddress;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setImporteraddress",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					importeraddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportercodereference() {
		return _importercodereference;
	}

	@Override
	public void setImportercodereference(String importercodereference) {
		_importercodereference = importercodereference;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setImportercodereference",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					importercodereference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF1Code() {
		return _F1Code;
	}

	@Override
	public void setF1Code(String F1Code) {
		_F1Code = F1Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF1Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F1Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF1Name() {
		return _F1Name;
	}

	@Override
	public void setF1Name(String F1Name) {
		_F1Name = F1Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF1Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F1Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF1Value() {
		return _F1Value;
	}

	@Override
	public void setF1Value(String F1Value) {
		_F1Value = F1Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF1Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F1Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF1Mark() {
		return _F1Mark;
	}

	@Override
	public void setF1Mark(double F1Mark) {
		_F1Mark = F1Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF1Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F1Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF2Code() {
		return _F2Code;
	}

	@Override
	public void setF2Code(String F2Code) {
		_F2Code = F2Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF2Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F2Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF2Name() {
		return _F2Name;
	}

	@Override
	public void setF2Name(String F2Name) {
		_F2Name = F2Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF2Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F2Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF2Value() {
		return _F2Value;
	}

	@Override
	public void setF2Value(String F2Value) {
		_F2Value = F2Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF2Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F2Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF2Mark() {
		return _F2Mark;
	}

	@Override
	public void setF2Mark(double F2Mark) {
		_F2Mark = F2Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF2Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F2Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF3Code() {
		return _F3Code;
	}

	@Override
	public void setF3Code(String F3Code) {
		_F3Code = F3Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF3Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F3Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF3Name() {
		return _F3Name;
	}

	@Override
	public void setF3Name(String F3Name) {
		_F3Name = F3Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF3Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F3Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF3Value() {
		return _F3Value;
	}

	@Override
	public void setF3Value(String F3Value) {
		_F3Value = F3Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF3Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F3Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF3Mark() {
		return _F3Mark;
	}

	@Override
	public void setF3Mark(double F3Mark) {
		_F3Mark = F3Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF3Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F3Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF4Code() {
		return _F4Code;
	}

	@Override
	public void setF4Code(String F4Code) {
		_F4Code = F4Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF4Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F4Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF4Name() {
		return _F4Name;
	}

	@Override
	public void setF4Name(String F4Name) {
		_F4Name = F4Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF4Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F4Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF4Value() {
		return _F4Value;
	}

	@Override
	public void setF4Value(String F4Value) {
		_F4Value = F4Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF4Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F4Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF4Mark() {
		return _F4Mark;
	}

	@Override
	public void setF4Mark(double F4Mark) {
		_F4Mark = F4Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF4Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F4Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF5Code() {
		return _F5Code;
	}

	@Override
	public void setF5Code(String F5Code) {
		_F5Code = F5Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF5Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F5Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF5Name() {
		return _F5Name;
	}

	@Override
	public void setF5Name(String F5Name) {
		_F5Name = F5Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF5Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F5Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF5Value() {
		return _F5Value;
	}

	@Override
	public void setF5Value(String F5Value) {
		_F5Value = F5Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF5Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F5Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF5Mark() {
		return _F5Mark;
	}

	@Override
	public void setF5Mark(double F5Mark) {
		_F5Mark = F5Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF5Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F5Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF6Code() {
		return _F6Code;
	}

	@Override
	public void setF6Code(String F6Code) {
		_F6Code = F6Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF6Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F6Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF6Name() {
		return _F6Name;
	}

	@Override
	public void setF6Name(String F6Name) {
		_F6Name = F6Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF6Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F6Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF6Value() {
		return _F6Value;
	}

	@Override
	public void setF6Value(String F6Value) {
		_F6Value = F6Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF6Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F6Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF6Mark() {
		return _F6Mark;
	}

	@Override
	public void setF6Mark(double F6Mark) {
		_F6Mark = F6Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF6Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F6Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF7Code() {
		return _F7Code;
	}

	@Override
	public void setF7Code(String F7Code) {
		_F7Code = F7Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF7Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F7Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF7Name() {
		return _F7Name;
	}

	@Override
	public void setF7Name(String F7Name) {
		_F7Name = F7Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF7Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F7Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF7Value() {
		return _F7Value;
	}

	@Override
	public void setF7Value(String F7Value) {
		_F7Value = F7Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF7Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F7Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF7Mark() {
		return _F7Mark;
	}

	@Override
	public void setF7Mark(double F7Mark) {
		_F7Mark = F7Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF7Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F7Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF8Code() {
		return _F8Code;
	}

	@Override
	public void setF8Code(String F8Code) {
		_F8Code = F8Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF8Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F8Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF8Name() {
		return _F8Name;
	}

	@Override
	public void setF8Name(String F8Name) {
		_F8Name = F8Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF8Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F8Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF8Value() {
		return _F8Value;
	}

	@Override
	public void setF8Value(String F8Value) {
		_F8Value = F8Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF8Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F8Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF8Mark() {
		return _F8Mark;
	}

	@Override
	public void setF8Mark(double F8Mark) {
		_F8Mark = F8Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF8Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F8Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF9Code() {
		return _F9Code;
	}

	@Override
	public void setF9Code(String F9Code) {
		_F9Code = F9Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF9Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F9Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF9Name() {
		return _F9Name;
	}

	@Override
	public void setF9Name(String F9Name) {
		_F9Name = F9Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF9Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F9Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF9Value() {
		return _F9Value;
	}

	@Override
	public void setF9Value(String F9Value) {
		_F9Value = F9Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF9Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F9Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF9Mark() {
		return _F9Mark;
	}

	@Override
	public void setF9Mark(double F9Mark) {
		_F9Mark = F9Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF9Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F9Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF10Code() {
		return _F10Code;
	}

	@Override
	public void setF10Code(String F10Code) {
		_F10Code = F10Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF10Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F10Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF10Name() {
		return _F10Name;
	}

	@Override
	public void setF10Name(String F10Name) {
		_F10Name = F10Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF10Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F10Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF10Value() {
		return _F10Value;
	}

	@Override
	public void setF10Value(String F10Value) {
		_F10Value = F10Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF10Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F10Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF10Mark() {
		return _F10Mark;
	}

	@Override
	public void setF10Mark(double F10Mark) {
		_F10Mark = F10Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF10Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F10Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF11Code() {
		return _F11Code;
	}

	@Override
	public void setF11Code(String F11Code) {
		_F11Code = F11Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF11Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F11Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF11Name() {
		return _F11Name;
	}

	@Override
	public void setF11Name(String F11Name) {
		_F11Name = F11Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF11Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F11Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF11Value() {
		return _F11Value;
	}

	@Override
	public void setF11Value(String F11Value) {
		_F11Value = F11Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF11Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F11Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF11Mark() {
		return _F11Mark;
	}

	@Override
	public void setF11Mark(double F11Mark) {
		_F11Mark = F11Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF11Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F11Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF12Code() {
		return _F12Code;
	}

	@Override
	public void setF12Code(String F12Code) {
		_F12Code = F12Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF12Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F12Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF12Name() {
		return _F12Name;
	}

	@Override
	public void setF12Name(String F12Name) {
		_F12Name = F12Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF12Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F12Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF12Value() {
		return _F12Value;
	}

	@Override
	public void setF12Value(String F12Value) {
		_F12Value = F12Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF12Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F12Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF12Mark() {
		return _F12Mark;
	}

	@Override
	public void setF12Mark(double F12Mark) {
		_F12Mark = F12Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF12Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F12Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF13Code() {
		return _F13Code;
	}

	@Override
	public void setF13Code(String F13Code) {
		_F13Code = F13Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF13Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F13Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF13Name() {
		return _F13Name;
	}

	@Override
	public void setF13Name(String F13Name) {
		_F13Name = F13Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF13Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F13Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF13Value() {
		return _F13Value;
	}

	@Override
	public void setF13Value(String F13Value) {
		_F13Value = F13Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF13Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F13Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF13Mark() {
		return _F13Mark;
	}

	@Override
	public void setF13Mark(double F13Mark) {
		_F13Mark = F13Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF13Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F13Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF14Code() {
		return _F14Code;
	}

	@Override
	public void setF14Code(String F14Code) {
		_F14Code = F14Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF14Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F14Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF14Name() {
		return _F14Name;
	}

	@Override
	public void setF14Name(String F14Name) {
		_F14Name = F14Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF14Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F14Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF14Value() {
		return _F14Value;
	}

	@Override
	public void setF14Value(String F14Value) {
		_F14Value = F14Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF14Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F14Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF14Mark() {
		return _F14Mark;
	}

	@Override
	public void setF14Mark(double F14Mark) {
		_F14Mark = F14Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF14Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F14Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF15Code() {
		return _F15Code;
	}

	@Override
	public void setF15Code(String F15Code) {
		_F15Code = F15Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF15Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F15Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF15Name() {
		return _F15Name;
	}

	@Override
	public void setF15Name(String F15Name) {
		_F15Name = F15Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF15Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F15Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF15Value() {
		return _F15Value;
	}

	@Override
	public void setF15Value(String F15Value) {
		_F15Value = F15Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF15Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F15Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF15Mark() {
		return _F15Mark;
	}

	@Override
	public void setF15Mark(double F15Mark) {
		_F15Mark = F15Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF15Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F15Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF16Code() {
		return _F16Code;
	}

	@Override
	public void setF16Code(String F16Code) {
		_F16Code = F16Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF16Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F16Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF16Name() {
		return _F16Name;
	}

	@Override
	public void setF16Name(String F16Name) {
		_F16Name = F16Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF16Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F16Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF16Value() {
		return _F16Value;
	}

	@Override
	public void setF16Value(String F16Value) {
		_F16Value = F16Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF16Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F16Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF16Mark() {
		return _F16Mark;
	}

	@Override
	public void setF16Mark(double F16Mark) {
		_F16Mark = F16Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF16Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F16Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF17Code() {
		return _F17Code;
	}

	@Override
	public void setF17Code(String F17Code) {
		_F17Code = F17Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF17Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F17Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF17Name() {
		return _F17Name;
	}

	@Override
	public void setF17Name(String F17Name) {
		_F17Name = F17Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF17Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F17Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF17Value() {
		return _F17Value;
	}

	@Override
	public void setF17Value(String F17Value) {
		_F17Value = F17Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF17Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F17Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF17Mark() {
		return _F17Mark;
	}

	@Override
	public void setF17Mark(double F17Mark) {
		_F17Mark = F17Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF17Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F17Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF18Code() {
		return _F18Code;
	}

	@Override
	public void setF18Code(String F18Code) {
		_F18Code = F18Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF18Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F18Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF18Name() {
		return _F18Name;
	}

	@Override
	public void setF18Name(String F18Name) {
		_F18Name = F18Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF18Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F18Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF18Value() {
		return _F18Value;
	}

	@Override
	public void setF18Value(String F18Value) {
		_F18Value = F18Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF18Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F18Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF18Mark() {
		return _F18Mark;
	}

	@Override
	public void setF18Mark(double F18Mark) {
		_F18Mark = F18Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF18Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F18Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF19Name() {
		return _F19Name;
	}

	@Override
	public void setF19Name(String F19Name) {
		_F19Name = F19Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF19Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F19Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF19Code() {
		return _F19Code;
	}

	@Override
	public void setF19Code(String F19Code) {
		_F19Code = F19Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF19Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F19Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF19Value() {
		return _F19Value;
	}

	@Override
	public void setF19Value(String F19Value) {
		_F19Value = F19Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF19Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F19Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF19Mark() {
		return _F19Mark;
	}

	@Override
	public void setF19Mark(double F19Mark) {
		_F19Mark = F19Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF19Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F19Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF20Code() {
		return _F20Code;
	}

	@Override
	public void setF20Code(String F20Code) {
		_F20Code = F20Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF20Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F20Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF20Name() {
		return _F20Name;
	}

	@Override
	public void setF20Name(String F20Name) {
		_F20Name = F20Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF20Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F20Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF20Value() {
		return _F20Value;
	}

	@Override
	public void setF20Value(String F20Value) {
		_F20Value = F20Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF20Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F20Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF20Mark() {
		return _F20Mark;
	}

	@Override
	public void setF20Mark(double F20Mark) {
		_F20Mark = F20Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF20Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F20Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF21Code() {
		return _F21Code;
	}

	@Override
	public void setF21Code(String F21Code) {
		_F21Code = F21Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF21Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F21Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF21Name() {
		return _F21Name;
	}

	@Override
	public void setF21Name(String F21Name) {
		_F21Name = F21Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF21Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F21Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF21Value() {
		return _F21Value;
	}

	@Override
	public void setF21Value(String F21Value) {
		_F21Value = F21Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF21Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F21Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF21Mark() {
		return _F21Mark;
	}

	@Override
	public void setF21Mark(double F21Mark) {
		_F21Mark = F21Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF21Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F21Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF22Code() {
		return _F22Code;
	}

	@Override
	public void setF22Code(String F22Code) {
		_F22Code = F22Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF22Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F22Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF22Name() {
		return _F22Name;
	}

	@Override
	public void setF22Name(String F22Name) {
		_F22Name = F22Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF22Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F22Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF22Value() {
		return _F22Value;
	}

	@Override
	public void setF22Value(String F22Value) {
		_F22Value = F22Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF22Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F22Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF22Mark() {
		return _F22Mark;
	}

	@Override
	public void setF22Mark(double F22Mark) {
		_F22Mark = F22Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF22Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F22Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF23Code() {
		return _F23Code;
	}

	@Override
	public void setF23Code(String F23Code) {
		_F23Code = F23Code;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF23Code", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F23Code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF23Name() {
		return _F23Name;
	}

	@Override
	public void setF23Name(String F23Name) {
		_F23Name = F23Name;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF23Name", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F23Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getF23Value() {
		return _F23Value;
	}

	@Override
	public void setF23Value(String F23Value) {
		_F23Value = F23Value;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF23Value", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F23Value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getF23Mark() {
		return _F23Mark;
	}

	@Override
	public void setF23Mark(double F23Mark) {
		_F23Mark = F23Mark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setF23Mark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, F23Mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSumMark() {
		return _SumMark;
	}

	@Override
	public void setSumMark(double SumMark) {
		_SumMark = SumMark;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setSumMark", double.class);

				method.invoke(_assessmentofImporterControlRemoteModel, SumMark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaker() {
		return _maker;
	}

	@Override
	public void setMaker(String maker) {
		_maker = maker;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setMaker", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, maker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChecker() {
		return _checker;
	}

	@Override
	public void setChecker(String checker) {
		_checker = checker;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setChecker", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, checker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprover() {
		return _approver;
	}

	@Override
	public void setApprover(String approver) {
		_approver = approver;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setApprover", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel, approver);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakermodified() {
		return _makermodified;
	}

	@Override
	public void setMakermodified(Date makermodified) {
		_makermodified = makermodified;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setMakermodified", Date.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					makermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckermodified() {
		return _checkermodified;
	}

	@Override
	public void setCheckermodified(Date checkermodified) {
		_checkermodified = checkermodified;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckermodified", Date.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					checkermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovermodified() {
		return _approvermodified;
	}

	@Override
	public void setApprovermodified(Date approvermodified) {
		_approvermodified = approvermodified;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovermodified",
						Date.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					approvermodified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentid() {
		return _assessmentid;
	}

	@Override
	public void setAssessmentid(String assessmentid) {
		_assessmentid = assessmentid;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentid", String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					assessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAssessmentyear() {
		return _assessmentyear;
	}

	@Override
	public void setAssessmentyear(String assessmentyear) {
		_assessmentyear = assessmentyear;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessmentyear",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					assessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEvaluationperiod() {
		return _evaluationperiod;
	}

	@Override
	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationperiod",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					evaluationperiod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLatestassessment() {
		return _latestassessment;
	}

	@Override
	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setLatestassessment",
						Date.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					latestassessment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_assessmentofImporterControlRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextassessmentid() {
		return _nextassessmentid;
	}

	@Override
	public void setNextassessmentid(String nextassessmentid) {
		_nextassessmentid = nextassessmentid;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setNextassessmentid",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					nextassessmentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNextassessmentyear() {
		return _nextassessmentyear;
	}

	@Override
	public void setNextassessmentyear(String nextassessmentyear) {
		_nextassessmentyear = nextassessmentyear;

		if (_assessmentofImporterControlRemoteModel != null) {
			try {
				Class<?> clazz = _assessmentofImporterControlRemoteModel.getClass();

				Method method = clazz.getMethod("setNextassessmentyear",
						String.class);

				method.invoke(_assessmentofImporterControlRemoteModel,
					nextassessmentyear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessmentofImporterControlRemoteModel() {
		return _assessmentofImporterControlRemoteModel;
	}

	public void setAssessmentofImporterControlRemoteModel(
		BaseModel<?> assessmentofImporterControlRemoteModel) {
		_assessmentofImporterControlRemoteModel = assessmentofImporterControlRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assessmentofImporterControlRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assessmentofImporterControlRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessmentofImporterControlLocalServiceUtil.addAssessmentofImporterControl(this);
		}
		else {
			AssessmentofImporterControlLocalServiceUtil.updateAssessmentofImporterControl(this);
		}
	}

	@Override
	public AssessmentofImporterControl toEscapedModel() {
		return (AssessmentofImporterControl)ProxyUtil.newProxyInstance(AssessmentofImporterControl.class.getClassLoader(),
			new Class[] { AssessmentofImporterControl.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessmentofImporterControlClp clone = new AssessmentofImporterControlClp();

		clone.setId(getId());
		clone.setImportercode(getImportercode());
		clone.setImportername(getImportername());
		clone.setImporteraddress(getImporteraddress());
		clone.setRepresentative(getRepresentative());
		clone.setEmail(getEmail());
		clone.setPhone(getPhone());
		clone.setFax(getFax());
		clone.setImportercodereference(getImportercodereference());
		clone.setF1Code(getF1Code());
		clone.setF1Name(getF1Name());
		clone.setF1Value(getF1Value());
		clone.setF1Mark(getF1Mark());
		clone.setF2Code(getF2Code());
		clone.setF2Name(getF2Name());
		clone.setF2Value(getF2Value());
		clone.setF2Mark(getF2Mark());
		clone.setF3Code(getF3Code());
		clone.setF3Name(getF3Name());
		clone.setF3Value(getF3Value());
		clone.setF3Mark(getF3Mark());
		clone.setF4Code(getF4Code());
		clone.setF4Name(getF4Name());
		clone.setF4Value(getF4Value());
		clone.setF4Mark(getF4Mark());
		clone.setF5Code(getF5Code());
		clone.setF5Name(getF5Name());
		clone.setF5Value(getF5Value());
		clone.setF5Mark(getF5Mark());
		clone.setF6Code(getF6Code());
		clone.setF6Name(getF6Name());
		clone.setF6Value(getF6Value());
		clone.setF6Mark(getF6Mark());
		clone.setF7Code(getF7Code());
		clone.setF7Name(getF7Name());
		clone.setF7Value(getF7Value());
		clone.setF7Mark(getF7Mark());
		clone.setF8Code(getF8Code());
		clone.setF8Name(getF8Name());
		clone.setF8Value(getF8Value());
		clone.setF8Mark(getF8Mark());
		clone.setF9Code(getF9Code());
		clone.setF9Name(getF9Name());
		clone.setF9Value(getF9Value());
		clone.setF9Mark(getF9Mark());
		clone.setF10Code(getF10Code());
		clone.setF10Name(getF10Name());
		clone.setF10Value(getF10Value());
		clone.setF10Mark(getF10Mark());
		clone.setF11Code(getF11Code());
		clone.setF11Name(getF11Name());
		clone.setF11Value(getF11Value());
		clone.setF11Mark(getF11Mark());
		clone.setF12Code(getF12Code());
		clone.setF12Name(getF12Name());
		clone.setF12Value(getF12Value());
		clone.setF12Mark(getF12Mark());
		clone.setF13Code(getF13Code());
		clone.setF13Name(getF13Name());
		clone.setF13Value(getF13Value());
		clone.setF13Mark(getF13Mark());
		clone.setF14Code(getF14Code());
		clone.setF14Name(getF14Name());
		clone.setF14Value(getF14Value());
		clone.setF14Mark(getF14Mark());
		clone.setF15Code(getF15Code());
		clone.setF15Name(getF15Name());
		clone.setF15Value(getF15Value());
		clone.setF15Mark(getF15Mark());
		clone.setF16Code(getF16Code());
		clone.setF16Name(getF16Name());
		clone.setF16Value(getF16Value());
		clone.setF16Mark(getF16Mark());
		clone.setF17Code(getF17Code());
		clone.setF17Name(getF17Name());
		clone.setF17Value(getF17Value());
		clone.setF17Mark(getF17Mark());
		clone.setF18Code(getF18Code());
		clone.setF18Name(getF18Name());
		clone.setF18Value(getF18Value());
		clone.setF18Mark(getF18Mark());
		clone.setF19Name(getF19Name());
		clone.setF19Code(getF19Code());
		clone.setF19Value(getF19Value());
		clone.setF19Mark(getF19Mark());
		clone.setF20Code(getF20Code());
		clone.setF20Name(getF20Name());
		clone.setF20Value(getF20Value());
		clone.setF20Mark(getF20Mark());
		clone.setF21Code(getF21Code());
		clone.setF21Name(getF21Name());
		clone.setF21Value(getF21Value());
		clone.setF21Mark(getF21Mark());
		clone.setF22Code(getF22Code());
		clone.setF22Name(getF22Name());
		clone.setF22Value(getF22Value());
		clone.setF22Mark(getF22Mark());
		clone.setF23Code(getF23Code());
		clone.setF23Name(getF23Name());
		clone.setF23Value(getF23Value());
		clone.setF23Mark(getF23Mark());
		clone.setSumMark(getSumMark());
		clone.setMaker(getMaker());
		clone.setChecker(getChecker());
		clone.setApprover(getApprover());
		clone.setMakermodified(getMakermodified());
		clone.setCheckermodified(getCheckermodified());
		clone.setApprovermodified(getApprovermodified());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessmentyear(getAssessmentyear());
		clone.setEvaluationperiod(getEvaluationperiod());
		clone.setLatestassessment(getLatestassessment());
		clone.setSynchdate(getSynchdate());
		clone.setNextassessmentid(getNextassessmentid());
		clone.setNextassessmentyear(getNextassessmentyear());

		return clone;
	}

	@Override
	public int compareTo(
		AssessmentofImporterControl assessmentofImporterControl) {
		int value = 0;

		if (getId() < assessmentofImporterControl.getId()) {
			value = -1;
		}
		else if (getId() > assessmentofImporterControl.getId()) {
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

		if (!(obj instanceof AssessmentofImporterControlClp)) {
			return false;
		}

		AssessmentofImporterControlClp assessmentofImporterControl = (AssessmentofImporterControlClp)obj;

		long primaryKey = assessmentofImporterControl.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(231);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", importercode=");
		sb.append(getImportercode());
		sb.append(", importername=");
		sb.append(getImportername());
		sb.append(", importeraddress=");
		sb.append(getImporteraddress());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", importercodereference=");
		sb.append(getImportercodereference());
		sb.append(", F1Code=");
		sb.append(getF1Code());
		sb.append(", F1Name=");
		sb.append(getF1Name());
		sb.append(", F1Value=");
		sb.append(getF1Value());
		sb.append(", F1Mark=");
		sb.append(getF1Mark());
		sb.append(", F2Code=");
		sb.append(getF2Code());
		sb.append(", F2Name=");
		sb.append(getF2Name());
		sb.append(", F2Value=");
		sb.append(getF2Value());
		sb.append(", F2Mark=");
		sb.append(getF2Mark());
		sb.append(", F3Code=");
		sb.append(getF3Code());
		sb.append(", F3Name=");
		sb.append(getF3Name());
		sb.append(", F3Value=");
		sb.append(getF3Value());
		sb.append(", F3Mark=");
		sb.append(getF3Mark());
		sb.append(", F4Code=");
		sb.append(getF4Code());
		sb.append(", F4Name=");
		sb.append(getF4Name());
		sb.append(", F4Value=");
		sb.append(getF4Value());
		sb.append(", F4Mark=");
		sb.append(getF4Mark());
		sb.append(", F5Code=");
		sb.append(getF5Code());
		sb.append(", F5Name=");
		sb.append(getF5Name());
		sb.append(", F5Value=");
		sb.append(getF5Value());
		sb.append(", F5Mark=");
		sb.append(getF5Mark());
		sb.append(", F6Code=");
		sb.append(getF6Code());
		sb.append(", F6Name=");
		sb.append(getF6Name());
		sb.append(", F6Value=");
		sb.append(getF6Value());
		sb.append(", F6Mark=");
		sb.append(getF6Mark());
		sb.append(", F7Code=");
		sb.append(getF7Code());
		sb.append(", F7Name=");
		sb.append(getF7Name());
		sb.append(", F7Value=");
		sb.append(getF7Value());
		sb.append(", F7Mark=");
		sb.append(getF7Mark());
		sb.append(", F8Code=");
		sb.append(getF8Code());
		sb.append(", F8Name=");
		sb.append(getF8Name());
		sb.append(", F8Value=");
		sb.append(getF8Value());
		sb.append(", F8Mark=");
		sb.append(getF8Mark());
		sb.append(", F9Code=");
		sb.append(getF9Code());
		sb.append(", F9Name=");
		sb.append(getF9Name());
		sb.append(", F9Value=");
		sb.append(getF9Value());
		sb.append(", F9Mark=");
		sb.append(getF9Mark());
		sb.append(", F10Code=");
		sb.append(getF10Code());
		sb.append(", F10Name=");
		sb.append(getF10Name());
		sb.append(", F10Value=");
		sb.append(getF10Value());
		sb.append(", F10Mark=");
		sb.append(getF10Mark());
		sb.append(", F11Code=");
		sb.append(getF11Code());
		sb.append(", F11Name=");
		sb.append(getF11Name());
		sb.append(", F11Value=");
		sb.append(getF11Value());
		sb.append(", F11Mark=");
		sb.append(getF11Mark());
		sb.append(", F12Code=");
		sb.append(getF12Code());
		sb.append(", F12Name=");
		sb.append(getF12Name());
		sb.append(", F12Value=");
		sb.append(getF12Value());
		sb.append(", F12Mark=");
		sb.append(getF12Mark());
		sb.append(", F13Code=");
		sb.append(getF13Code());
		sb.append(", F13Name=");
		sb.append(getF13Name());
		sb.append(", F13Value=");
		sb.append(getF13Value());
		sb.append(", F13Mark=");
		sb.append(getF13Mark());
		sb.append(", F14Code=");
		sb.append(getF14Code());
		sb.append(", F14Name=");
		sb.append(getF14Name());
		sb.append(", F14Value=");
		sb.append(getF14Value());
		sb.append(", F14Mark=");
		sb.append(getF14Mark());
		sb.append(", F15Code=");
		sb.append(getF15Code());
		sb.append(", F15Name=");
		sb.append(getF15Name());
		sb.append(", F15Value=");
		sb.append(getF15Value());
		sb.append(", F15Mark=");
		sb.append(getF15Mark());
		sb.append(", F16Code=");
		sb.append(getF16Code());
		sb.append(", F16Name=");
		sb.append(getF16Name());
		sb.append(", F16Value=");
		sb.append(getF16Value());
		sb.append(", F16Mark=");
		sb.append(getF16Mark());
		sb.append(", F17Code=");
		sb.append(getF17Code());
		sb.append(", F17Name=");
		sb.append(getF17Name());
		sb.append(", F17Value=");
		sb.append(getF17Value());
		sb.append(", F17Mark=");
		sb.append(getF17Mark());
		sb.append(", F18Code=");
		sb.append(getF18Code());
		sb.append(", F18Name=");
		sb.append(getF18Name());
		sb.append(", F18Value=");
		sb.append(getF18Value());
		sb.append(", F18Mark=");
		sb.append(getF18Mark());
		sb.append(", F19Name=");
		sb.append(getF19Name());
		sb.append(", F19Code=");
		sb.append(getF19Code());
		sb.append(", F19Value=");
		sb.append(getF19Value());
		sb.append(", F19Mark=");
		sb.append(getF19Mark());
		sb.append(", F20Code=");
		sb.append(getF20Code());
		sb.append(", F20Name=");
		sb.append(getF20Name());
		sb.append(", F20Value=");
		sb.append(getF20Value());
		sb.append(", F20Mark=");
		sb.append(getF20Mark());
		sb.append(", F21Code=");
		sb.append(getF21Code());
		sb.append(", F21Name=");
		sb.append(getF21Name());
		sb.append(", F21Value=");
		sb.append(getF21Value());
		sb.append(", F21Mark=");
		sb.append(getF21Mark());
		sb.append(", F22Code=");
		sb.append(getF22Code());
		sb.append(", F22Name=");
		sb.append(getF22Name());
		sb.append(", F22Value=");
		sb.append(getF22Value());
		sb.append(", F22Mark=");
		sb.append(getF22Mark());
		sb.append(", F23Code=");
		sb.append(getF23Code());
		sb.append(", F23Name=");
		sb.append(getF23Name());
		sb.append(", F23Value=");
		sb.append(getF23Value());
		sb.append(", F23Mark=");
		sb.append(getF23Mark());
		sb.append(", SumMark=");
		sb.append(getSumMark());
		sb.append(", maker=");
		sb.append(getMaker());
		sb.append(", checker=");
		sb.append(getChecker());
		sb.append(", approver=");
		sb.append(getApprover());
		sb.append(", makermodified=");
		sb.append(getMakermodified());
		sb.append(", checkermodified=");
		sb.append(getCheckermodified());
		sb.append(", approvermodified=");
		sb.append(getApprovermodified());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessmentyear=");
		sb.append(getAssessmentyear());
		sb.append(", evaluationperiod=");
		sb.append(getEvaluationperiod());
		sb.append(", latestassessment=");
		sb.append(getLatestassessment());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append(", nextassessmentid=");
		sb.append(getNextassessmentid());
		sb.append(", nextassessmentyear=");
		sb.append(getNextassessmentyear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(349);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importercode</column-name><column-value><![CDATA[");
		sb.append(getImportercode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importername</column-name><column-value><![CDATA[");
		sb.append(getImportername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importeraddress</column-name><column-value><![CDATA[");
		sb.append(getImporteraddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importercodereference</column-name><column-value><![CDATA[");
		sb.append(getImportercodereference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F1Code</column-name><column-value><![CDATA[");
		sb.append(getF1Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F1Name</column-name><column-value><![CDATA[");
		sb.append(getF1Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F1Value</column-name><column-value><![CDATA[");
		sb.append(getF1Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F1Mark</column-name><column-value><![CDATA[");
		sb.append(getF1Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F2Code</column-name><column-value><![CDATA[");
		sb.append(getF2Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F2Name</column-name><column-value><![CDATA[");
		sb.append(getF2Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F2Value</column-name><column-value><![CDATA[");
		sb.append(getF2Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F2Mark</column-name><column-value><![CDATA[");
		sb.append(getF2Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F3Code</column-name><column-value><![CDATA[");
		sb.append(getF3Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F3Name</column-name><column-value><![CDATA[");
		sb.append(getF3Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F3Value</column-name><column-value><![CDATA[");
		sb.append(getF3Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F3Mark</column-name><column-value><![CDATA[");
		sb.append(getF3Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F4Code</column-name><column-value><![CDATA[");
		sb.append(getF4Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F4Name</column-name><column-value><![CDATA[");
		sb.append(getF4Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F4Value</column-name><column-value><![CDATA[");
		sb.append(getF4Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F4Mark</column-name><column-value><![CDATA[");
		sb.append(getF4Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F5Code</column-name><column-value><![CDATA[");
		sb.append(getF5Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F5Name</column-name><column-value><![CDATA[");
		sb.append(getF5Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F5Value</column-name><column-value><![CDATA[");
		sb.append(getF5Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F5Mark</column-name><column-value><![CDATA[");
		sb.append(getF5Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F6Code</column-name><column-value><![CDATA[");
		sb.append(getF6Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F6Name</column-name><column-value><![CDATA[");
		sb.append(getF6Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F6Value</column-name><column-value><![CDATA[");
		sb.append(getF6Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F6Mark</column-name><column-value><![CDATA[");
		sb.append(getF6Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F7Code</column-name><column-value><![CDATA[");
		sb.append(getF7Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F7Name</column-name><column-value><![CDATA[");
		sb.append(getF7Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F7Value</column-name><column-value><![CDATA[");
		sb.append(getF7Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F7Mark</column-name><column-value><![CDATA[");
		sb.append(getF7Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F8Code</column-name><column-value><![CDATA[");
		sb.append(getF8Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F8Name</column-name><column-value><![CDATA[");
		sb.append(getF8Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F8Value</column-name><column-value><![CDATA[");
		sb.append(getF8Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F8Mark</column-name><column-value><![CDATA[");
		sb.append(getF8Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F9Code</column-name><column-value><![CDATA[");
		sb.append(getF9Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F9Name</column-name><column-value><![CDATA[");
		sb.append(getF9Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F9Value</column-name><column-value><![CDATA[");
		sb.append(getF9Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F9Mark</column-name><column-value><![CDATA[");
		sb.append(getF9Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F10Code</column-name><column-value><![CDATA[");
		sb.append(getF10Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F10Name</column-name><column-value><![CDATA[");
		sb.append(getF10Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F10Value</column-name><column-value><![CDATA[");
		sb.append(getF10Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F10Mark</column-name><column-value><![CDATA[");
		sb.append(getF10Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F11Code</column-name><column-value><![CDATA[");
		sb.append(getF11Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F11Name</column-name><column-value><![CDATA[");
		sb.append(getF11Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F11Value</column-name><column-value><![CDATA[");
		sb.append(getF11Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F11Mark</column-name><column-value><![CDATA[");
		sb.append(getF11Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F12Code</column-name><column-value><![CDATA[");
		sb.append(getF12Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F12Name</column-name><column-value><![CDATA[");
		sb.append(getF12Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F12Value</column-name><column-value><![CDATA[");
		sb.append(getF12Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F12Mark</column-name><column-value><![CDATA[");
		sb.append(getF12Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F13Code</column-name><column-value><![CDATA[");
		sb.append(getF13Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F13Name</column-name><column-value><![CDATA[");
		sb.append(getF13Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F13Value</column-name><column-value><![CDATA[");
		sb.append(getF13Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F13Mark</column-name><column-value><![CDATA[");
		sb.append(getF13Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F14Code</column-name><column-value><![CDATA[");
		sb.append(getF14Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F14Name</column-name><column-value><![CDATA[");
		sb.append(getF14Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F14Value</column-name><column-value><![CDATA[");
		sb.append(getF14Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F14Mark</column-name><column-value><![CDATA[");
		sb.append(getF14Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F15Code</column-name><column-value><![CDATA[");
		sb.append(getF15Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F15Name</column-name><column-value><![CDATA[");
		sb.append(getF15Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F15Value</column-name><column-value><![CDATA[");
		sb.append(getF15Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F15Mark</column-name><column-value><![CDATA[");
		sb.append(getF15Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F16Code</column-name><column-value><![CDATA[");
		sb.append(getF16Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F16Name</column-name><column-value><![CDATA[");
		sb.append(getF16Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F16Value</column-name><column-value><![CDATA[");
		sb.append(getF16Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F16Mark</column-name><column-value><![CDATA[");
		sb.append(getF16Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F17Code</column-name><column-value><![CDATA[");
		sb.append(getF17Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F17Name</column-name><column-value><![CDATA[");
		sb.append(getF17Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F17Value</column-name><column-value><![CDATA[");
		sb.append(getF17Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F17Mark</column-name><column-value><![CDATA[");
		sb.append(getF17Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F18Code</column-name><column-value><![CDATA[");
		sb.append(getF18Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F18Name</column-name><column-value><![CDATA[");
		sb.append(getF18Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F18Value</column-name><column-value><![CDATA[");
		sb.append(getF18Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F18Mark</column-name><column-value><![CDATA[");
		sb.append(getF18Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F19Name</column-name><column-value><![CDATA[");
		sb.append(getF19Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F19Code</column-name><column-value><![CDATA[");
		sb.append(getF19Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F19Value</column-name><column-value><![CDATA[");
		sb.append(getF19Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F19Mark</column-name><column-value><![CDATA[");
		sb.append(getF19Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F20Code</column-name><column-value><![CDATA[");
		sb.append(getF20Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F20Name</column-name><column-value><![CDATA[");
		sb.append(getF20Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F20Value</column-name><column-value><![CDATA[");
		sb.append(getF20Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F20Mark</column-name><column-value><![CDATA[");
		sb.append(getF20Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F21Code</column-name><column-value><![CDATA[");
		sb.append(getF21Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F21Name</column-name><column-value><![CDATA[");
		sb.append(getF21Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F21Value</column-name><column-value><![CDATA[");
		sb.append(getF21Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F21Mark</column-name><column-value><![CDATA[");
		sb.append(getF21Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F22Code</column-name><column-value><![CDATA[");
		sb.append(getF22Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F22Name</column-name><column-value><![CDATA[");
		sb.append(getF22Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F22Value</column-name><column-value><![CDATA[");
		sb.append(getF22Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F22Mark</column-name><column-value><![CDATA[");
		sb.append(getF22Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F23Code</column-name><column-value><![CDATA[");
		sb.append(getF23Code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F23Name</column-name><column-value><![CDATA[");
		sb.append(getF23Name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F23Value</column-name><column-value><![CDATA[");
		sb.append(getF23Value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>F23Mark</column-name><column-value><![CDATA[");
		sb.append(getF23Mark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SumMark</column-name><column-value><![CDATA[");
		sb.append(getSumMark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maker</column-name><column-value><![CDATA[");
		sb.append(getMaker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checker</column-name><column-value><![CDATA[");
		sb.append(getChecker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approver</column-name><column-value><![CDATA[");
		sb.append(getApprover());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makermodified</column-name><column-value><![CDATA[");
		sb.append(getMakermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkermodified</column-name><column-value><![CDATA[");
		sb.append(getCheckermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvermodified</column-name><column-value><![CDATA[");
		sb.append(getApprovermodified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentid</column-name><column-value><![CDATA[");
		sb.append(getAssessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentyear</column-name><column-value><![CDATA[");
		sb.append(getAssessmentyear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationperiod</column-name><column-value><![CDATA[");
		sb.append(getEvaluationperiod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestassessment</column-name><column-value><![CDATA[");
		sb.append(getLatestassessment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextassessmentid</column-name><column-value><![CDATA[");
		sb.append(getNextassessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextassessmentyear</column-name><column-value><![CDATA[");
		sb.append(getNextassessmentyear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _importercode;
	private String _importername;
	private String _importeraddress;
	private String _representative;
	private String _email;
	private String _phone;
	private String _fax;
	private String _importercodereference;
	private String _F1Code;
	private String _F1Name;
	private String _F1Value;
	private double _F1Mark;
	private String _F2Code;
	private String _F2Name;
	private String _F2Value;
	private double _F2Mark;
	private String _F3Code;
	private String _F3Name;
	private String _F3Value;
	private double _F3Mark;
	private String _F4Code;
	private String _F4Name;
	private String _F4Value;
	private double _F4Mark;
	private String _F5Code;
	private String _F5Name;
	private String _F5Value;
	private double _F5Mark;
	private String _F6Code;
	private String _F6Name;
	private String _F6Value;
	private double _F6Mark;
	private String _F7Code;
	private String _F7Name;
	private String _F7Value;
	private double _F7Mark;
	private String _F8Code;
	private String _F8Name;
	private String _F8Value;
	private double _F8Mark;
	private String _F9Code;
	private String _F9Name;
	private String _F9Value;
	private double _F9Mark;
	private String _F10Code;
	private String _F10Name;
	private String _F10Value;
	private double _F10Mark;
	private String _F11Code;
	private String _F11Name;
	private String _F11Value;
	private double _F11Mark;
	private String _F12Code;
	private String _F12Name;
	private String _F12Value;
	private double _F12Mark;
	private String _F13Code;
	private String _F13Name;
	private String _F13Value;
	private double _F13Mark;
	private String _F14Code;
	private String _F14Name;
	private String _F14Value;
	private double _F14Mark;
	private String _F15Code;
	private String _F15Name;
	private String _F15Value;
	private double _F15Mark;
	private String _F16Code;
	private String _F16Name;
	private String _F16Value;
	private double _F16Mark;
	private String _F17Code;
	private String _F17Name;
	private String _F17Value;
	private double _F17Mark;
	private String _F18Code;
	private String _F18Name;
	private String _F18Value;
	private double _F18Mark;
	private String _F19Name;
	private String _F19Code;
	private String _F19Value;
	private double _F19Mark;
	private String _F20Code;
	private String _F20Name;
	private String _F20Value;
	private double _F20Mark;
	private String _F21Code;
	private String _F21Name;
	private String _F21Value;
	private double _F21Mark;
	private String _F22Code;
	private String _F22Name;
	private String _F22Value;
	private double _F22Mark;
	private String _F23Code;
	private String _F23Name;
	private String _F23Value;
	private double _F23Mark;
	private double _SumMark;
	private String _maker;
	private String _checker;
	private String _approver;
	private Date _makermodified;
	private Date _checkermodified;
	private Date _approvermodified;
	private String _assessmentid;
	private String _assessmentyear;
	private String _evaluationperiod;
	private Date _latestassessment;
	private Date _synchdate;
	private String _nextassessmentid;
	private String _nextassessmentyear;
	private BaseModel<?> _assessmentofImporterControlRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}