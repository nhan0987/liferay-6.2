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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssessmentofImporterControl}.
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterControl
 * @generated
 */
public class AssessmentofImporterControlWrapper
	implements AssessmentofImporterControl,
		ModelWrapper<AssessmentofImporterControl> {
	public AssessmentofImporterControlWrapper(
		AssessmentofImporterControl assessmentofImporterControl) {
		_assessmentofImporterControl = assessmentofImporterControl;
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

	/**
	* Returns the primary key of this assessmentof importer control.
	*
	* @return the primary key of this assessmentof importer control
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentofImporterControl.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessmentof importer control.
	*
	* @param primaryKey the primary key of this assessmentof importer control
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentofImporterControl.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessmentof importer control.
	*
	* @return the ID of this assessmentof importer control
	*/
	@Override
	public long getId() {
		return _assessmentofImporterControl.getId();
	}

	/**
	* Sets the ID of this assessmentof importer control.
	*
	* @param id the ID of this assessmentof importer control
	*/
	@Override
	public void setId(long id) {
		_assessmentofImporterControl.setId(id);
	}

	/**
	* Returns the importercode of this assessmentof importer control.
	*
	* @return the importercode of this assessmentof importer control
	*/
	@Override
	public java.lang.String getImportercode() {
		return _assessmentofImporterControl.getImportercode();
	}

	/**
	* Sets the importercode of this assessmentof importer control.
	*
	* @param importercode the importercode of this assessmentof importer control
	*/
	@Override
	public void setImportercode(java.lang.String importercode) {
		_assessmentofImporterControl.setImportercode(importercode);
	}

	/**
	* Returns the importername of this assessmentof importer control.
	*
	* @return the importername of this assessmentof importer control
	*/
	@Override
	public java.lang.String getImportername() {
		return _assessmentofImporterControl.getImportername();
	}

	/**
	* Sets the importername of this assessmentof importer control.
	*
	* @param importername the importername of this assessmentof importer control
	*/
	@Override
	public void setImportername(java.lang.String importername) {
		_assessmentofImporterControl.setImportername(importername);
	}

	/**
	* Returns the importeraddress of this assessmentof importer control.
	*
	* @return the importeraddress of this assessmentof importer control
	*/
	@Override
	public java.lang.String getImporteraddress() {
		return _assessmentofImporterControl.getImporteraddress();
	}

	/**
	* Sets the importeraddress of this assessmentof importer control.
	*
	* @param importeraddress the importeraddress of this assessmentof importer control
	*/
	@Override
	public void setImporteraddress(java.lang.String importeraddress) {
		_assessmentofImporterControl.setImporteraddress(importeraddress);
	}

	/**
	* Returns the representative of this assessmentof importer control.
	*
	* @return the representative of this assessmentof importer control
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _assessmentofImporterControl.getRepresentative();
	}

	/**
	* Sets the representative of this assessmentof importer control.
	*
	* @param representative the representative of this assessmentof importer control
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_assessmentofImporterControl.setRepresentative(representative);
	}

	/**
	* Returns the email of this assessmentof importer control.
	*
	* @return the email of this assessmentof importer control
	*/
	@Override
	public java.lang.String getEmail() {
		return _assessmentofImporterControl.getEmail();
	}

	/**
	* Sets the email of this assessmentof importer control.
	*
	* @param email the email of this assessmentof importer control
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_assessmentofImporterControl.setEmail(email);
	}

	/**
	* Returns the phone of this assessmentof importer control.
	*
	* @return the phone of this assessmentof importer control
	*/
	@Override
	public java.lang.String getPhone() {
		return _assessmentofImporterControl.getPhone();
	}

	/**
	* Sets the phone of this assessmentof importer control.
	*
	* @param phone the phone of this assessmentof importer control
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_assessmentofImporterControl.setPhone(phone);
	}

	/**
	* Returns the fax of this assessmentof importer control.
	*
	* @return the fax of this assessmentof importer control
	*/
	@Override
	public java.lang.String getFax() {
		return _assessmentofImporterControl.getFax();
	}

	/**
	* Sets the fax of this assessmentof importer control.
	*
	* @param fax the fax of this assessmentof importer control
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_assessmentofImporterControl.setFax(fax);
	}

	/**
	* Returns the importercodereference of this assessmentof importer control.
	*
	* @return the importercodereference of this assessmentof importer control
	*/
	@Override
	public java.lang.String getImportercodereference() {
		return _assessmentofImporterControl.getImportercodereference();
	}

	/**
	* Sets the importercodereference of this assessmentof importer control.
	*
	* @param importercodereference the importercodereference of this assessmentof importer control
	*/
	@Override
	public void setImportercodereference(java.lang.String importercodereference) {
		_assessmentofImporterControl.setImportercodereference(importercodereference);
	}

	/**
	* Returns the f1 code of this assessmentof importer control.
	*
	* @return the f1 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF1Code() {
		return _assessmentofImporterControl.getF1Code();
	}

	/**
	* Sets the f1 code of this assessmentof importer control.
	*
	* @param F1Code the f1 code of this assessmentof importer control
	*/
	@Override
	public void setF1Code(java.lang.String F1Code) {
		_assessmentofImporterControl.setF1Code(F1Code);
	}

	/**
	* Returns the f1 name of this assessmentof importer control.
	*
	* @return the f1 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF1Name() {
		return _assessmentofImporterControl.getF1Name();
	}

	/**
	* Sets the f1 name of this assessmentof importer control.
	*
	* @param F1Name the f1 name of this assessmentof importer control
	*/
	@Override
	public void setF1Name(java.lang.String F1Name) {
		_assessmentofImporterControl.setF1Name(F1Name);
	}

	/**
	* Returns the f1 value of this assessmentof importer control.
	*
	* @return the f1 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF1Value() {
		return _assessmentofImporterControl.getF1Value();
	}

	/**
	* Sets the f1 value of this assessmentof importer control.
	*
	* @param F1Value the f1 value of this assessmentof importer control
	*/
	@Override
	public void setF1Value(java.lang.String F1Value) {
		_assessmentofImporterControl.setF1Value(F1Value);
	}

	/**
	* Returns the f1 mark of this assessmentof importer control.
	*
	* @return the f1 mark of this assessmentof importer control
	*/
	@Override
	public double getF1Mark() {
		return _assessmentofImporterControl.getF1Mark();
	}

	/**
	* Sets the f1 mark of this assessmentof importer control.
	*
	* @param F1Mark the f1 mark of this assessmentof importer control
	*/
	@Override
	public void setF1Mark(double F1Mark) {
		_assessmentofImporterControl.setF1Mark(F1Mark);
	}

	/**
	* Returns the f2 code of this assessmentof importer control.
	*
	* @return the f2 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF2Code() {
		return _assessmentofImporterControl.getF2Code();
	}

	/**
	* Sets the f2 code of this assessmentof importer control.
	*
	* @param F2Code the f2 code of this assessmentof importer control
	*/
	@Override
	public void setF2Code(java.lang.String F2Code) {
		_assessmentofImporterControl.setF2Code(F2Code);
	}

	/**
	* Returns the f2 name of this assessmentof importer control.
	*
	* @return the f2 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF2Name() {
		return _assessmentofImporterControl.getF2Name();
	}

	/**
	* Sets the f2 name of this assessmentof importer control.
	*
	* @param F2Name the f2 name of this assessmentof importer control
	*/
	@Override
	public void setF2Name(java.lang.String F2Name) {
		_assessmentofImporterControl.setF2Name(F2Name);
	}

	/**
	* Returns the f2 value of this assessmentof importer control.
	*
	* @return the f2 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF2Value() {
		return _assessmentofImporterControl.getF2Value();
	}

	/**
	* Sets the f2 value of this assessmentof importer control.
	*
	* @param F2Value the f2 value of this assessmentof importer control
	*/
	@Override
	public void setF2Value(java.lang.String F2Value) {
		_assessmentofImporterControl.setF2Value(F2Value);
	}

	/**
	* Returns the f2 mark of this assessmentof importer control.
	*
	* @return the f2 mark of this assessmentof importer control
	*/
	@Override
	public double getF2Mark() {
		return _assessmentofImporterControl.getF2Mark();
	}

	/**
	* Sets the f2 mark of this assessmentof importer control.
	*
	* @param F2Mark the f2 mark of this assessmentof importer control
	*/
	@Override
	public void setF2Mark(double F2Mark) {
		_assessmentofImporterControl.setF2Mark(F2Mark);
	}

	/**
	* Returns the f3 code of this assessmentof importer control.
	*
	* @return the f3 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF3Code() {
		return _assessmentofImporterControl.getF3Code();
	}

	/**
	* Sets the f3 code of this assessmentof importer control.
	*
	* @param F3Code the f3 code of this assessmentof importer control
	*/
	@Override
	public void setF3Code(java.lang.String F3Code) {
		_assessmentofImporterControl.setF3Code(F3Code);
	}

	/**
	* Returns the f3 name of this assessmentof importer control.
	*
	* @return the f3 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF3Name() {
		return _assessmentofImporterControl.getF3Name();
	}

	/**
	* Sets the f3 name of this assessmentof importer control.
	*
	* @param F3Name the f3 name of this assessmentof importer control
	*/
	@Override
	public void setF3Name(java.lang.String F3Name) {
		_assessmentofImporterControl.setF3Name(F3Name);
	}

	/**
	* Returns the f3 value of this assessmentof importer control.
	*
	* @return the f3 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF3Value() {
		return _assessmentofImporterControl.getF3Value();
	}

	/**
	* Sets the f3 value of this assessmentof importer control.
	*
	* @param F3Value the f3 value of this assessmentof importer control
	*/
	@Override
	public void setF3Value(java.lang.String F3Value) {
		_assessmentofImporterControl.setF3Value(F3Value);
	}

	/**
	* Returns the f3 mark of this assessmentof importer control.
	*
	* @return the f3 mark of this assessmentof importer control
	*/
	@Override
	public double getF3Mark() {
		return _assessmentofImporterControl.getF3Mark();
	}

	/**
	* Sets the f3 mark of this assessmentof importer control.
	*
	* @param F3Mark the f3 mark of this assessmentof importer control
	*/
	@Override
	public void setF3Mark(double F3Mark) {
		_assessmentofImporterControl.setF3Mark(F3Mark);
	}

	/**
	* Returns the f4 code of this assessmentof importer control.
	*
	* @return the f4 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF4Code() {
		return _assessmentofImporterControl.getF4Code();
	}

	/**
	* Sets the f4 code of this assessmentof importer control.
	*
	* @param F4Code the f4 code of this assessmentof importer control
	*/
	@Override
	public void setF4Code(java.lang.String F4Code) {
		_assessmentofImporterControl.setF4Code(F4Code);
	}

	/**
	* Returns the f4 name of this assessmentof importer control.
	*
	* @return the f4 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF4Name() {
		return _assessmentofImporterControl.getF4Name();
	}

	/**
	* Sets the f4 name of this assessmentof importer control.
	*
	* @param F4Name the f4 name of this assessmentof importer control
	*/
	@Override
	public void setF4Name(java.lang.String F4Name) {
		_assessmentofImporterControl.setF4Name(F4Name);
	}

	/**
	* Returns the f4 value of this assessmentof importer control.
	*
	* @return the f4 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF4Value() {
		return _assessmentofImporterControl.getF4Value();
	}

	/**
	* Sets the f4 value of this assessmentof importer control.
	*
	* @param F4Value the f4 value of this assessmentof importer control
	*/
	@Override
	public void setF4Value(java.lang.String F4Value) {
		_assessmentofImporterControl.setF4Value(F4Value);
	}

	/**
	* Returns the f4 mark of this assessmentof importer control.
	*
	* @return the f4 mark of this assessmentof importer control
	*/
	@Override
	public double getF4Mark() {
		return _assessmentofImporterControl.getF4Mark();
	}

	/**
	* Sets the f4 mark of this assessmentof importer control.
	*
	* @param F4Mark the f4 mark of this assessmentof importer control
	*/
	@Override
	public void setF4Mark(double F4Mark) {
		_assessmentofImporterControl.setF4Mark(F4Mark);
	}

	/**
	* Returns the f5 code of this assessmentof importer control.
	*
	* @return the f5 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF5Code() {
		return _assessmentofImporterControl.getF5Code();
	}

	/**
	* Sets the f5 code of this assessmentof importer control.
	*
	* @param F5Code the f5 code of this assessmentof importer control
	*/
	@Override
	public void setF5Code(java.lang.String F5Code) {
		_assessmentofImporterControl.setF5Code(F5Code);
	}

	/**
	* Returns the f5 name of this assessmentof importer control.
	*
	* @return the f5 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF5Name() {
		return _assessmentofImporterControl.getF5Name();
	}

	/**
	* Sets the f5 name of this assessmentof importer control.
	*
	* @param F5Name the f5 name of this assessmentof importer control
	*/
	@Override
	public void setF5Name(java.lang.String F5Name) {
		_assessmentofImporterControl.setF5Name(F5Name);
	}

	/**
	* Returns the f5 value of this assessmentof importer control.
	*
	* @return the f5 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF5Value() {
		return _assessmentofImporterControl.getF5Value();
	}

	/**
	* Sets the f5 value of this assessmentof importer control.
	*
	* @param F5Value the f5 value of this assessmentof importer control
	*/
	@Override
	public void setF5Value(java.lang.String F5Value) {
		_assessmentofImporterControl.setF5Value(F5Value);
	}

	/**
	* Returns the f5 mark of this assessmentof importer control.
	*
	* @return the f5 mark of this assessmentof importer control
	*/
	@Override
	public double getF5Mark() {
		return _assessmentofImporterControl.getF5Mark();
	}

	/**
	* Sets the f5 mark of this assessmentof importer control.
	*
	* @param F5Mark the f5 mark of this assessmentof importer control
	*/
	@Override
	public void setF5Mark(double F5Mark) {
		_assessmentofImporterControl.setF5Mark(F5Mark);
	}

	/**
	* Returns the f6 code of this assessmentof importer control.
	*
	* @return the f6 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF6Code() {
		return _assessmentofImporterControl.getF6Code();
	}

	/**
	* Sets the f6 code of this assessmentof importer control.
	*
	* @param F6Code the f6 code of this assessmentof importer control
	*/
	@Override
	public void setF6Code(java.lang.String F6Code) {
		_assessmentofImporterControl.setF6Code(F6Code);
	}

	/**
	* Returns the f6 name of this assessmentof importer control.
	*
	* @return the f6 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF6Name() {
		return _assessmentofImporterControl.getF6Name();
	}

	/**
	* Sets the f6 name of this assessmentof importer control.
	*
	* @param F6Name the f6 name of this assessmentof importer control
	*/
	@Override
	public void setF6Name(java.lang.String F6Name) {
		_assessmentofImporterControl.setF6Name(F6Name);
	}

	/**
	* Returns the f6 value of this assessmentof importer control.
	*
	* @return the f6 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF6Value() {
		return _assessmentofImporterControl.getF6Value();
	}

	/**
	* Sets the f6 value of this assessmentof importer control.
	*
	* @param F6Value the f6 value of this assessmentof importer control
	*/
	@Override
	public void setF6Value(java.lang.String F6Value) {
		_assessmentofImporterControl.setF6Value(F6Value);
	}

	/**
	* Returns the f6 mark of this assessmentof importer control.
	*
	* @return the f6 mark of this assessmentof importer control
	*/
	@Override
	public double getF6Mark() {
		return _assessmentofImporterControl.getF6Mark();
	}

	/**
	* Sets the f6 mark of this assessmentof importer control.
	*
	* @param F6Mark the f6 mark of this assessmentof importer control
	*/
	@Override
	public void setF6Mark(double F6Mark) {
		_assessmentofImporterControl.setF6Mark(F6Mark);
	}

	/**
	* Returns the f7 code of this assessmentof importer control.
	*
	* @return the f7 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF7Code() {
		return _assessmentofImporterControl.getF7Code();
	}

	/**
	* Sets the f7 code of this assessmentof importer control.
	*
	* @param F7Code the f7 code of this assessmentof importer control
	*/
	@Override
	public void setF7Code(java.lang.String F7Code) {
		_assessmentofImporterControl.setF7Code(F7Code);
	}

	/**
	* Returns the f7 name of this assessmentof importer control.
	*
	* @return the f7 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF7Name() {
		return _assessmentofImporterControl.getF7Name();
	}

	/**
	* Sets the f7 name of this assessmentof importer control.
	*
	* @param F7Name the f7 name of this assessmentof importer control
	*/
	@Override
	public void setF7Name(java.lang.String F7Name) {
		_assessmentofImporterControl.setF7Name(F7Name);
	}

	/**
	* Returns the f7 value of this assessmentof importer control.
	*
	* @return the f7 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF7Value() {
		return _assessmentofImporterControl.getF7Value();
	}

	/**
	* Sets the f7 value of this assessmentof importer control.
	*
	* @param F7Value the f7 value of this assessmentof importer control
	*/
	@Override
	public void setF7Value(java.lang.String F7Value) {
		_assessmentofImporterControl.setF7Value(F7Value);
	}

	/**
	* Returns the f7 mark of this assessmentof importer control.
	*
	* @return the f7 mark of this assessmentof importer control
	*/
	@Override
	public double getF7Mark() {
		return _assessmentofImporterControl.getF7Mark();
	}

	/**
	* Sets the f7 mark of this assessmentof importer control.
	*
	* @param F7Mark the f7 mark of this assessmentof importer control
	*/
	@Override
	public void setF7Mark(double F7Mark) {
		_assessmentofImporterControl.setF7Mark(F7Mark);
	}

	/**
	* Returns the f8 code of this assessmentof importer control.
	*
	* @return the f8 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF8Code() {
		return _assessmentofImporterControl.getF8Code();
	}

	/**
	* Sets the f8 code of this assessmentof importer control.
	*
	* @param F8Code the f8 code of this assessmentof importer control
	*/
	@Override
	public void setF8Code(java.lang.String F8Code) {
		_assessmentofImporterControl.setF8Code(F8Code);
	}

	/**
	* Returns the f8 name of this assessmentof importer control.
	*
	* @return the f8 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF8Name() {
		return _assessmentofImporterControl.getF8Name();
	}

	/**
	* Sets the f8 name of this assessmentof importer control.
	*
	* @param F8Name the f8 name of this assessmentof importer control
	*/
	@Override
	public void setF8Name(java.lang.String F8Name) {
		_assessmentofImporterControl.setF8Name(F8Name);
	}

	/**
	* Returns the f8 value of this assessmentof importer control.
	*
	* @return the f8 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF8Value() {
		return _assessmentofImporterControl.getF8Value();
	}

	/**
	* Sets the f8 value of this assessmentof importer control.
	*
	* @param F8Value the f8 value of this assessmentof importer control
	*/
	@Override
	public void setF8Value(java.lang.String F8Value) {
		_assessmentofImporterControl.setF8Value(F8Value);
	}

	/**
	* Returns the f8 mark of this assessmentof importer control.
	*
	* @return the f8 mark of this assessmentof importer control
	*/
	@Override
	public double getF8Mark() {
		return _assessmentofImporterControl.getF8Mark();
	}

	/**
	* Sets the f8 mark of this assessmentof importer control.
	*
	* @param F8Mark the f8 mark of this assessmentof importer control
	*/
	@Override
	public void setF8Mark(double F8Mark) {
		_assessmentofImporterControl.setF8Mark(F8Mark);
	}

	/**
	* Returns the f9 code of this assessmentof importer control.
	*
	* @return the f9 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF9Code() {
		return _assessmentofImporterControl.getF9Code();
	}

	/**
	* Sets the f9 code of this assessmentof importer control.
	*
	* @param F9Code the f9 code of this assessmentof importer control
	*/
	@Override
	public void setF9Code(java.lang.String F9Code) {
		_assessmentofImporterControl.setF9Code(F9Code);
	}

	/**
	* Returns the f9 name of this assessmentof importer control.
	*
	* @return the f9 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF9Name() {
		return _assessmentofImporterControl.getF9Name();
	}

	/**
	* Sets the f9 name of this assessmentof importer control.
	*
	* @param F9Name the f9 name of this assessmentof importer control
	*/
	@Override
	public void setF9Name(java.lang.String F9Name) {
		_assessmentofImporterControl.setF9Name(F9Name);
	}

	/**
	* Returns the f9 value of this assessmentof importer control.
	*
	* @return the f9 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF9Value() {
		return _assessmentofImporterControl.getF9Value();
	}

	/**
	* Sets the f9 value of this assessmentof importer control.
	*
	* @param F9Value the f9 value of this assessmentof importer control
	*/
	@Override
	public void setF9Value(java.lang.String F9Value) {
		_assessmentofImporterControl.setF9Value(F9Value);
	}

	/**
	* Returns the f9 mark of this assessmentof importer control.
	*
	* @return the f9 mark of this assessmentof importer control
	*/
	@Override
	public double getF9Mark() {
		return _assessmentofImporterControl.getF9Mark();
	}

	/**
	* Sets the f9 mark of this assessmentof importer control.
	*
	* @param F9Mark the f9 mark of this assessmentof importer control
	*/
	@Override
	public void setF9Mark(double F9Mark) {
		_assessmentofImporterControl.setF9Mark(F9Mark);
	}

	/**
	* Returns the f10 code of this assessmentof importer control.
	*
	* @return the f10 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF10Code() {
		return _assessmentofImporterControl.getF10Code();
	}

	/**
	* Sets the f10 code of this assessmentof importer control.
	*
	* @param F10Code the f10 code of this assessmentof importer control
	*/
	@Override
	public void setF10Code(java.lang.String F10Code) {
		_assessmentofImporterControl.setF10Code(F10Code);
	}

	/**
	* Returns the f10 name of this assessmentof importer control.
	*
	* @return the f10 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF10Name() {
		return _assessmentofImporterControl.getF10Name();
	}

	/**
	* Sets the f10 name of this assessmentof importer control.
	*
	* @param F10Name the f10 name of this assessmentof importer control
	*/
	@Override
	public void setF10Name(java.lang.String F10Name) {
		_assessmentofImporterControl.setF10Name(F10Name);
	}

	/**
	* Returns the f10 value of this assessmentof importer control.
	*
	* @return the f10 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF10Value() {
		return _assessmentofImporterControl.getF10Value();
	}

	/**
	* Sets the f10 value of this assessmentof importer control.
	*
	* @param F10Value the f10 value of this assessmentof importer control
	*/
	@Override
	public void setF10Value(java.lang.String F10Value) {
		_assessmentofImporterControl.setF10Value(F10Value);
	}

	/**
	* Returns the f10 mark of this assessmentof importer control.
	*
	* @return the f10 mark of this assessmentof importer control
	*/
	@Override
	public double getF10Mark() {
		return _assessmentofImporterControl.getF10Mark();
	}

	/**
	* Sets the f10 mark of this assessmentof importer control.
	*
	* @param F10Mark the f10 mark of this assessmentof importer control
	*/
	@Override
	public void setF10Mark(double F10Mark) {
		_assessmentofImporterControl.setF10Mark(F10Mark);
	}

	/**
	* Returns the f11 code of this assessmentof importer control.
	*
	* @return the f11 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF11Code() {
		return _assessmentofImporterControl.getF11Code();
	}

	/**
	* Sets the f11 code of this assessmentof importer control.
	*
	* @param F11Code the f11 code of this assessmentof importer control
	*/
	@Override
	public void setF11Code(java.lang.String F11Code) {
		_assessmentofImporterControl.setF11Code(F11Code);
	}

	/**
	* Returns the f11 name of this assessmentof importer control.
	*
	* @return the f11 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF11Name() {
		return _assessmentofImporterControl.getF11Name();
	}

	/**
	* Sets the f11 name of this assessmentof importer control.
	*
	* @param F11Name the f11 name of this assessmentof importer control
	*/
	@Override
	public void setF11Name(java.lang.String F11Name) {
		_assessmentofImporterControl.setF11Name(F11Name);
	}

	/**
	* Returns the f11 value of this assessmentof importer control.
	*
	* @return the f11 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF11Value() {
		return _assessmentofImporterControl.getF11Value();
	}

	/**
	* Sets the f11 value of this assessmentof importer control.
	*
	* @param F11Value the f11 value of this assessmentof importer control
	*/
	@Override
	public void setF11Value(java.lang.String F11Value) {
		_assessmentofImporterControl.setF11Value(F11Value);
	}

	/**
	* Returns the f11 mark of this assessmentof importer control.
	*
	* @return the f11 mark of this assessmentof importer control
	*/
	@Override
	public double getF11Mark() {
		return _assessmentofImporterControl.getF11Mark();
	}

	/**
	* Sets the f11 mark of this assessmentof importer control.
	*
	* @param F11Mark the f11 mark of this assessmentof importer control
	*/
	@Override
	public void setF11Mark(double F11Mark) {
		_assessmentofImporterControl.setF11Mark(F11Mark);
	}

	/**
	* Returns the f12 code of this assessmentof importer control.
	*
	* @return the f12 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF12Code() {
		return _assessmentofImporterControl.getF12Code();
	}

	/**
	* Sets the f12 code of this assessmentof importer control.
	*
	* @param F12Code the f12 code of this assessmentof importer control
	*/
	@Override
	public void setF12Code(java.lang.String F12Code) {
		_assessmentofImporterControl.setF12Code(F12Code);
	}

	/**
	* Returns the f12 name of this assessmentof importer control.
	*
	* @return the f12 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF12Name() {
		return _assessmentofImporterControl.getF12Name();
	}

	/**
	* Sets the f12 name of this assessmentof importer control.
	*
	* @param F12Name the f12 name of this assessmentof importer control
	*/
	@Override
	public void setF12Name(java.lang.String F12Name) {
		_assessmentofImporterControl.setF12Name(F12Name);
	}

	/**
	* Returns the f12 value of this assessmentof importer control.
	*
	* @return the f12 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF12Value() {
		return _assessmentofImporterControl.getF12Value();
	}

	/**
	* Sets the f12 value of this assessmentof importer control.
	*
	* @param F12Value the f12 value of this assessmentof importer control
	*/
	@Override
	public void setF12Value(java.lang.String F12Value) {
		_assessmentofImporterControl.setF12Value(F12Value);
	}

	/**
	* Returns the f12 mark of this assessmentof importer control.
	*
	* @return the f12 mark of this assessmentof importer control
	*/
	@Override
	public double getF12Mark() {
		return _assessmentofImporterControl.getF12Mark();
	}

	/**
	* Sets the f12 mark of this assessmentof importer control.
	*
	* @param F12Mark the f12 mark of this assessmentof importer control
	*/
	@Override
	public void setF12Mark(double F12Mark) {
		_assessmentofImporterControl.setF12Mark(F12Mark);
	}

	/**
	* Returns the f13 code of this assessmentof importer control.
	*
	* @return the f13 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF13Code() {
		return _assessmentofImporterControl.getF13Code();
	}

	/**
	* Sets the f13 code of this assessmentof importer control.
	*
	* @param F13Code the f13 code of this assessmentof importer control
	*/
	@Override
	public void setF13Code(java.lang.String F13Code) {
		_assessmentofImporterControl.setF13Code(F13Code);
	}

	/**
	* Returns the f13 name of this assessmentof importer control.
	*
	* @return the f13 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF13Name() {
		return _assessmentofImporterControl.getF13Name();
	}

	/**
	* Sets the f13 name of this assessmentof importer control.
	*
	* @param F13Name the f13 name of this assessmentof importer control
	*/
	@Override
	public void setF13Name(java.lang.String F13Name) {
		_assessmentofImporterControl.setF13Name(F13Name);
	}

	/**
	* Returns the f13 value of this assessmentof importer control.
	*
	* @return the f13 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF13Value() {
		return _assessmentofImporterControl.getF13Value();
	}

	/**
	* Sets the f13 value of this assessmentof importer control.
	*
	* @param F13Value the f13 value of this assessmentof importer control
	*/
	@Override
	public void setF13Value(java.lang.String F13Value) {
		_assessmentofImporterControl.setF13Value(F13Value);
	}

	/**
	* Returns the f13 mark of this assessmentof importer control.
	*
	* @return the f13 mark of this assessmentof importer control
	*/
	@Override
	public double getF13Mark() {
		return _assessmentofImporterControl.getF13Mark();
	}

	/**
	* Sets the f13 mark of this assessmentof importer control.
	*
	* @param F13Mark the f13 mark of this assessmentof importer control
	*/
	@Override
	public void setF13Mark(double F13Mark) {
		_assessmentofImporterControl.setF13Mark(F13Mark);
	}

	/**
	* Returns the f14 code of this assessmentof importer control.
	*
	* @return the f14 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF14Code() {
		return _assessmentofImporterControl.getF14Code();
	}

	/**
	* Sets the f14 code of this assessmentof importer control.
	*
	* @param F14Code the f14 code of this assessmentof importer control
	*/
	@Override
	public void setF14Code(java.lang.String F14Code) {
		_assessmentofImporterControl.setF14Code(F14Code);
	}

	/**
	* Returns the f14 name of this assessmentof importer control.
	*
	* @return the f14 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF14Name() {
		return _assessmentofImporterControl.getF14Name();
	}

	/**
	* Sets the f14 name of this assessmentof importer control.
	*
	* @param F14Name the f14 name of this assessmentof importer control
	*/
	@Override
	public void setF14Name(java.lang.String F14Name) {
		_assessmentofImporterControl.setF14Name(F14Name);
	}

	/**
	* Returns the f14 value of this assessmentof importer control.
	*
	* @return the f14 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF14Value() {
		return _assessmentofImporterControl.getF14Value();
	}

	/**
	* Sets the f14 value of this assessmentof importer control.
	*
	* @param F14Value the f14 value of this assessmentof importer control
	*/
	@Override
	public void setF14Value(java.lang.String F14Value) {
		_assessmentofImporterControl.setF14Value(F14Value);
	}

	/**
	* Returns the f14 mark of this assessmentof importer control.
	*
	* @return the f14 mark of this assessmentof importer control
	*/
	@Override
	public double getF14Mark() {
		return _assessmentofImporterControl.getF14Mark();
	}

	/**
	* Sets the f14 mark of this assessmentof importer control.
	*
	* @param F14Mark the f14 mark of this assessmentof importer control
	*/
	@Override
	public void setF14Mark(double F14Mark) {
		_assessmentofImporterControl.setF14Mark(F14Mark);
	}

	/**
	* Returns the f15 code of this assessmentof importer control.
	*
	* @return the f15 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF15Code() {
		return _assessmentofImporterControl.getF15Code();
	}

	/**
	* Sets the f15 code of this assessmentof importer control.
	*
	* @param F15Code the f15 code of this assessmentof importer control
	*/
	@Override
	public void setF15Code(java.lang.String F15Code) {
		_assessmentofImporterControl.setF15Code(F15Code);
	}

	/**
	* Returns the f15 name of this assessmentof importer control.
	*
	* @return the f15 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF15Name() {
		return _assessmentofImporterControl.getF15Name();
	}

	/**
	* Sets the f15 name of this assessmentof importer control.
	*
	* @param F15Name the f15 name of this assessmentof importer control
	*/
	@Override
	public void setF15Name(java.lang.String F15Name) {
		_assessmentofImporterControl.setF15Name(F15Name);
	}

	/**
	* Returns the f15 value of this assessmentof importer control.
	*
	* @return the f15 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF15Value() {
		return _assessmentofImporterControl.getF15Value();
	}

	/**
	* Sets the f15 value of this assessmentof importer control.
	*
	* @param F15Value the f15 value of this assessmentof importer control
	*/
	@Override
	public void setF15Value(java.lang.String F15Value) {
		_assessmentofImporterControl.setF15Value(F15Value);
	}

	/**
	* Returns the f15 mark of this assessmentof importer control.
	*
	* @return the f15 mark of this assessmentof importer control
	*/
	@Override
	public double getF15Mark() {
		return _assessmentofImporterControl.getF15Mark();
	}

	/**
	* Sets the f15 mark of this assessmentof importer control.
	*
	* @param F15Mark the f15 mark of this assessmentof importer control
	*/
	@Override
	public void setF15Mark(double F15Mark) {
		_assessmentofImporterControl.setF15Mark(F15Mark);
	}

	/**
	* Returns the f16 code of this assessmentof importer control.
	*
	* @return the f16 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF16Code() {
		return _assessmentofImporterControl.getF16Code();
	}

	/**
	* Sets the f16 code of this assessmentof importer control.
	*
	* @param F16Code the f16 code of this assessmentof importer control
	*/
	@Override
	public void setF16Code(java.lang.String F16Code) {
		_assessmentofImporterControl.setF16Code(F16Code);
	}

	/**
	* Returns the f16 name of this assessmentof importer control.
	*
	* @return the f16 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF16Name() {
		return _assessmentofImporterControl.getF16Name();
	}

	/**
	* Sets the f16 name of this assessmentof importer control.
	*
	* @param F16Name the f16 name of this assessmentof importer control
	*/
	@Override
	public void setF16Name(java.lang.String F16Name) {
		_assessmentofImporterControl.setF16Name(F16Name);
	}

	/**
	* Returns the f16 value of this assessmentof importer control.
	*
	* @return the f16 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF16Value() {
		return _assessmentofImporterControl.getF16Value();
	}

	/**
	* Sets the f16 value of this assessmentof importer control.
	*
	* @param F16Value the f16 value of this assessmentof importer control
	*/
	@Override
	public void setF16Value(java.lang.String F16Value) {
		_assessmentofImporterControl.setF16Value(F16Value);
	}

	/**
	* Returns the f16 mark of this assessmentof importer control.
	*
	* @return the f16 mark of this assessmentof importer control
	*/
	@Override
	public double getF16Mark() {
		return _assessmentofImporterControl.getF16Mark();
	}

	/**
	* Sets the f16 mark of this assessmentof importer control.
	*
	* @param F16Mark the f16 mark of this assessmentof importer control
	*/
	@Override
	public void setF16Mark(double F16Mark) {
		_assessmentofImporterControl.setF16Mark(F16Mark);
	}

	/**
	* Returns the f17 code of this assessmentof importer control.
	*
	* @return the f17 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF17Code() {
		return _assessmentofImporterControl.getF17Code();
	}

	/**
	* Sets the f17 code of this assessmentof importer control.
	*
	* @param F17Code the f17 code of this assessmentof importer control
	*/
	@Override
	public void setF17Code(java.lang.String F17Code) {
		_assessmentofImporterControl.setF17Code(F17Code);
	}

	/**
	* Returns the f17 name of this assessmentof importer control.
	*
	* @return the f17 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF17Name() {
		return _assessmentofImporterControl.getF17Name();
	}

	/**
	* Sets the f17 name of this assessmentof importer control.
	*
	* @param F17Name the f17 name of this assessmentof importer control
	*/
	@Override
	public void setF17Name(java.lang.String F17Name) {
		_assessmentofImporterControl.setF17Name(F17Name);
	}

	/**
	* Returns the f17 value of this assessmentof importer control.
	*
	* @return the f17 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF17Value() {
		return _assessmentofImporterControl.getF17Value();
	}

	/**
	* Sets the f17 value of this assessmentof importer control.
	*
	* @param F17Value the f17 value of this assessmentof importer control
	*/
	@Override
	public void setF17Value(java.lang.String F17Value) {
		_assessmentofImporterControl.setF17Value(F17Value);
	}

	/**
	* Returns the f17 mark of this assessmentof importer control.
	*
	* @return the f17 mark of this assessmentof importer control
	*/
	@Override
	public double getF17Mark() {
		return _assessmentofImporterControl.getF17Mark();
	}

	/**
	* Sets the f17 mark of this assessmentof importer control.
	*
	* @param F17Mark the f17 mark of this assessmentof importer control
	*/
	@Override
	public void setF17Mark(double F17Mark) {
		_assessmentofImporterControl.setF17Mark(F17Mark);
	}

	/**
	* Returns the f18 code of this assessmentof importer control.
	*
	* @return the f18 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF18Code() {
		return _assessmentofImporterControl.getF18Code();
	}

	/**
	* Sets the f18 code of this assessmentof importer control.
	*
	* @param F18Code the f18 code of this assessmentof importer control
	*/
	@Override
	public void setF18Code(java.lang.String F18Code) {
		_assessmentofImporterControl.setF18Code(F18Code);
	}

	/**
	* Returns the f18 name of this assessmentof importer control.
	*
	* @return the f18 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF18Name() {
		return _assessmentofImporterControl.getF18Name();
	}

	/**
	* Sets the f18 name of this assessmentof importer control.
	*
	* @param F18Name the f18 name of this assessmentof importer control
	*/
	@Override
	public void setF18Name(java.lang.String F18Name) {
		_assessmentofImporterControl.setF18Name(F18Name);
	}

	/**
	* Returns the f18 value of this assessmentof importer control.
	*
	* @return the f18 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF18Value() {
		return _assessmentofImporterControl.getF18Value();
	}

	/**
	* Sets the f18 value of this assessmentof importer control.
	*
	* @param F18Value the f18 value of this assessmentof importer control
	*/
	@Override
	public void setF18Value(java.lang.String F18Value) {
		_assessmentofImporterControl.setF18Value(F18Value);
	}

	/**
	* Returns the f18 mark of this assessmentof importer control.
	*
	* @return the f18 mark of this assessmentof importer control
	*/
	@Override
	public double getF18Mark() {
		return _assessmentofImporterControl.getF18Mark();
	}

	/**
	* Sets the f18 mark of this assessmentof importer control.
	*
	* @param F18Mark the f18 mark of this assessmentof importer control
	*/
	@Override
	public void setF18Mark(double F18Mark) {
		_assessmentofImporterControl.setF18Mark(F18Mark);
	}

	/**
	* Returns the f19 name of this assessmentof importer control.
	*
	* @return the f19 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF19Name() {
		return _assessmentofImporterControl.getF19Name();
	}

	/**
	* Sets the f19 name of this assessmentof importer control.
	*
	* @param F19Name the f19 name of this assessmentof importer control
	*/
	@Override
	public void setF19Name(java.lang.String F19Name) {
		_assessmentofImporterControl.setF19Name(F19Name);
	}

	/**
	* Returns the f19 code of this assessmentof importer control.
	*
	* @return the f19 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF19Code() {
		return _assessmentofImporterControl.getF19Code();
	}

	/**
	* Sets the f19 code of this assessmentof importer control.
	*
	* @param F19Code the f19 code of this assessmentof importer control
	*/
	@Override
	public void setF19Code(java.lang.String F19Code) {
		_assessmentofImporterControl.setF19Code(F19Code);
	}

	/**
	* Returns the f19 value of this assessmentof importer control.
	*
	* @return the f19 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF19Value() {
		return _assessmentofImporterControl.getF19Value();
	}

	/**
	* Sets the f19 value of this assessmentof importer control.
	*
	* @param F19Value the f19 value of this assessmentof importer control
	*/
	@Override
	public void setF19Value(java.lang.String F19Value) {
		_assessmentofImporterControl.setF19Value(F19Value);
	}

	/**
	* Returns the f19 mark of this assessmentof importer control.
	*
	* @return the f19 mark of this assessmentof importer control
	*/
	@Override
	public double getF19Mark() {
		return _assessmentofImporterControl.getF19Mark();
	}

	/**
	* Sets the f19 mark of this assessmentof importer control.
	*
	* @param F19Mark the f19 mark of this assessmentof importer control
	*/
	@Override
	public void setF19Mark(double F19Mark) {
		_assessmentofImporterControl.setF19Mark(F19Mark);
	}

	/**
	* Returns the f20 code of this assessmentof importer control.
	*
	* @return the f20 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF20Code() {
		return _assessmentofImporterControl.getF20Code();
	}

	/**
	* Sets the f20 code of this assessmentof importer control.
	*
	* @param F20Code the f20 code of this assessmentof importer control
	*/
	@Override
	public void setF20Code(java.lang.String F20Code) {
		_assessmentofImporterControl.setF20Code(F20Code);
	}

	/**
	* Returns the f20 name of this assessmentof importer control.
	*
	* @return the f20 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF20Name() {
		return _assessmentofImporterControl.getF20Name();
	}

	/**
	* Sets the f20 name of this assessmentof importer control.
	*
	* @param F20Name the f20 name of this assessmentof importer control
	*/
	@Override
	public void setF20Name(java.lang.String F20Name) {
		_assessmentofImporterControl.setF20Name(F20Name);
	}

	/**
	* Returns the f20 value of this assessmentof importer control.
	*
	* @return the f20 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF20Value() {
		return _assessmentofImporterControl.getF20Value();
	}

	/**
	* Sets the f20 value of this assessmentof importer control.
	*
	* @param F20Value the f20 value of this assessmentof importer control
	*/
	@Override
	public void setF20Value(java.lang.String F20Value) {
		_assessmentofImporterControl.setF20Value(F20Value);
	}

	/**
	* Returns the f20 mark of this assessmentof importer control.
	*
	* @return the f20 mark of this assessmentof importer control
	*/
	@Override
	public double getF20Mark() {
		return _assessmentofImporterControl.getF20Mark();
	}

	/**
	* Sets the f20 mark of this assessmentof importer control.
	*
	* @param F20Mark the f20 mark of this assessmentof importer control
	*/
	@Override
	public void setF20Mark(double F20Mark) {
		_assessmentofImporterControl.setF20Mark(F20Mark);
	}

	/**
	* Returns the f21 code of this assessmentof importer control.
	*
	* @return the f21 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF21Code() {
		return _assessmentofImporterControl.getF21Code();
	}

	/**
	* Sets the f21 code of this assessmentof importer control.
	*
	* @param F21Code the f21 code of this assessmentof importer control
	*/
	@Override
	public void setF21Code(java.lang.String F21Code) {
		_assessmentofImporterControl.setF21Code(F21Code);
	}

	/**
	* Returns the f21 name of this assessmentof importer control.
	*
	* @return the f21 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF21Name() {
		return _assessmentofImporterControl.getF21Name();
	}

	/**
	* Sets the f21 name of this assessmentof importer control.
	*
	* @param F21Name the f21 name of this assessmentof importer control
	*/
	@Override
	public void setF21Name(java.lang.String F21Name) {
		_assessmentofImporterControl.setF21Name(F21Name);
	}

	/**
	* Returns the f21 value of this assessmentof importer control.
	*
	* @return the f21 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF21Value() {
		return _assessmentofImporterControl.getF21Value();
	}

	/**
	* Sets the f21 value of this assessmentof importer control.
	*
	* @param F21Value the f21 value of this assessmentof importer control
	*/
	@Override
	public void setF21Value(java.lang.String F21Value) {
		_assessmentofImporterControl.setF21Value(F21Value);
	}

	/**
	* Returns the f21 mark of this assessmentof importer control.
	*
	* @return the f21 mark of this assessmentof importer control
	*/
	@Override
	public double getF21Mark() {
		return _assessmentofImporterControl.getF21Mark();
	}

	/**
	* Sets the f21 mark of this assessmentof importer control.
	*
	* @param F21Mark the f21 mark of this assessmentof importer control
	*/
	@Override
	public void setF21Mark(double F21Mark) {
		_assessmentofImporterControl.setF21Mark(F21Mark);
	}

	/**
	* Returns the f22 code of this assessmentof importer control.
	*
	* @return the f22 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF22Code() {
		return _assessmentofImporterControl.getF22Code();
	}

	/**
	* Sets the f22 code of this assessmentof importer control.
	*
	* @param F22Code the f22 code of this assessmentof importer control
	*/
	@Override
	public void setF22Code(java.lang.String F22Code) {
		_assessmentofImporterControl.setF22Code(F22Code);
	}

	/**
	* Returns the f22 name of this assessmentof importer control.
	*
	* @return the f22 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF22Name() {
		return _assessmentofImporterControl.getF22Name();
	}

	/**
	* Sets the f22 name of this assessmentof importer control.
	*
	* @param F22Name the f22 name of this assessmentof importer control
	*/
	@Override
	public void setF22Name(java.lang.String F22Name) {
		_assessmentofImporterControl.setF22Name(F22Name);
	}

	/**
	* Returns the f22 value of this assessmentof importer control.
	*
	* @return the f22 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF22Value() {
		return _assessmentofImporterControl.getF22Value();
	}

	/**
	* Sets the f22 value of this assessmentof importer control.
	*
	* @param F22Value the f22 value of this assessmentof importer control
	*/
	@Override
	public void setF22Value(java.lang.String F22Value) {
		_assessmentofImporterControl.setF22Value(F22Value);
	}

	/**
	* Returns the f22 mark of this assessmentof importer control.
	*
	* @return the f22 mark of this assessmentof importer control
	*/
	@Override
	public double getF22Mark() {
		return _assessmentofImporterControl.getF22Mark();
	}

	/**
	* Sets the f22 mark of this assessmentof importer control.
	*
	* @param F22Mark the f22 mark of this assessmentof importer control
	*/
	@Override
	public void setF22Mark(double F22Mark) {
		_assessmentofImporterControl.setF22Mark(F22Mark);
	}

	/**
	* Returns the f23 code of this assessmentof importer control.
	*
	* @return the f23 code of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF23Code() {
		return _assessmentofImporterControl.getF23Code();
	}

	/**
	* Sets the f23 code of this assessmentof importer control.
	*
	* @param F23Code the f23 code of this assessmentof importer control
	*/
	@Override
	public void setF23Code(java.lang.String F23Code) {
		_assessmentofImporterControl.setF23Code(F23Code);
	}

	/**
	* Returns the f23 name of this assessmentof importer control.
	*
	* @return the f23 name of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF23Name() {
		return _assessmentofImporterControl.getF23Name();
	}

	/**
	* Sets the f23 name of this assessmentof importer control.
	*
	* @param F23Name the f23 name of this assessmentof importer control
	*/
	@Override
	public void setF23Name(java.lang.String F23Name) {
		_assessmentofImporterControl.setF23Name(F23Name);
	}

	/**
	* Returns the f23 value of this assessmentof importer control.
	*
	* @return the f23 value of this assessmentof importer control
	*/
	@Override
	public java.lang.String getF23Value() {
		return _assessmentofImporterControl.getF23Value();
	}

	/**
	* Sets the f23 value of this assessmentof importer control.
	*
	* @param F23Value the f23 value of this assessmentof importer control
	*/
	@Override
	public void setF23Value(java.lang.String F23Value) {
		_assessmentofImporterControl.setF23Value(F23Value);
	}

	/**
	* Returns the f23 mark of this assessmentof importer control.
	*
	* @return the f23 mark of this assessmentof importer control
	*/
	@Override
	public double getF23Mark() {
		return _assessmentofImporterControl.getF23Mark();
	}

	/**
	* Sets the f23 mark of this assessmentof importer control.
	*
	* @param F23Mark the f23 mark of this assessmentof importer control
	*/
	@Override
	public void setF23Mark(double F23Mark) {
		_assessmentofImporterControl.setF23Mark(F23Mark);
	}

	/**
	* Returns the sum mark of this assessmentof importer control.
	*
	* @return the sum mark of this assessmentof importer control
	*/
	@Override
	public double getSumMark() {
		return _assessmentofImporterControl.getSumMark();
	}

	/**
	* Sets the sum mark of this assessmentof importer control.
	*
	* @param SumMark the sum mark of this assessmentof importer control
	*/
	@Override
	public void setSumMark(double SumMark) {
		_assessmentofImporterControl.setSumMark(SumMark);
	}

	/**
	* Returns the maker of this assessmentof importer control.
	*
	* @return the maker of this assessmentof importer control
	*/
	@Override
	public java.lang.String getMaker() {
		return _assessmentofImporterControl.getMaker();
	}

	/**
	* Sets the maker of this assessmentof importer control.
	*
	* @param maker the maker of this assessmentof importer control
	*/
	@Override
	public void setMaker(java.lang.String maker) {
		_assessmentofImporterControl.setMaker(maker);
	}

	/**
	* Returns the checker of this assessmentof importer control.
	*
	* @return the checker of this assessmentof importer control
	*/
	@Override
	public java.lang.String getChecker() {
		return _assessmentofImporterControl.getChecker();
	}

	/**
	* Sets the checker of this assessmentof importer control.
	*
	* @param checker the checker of this assessmentof importer control
	*/
	@Override
	public void setChecker(java.lang.String checker) {
		_assessmentofImporterControl.setChecker(checker);
	}

	/**
	* Returns the approver of this assessmentof importer control.
	*
	* @return the approver of this assessmentof importer control
	*/
	@Override
	public java.lang.String getApprover() {
		return _assessmentofImporterControl.getApprover();
	}

	/**
	* Sets the approver of this assessmentof importer control.
	*
	* @param approver the approver of this assessmentof importer control
	*/
	@Override
	public void setApprover(java.lang.String approver) {
		_assessmentofImporterControl.setApprover(approver);
	}

	/**
	* Returns the makermodified of this assessmentof importer control.
	*
	* @return the makermodified of this assessmentof importer control
	*/
	@Override
	public java.util.Date getMakermodified() {
		return _assessmentofImporterControl.getMakermodified();
	}

	/**
	* Sets the makermodified of this assessmentof importer control.
	*
	* @param makermodified the makermodified of this assessmentof importer control
	*/
	@Override
	public void setMakermodified(java.util.Date makermodified) {
		_assessmentofImporterControl.setMakermodified(makermodified);
	}

	/**
	* Returns the checkermodified of this assessmentof importer control.
	*
	* @return the checkermodified of this assessmentof importer control
	*/
	@Override
	public java.util.Date getCheckermodified() {
		return _assessmentofImporterControl.getCheckermodified();
	}

	/**
	* Sets the checkermodified of this assessmentof importer control.
	*
	* @param checkermodified the checkermodified of this assessmentof importer control
	*/
	@Override
	public void setCheckermodified(java.util.Date checkermodified) {
		_assessmentofImporterControl.setCheckermodified(checkermodified);
	}

	/**
	* Returns the approvermodified of this assessmentof importer control.
	*
	* @return the approvermodified of this assessmentof importer control
	*/
	@Override
	public java.util.Date getApprovermodified() {
		return _assessmentofImporterControl.getApprovermodified();
	}

	/**
	* Sets the approvermodified of this assessmentof importer control.
	*
	* @param approvermodified the approvermodified of this assessmentof importer control
	*/
	@Override
	public void setApprovermodified(java.util.Date approvermodified) {
		_assessmentofImporterControl.setApprovermodified(approvermodified);
	}

	/**
	* Returns the assessmentid of this assessmentof importer control.
	*
	* @return the assessmentid of this assessmentof importer control
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentofImporterControl.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessmentof importer control.
	*
	* @param assessmentid the assessmentid of this assessmentof importer control
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentofImporterControl.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessmentof importer control.
	*
	* @return the assessmentyear of this assessmentof importer control
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentofImporterControl.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessmentof importer control.
	*
	* @param assessmentyear the assessmentyear of this assessmentof importer control
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentofImporterControl.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessmentof importer control.
	*
	* @return the evaluationperiod of this assessmentof importer control
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentofImporterControl.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessmentof importer control.
	*
	* @param evaluationperiod the evaluationperiod of this assessmentof importer control
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentofImporterControl.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the latestassessment of this assessmentof importer control.
	*
	* @return the latestassessment of this assessmentof importer control
	*/
	@Override
	public java.util.Date getLatestassessment() {
		return _assessmentofImporterControl.getLatestassessment();
	}

	/**
	* Sets the latestassessment of this assessmentof importer control.
	*
	* @param latestassessment the latestassessment of this assessmentof importer control
	*/
	@Override
	public void setLatestassessment(java.util.Date latestassessment) {
		_assessmentofImporterControl.setLatestassessment(latestassessment);
	}

	/**
	* Returns the synchdate of this assessmentof importer control.
	*
	* @return the synchdate of this assessmentof importer control
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentofImporterControl.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessmentof importer control.
	*
	* @param synchdate the synchdate of this assessmentof importer control
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentofImporterControl.setSynchdate(synchdate);
	}

	/**
	* Returns the nextassessmentid of this assessmentof importer control.
	*
	* @return the nextassessmentid of this assessmentof importer control
	*/
	@Override
	public java.lang.String getNextassessmentid() {
		return _assessmentofImporterControl.getNextassessmentid();
	}

	/**
	* Sets the nextassessmentid of this assessmentof importer control.
	*
	* @param nextassessmentid the nextassessmentid of this assessmentof importer control
	*/
	@Override
	public void setNextassessmentid(java.lang.String nextassessmentid) {
		_assessmentofImporterControl.setNextassessmentid(nextassessmentid);
	}

	/**
	* Returns the nextassessmentyear of this assessmentof importer control.
	*
	* @return the nextassessmentyear of this assessmentof importer control
	*/
	@Override
	public java.lang.String getNextassessmentyear() {
		return _assessmentofImporterControl.getNextassessmentyear();
	}

	/**
	* Sets the nextassessmentyear of this assessmentof importer control.
	*
	* @param nextassessmentyear the nextassessmentyear of this assessmentof importer control
	*/
	@Override
	public void setNextassessmentyear(java.lang.String nextassessmentyear) {
		_assessmentofImporterControl.setNextassessmentyear(nextassessmentyear);
	}

	@Override
	public boolean isNew() {
		return _assessmentofImporterControl.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentofImporterControl.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentofImporterControl.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentofImporterControl.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentofImporterControl.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentofImporterControl.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentofImporterControl.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentofImporterControl.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentofImporterControl.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentofImporterControl.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentofImporterControl.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentofImporterControlWrapper((AssessmentofImporterControl)_assessmentofImporterControl.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl) {
		return _assessmentofImporterControl.compareTo(assessmentofImporterControl);
	}

	@Override
	public int hashCode() {
		return _assessmentofImporterControl.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> toCacheModel() {
		return _assessmentofImporterControl.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl toEscapedModel() {
		return new AssessmentofImporterControlWrapper(_assessmentofImporterControl.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl toUnescapedModel() {
		return new AssessmentofImporterControlWrapper(_assessmentofImporterControl.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentofImporterControl.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentofImporterControl.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentofImporterControl.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentofImporterControlWrapper)) {
			return false;
		}

		AssessmentofImporterControlWrapper assessmentofImporterControlWrapper = (AssessmentofImporterControlWrapper)obj;

		if (Validator.equals(_assessmentofImporterControl,
					assessmentofImporterControlWrapper._assessmentofImporterControl)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentofImporterControl getWrappedAssessmentofImporterControl() {
		return _assessmentofImporterControl;
	}

	@Override
	public AssessmentofImporterControl getWrappedModel() {
		return _assessmentofImporterControl;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentofImporterControl.resetOriginalValues();
	}

	private AssessmentofImporterControl _assessmentofImporterControl;
}