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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentofProductServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.AssessmentofProductServiceSoap
 * @generated
 */
public class AssessmentofProductSoap implements Serializable {
	public static AssessmentofProductSoap toSoapModel(AssessmentofProduct model) {
		AssessmentofProductSoap soapModel = new AssessmentofProductSoap();

		soapModel.setId(model.getId());
		soapModel.setProductcode(model.getProductcode());
		soapModel.setProductname(model.getProductname());
		soapModel.setProductsequenceno(model.getProductsequenceno());
		soapModel.setProductdescription(model.getProductdescription());
		soapModel.setProductcodereference(model.getProductcodereference());
		soapModel.setProductnamereference(model.getProductnamereference());
		soapModel.setF1Code(model.getF1Code());
		soapModel.setF1Name(model.getF1Name());
		soapModel.setF1Value(model.getF1Value());
		soapModel.setF1Mark(model.getF1Mark());
		soapModel.setF2Code(model.getF2Code());
		soapModel.setF2Name(model.getF2Name());
		soapModel.setF2Value(model.getF2Value());
		soapModel.setF2Mark(model.getF2Mark());
		soapModel.setF3Code(model.getF3Code());
		soapModel.setF3Name(model.getF3Name());
		soapModel.setF3Value(model.getF3Value());
		soapModel.setF3Mark(model.getF3Mark());
		soapModel.setF4Code(model.getF4Code());
		soapModel.setF4Name(model.getF4Name());
		soapModel.setF4Value(model.getF4Value());
		soapModel.setF4Mark(model.getF4Mark());
		soapModel.setF5Code(model.getF5Code());
		soapModel.setF5Name(model.getF5Name());
		soapModel.setF5Value(model.getF5Value());
		soapModel.setF5Mark(model.getF5Mark());
		soapModel.setF6Code(model.getF6Code());
		soapModel.setF6Name(model.getF6Name());
		soapModel.setF6Value(model.getF6Value());
		soapModel.setF6Mark(model.getF6Mark());
		soapModel.setF7Code(model.getF7Code());
		soapModel.setF7Name(model.getF7Name());
		soapModel.setF7Value(model.getF7Value());
		soapModel.setF7Mark(model.getF7Mark());
		soapModel.setF8Code(model.getF8Code());
		soapModel.setF8Name(model.getF8Name());
		soapModel.setF8Value(model.getF8Value());
		soapModel.setF8Mark(model.getF8Mark());
		soapModel.setF9Code(model.getF9Code());
		soapModel.setF9Name(model.getF9Name());
		soapModel.setF9Value(model.getF9Value());
		soapModel.setF9Mark(model.getF9Mark());
		soapModel.setF10Code(model.getF10Code());
		soapModel.setF10Name(model.getF10Name());
		soapModel.setF10Value(model.getF10Value());
		soapModel.setF10Mark(model.getF10Mark());
		soapModel.setF11Code(model.getF11Code());
		soapModel.setF11Name(model.getF11Name());
		soapModel.setF11Value(model.getF11Value());
		soapModel.setF11Mark(model.getF11Mark());
		soapModel.setF12Code(model.getF12Code());
		soapModel.setF12Name(model.getF12Name());
		soapModel.setF12Value(model.getF12Value());
		soapModel.setF12Mark(model.getF12Mark());
		soapModel.setF13Code(model.getF13Code());
		soapModel.setF13Name(model.getF13Name());
		soapModel.setF13Value(model.getF13Value());
		soapModel.setF13Mark(model.getF13Mark());
		soapModel.setF14Code(model.getF14Code());
		soapModel.setF14Name(model.getF14Name());
		soapModel.setF14Value(model.getF14Value());
		soapModel.setF14Mark(model.getF14Mark());
		soapModel.setF15Code(model.getF15Code());
		soapModel.setF15Name(model.getF15Name());
		soapModel.setF15Value(model.getF15Value());
		soapModel.setF15Mark(model.getF15Mark());
		soapModel.setF16Code(model.getF16Code());
		soapModel.setF16Name(model.getF16Name());
		soapModel.setF16Value(model.getF16Value());
		soapModel.setF16Mark(model.getF16Mark());
		soapModel.setF17Code(model.getF17Code());
		soapModel.setF17Name(model.getF17Name());
		soapModel.setF17Value(model.getF17Value());
		soapModel.setF17Mark(model.getF17Mark());
		soapModel.setF18Code(model.getF18Code());
		soapModel.setF18Name(model.getF18Name());
		soapModel.setF18Value(model.getF18Value());
		soapModel.setF18Mark(model.getF18Mark());
		soapModel.setF19Name(model.getF19Name());
		soapModel.setF19Code(model.getF19Code());
		soapModel.setF19Value(model.getF19Value());
		soapModel.setF19Mark(model.getF19Mark());
		soapModel.setF20Code(model.getF20Code());
		soapModel.setF20Name(model.getF20Name());
		soapModel.setF20Value(model.getF20Value());
		soapModel.setF20Mark(model.getF20Mark());
		soapModel.setF21Code(model.getF21Code());
		soapModel.setF21Name(model.getF21Name());
		soapModel.setF21Value(model.getF21Value());
		soapModel.setF21Mark(model.getF21Mark());
		soapModel.setF22Code(model.getF22Code());
		soapModel.setF22Name(model.getF22Name());
		soapModel.setF22Value(model.getF22Value());
		soapModel.setF22Mark(model.getF22Mark());
		soapModel.setF23Code(model.getF23Code());
		soapModel.setF23Name(model.getF23Name());
		soapModel.setF23Value(model.getF23Value());
		soapModel.setF23Mark(model.getF23Mark());
		soapModel.setSumMark(model.getSumMark());
		soapModel.setMaker(model.getMaker());
		soapModel.setChecker(model.getChecker());
		soapModel.setApprover(model.getApprover());
		soapModel.setMakermodified(model.getMakermodified());
		soapModel.setCheckermodified(model.getCheckermodified());
		soapModel.setApprovermodified(model.getApprovermodified());
		soapModel.setAssessmentid(model.getAssessmentid());
		soapModel.setAssessmentyear(model.getAssessmentyear());
		soapModel.setEvaluationperiod(model.getEvaluationperiod());
		soapModel.setLatestassessment(model.getLatestassessment());
		soapModel.setSynchdate(model.getSynchdate());
		soapModel.setNextassessmentid(model.getNextassessmentid());
		soapModel.setNextassessmentyear(model.getNextassessmentyear());

		return soapModel;
	}

