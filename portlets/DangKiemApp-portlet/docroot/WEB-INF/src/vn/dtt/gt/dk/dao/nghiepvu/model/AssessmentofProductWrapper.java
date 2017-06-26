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
 * This class is a wrapper for {@link AssessmentofProduct}.
 * </p>
 *
 * @author win_64
 * @see AssessmentofProduct
 * @generated
 */
public class AssessmentofProductWrapper implements AssessmentofProduct,
	ModelWrapper<AssessmentofProduct> {
	public AssessmentofProductWrapper(AssessmentofProduct assessmentofProduct) {
		_assessmentofProduct = assessmentofProduct;
	}

	@Override
	public Class<?> getModelClass() {
		return AssessmentofProduct.class;
	}

	@Override
	public String getModelClassName() {
		return AssessmentofProduct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("productcode", getProductcode());
		attributes.put("productname", getProductname());
		attributes.put("productsequenceno", getProductsequenceno());
		attributes.put("productdescription", getProductdescription());
		attributes.put("productcodereference", getProductcodereference());
		attributes.put("productnamereference", getProductnamereference());
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

		String productcode = (String)attributes.get("productcode");

		if (productcode != null) {
			setProductcode(productcode);
		}

		String productname = (String)attributes.get("productname");

		if (productname != null) {
			setProductname(productname);
		}

		Integer productsequenceno = (Integer)attributes.get("productsequenceno");

		if (productsequenceno != null) {
			setProductsequenceno(productsequenceno);
		}

		String productdescription = (String)attributes.get("productdescription");

		if (productdescription != null) {
			setProductdescription(productdescription);
		}

		String productcodereference = (String)attributes.get(
				"productcodereference");

		if (productcodereference != null) {
			setProductcodereference(productcodereference);
		}

		String productnamereference = (String)attributes.get(
				"productnamereference");

		if (productnamereference != null) {
			setProductnamereference(productnamereference);
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
	* Returns the primary key of this assessmentof product.
	*
	* @return the primary key of this assessmentof product
	*/
	@Override
	public long getPrimaryKey() {
		return _assessmentofProduct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessmentof product.
	*
	* @param primaryKey the primary key of this assessmentof product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessmentofProduct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this assessmentof product.
	*
	* @return the ID of this assessmentof product
	*/
	@Override
	public long getId() {
		return _assessmentofProduct.getId();
	}

	/**
	* Sets the ID of this assessmentof product.
	*
	* @param id the ID of this assessmentof product
	*/
	@Override
	public void setId(long id) {
		_assessmentofProduct.setId(id);
	}

	/**
	* Returns the productcode of this assessmentof product.
	*
	* @return the productcode of this assessmentof product
	*/
	@Override
	public java.lang.String getProductcode() {
		return _assessmentofProduct.getProductcode();
	}

	/**
	* Sets the productcode of this assessmentof product.
	*
	* @param productcode the productcode of this assessmentof product
	*/
	@Override
	public void setProductcode(java.lang.String productcode) {
		_assessmentofProduct.setProductcode(productcode);
	}

	/**
	* Returns the productname of this assessmentof product.
	*
	* @return the productname of this assessmentof product
	*/
	@Override
	public java.lang.String getProductname() {
		return _assessmentofProduct.getProductname();
	}

	/**
	* Sets the productname of this assessmentof product.
	*
	* @param productname the productname of this assessmentof product
	*/
	@Override
	public void setProductname(java.lang.String productname) {
		_assessmentofProduct.setProductname(productname);
	}

	/**
	* Returns the productsequenceno of this assessmentof product.
	*
	* @return the productsequenceno of this assessmentof product
	*/
	@Override
	public int getProductsequenceno() {
		return _assessmentofProduct.getProductsequenceno();
	}

	/**
	* Sets the productsequenceno of this assessmentof product.
	*
	* @param productsequenceno the productsequenceno of this assessmentof product
	*/
	@Override
	public void setProductsequenceno(int productsequenceno) {
		_assessmentofProduct.setProductsequenceno(productsequenceno);
	}

	/**
	* Returns the productdescription of this assessmentof product.
	*
	* @return the productdescription of this assessmentof product
	*/
	@Override
	public java.lang.String getProductdescription() {
		return _assessmentofProduct.getProductdescription();
	}

	/**
	* Sets the productdescription of this assessmentof product.
	*
	* @param productdescription the productdescription of this assessmentof product
	*/
	@Override
	public void setProductdescription(java.lang.String productdescription) {
		_assessmentofProduct.setProductdescription(productdescription);
	}

	/**
	* Returns the productcodereference of this assessmentof product.
	*
	* @return the productcodereference of this assessmentof product
	*/
	@Override
	public java.lang.String getProductcodereference() {
		return _assessmentofProduct.getProductcodereference();
	}

	/**
	* Sets the productcodereference of this assessmentof product.
	*
	* @param productcodereference the productcodereference of this assessmentof product
	*/
	@Override
	public void setProductcodereference(java.lang.String productcodereference) {
		_assessmentofProduct.setProductcodereference(productcodereference);
	}

	/**
	* Returns the productnamereference of this assessmentof product.
	*
	* @return the productnamereference of this assessmentof product
	*/
	@Override
	public java.lang.String getProductnamereference() {
		return _assessmentofProduct.getProductnamereference();
	}

	/**
	* Sets the productnamereference of this assessmentof product.
	*
	* @param productnamereference the productnamereference of this assessmentof product
	*/
	@Override
	public void setProductnamereference(java.lang.String productnamereference) {
		_assessmentofProduct.setProductnamereference(productnamereference);
	}

	/**
	* Returns the f1 code of this assessmentof product.
	*
	* @return the f1 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF1Code() {
		return _assessmentofProduct.getF1Code();
	}

	/**
	* Sets the f1 code of this assessmentof product.
	*
	* @param F1Code the f1 code of this assessmentof product
	*/
	@Override
	public void setF1Code(java.lang.String F1Code) {
		_assessmentofProduct.setF1Code(F1Code);
	}

	/**
	* Returns the f1 name of this assessmentof product.
	*
	* @return the f1 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF1Name() {
		return _assessmentofProduct.getF1Name();
	}

	/**
	* Sets the f1 name of this assessmentof product.
	*
	* @param F1Name the f1 name of this assessmentof product
	*/
	@Override
	public void setF1Name(java.lang.String F1Name) {
		_assessmentofProduct.setF1Name(F1Name);
	}

	/**
	* Returns the f1 value of this assessmentof product.
	*
	* @return the f1 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF1Value() {
		return _assessmentofProduct.getF1Value();
	}

	/**
	* Sets the f1 value of this assessmentof product.
	*
	* @param F1Value the f1 value of this assessmentof product
	*/
	@Override
	public void setF1Value(java.lang.String F1Value) {
		_assessmentofProduct.setF1Value(F1Value);
	}

	/**
	* Returns the f1 mark of this assessmentof product.
	*
	* @return the f1 mark of this assessmentof product
	*/
	@Override
	public double getF1Mark() {
		return _assessmentofProduct.getF1Mark();
	}

	/**
	* Sets the f1 mark of this assessmentof product.
	*
	* @param F1Mark the f1 mark of this assessmentof product
	*/
	@Override
	public void setF1Mark(double F1Mark) {
		_assessmentofProduct.setF1Mark(F1Mark);
	}

	/**
	* Returns the f2 code of this assessmentof product.
	*
	* @return the f2 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF2Code() {
		return _assessmentofProduct.getF2Code();
	}

	/**
	* Sets the f2 code of this assessmentof product.
	*
	* @param F2Code the f2 code of this assessmentof product
	*/
	@Override
	public void setF2Code(java.lang.String F2Code) {
		_assessmentofProduct.setF2Code(F2Code);
	}

	/**
	* Returns the f2 name of this assessmentof product.
	*
	* @return the f2 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF2Name() {
		return _assessmentofProduct.getF2Name();
	}

	/**
	* Sets the f2 name of this assessmentof product.
	*
	* @param F2Name the f2 name of this assessmentof product
	*/
	@Override
	public void setF2Name(java.lang.String F2Name) {
		_assessmentofProduct.setF2Name(F2Name);
	}

	/**
	* Returns the f2 value of this assessmentof product.
	*
	* @return the f2 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF2Value() {
		return _assessmentofProduct.getF2Value();
	}

	/**
	* Sets the f2 value of this assessmentof product.
	*
	* @param F2Value the f2 value of this assessmentof product
	*/
	@Override
	public void setF2Value(java.lang.String F2Value) {
		_assessmentofProduct.setF2Value(F2Value);
	}

	/**
	* Returns the f2 mark of this assessmentof product.
	*
	* @return the f2 mark of this assessmentof product
	*/
	@Override
	public double getF2Mark() {
		return _assessmentofProduct.getF2Mark();
	}

	/**
	* Sets the f2 mark of this assessmentof product.
	*
	* @param F2Mark the f2 mark of this assessmentof product
	*/
	@Override
	public void setF2Mark(double F2Mark) {
		_assessmentofProduct.setF2Mark(F2Mark);
	}

	/**
	* Returns the f3 code of this assessmentof product.
	*
	* @return the f3 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF3Code() {
		return _assessmentofProduct.getF3Code();
	}

	/**
	* Sets the f3 code of this assessmentof product.
	*
	* @param F3Code the f3 code of this assessmentof product
	*/
	@Override
	public void setF3Code(java.lang.String F3Code) {
		_assessmentofProduct.setF3Code(F3Code);
	}

	/**
	* Returns the f3 name of this assessmentof product.
	*
	* @return the f3 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF3Name() {
		return _assessmentofProduct.getF3Name();
	}

	/**
	* Sets the f3 name of this assessmentof product.
	*
	* @param F3Name the f3 name of this assessmentof product
	*/
	@Override
	public void setF3Name(java.lang.String F3Name) {
		_assessmentofProduct.setF3Name(F3Name);
	}

	/**
	* Returns the f3 value of this assessmentof product.
	*
	* @return the f3 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF3Value() {
		return _assessmentofProduct.getF3Value();
	}

	/**
	* Sets the f3 value of this assessmentof product.
	*
	* @param F3Value the f3 value of this assessmentof product
	*/
	@Override
	public void setF3Value(java.lang.String F3Value) {
		_assessmentofProduct.setF3Value(F3Value);
	}

	/**
	* Returns the f3 mark of this assessmentof product.
	*
	* @return the f3 mark of this assessmentof product
	*/
	@Override
	public double getF3Mark() {
		return _assessmentofProduct.getF3Mark();
	}

	/**
	* Sets the f3 mark of this assessmentof product.
	*
	* @param F3Mark the f3 mark of this assessmentof product
	*/
	@Override
	public void setF3Mark(double F3Mark) {
		_assessmentofProduct.setF3Mark(F3Mark);
	}

	/**
	* Returns the f4 code of this assessmentof product.
	*
	* @return the f4 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF4Code() {
		return _assessmentofProduct.getF4Code();
	}

	/**
	* Sets the f4 code of this assessmentof product.
	*
	* @param F4Code the f4 code of this assessmentof product
	*/
	@Override
	public void setF4Code(java.lang.String F4Code) {
		_assessmentofProduct.setF4Code(F4Code);
	}

	/**
	* Returns the f4 name of this assessmentof product.
	*
	* @return the f4 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF4Name() {
		return _assessmentofProduct.getF4Name();
	}

	/**
	* Sets the f4 name of this assessmentof product.
	*
	* @param F4Name the f4 name of this assessmentof product
	*/
	@Override
	public void setF4Name(java.lang.String F4Name) {
		_assessmentofProduct.setF4Name(F4Name);
	}

	/**
	* Returns the f4 value of this assessmentof product.
	*
	* @return the f4 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF4Value() {
		return _assessmentofProduct.getF4Value();
	}

	/**
	* Sets the f4 value of this assessmentof product.
	*
	* @param F4Value the f4 value of this assessmentof product
	*/
	@Override
	public void setF4Value(java.lang.String F4Value) {
		_assessmentofProduct.setF4Value(F4Value);
	}

	/**
	* Returns the f4 mark of this assessmentof product.
	*
	* @return the f4 mark of this assessmentof product
	*/
	@Override
	public double getF4Mark() {
		return _assessmentofProduct.getF4Mark();
	}

	/**
	* Sets the f4 mark of this assessmentof product.
	*
	* @param F4Mark the f4 mark of this assessmentof product
	*/
	@Override
	public void setF4Mark(double F4Mark) {
		_assessmentofProduct.setF4Mark(F4Mark);
	}

	/**
	* Returns the f5 code of this assessmentof product.
	*
	* @return the f5 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF5Code() {
		return _assessmentofProduct.getF5Code();
	}

	/**
	* Sets the f5 code of this assessmentof product.
	*
	* @param F5Code the f5 code of this assessmentof product
	*/
	@Override
	public void setF5Code(java.lang.String F5Code) {
		_assessmentofProduct.setF5Code(F5Code);
	}

	/**
	* Returns the f5 name of this assessmentof product.
	*
	* @return the f5 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF5Name() {
		return _assessmentofProduct.getF5Name();
	}

	/**
	* Sets the f5 name of this assessmentof product.
	*
	* @param F5Name the f5 name of this assessmentof product
	*/
	@Override
	public void setF5Name(java.lang.String F5Name) {
		_assessmentofProduct.setF5Name(F5Name);
	}

	/**
	* Returns the f5 value of this assessmentof product.
	*
	* @return the f5 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF5Value() {
		return _assessmentofProduct.getF5Value();
	}

	/**
	* Sets the f5 value of this assessmentof product.
	*
	* @param F5Value the f5 value of this assessmentof product
	*/
	@Override
	public void setF5Value(java.lang.String F5Value) {
		_assessmentofProduct.setF5Value(F5Value);
	}

	/**
	* Returns the f5 mark of this assessmentof product.
	*
	* @return the f5 mark of this assessmentof product
	*/
	@Override
	public double getF5Mark() {
		return _assessmentofProduct.getF5Mark();
	}

	/**
	* Sets the f5 mark of this assessmentof product.
	*
	* @param F5Mark the f5 mark of this assessmentof product
	*/
	@Override
	public void setF5Mark(double F5Mark) {
		_assessmentofProduct.setF5Mark(F5Mark);
	}

	/**
	* Returns the f6 code of this assessmentof product.
	*
	* @return the f6 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF6Code() {
		return _assessmentofProduct.getF6Code();
	}

	/**
	* Sets the f6 code of this assessmentof product.
	*
	* @param F6Code the f6 code of this assessmentof product
	*/
	@Override
	public void setF6Code(java.lang.String F6Code) {
		_assessmentofProduct.setF6Code(F6Code);
	}

	/**
	* Returns the f6 name of this assessmentof product.
	*
	* @return the f6 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF6Name() {
		return _assessmentofProduct.getF6Name();
	}

	/**
	* Sets the f6 name of this assessmentof product.
	*
	* @param F6Name the f6 name of this assessmentof product
	*/
	@Override
	public void setF6Name(java.lang.String F6Name) {
		_assessmentofProduct.setF6Name(F6Name);
	}

	/**
	* Returns the f6 value of this assessmentof product.
	*
	* @return the f6 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF6Value() {
		return _assessmentofProduct.getF6Value();
	}

	/**
	* Sets the f6 value of this assessmentof product.
	*
	* @param F6Value the f6 value of this assessmentof product
	*/
	@Override
	public void setF6Value(java.lang.String F6Value) {
		_assessmentofProduct.setF6Value(F6Value);
	}

	/**
	* Returns the f6 mark of this assessmentof product.
	*
	* @return the f6 mark of this assessmentof product
	*/
	@Override
	public double getF6Mark() {
		return _assessmentofProduct.getF6Mark();
	}

	/**
	* Sets the f6 mark of this assessmentof product.
	*
	* @param F6Mark the f6 mark of this assessmentof product
	*/
	@Override
	public void setF6Mark(double F6Mark) {
		_assessmentofProduct.setF6Mark(F6Mark);
	}

	/**
	* Returns the f7 code of this assessmentof product.
	*
	* @return the f7 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF7Code() {
		return _assessmentofProduct.getF7Code();
	}

	/**
	* Sets the f7 code of this assessmentof product.
	*
	* @param F7Code the f7 code of this assessmentof product
	*/
	@Override
	public void setF7Code(java.lang.String F7Code) {
		_assessmentofProduct.setF7Code(F7Code);
	}

	/**
	* Returns the f7 name of this assessmentof product.
	*
	* @return the f7 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF7Name() {
		return _assessmentofProduct.getF7Name();
	}

	/**
	* Sets the f7 name of this assessmentof product.
	*
	* @param F7Name the f7 name of this assessmentof product
	*/
	@Override
	public void setF7Name(java.lang.String F7Name) {
		_assessmentofProduct.setF7Name(F7Name);
	}

	/**
	* Returns the f7 value of this assessmentof product.
	*
	* @return the f7 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF7Value() {
		return _assessmentofProduct.getF7Value();
	}

	/**
	* Sets the f7 value of this assessmentof product.
	*
	* @param F7Value the f7 value of this assessmentof product
	*/
	@Override
	public void setF7Value(java.lang.String F7Value) {
		_assessmentofProduct.setF7Value(F7Value);
	}

	/**
	* Returns the f7 mark of this assessmentof product.
	*
	* @return the f7 mark of this assessmentof product
	*/
	@Override
	public double getF7Mark() {
		return _assessmentofProduct.getF7Mark();
	}

	/**
	* Sets the f7 mark of this assessmentof product.
	*
	* @param F7Mark the f7 mark of this assessmentof product
	*/
	@Override
	public void setF7Mark(double F7Mark) {
		_assessmentofProduct.setF7Mark(F7Mark);
	}

	/**
	* Returns the f8 code of this assessmentof product.
	*
	* @return the f8 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF8Code() {
		return _assessmentofProduct.getF8Code();
	}

	/**
	* Sets the f8 code of this assessmentof product.
	*
	* @param F8Code the f8 code of this assessmentof product
	*/
	@Override
	public void setF8Code(java.lang.String F8Code) {
		_assessmentofProduct.setF8Code(F8Code);
	}

	/**
	* Returns the f8 name of this assessmentof product.
	*
	* @return the f8 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF8Name() {
		return _assessmentofProduct.getF8Name();
	}

	/**
	* Sets the f8 name of this assessmentof product.
	*
	* @param F8Name the f8 name of this assessmentof product
	*/
	@Override
	public void setF8Name(java.lang.String F8Name) {
		_assessmentofProduct.setF8Name(F8Name);
	}

	/**
	* Returns the f8 value of this assessmentof product.
	*
	* @return the f8 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF8Value() {
		return _assessmentofProduct.getF8Value();
	}

	/**
	* Sets the f8 value of this assessmentof product.
	*
	* @param F8Value the f8 value of this assessmentof product
	*/
	@Override
	public void setF8Value(java.lang.String F8Value) {
		_assessmentofProduct.setF8Value(F8Value);
	}

	/**
	* Returns the f8 mark of this assessmentof product.
	*
	* @return the f8 mark of this assessmentof product
	*/
	@Override
	public double getF8Mark() {
		return _assessmentofProduct.getF8Mark();
	}

	/**
	* Sets the f8 mark of this assessmentof product.
	*
	* @param F8Mark the f8 mark of this assessmentof product
	*/
	@Override
	public void setF8Mark(double F8Mark) {
		_assessmentofProduct.setF8Mark(F8Mark);
	}

	/**
	* Returns the f9 code of this assessmentof product.
	*
	* @return the f9 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF9Code() {
		return _assessmentofProduct.getF9Code();
	}

	/**
	* Sets the f9 code of this assessmentof product.
	*
	* @param F9Code the f9 code of this assessmentof product
	*/
	@Override
	public void setF9Code(java.lang.String F9Code) {
		_assessmentofProduct.setF9Code(F9Code);
	}

	/**
	* Returns the f9 name of this assessmentof product.
	*
	* @return the f9 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF9Name() {
		return _assessmentofProduct.getF9Name();
	}

	/**
	* Sets the f9 name of this assessmentof product.
	*
	* @param F9Name the f9 name of this assessmentof product
	*/
	@Override
	public void setF9Name(java.lang.String F9Name) {
		_assessmentofProduct.setF9Name(F9Name);
	}

	/**
	* Returns the f9 value of this assessmentof product.
	*
	* @return the f9 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF9Value() {
		return _assessmentofProduct.getF9Value();
	}

	/**
	* Sets the f9 value of this assessmentof product.
	*
	* @param F9Value the f9 value of this assessmentof product
	*/
	@Override
	public void setF9Value(java.lang.String F9Value) {
		_assessmentofProduct.setF9Value(F9Value);
	}

	/**
	* Returns the f9 mark of this assessmentof product.
	*
	* @return the f9 mark of this assessmentof product
	*/
	@Override
	public double getF9Mark() {
		return _assessmentofProduct.getF9Mark();
	}

	/**
	* Sets the f9 mark of this assessmentof product.
	*
	* @param F9Mark the f9 mark of this assessmentof product
	*/
	@Override
	public void setF9Mark(double F9Mark) {
		_assessmentofProduct.setF9Mark(F9Mark);
	}

	/**
	* Returns the f10 code of this assessmentof product.
	*
	* @return the f10 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF10Code() {
		return _assessmentofProduct.getF10Code();
	}

	/**
	* Sets the f10 code of this assessmentof product.
	*
	* @param F10Code the f10 code of this assessmentof product
	*/
	@Override
	public void setF10Code(java.lang.String F10Code) {
		_assessmentofProduct.setF10Code(F10Code);
	}

	/**
	* Returns the f10 name of this assessmentof product.
	*
	* @return the f10 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF10Name() {
		return _assessmentofProduct.getF10Name();
	}

	/**
	* Sets the f10 name of this assessmentof product.
	*
	* @param F10Name the f10 name of this assessmentof product
	*/
	@Override
	public void setF10Name(java.lang.String F10Name) {
		_assessmentofProduct.setF10Name(F10Name);
	}

	/**
	* Returns the f10 value of this assessmentof product.
	*
	* @return the f10 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF10Value() {
		return _assessmentofProduct.getF10Value();
	}

	/**
	* Sets the f10 value of this assessmentof product.
	*
	* @param F10Value the f10 value of this assessmentof product
	*/
	@Override
	public void setF10Value(java.lang.String F10Value) {
		_assessmentofProduct.setF10Value(F10Value);
	}

	/**
	* Returns the f10 mark of this assessmentof product.
	*
	* @return the f10 mark of this assessmentof product
	*/
	@Override
	public double getF10Mark() {
		return _assessmentofProduct.getF10Mark();
	}

	/**
	* Sets the f10 mark of this assessmentof product.
	*
	* @param F10Mark the f10 mark of this assessmentof product
	*/
	@Override
	public void setF10Mark(double F10Mark) {
		_assessmentofProduct.setF10Mark(F10Mark);
	}

	/**
	* Returns the f11 code of this assessmentof product.
	*
	* @return the f11 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF11Code() {
		return _assessmentofProduct.getF11Code();
	}

	/**
	* Sets the f11 code of this assessmentof product.
	*
	* @param F11Code the f11 code of this assessmentof product
	*/
	@Override
	public void setF11Code(java.lang.String F11Code) {
		_assessmentofProduct.setF11Code(F11Code);
	}

	/**
	* Returns the f11 name of this assessmentof product.
	*
	* @return the f11 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF11Name() {
		return _assessmentofProduct.getF11Name();
	}

	/**
	* Sets the f11 name of this assessmentof product.
	*
	* @param F11Name the f11 name of this assessmentof product
	*/
	@Override
	public void setF11Name(java.lang.String F11Name) {
		_assessmentofProduct.setF11Name(F11Name);
	}

	/**
	* Returns the f11 value of this assessmentof product.
	*
	* @return the f11 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF11Value() {
		return _assessmentofProduct.getF11Value();
	}

	/**
	* Sets the f11 value of this assessmentof product.
	*
	* @param F11Value the f11 value of this assessmentof product
	*/
	@Override
	public void setF11Value(java.lang.String F11Value) {
		_assessmentofProduct.setF11Value(F11Value);
	}

	/**
	* Returns the f11 mark of this assessmentof product.
	*
	* @return the f11 mark of this assessmentof product
	*/
	@Override
	public double getF11Mark() {
		return _assessmentofProduct.getF11Mark();
	}

	/**
	* Sets the f11 mark of this assessmentof product.
	*
	* @param F11Mark the f11 mark of this assessmentof product
	*/
	@Override
	public void setF11Mark(double F11Mark) {
		_assessmentofProduct.setF11Mark(F11Mark);
	}

	/**
	* Returns the f12 code of this assessmentof product.
	*
	* @return the f12 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF12Code() {
		return _assessmentofProduct.getF12Code();
	}

	/**
	* Sets the f12 code of this assessmentof product.
	*
	* @param F12Code the f12 code of this assessmentof product
	*/
	@Override
	public void setF12Code(java.lang.String F12Code) {
		_assessmentofProduct.setF12Code(F12Code);
	}

	/**
	* Returns the f12 name of this assessmentof product.
	*
	* @return the f12 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF12Name() {
		return _assessmentofProduct.getF12Name();
	}

	/**
	* Sets the f12 name of this assessmentof product.
	*
	* @param F12Name the f12 name of this assessmentof product
	*/
	@Override
	public void setF12Name(java.lang.String F12Name) {
		_assessmentofProduct.setF12Name(F12Name);
	}

	/**
	* Returns the f12 value of this assessmentof product.
	*
	* @return the f12 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF12Value() {
		return _assessmentofProduct.getF12Value();
	}

	/**
	* Sets the f12 value of this assessmentof product.
	*
	* @param F12Value the f12 value of this assessmentof product
	*/
	@Override
	public void setF12Value(java.lang.String F12Value) {
		_assessmentofProduct.setF12Value(F12Value);
	}

	/**
	* Returns the f12 mark of this assessmentof product.
	*
	* @return the f12 mark of this assessmentof product
	*/
	@Override
	public double getF12Mark() {
		return _assessmentofProduct.getF12Mark();
	}

	/**
	* Sets the f12 mark of this assessmentof product.
	*
	* @param F12Mark the f12 mark of this assessmentof product
	*/
	@Override
	public void setF12Mark(double F12Mark) {
		_assessmentofProduct.setF12Mark(F12Mark);
	}

	/**
	* Returns the f13 code of this assessmentof product.
	*
	* @return the f13 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF13Code() {
		return _assessmentofProduct.getF13Code();
	}

	/**
	* Sets the f13 code of this assessmentof product.
	*
	* @param F13Code the f13 code of this assessmentof product
	*/
	@Override
	public void setF13Code(java.lang.String F13Code) {
		_assessmentofProduct.setF13Code(F13Code);
	}

	/**
	* Returns the f13 name of this assessmentof product.
	*
	* @return the f13 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF13Name() {
		return _assessmentofProduct.getF13Name();
	}

	/**
	* Sets the f13 name of this assessmentof product.
	*
	* @param F13Name the f13 name of this assessmentof product
	*/
	@Override
	public void setF13Name(java.lang.String F13Name) {
		_assessmentofProduct.setF13Name(F13Name);
	}

	/**
	* Returns the f13 value of this assessmentof product.
	*
	* @return the f13 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF13Value() {
		return _assessmentofProduct.getF13Value();
	}

	/**
	* Sets the f13 value of this assessmentof product.
	*
	* @param F13Value the f13 value of this assessmentof product
	*/
	@Override
	public void setF13Value(java.lang.String F13Value) {
		_assessmentofProduct.setF13Value(F13Value);
	}

	/**
	* Returns the f13 mark of this assessmentof product.
	*
	* @return the f13 mark of this assessmentof product
	*/
	@Override
	public double getF13Mark() {
		return _assessmentofProduct.getF13Mark();
	}

	/**
	* Sets the f13 mark of this assessmentof product.
	*
	* @param F13Mark the f13 mark of this assessmentof product
	*/
	@Override
	public void setF13Mark(double F13Mark) {
		_assessmentofProduct.setF13Mark(F13Mark);
	}

	/**
	* Returns the f14 code of this assessmentof product.
	*
	* @return the f14 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF14Code() {
		return _assessmentofProduct.getF14Code();
	}

	/**
	* Sets the f14 code of this assessmentof product.
	*
	* @param F14Code the f14 code of this assessmentof product
	*/
	@Override
	public void setF14Code(java.lang.String F14Code) {
		_assessmentofProduct.setF14Code(F14Code);
	}

	/**
	* Returns the f14 name of this assessmentof product.
	*
	* @return the f14 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF14Name() {
		return _assessmentofProduct.getF14Name();
	}

	/**
	* Sets the f14 name of this assessmentof product.
	*
	* @param F14Name the f14 name of this assessmentof product
	*/
	@Override
	public void setF14Name(java.lang.String F14Name) {
		_assessmentofProduct.setF14Name(F14Name);
	}

	/**
	* Returns the f14 value of this assessmentof product.
	*
	* @return the f14 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF14Value() {
		return _assessmentofProduct.getF14Value();
	}

	/**
	* Sets the f14 value of this assessmentof product.
	*
	* @param F14Value the f14 value of this assessmentof product
	*/
	@Override
	public void setF14Value(java.lang.String F14Value) {
		_assessmentofProduct.setF14Value(F14Value);
	}

	/**
	* Returns the f14 mark of this assessmentof product.
	*
	* @return the f14 mark of this assessmentof product
	*/
	@Override
	public double getF14Mark() {
		return _assessmentofProduct.getF14Mark();
	}

	/**
	* Sets the f14 mark of this assessmentof product.
	*
	* @param F14Mark the f14 mark of this assessmentof product
	*/
	@Override
	public void setF14Mark(double F14Mark) {
		_assessmentofProduct.setF14Mark(F14Mark);
	}

	/**
	* Returns the f15 code of this assessmentof product.
	*
	* @return the f15 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF15Code() {
		return _assessmentofProduct.getF15Code();
	}

	/**
	* Sets the f15 code of this assessmentof product.
	*
	* @param F15Code the f15 code of this assessmentof product
	*/
	@Override
	public void setF15Code(java.lang.String F15Code) {
		_assessmentofProduct.setF15Code(F15Code);
	}

	/**
	* Returns the f15 name of this assessmentof product.
	*
	* @return the f15 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF15Name() {
		return _assessmentofProduct.getF15Name();
	}

	/**
	* Sets the f15 name of this assessmentof product.
	*
	* @param F15Name the f15 name of this assessmentof product
	*/
	@Override
	public void setF15Name(java.lang.String F15Name) {
		_assessmentofProduct.setF15Name(F15Name);
	}

	/**
	* Returns the f15 value of this assessmentof product.
	*
	* @return the f15 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF15Value() {
		return _assessmentofProduct.getF15Value();
	}

	/**
	* Sets the f15 value of this assessmentof product.
	*
	* @param F15Value the f15 value of this assessmentof product
	*/
	@Override
	public void setF15Value(java.lang.String F15Value) {
		_assessmentofProduct.setF15Value(F15Value);
	}

	/**
	* Returns the f15 mark of this assessmentof product.
	*
	* @return the f15 mark of this assessmentof product
	*/
	@Override
	public double getF15Mark() {
		return _assessmentofProduct.getF15Mark();
	}

	/**
	* Sets the f15 mark of this assessmentof product.
	*
	* @param F15Mark the f15 mark of this assessmentof product
	*/
	@Override
	public void setF15Mark(double F15Mark) {
		_assessmentofProduct.setF15Mark(F15Mark);
	}

	/**
	* Returns the f16 code of this assessmentof product.
	*
	* @return the f16 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF16Code() {
		return _assessmentofProduct.getF16Code();
	}

	/**
	* Sets the f16 code of this assessmentof product.
	*
	* @param F16Code the f16 code of this assessmentof product
	*/
	@Override
	public void setF16Code(java.lang.String F16Code) {
		_assessmentofProduct.setF16Code(F16Code);
	}

	/**
	* Returns the f16 name of this assessmentof product.
	*
	* @return the f16 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF16Name() {
		return _assessmentofProduct.getF16Name();
	}

	/**
	* Sets the f16 name of this assessmentof product.
	*
	* @param F16Name the f16 name of this assessmentof product
	*/
	@Override
	public void setF16Name(java.lang.String F16Name) {
		_assessmentofProduct.setF16Name(F16Name);
	}

	/**
	* Returns the f16 value of this assessmentof product.
	*
	* @return the f16 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF16Value() {
		return _assessmentofProduct.getF16Value();
	}

	/**
	* Sets the f16 value of this assessmentof product.
	*
	* @param F16Value the f16 value of this assessmentof product
	*/
	@Override
	public void setF16Value(java.lang.String F16Value) {
		_assessmentofProduct.setF16Value(F16Value);
	}

	/**
	* Returns the f16 mark of this assessmentof product.
	*
	* @return the f16 mark of this assessmentof product
	*/
	@Override
	public double getF16Mark() {
		return _assessmentofProduct.getF16Mark();
	}

	/**
	* Sets the f16 mark of this assessmentof product.
	*
	* @param F16Mark the f16 mark of this assessmentof product
	*/
	@Override
	public void setF16Mark(double F16Mark) {
		_assessmentofProduct.setF16Mark(F16Mark);
	}

	/**
	* Returns the f17 code of this assessmentof product.
	*
	* @return the f17 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF17Code() {
		return _assessmentofProduct.getF17Code();
	}

	/**
	* Sets the f17 code of this assessmentof product.
	*
	* @param F17Code the f17 code of this assessmentof product
	*/
	@Override
	public void setF17Code(java.lang.String F17Code) {
		_assessmentofProduct.setF17Code(F17Code);
	}

	/**
	* Returns the f17 name of this assessmentof product.
	*
	* @return the f17 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF17Name() {
		return _assessmentofProduct.getF17Name();
	}

	/**
	* Sets the f17 name of this assessmentof product.
	*
	* @param F17Name the f17 name of this assessmentof product
	*/
	@Override
	public void setF17Name(java.lang.String F17Name) {
		_assessmentofProduct.setF17Name(F17Name);
	}

	/**
	* Returns the f17 value of this assessmentof product.
	*
	* @return the f17 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF17Value() {
		return _assessmentofProduct.getF17Value();
	}

	/**
	* Sets the f17 value of this assessmentof product.
	*
	* @param F17Value the f17 value of this assessmentof product
	*/
	@Override
	public void setF17Value(java.lang.String F17Value) {
		_assessmentofProduct.setF17Value(F17Value);
	}

	/**
	* Returns the f17 mark of this assessmentof product.
	*
	* @return the f17 mark of this assessmentof product
	*/
	@Override
	public double getF17Mark() {
		return _assessmentofProduct.getF17Mark();
	}

	/**
	* Sets the f17 mark of this assessmentof product.
	*
	* @param F17Mark the f17 mark of this assessmentof product
	*/
	@Override
	public void setF17Mark(double F17Mark) {
		_assessmentofProduct.setF17Mark(F17Mark);
	}

	/**
	* Returns the f18 code of this assessmentof product.
	*
	* @return the f18 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF18Code() {
		return _assessmentofProduct.getF18Code();
	}

	/**
	* Sets the f18 code of this assessmentof product.
	*
	* @param F18Code the f18 code of this assessmentof product
	*/
	@Override
	public void setF18Code(java.lang.String F18Code) {
		_assessmentofProduct.setF18Code(F18Code);
	}

	/**
	* Returns the f18 name of this assessmentof product.
	*
	* @return the f18 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF18Name() {
		return _assessmentofProduct.getF18Name();
	}

	/**
	* Sets the f18 name of this assessmentof product.
	*
	* @param F18Name the f18 name of this assessmentof product
	*/
	@Override
	public void setF18Name(java.lang.String F18Name) {
		_assessmentofProduct.setF18Name(F18Name);
	}

	/**
	* Returns the f18 value of this assessmentof product.
	*
	* @return the f18 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF18Value() {
		return _assessmentofProduct.getF18Value();
	}

	/**
	* Sets the f18 value of this assessmentof product.
	*
	* @param F18Value the f18 value of this assessmentof product
	*/
	@Override
	public void setF18Value(java.lang.String F18Value) {
		_assessmentofProduct.setF18Value(F18Value);
	}

	/**
	* Returns the f18 mark of this assessmentof product.
	*
	* @return the f18 mark of this assessmentof product
	*/
	@Override
	public double getF18Mark() {
		return _assessmentofProduct.getF18Mark();
	}

	/**
	* Sets the f18 mark of this assessmentof product.
	*
	* @param F18Mark the f18 mark of this assessmentof product
	*/
	@Override
	public void setF18Mark(double F18Mark) {
		_assessmentofProduct.setF18Mark(F18Mark);
	}

	/**
	* Returns the f19 name of this assessmentof product.
	*
	* @return the f19 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF19Name() {
		return _assessmentofProduct.getF19Name();
	}

	/**
	* Sets the f19 name of this assessmentof product.
	*
	* @param F19Name the f19 name of this assessmentof product
	*/
	@Override
	public void setF19Name(java.lang.String F19Name) {
		_assessmentofProduct.setF19Name(F19Name);
	}

	/**
	* Returns the f19 code of this assessmentof product.
	*
	* @return the f19 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF19Code() {
		return _assessmentofProduct.getF19Code();
	}

	/**
	* Sets the f19 code of this assessmentof product.
	*
	* @param F19Code the f19 code of this assessmentof product
	*/
	@Override
	public void setF19Code(java.lang.String F19Code) {
		_assessmentofProduct.setF19Code(F19Code);
	}

	/**
	* Returns the f19 value of this assessmentof product.
	*
	* @return the f19 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF19Value() {
		return _assessmentofProduct.getF19Value();
	}

	/**
	* Sets the f19 value of this assessmentof product.
	*
	* @param F19Value the f19 value of this assessmentof product
	*/
	@Override
	public void setF19Value(java.lang.String F19Value) {
		_assessmentofProduct.setF19Value(F19Value);
	}

	/**
	* Returns the f19 mark of this assessmentof product.
	*
	* @return the f19 mark of this assessmentof product
	*/
	@Override
	public double getF19Mark() {
		return _assessmentofProduct.getF19Mark();
	}

	/**
	* Sets the f19 mark of this assessmentof product.
	*
	* @param F19Mark the f19 mark of this assessmentof product
	*/
	@Override
	public void setF19Mark(double F19Mark) {
		_assessmentofProduct.setF19Mark(F19Mark);
	}

	/**
	* Returns the f20 code of this assessmentof product.
	*
	* @return the f20 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF20Code() {
		return _assessmentofProduct.getF20Code();
	}

	/**
	* Sets the f20 code of this assessmentof product.
	*
	* @param F20Code the f20 code of this assessmentof product
	*/
	@Override
	public void setF20Code(java.lang.String F20Code) {
		_assessmentofProduct.setF20Code(F20Code);
	}

	/**
	* Returns the f20 name of this assessmentof product.
	*
	* @return the f20 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF20Name() {
		return _assessmentofProduct.getF20Name();
	}

	/**
	* Sets the f20 name of this assessmentof product.
	*
	* @param F20Name the f20 name of this assessmentof product
	*/
	@Override
	public void setF20Name(java.lang.String F20Name) {
		_assessmentofProduct.setF20Name(F20Name);
	}

	/**
	* Returns the f20 value of this assessmentof product.
	*
	* @return the f20 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF20Value() {
		return _assessmentofProduct.getF20Value();
	}

	/**
	* Sets the f20 value of this assessmentof product.
	*
	* @param F20Value the f20 value of this assessmentof product
	*/
	@Override
	public void setF20Value(java.lang.String F20Value) {
		_assessmentofProduct.setF20Value(F20Value);
	}

	/**
	* Returns the f20 mark of this assessmentof product.
	*
	* @return the f20 mark of this assessmentof product
	*/
	@Override
	public double getF20Mark() {
		return _assessmentofProduct.getF20Mark();
	}

	/**
	* Sets the f20 mark of this assessmentof product.
	*
	* @param F20Mark the f20 mark of this assessmentof product
	*/
	@Override
	public void setF20Mark(double F20Mark) {
		_assessmentofProduct.setF20Mark(F20Mark);
	}

	/**
	* Returns the f21 code of this assessmentof product.
	*
	* @return the f21 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF21Code() {
		return _assessmentofProduct.getF21Code();
	}

	/**
	* Sets the f21 code of this assessmentof product.
	*
	* @param F21Code the f21 code of this assessmentof product
	*/
	@Override
	public void setF21Code(java.lang.String F21Code) {
		_assessmentofProduct.setF21Code(F21Code);
	}

	/**
	* Returns the f21 name of this assessmentof product.
	*
	* @return the f21 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF21Name() {
		return _assessmentofProduct.getF21Name();
	}

	/**
	* Sets the f21 name of this assessmentof product.
	*
	* @param F21Name the f21 name of this assessmentof product
	*/
	@Override
	public void setF21Name(java.lang.String F21Name) {
		_assessmentofProduct.setF21Name(F21Name);
	}

	/**
	* Returns the f21 value of this assessmentof product.
	*
	* @return the f21 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF21Value() {
		return _assessmentofProduct.getF21Value();
	}

	/**
	* Sets the f21 value of this assessmentof product.
	*
	* @param F21Value the f21 value of this assessmentof product
	*/
	@Override
	public void setF21Value(java.lang.String F21Value) {
		_assessmentofProduct.setF21Value(F21Value);
	}

	/**
	* Returns the f21 mark of this assessmentof product.
	*
	* @return the f21 mark of this assessmentof product
	*/
	@Override
	public double getF21Mark() {
		return _assessmentofProduct.getF21Mark();
	}

	/**
	* Sets the f21 mark of this assessmentof product.
	*
	* @param F21Mark the f21 mark of this assessmentof product
	*/
	@Override
	public void setF21Mark(double F21Mark) {
		_assessmentofProduct.setF21Mark(F21Mark);
	}

	/**
	* Returns the f22 code of this assessmentof product.
	*
	* @return the f22 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF22Code() {
		return _assessmentofProduct.getF22Code();
	}

	/**
	* Sets the f22 code of this assessmentof product.
	*
	* @param F22Code the f22 code of this assessmentof product
	*/
	@Override
	public void setF22Code(java.lang.String F22Code) {
		_assessmentofProduct.setF22Code(F22Code);
	}

	/**
	* Returns the f22 name of this assessmentof product.
	*
	* @return the f22 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF22Name() {
		return _assessmentofProduct.getF22Name();
	}

	/**
	* Sets the f22 name of this assessmentof product.
	*
	* @param F22Name the f22 name of this assessmentof product
	*/
	@Override
	public void setF22Name(java.lang.String F22Name) {
		_assessmentofProduct.setF22Name(F22Name);
	}

	/**
	* Returns the f22 value of this assessmentof product.
	*
	* @return the f22 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF22Value() {
		return _assessmentofProduct.getF22Value();
	}

	/**
	* Sets the f22 value of this assessmentof product.
	*
	* @param F22Value the f22 value of this assessmentof product
	*/
	@Override
	public void setF22Value(java.lang.String F22Value) {
		_assessmentofProduct.setF22Value(F22Value);
	}

	/**
	* Returns the f22 mark of this assessmentof product.
	*
	* @return the f22 mark of this assessmentof product
	*/
	@Override
	public double getF22Mark() {
		return _assessmentofProduct.getF22Mark();
	}

	/**
	* Sets the f22 mark of this assessmentof product.
	*
	* @param F22Mark the f22 mark of this assessmentof product
	*/
	@Override
	public void setF22Mark(double F22Mark) {
		_assessmentofProduct.setF22Mark(F22Mark);
	}

	/**
	* Returns the f23 code of this assessmentof product.
	*
	* @return the f23 code of this assessmentof product
	*/
	@Override
	public java.lang.String getF23Code() {
		return _assessmentofProduct.getF23Code();
	}

	/**
	* Sets the f23 code of this assessmentof product.
	*
	* @param F23Code the f23 code of this assessmentof product
	*/
	@Override
	public void setF23Code(java.lang.String F23Code) {
		_assessmentofProduct.setF23Code(F23Code);
	}

	/**
	* Returns the f23 name of this assessmentof product.
	*
	* @return the f23 name of this assessmentof product
	*/
	@Override
	public java.lang.String getF23Name() {
		return _assessmentofProduct.getF23Name();
	}

	/**
	* Sets the f23 name of this assessmentof product.
	*
	* @param F23Name the f23 name of this assessmentof product
	*/
	@Override
	public void setF23Name(java.lang.String F23Name) {
		_assessmentofProduct.setF23Name(F23Name);
	}

	/**
	* Returns the f23 value of this assessmentof product.
	*
	* @return the f23 value of this assessmentof product
	*/
	@Override
	public java.lang.String getF23Value() {
		return _assessmentofProduct.getF23Value();
	}

	/**
	* Sets the f23 value of this assessmentof product.
	*
	* @param F23Value the f23 value of this assessmentof product
	*/
	@Override
	public void setF23Value(java.lang.String F23Value) {
		_assessmentofProduct.setF23Value(F23Value);
	}

	/**
	* Returns the f23 mark of this assessmentof product.
	*
	* @return the f23 mark of this assessmentof product
	*/
	@Override
	public double getF23Mark() {
		return _assessmentofProduct.getF23Mark();
	}

	/**
	* Sets the f23 mark of this assessmentof product.
	*
	* @param F23Mark the f23 mark of this assessmentof product
	*/
	@Override
	public void setF23Mark(double F23Mark) {
		_assessmentofProduct.setF23Mark(F23Mark);
	}

	/**
	* Returns the sum mark of this assessmentof product.
	*
	* @return the sum mark of this assessmentof product
	*/
	@Override
	public double getSumMark() {
		return _assessmentofProduct.getSumMark();
	}

	/**
	* Sets the sum mark of this assessmentof product.
	*
	* @param SumMark the sum mark of this assessmentof product
	*/
	@Override
	public void setSumMark(double SumMark) {
		_assessmentofProduct.setSumMark(SumMark);
	}

	/**
	* Returns the maker of this assessmentof product.
	*
	* @return the maker of this assessmentof product
	*/
	@Override
	public java.lang.String getMaker() {
		return _assessmentofProduct.getMaker();
	}

	/**
	* Sets the maker of this assessmentof product.
	*
	* @param maker the maker of this assessmentof product
	*/
	@Override
	public void setMaker(java.lang.String maker) {
		_assessmentofProduct.setMaker(maker);
	}

	/**
	* Returns the checker of this assessmentof product.
	*
	* @return the checker of this assessmentof product
	*/
	@Override
	public java.lang.String getChecker() {
		return _assessmentofProduct.getChecker();
	}

	/**
	* Sets the checker of this assessmentof product.
	*
	* @param checker the checker of this assessmentof product
	*/
	@Override
	public void setChecker(java.lang.String checker) {
		_assessmentofProduct.setChecker(checker);
	}

	/**
	* Returns the approver of this assessmentof product.
	*
	* @return the approver of this assessmentof product
	*/
	@Override
	public java.lang.String getApprover() {
		return _assessmentofProduct.getApprover();
	}

	/**
	* Sets the approver of this assessmentof product.
	*
	* @param approver the approver of this assessmentof product
	*/
	@Override
	public void setApprover(java.lang.String approver) {
		_assessmentofProduct.setApprover(approver);
	}

	/**
	* Returns the makermodified of this assessmentof product.
	*
	* @return the makermodified of this assessmentof product
	*/
	@Override
	public java.util.Date getMakermodified() {
		return _assessmentofProduct.getMakermodified();
	}

	/**
	* Sets the makermodified of this assessmentof product.
	*
	* @param makermodified the makermodified of this assessmentof product
	*/
	@Override
	public void setMakermodified(java.util.Date makermodified) {
		_assessmentofProduct.setMakermodified(makermodified);
	}

	/**
	* Returns the checkermodified of this assessmentof product.
	*
	* @return the checkermodified of this assessmentof product
	*/
	@Override
	public java.util.Date getCheckermodified() {
		return _assessmentofProduct.getCheckermodified();
	}

	/**
	* Sets the checkermodified of this assessmentof product.
	*
	* @param checkermodified the checkermodified of this assessmentof product
	*/
	@Override
	public void setCheckermodified(java.util.Date checkermodified) {
		_assessmentofProduct.setCheckermodified(checkermodified);
	}

	/**
	* Returns the approvermodified of this assessmentof product.
	*
	* @return the approvermodified of this assessmentof product
	*/
	@Override
	public java.util.Date getApprovermodified() {
		return _assessmentofProduct.getApprovermodified();
	}

	/**
	* Sets the approvermodified of this assessmentof product.
	*
	* @param approvermodified the approvermodified of this assessmentof product
	*/
	@Override
	public void setApprovermodified(java.util.Date approvermodified) {
		_assessmentofProduct.setApprovermodified(approvermodified);
	}

	/**
	* Returns the assessmentid of this assessmentof product.
	*
	* @return the assessmentid of this assessmentof product
	*/
	@Override
	public java.lang.String getAssessmentid() {
		return _assessmentofProduct.getAssessmentid();
	}

	/**
	* Sets the assessmentid of this assessmentof product.
	*
	* @param assessmentid the assessmentid of this assessmentof product
	*/
	@Override
	public void setAssessmentid(java.lang.String assessmentid) {
		_assessmentofProduct.setAssessmentid(assessmentid);
	}

	/**
	* Returns the assessmentyear of this assessmentof product.
	*
	* @return the assessmentyear of this assessmentof product
	*/
	@Override
	public java.lang.String getAssessmentyear() {
		return _assessmentofProduct.getAssessmentyear();
	}

	/**
	* Sets the assessmentyear of this assessmentof product.
	*
	* @param assessmentyear the assessmentyear of this assessmentof product
	*/
	@Override
	public void setAssessmentyear(java.lang.String assessmentyear) {
		_assessmentofProduct.setAssessmentyear(assessmentyear);
	}

	/**
	* Returns the evaluationperiod of this assessmentof product.
	*
	* @return the evaluationperiod of this assessmentof product
	*/
	@Override
	public java.lang.String getEvaluationperiod() {
		return _assessmentofProduct.getEvaluationperiod();
	}

	/**
	* Sets the evaluationperiod of this assessmentof product.
	*
	* @param evaluationperiod the evaluationperiod of this assessmentof product
	*/
	@Override
	public void setEvaluationperiod(java.lang.String evaluationperiod) {
		_assessmentofProduct.setEvaluationperiod(evaluationperiod);
	}

	/**
	* Returns the latestassessment of this assessmentof product.
	*
	* @return the latestassessment of this assessmentof product
	*/
	@Override
	public java.util.Date getLatestassessment() {
		return _assessmentofProduct.getLatestassessment();
	}

	/**
	* Sets the latestassessment of this assessmentof product.
	*
	* @param latestassessment the latestassessment of this assessmentof product
	*/
	@Override
	public void setLatestassessment(java.util.Date latestassessment) {
		_assessmentofProduct.setLatestassessment(latestassessment);
	}

	/**
	* Returns the synchdate of this assessmentof product.
	*
	* @return the synchdate of this assessmentof product
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _assessmentofProduct.getSynchdate();
	}

	/**
	* Sets the synchdate of this assessmentof product.
	*
	* @param synchdate the synchdate of this assessmentof product
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_assessmentofProduct.setSynchdate(synchdate);
	}

	/**
	* Returns the nextassessmentid of this assessmentof product.
	*
	* @return the nextassessmentid of this assessmentof product
	*/
	@Override
	public java.lang.String getNextassessmentid() {
		return _assessmentofProduct.getNextassessmentid();
	}

	/**
	* Sets the nextassessmentid of this assessmentof product.
	*
	* @param nextassessmentid the nextassessmentid of this assessmentof product
	*/
	@Override
	public void setNextassessmentid(java.lang.String nextassessmentid) {
		_assessmentofProduct.setNextassessmentid(nextassessmentid);
	}

	/**
	* Returns the nextassessmentyear of this assessmentof product.
	*
	* @return the nextassessmentyear of this assessmentof product
	*/
	@Override
	public java.lang.String getNextassessmentyear() {
		return _assessmentofProduct.getNextassessmentyear();
	}

	/**
	* Sets the nextassessmentyear of this assessmentof product.
	*
	* @param nextassessmentyear the nextassessmentyear of this assessmentof product
	*/
	@Override
	public void setNextassessmentyear(java.lang.String nextassessmentyear) {
		_assessmentofProduct.setNextassessmentyear(nextassessmentyear);
	}

	@Override
	public boolean isNew() {
		return _assessmentofProduct.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessmentofProduct.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessmentofProduct.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessmentofProduct.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessmentofProduct.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessmentofProduct.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessmentofProduct.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessmentofProduct.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessmentofProduct.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessmentofProduct.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessmentofProduct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentofProductWrapper((AssessmentofProduct)_assessmentofProduct.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct) {
		return _assessmentofProduct.compareTo(assessmentofProduct);
	}

	@Override
	public int hashCode() {
		return _assessmentofProduct.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> toCacheModel() {
		return _assessmentofProduct.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct toEscapedModel() {
		return new AssessmentofProductWrapper(_assessmentofProduct.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct toUnescapedModel() {
		return new AssessmentofProductWrapper(_assessmentofProduct.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessmentofProduct.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessmentofProduct.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessmentofProduct.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentofProductWrapper)) {
			return false;
		}

		AssessmentofProductWrapper assessmentofProductWrapper = (AssessmentofProductWrapper)obj;

		if (Validator.equals(_assessmentofProduct,
					assessmentofProductWrapper._assessmentofProduct)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssessmentofProduct getWrappedAssessmentofProduct() {
		return _assessmentofProduct;
	}

	@Override
	public AssessmentofProduct getWrappedModel() {
		return _assessmentofProduct;
	}

	@Override
	public void resetOriginalValues() {
		_assessmentofProduct.resetOriginalValues();
	}

	private AssessmentofProduct _assessmentofProduct;
}