	public static AssessmentofProductSoap[] toSoapModels(
		AssessmentofProduct[] models) {
		AssessmentofProductSoap[] soapModels = new AssessmentofProductSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessmentofProductSoap[][] toSoapModels(
		AssessmentofProduct[][] models) {
		AssessmentofProductSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessmentofProductSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessmentofProductSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessmentofProductSoap[] toSoapModels(
		List<AssessmentofProduct> models) {
		List<AssessmentofProductSoap> soapModels = new ArrayList<AssessmentofProductSoap>(models.size());

		for (AssessmentofProduct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessmentofProductSoap[soapModels.size()]);
	}

	public AssessmentofProductSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getProductcode() {
		return _productcode;
	}

	public void setProductcode(String productcode) {
		_productcode = productcode;
	}

	public String getProductname() {
		return _productname;
	}

	public void setProductname(String productname) {
		_productname = productname;
	}

	public int getProductsequenceno() {
		return _productsequenceno;
	}

	public void setProductsequenceno(int productsequenceno) {
		_productsequenceno = productsequenceno;
	}

	public String getProductdescription() {
		return _productdescription;
	}

	public void setProductdescription(String productdescription) {
		_productdescription = productdescription;
	}

	public String getProductcodereference() {
		return _productcodereference;
	}

	public void setProductcodereference(String productcodereference) {
		_productcodereference = productcodereference;
	}

	public String getProductnamereference() {
		return _productnamereference;
	}

	public void setProductnamereference(String productnamereference) {
		_productnamereference = productnamereference;
	}

	public String getF1Code() {
		return _F1Code;
	}

	public void setF1Code(String F1Code) {
		_F1Code = F1Code;
	}

	public String getF1Name() {
		return _F1Name;
	}

	public void setF1Name(String F1Name) {
		_F1Name = F1Name;
	}

	public String getF1Value() {
		return _F1Value;
	}

	public void setF1Value(String F1Value) {
		_F1Value = F1Value;
	}

	public double getF1Mark() {
		return _F1Mark;
	}

	public void setF1Mark(double F1Mark) {
		_F1Mark = F1Mark;
	}

	public String getF2Code() {
		return _F2Code;
	}

	public void setF2Code(String F2Code) {
		_F2Code = F2Code;
	}

	public String getF2Name() {
		return _F2Name;
	}

	public void setF2Name(String F2Name) {
		_F2Name = F2Name;
	}

	public String getF2Value() {
		return _F2Value;
	}

	public void setF2Value(String F2Value) {
		_F2Value = F2Value;
	}

	public double getF2Mark() {
		return _F2Mark;
	}

	public void setF2Mark(double F2Mark) {
		_F2Mark = F2Mark;
	}

	public String getF3Code() {
		return _F3Code;
	}

	public void setF3Code(String F3Code) {
		_F3Code = F3Code;
	}

	public String getF3Name() {
		return _F3Name;
	}

	public void setF3Name(String F3Name) {
		_F3Name = F3Name;
	}

	public String getF3Value() {
		return _F3Value;
	}

	public void setF3Value(String F3Value) {
		_F3Value = F3Value;
	}

	public double getF3Mark() {
		return _F3Mark;
	}

	public void setF3Mark(double F3Mark) {
		_F3Mark = F3Mark;
	}

	public String getF4Code() {
		return _F4Code;
	}

	public void setF4Code(String F4Code) {
		_F4Code = F4Code;
	}

	public String getF4Name() {
		return _F4Name;
	}

	public void setF4Name(String F4Name) {
		_F4Name = F4Name;
	}

	public String getF4Value() {
		return _F4Value;
	}

	public void setF4Value(String F4Value) {
		_F4Value = F4Value;
	}

	public double getF4Mark() {
		return _F4Mark;
	}

	public void setF4Mark(double F4Mark) {
		_F4Mark = F4Mark;
	}

	public String getF5Code() {
		return _F5Code;
	}

	public void setF5Code(String F5Code) {
		_F5Code = F5Code;
	}

	public String getF5Name() {
		return _F5Name;
	}

	public void setF5Name(String F5Name) {
		_F5Name = F5Name;
	}

	public String getF5Value() {
		return _F5Value;
	}

	public void setF5Value(String F5Value) {
		_F5Value = F5Value;
	}

	public double getF5Mark() {
		return _F5Mark;
	}

	public void setF5Mark(double F5Mark) {
		_F5Mark = F5Mark;
	}

	public String getF6Code() {
		return _F6Code;
	}

	public void setF6Code(String F6Code) {
		_F6Code = F6Code;
	}

	public String getF6Name() {
		return _F6Name;
	}

	public void setF6Name(String F6Name) {
		_F6Name = F6Name;
	}

	public String getF6Value() {
		return _F6Value;
	}

	public void setF6Value(String F6Value) {
		_F6Value = F6Value;
	}

	public double getF6Mark() {
		return _F6Mark;
	}

	public void setF6Mark(double F6Mark) {
		_F6Mark = F6Mark;
	}

	public String getF7Code() {
		return _F7Code;
	}

	public void setF7Code(String F7Code) {
		_F7Code = F7Code;
	}

	public String getF7Name() {
		return _F7Name;
	}

	public void setF7Name(String F7Name) {
		_F7Name = F7Name;
	}

	public String getF7Value() {
		return _F7Value;
	}

	public void setF7Value(String F7Value) {
		_F7Value = F7Value;
	}

	public double getF7Mark() {
		return _F7Mark;
	}

	public void setF7Mark(double F7Mark) {
		_F7Mark = F7Mark;
	}

	public String getF8Code() {
		return _F8Code;
	}

	public void setF8Code(String F8Code) {
		_F8Code = F8Code;
	}

	public String getF8Name() {
		return _F8Name;
	}

	public void setF8Name(String F8Name) {
		_F8Name = F8Name;
	}

	public String getF8Value() {
		return _F8Value;
	}

	public void setF8Value(String F8Value) {
		_F8Value = F8Value;
	}

	public double getF8Mark() {
		return _F8Mark;
	}

	public void setF8Mark(double F8Mark) {
		_F8Mark = F8Mark;
	}

	public String getF9Code() {
		return _F9Code;
	}

	public void setF9Code(String F9Code) {
		_F9Code = F9Code;
	}

	public String getF9Name() {
		return _F9Name;
	}

	public void setF9Name(String F9Name) {
		_F9Name = F9Name;
	}

	public String getF9Value() {
		return _F9Value;
	}

	public void setF9Value(String F9Value) {
		_F9Value = F9Value;
	}

	public double getF9Mark() {
		return _F9Mark;
	}

	public void setF9Mark(double F9Mark) {
		_F9Mark = F9Mark;
	}

	public String getF10Code() {
		return _F10Code;
	}

	public void setF10Code(String F10Code) {
		_F10Code = F10Code;
	}

	public String getF10Name() {
		return _F10Name;
	}

	public void setF10Name(String F10Name) {
		_F10Name = F10Name;
	}

	public String getF10Value() {
		return _F10Value;
	}

	public void setF10Value(String F10Value) {
		_F10Value = F10Value;
	}

	public double getF10Mark() {
		return _F10Mark;
	}

	public void setF10Mark(double F10Mark) {
		_F10Mark = F10Mark;
	}

	public String getF11Code() {
		return _F11Code;
	}

	public void setF11Code(String F11Code) {
		_F11Code = F11Code;
	}

	public String getF11Name() {
		return _F11Name;
	}

	public void setF11Name(String F11Name) {
		_F11Name = F11Name;
	}

	public String getF11Value() {
		return _F11Value;
	}

	public void setF11Value(String F11Value) {
		_F11Value = F11Value;
	}

	public double getF11Mark() {
		return _F11Mark;
	}

	public void setF11Mark(double F11Mark) {
		_F11Mark = F11Mark;
	}

	public String getF12Code() {
		return _F12Code;
	}

	public void setF12Code(String F12Code) {
		_F12Code = F12Code;
	}

	public String getF12Name() {
		return _F12Name;
	}

	public void setF12Name(String F12Name) {
		_F12Name = F12Name;
	}

	public String getF12Value() {
		return _F12Value;
	}

	public void setF12Value(String F12Value) {
		_F12Value = F12Value;
	}

	public double getF12Mark() {
		return _F12Mark;
	}

	public void setF12Mark(double F12Mark) {
		_F12Mark = F12Mark;
	}

	public String getF13Code() {
		return _F13Code;
	}

	public void setF13Code(String F13Code) {
		_F13Code = F13Code;
	}

	public String getF13Name() {
		return _F13Name;
	}

	public void setF13Name(String F13Name) {
		_F13Name = F13Name;
	}

	public String getF13Value() {
		return _F13Value;
	}

	public void setF13Value(String F13Value) {
		_F13Value = F13Value;
	}

	public double getF13Mark() {
		return _F13Mark;
	}

	public void setF13Mark(double F13Mark) {
		_F13Mark = F13Mark;
	}

	public String getF14Code() {
		return _F14Code;
	}

	public void setF14Code(String F14Code) {
		_F14Code = F14Code;
	}

	public String getF14Name() {
		return _F14Name;
	}

	public void setF14Name(String F14Name) {
		_F14Name = F14Name;
	}

	public String getF14Value() {
		return _F14Value;
	}

	public void setF14Value(String F14Value) {
		_F14Value = F14Value;
	}

	public double getF14Mark() {
		return _F14Mark;
	}

	public void setF14Mark(double F14Mark) {
		_F14Mark = F14Mark;
	}

	public String getF15Code() {
		return _F15Code;
	}

	public void setF15Code(String F15Code) {
		_F15Code = F15Code;
	}

	public String getF15Name() {
		return _F15Name;
	}

	public void setF15Name(String F15Name) {
		_F15Name = F15Name;
	}

	public String getF15Value() {
		return _F15Value;
	}

	public void setF15Value(String F15Value) {
		_F15Value = F15Value;
	}

	public double getF15Mark() {
		return _F15Mark;
	}

	public void setF15Mark(double F15Mark) {
		_F15Mark = F15Mark;
	}

	public String getF16Code() {
		return _F16Code;
	}

	public void setF16Code(String F16Code) {
		_F16Code = F16Code;
	}

	public String getF16Name() {
		return _F16Name;
	}

	public void setF16Name(String F16Name) {
		_F16Name = F16Name;
	}

	public String getF16Value() {
		return _F16Value;
	}

	public void setF16Value(String F16Value) {
		_F16Value = F16Value;
	}

	public double getF16Mark() {
		return _F16Mark;
	}

	public void setF16Mark(double F16Mark) {
		_F16Mark = F16Mark;
	}

	public String getF17Code() {
		return _F17Code;
	}

	public void setF17Code(String F17Code) {
		_F17Code = F17Code;
	}

	public String getF17Name() {
		return _F17Name;
	}

	public void setF17Name(String F17Name) {
		_F17Name = F17Name;
	}

	public String getF17Value() {
		return _F17Value;
	}

	public void setF17Value(String F17Value) {
		_F17Value = F17Value;
	}

	public double getF17Mark() {
		return _F17Mark;
	}

	public void setF17Mark(double F17Mark) {
		_F17Mark = F17Mark;
	}

	public String getF18Code() {
		return _F18Code;
	}

	public void setF18Code(String F18Code) {
		_F18Code = F18Code;
	}

	public String getF18Name() {
		return _F18Name;
	}

	public void setF18Name(String F18Name) {
		_F18Name = F18Name;
	}

	public String getF18Value() {
		return _F18Value;
	}

	public void setF18Value(String F18Value) {
		_F18Value = F18Value;
	}

	public double getF18Mark() {
		return _F18Mark;
	}

	public void setF18Mark(double F18Mark) {
		_F18Mark = F18Mark;
	}

	public String getF19Name() {
		return _F19Name;
	}

	public void setF19Name(String F19Name) {
		_F19Name = F19Name;
	}

	public String getF19Code() {
		return _F19Code;
	}

	public void setF19Code(String F19Code) {
		_F19Code = F19Code;
	}

	public String getF19Value() {
		return _F19Value;
	}

	public void setF19Value(String F19Value) {
		_F19Value = F19Value;
	}

	public double getF19Mark() {
		return _F19Mark;
	}

	public void setF19Mark(double F19Mark) {
		_F19Mark = F19Mark;
	}

	public String getF20Code() {
		return _F20Code;
	}

	public void setF20Code(String F20Code) {
		_F20Code = F20Code;
	}

	public String getF20Name() {
		return _F20Name;
	}

	public void setF20Name(String F20Name) {
		_F20Name = F20Name;
	}

	public String getF20Value() {
		return _F20Value;
	}

	public void setF20Value(String F20Value) {
		_F20Value = F20Value;
	}

	public double getF20Mark() {
		return _F20Mark;
	}

	public void setF20Mark(double F20Mark) {
		_F20Mark = F20Mark;
	}

	public String getF21Code() {
		return _F21Code;
	}

	public void setF21Code(String F21Code) {
		_F21Code = F21Code;
	}

	public String getF21Name() {
		return _F21Name;
	}

	public void setF21Name(String F21Name) {
		_F21Name = F21Name;
	}

	public String getF21Value() {
		return _F21Value;
	}

	public void setF21Value(String F21Value) {
		_F21Value = F21Value;
	}

	public double getF21Mark() {
		return _F21Mark;
	}

	public void setF21Mark(double F21Mark) {
		_F21Mark = F21Mark;
	}

	public String getF22Code() {
		return _F22Code;
	}

	public void setF22Code(String F22Code) {
		_F22Code = F22Code;
	}

	public String getF22Name() {
		return _F22Name;
	}

	public void setF22Name(String F22Name) {
		_F22Name = F22Name;
	}

	public String getF22Value() {
		return _F22Value;
	}

	public void setF22Value(String F22Value) {
		_F22Value = F22Value;
	}

	public double getF22Mark() {
		return _F22Mark;
	}

	public void setF22Mark(double F22Mark) {
		_F22Mark = F22Mark;
	}

	public String getF23Code() {
		return _F23Code;
	}

	public void setF23Code(String F23Code) {
		_F23Code = F23Code;
	}

	public String getF23Name() {
		return _F23Name;
	}

	public void setF23Name(String F23Name) {
		_F23Name = F23Name;
	}

	public String getF23Value() {
		return _F23Value;
	}

	public void setF23Value(String F23Value) {
		_F23Value = F23Value;
	}

	public double getF23Mark() {
		return _F23Mark;
	}

	public void setF23Mark(double F23Mark) {
		_F23Mark = F23Mark;
	}

	public double getSumMark() {
		return _SumMark;
	}

	public void setSumMark(double SumMark) {
		_SumMark = SumMark;
	}

	public String getMaker() {
		return _maker;
	}

	public void setMaker(String maker) {
		_maker = maker;
	}

	public String getChecker() {
		return _checker;
	}

	public void setChecker(String checker) {
		_checker = checker;
	}

	public String getApprover() {
		return _approver;
	}

	public void setApprover(String approver) {
		_approver = approver;
	}

	public Date getMakermodified() {
		return _makermodified;
	}

	public void setMakermodified(Date makermodified) {
		_makermodified = makermodified;
	}

	public Date getCheckermodified() {
		return _checkermodified;
	}

	public void setCheckermodified(Date checkermodified) {
		_checkermodified = checkermodified;
	}

	public Date getApprovermodified() {
		return _approvermodified;
	}

	public void setApprovermodified(Date approvermodified) {
		_approvermodified = approvermodified;
	}

	public String getAssessmentid() {
		return _assessmentid;
	}

	public void setAssessmentid(String assessmentid) {
		_assessmentid = assessmentid;
	}

	public String getAssessmentyear() {
		return _assessmentyear;
	}

	public void setAssessmentyear(String assessmentyear) {
		_assessmentyear = assessmentyear;
	}

	public String getEvaluationperiod() {
		return _evaluationperiod;
	}

	public void setEvaluationperiod(String evaluationperiod) {
		_evaluationperiod = evaluationperiod;
	}

	public Date getLatestassessment() {
		return _latestassessment;
	}

	public void setLatestassessment(Date latestassessment) {
		_latestassessment = latestassessment;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	public String getNextassessmentid() {
		return _nextassessmentid;
	}

	public void setNextassessmentid(String nextassessmentid) {
		_nextassessmentid = nextassessmentid;
	}

	public String getNextassessmentyear() {
		return _nextassessmentyear;
	}

	public void setNextassessmentyear(String nextassessmentyear) {
		_nextassessmentyear = nextassessmentyear;
	}

	private long _id;
	private String _productcode;
	private String _productname;
	private int _productsequenceno;
	private String _productdescription;
	private String _productcodereference;
	private String _productnamereference;
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
}