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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentofProduct in entity cache.
 *
 * @author win_64
 * @see AssessmentofProduct
 * @generated
 */
public class AssessmentofProductCacheModel implements CacheModel<AssessmentofProduct>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(227);

		sb.append("{id=");
		sb.append(id);
		sb.append(", productcode=");
		sb.append(productcode);
		sb.append(", productname=");
		sb.append(productname);
		sb.append(", productsequenceno=");
		sb.append(productsequenceno);
		sb.append(", productdescription=");
		sb.append(productdescription);
		sb.append(", productcodereference=");
		sb.append(productcodereference);
		sb.append(", productnamereference=");
		sb.append(productnamereference);
		sb.append(", F1Code=");
		sb.append(F1Code);
		sb.append(", F1Name=");
		sb.append(F1Name);
		sb.append(", F1Value=");
		sb.append(F1Value);
		sb.append(", F1Mark=");
		sb.append(F1Mark);
		sb.append(", F2Code=");
		sb.append(F2Code);
		sb.append(", F2Name=");
		sb.append(F2Name);
		sb.append(", F2Value=");
		sb.append(F2Value);
		sb.append(", F2Mark=");
		sb.append(F2Mark);
		sb.append(", F3Code=");
		sb.append(F3Code);
		sb.append(", F3Name=");
		sb.append(F3Name);
		sb.append(", F3Value=");
		sb.append(F3Value);
		sb.append(", F3Mark=");
		sb.append(F3Mark);
		sb.append(", F4Code=");
		sb.append(F4Code);
		sb.append(", F4Name=");
		sb.append(F4Name);
		sb.append(", F4Value=");
		sb.append(F4Value);
		sb.append(", F4Mark=");
		sb.append(F4Mark);
		sb.append(", F5Code=");
		sb.append(F5Code);
		sb.append(", F5Name=");
		sb.append(F5Name);
		sb.append(", F5Value=");
		sb.append(F5Value);
		sb.append(", F5Mark=");
		sb.append(F5Mark);
		sb.append(", F6Code=");
		sb.append(F6Code);
		sb.append(", F6Name=");
		sb.append(F6Name);
		sb.append(", F6Value=");
		sb.append(F6Value);
		sb.append(", F6Mark=");
		sb.append(F6Mark);
		sb.append(", F7Code=");
		sb.append(F7Code);
		sb.append(", F7Name=");
		sb.append(F7Name);
		sb.append(", F7Value=");
		sb.append(F7Value);
		sb.append(", F7Mark=");
		sb.append(F7Mark);
		sb.append(", F8Code=");
		sb.append(F8Code);
		sb.append(", F8Name=");
		sb.append(F8Name);
		sb.append(", F8Value=");
		sb.append(F8Value);
		sb.append(", F8Mark=");
		sb.append(F8Mark);
		sb.append(", F9Code=");
		sb.append(F9Code);
		sb.append(", F9Name=");
		sb.append(F9Name);
		sb.append(", F9Value=");
		sb.append(F9Value);
		sb.append(", F9Mark=");
		sb.append(F9Mark);
		sb.append(", F10Code=");
		sb.append(F10Code);
		sb.append(", F10Name=");
		sb.append(F10Name);
		sb.append(", F10Value=");
		sb.append(F10Value);
		sb.append(", F10Mark=");
		sb.append(F10Mark);
		sb.append(", F11Code=");
		sb.append(F11Code);
		sb.append(", F11Name=");
		sb.append(F11Name);
		sb.append(", F11Value=");
		sb.append(F11Value);
		sb.append(", F11Mark=");
		sb.append(F11Mark);
		sb.append(", F12Code=");
		sb.append(F12Code);
		sb.append(", F12Name=");
		sb.append(F12Name);
		sb.append(", F12Value=");
		sb.append(F12Value);
		sb.append(", F12Mark=");
		sb.append(F12Mark);
		sb.append(", F13Code=");
		sb.append(F13Code);
		sb.append(", F13Name=");
		sb.append(F13Name);
		sb.append(", F13Value=");
		sb.append(F13Value);
		sb.append(", F13Mark=");
		sb.append(F13Mark);
		sb.append(", F14Code=");
		sb.append(F14Code);
		sb.append(", F14Name=");
		sb.append(F14Name);
		sb.append(", F14Value=");
		sb.append(F14Value);
		sb.append(", F14Mark=");
		sb.append(F14Mark);
		sb.append(", F15Code=");
		sb.append(F15Code);
		sb.append(", F15Name=");
		sb.append(F15Name);
		sb.append(", F15Value=");
		sb.append(F15Value);
		sb.append(", F15Mark=");
		sb.append(F15Mark);
		sb.append(", F16Code=");
		sb.append(F16Code);
		sb.append(", F16Name=");
		sb.append(F16Name);
		sb.append(", F16Value=");
		sb.append(F16Value);
		sb.append(", F16Mark=");
		sb.append(F16Mark);
		sb.append(", F17Code=");
		sb.append(F17Code);
		sb.append(", F17Name=");
		sb.append(F17Name);
		sb.append(", F17Value=");
		sb.append(F17Value);
		sb.append(", F17Mark=");
		sb.append(F17Mark);
		sb.append(", F18Code=");
		sb.append(F18Code);
		sb.append(", F18Name=");
		sb.append(F18Name);
		sb.append(", F18Value=");
		sb.append(F18Value);
		sb.append(", F18Mark=");
		sb.append(F18Mark);
		sb.append(", F19Name=");
		sb.append(F19Name);
		sb.append(", F19Code=");
		sb.append(F19Code);
		sb.append(", F19Value=");
		sb.append(F19Value);
		sb.append(", F19Mark=");
		sb.append(F19Mark);
		sb.append(", F20Code=");
		sb.append(F20Code);
		sb.append(", F20Name=");
		sb.append(F20Name);
		sb.append(", F20Value=");
		sb.append(F20Value);
		sb.append(", F20Mark=");
		sb.append(F20Mark);
		sb.append(", F21Code=");
		sb.append(F21Code);
		sb.append(", F21Name=");
		sb.append(F21Name);
		sb.append(", F21Value=");
		sb.append(F21Value);
		sb.append(", F21Mark=");
		sb.append(F21Mark);
		sb.append(", F22Code=");
		sb.append(F22Code);
		sb.append(", F22Name=");
		sb.append(F22Name);
		sb.append(", F22Value=");
		sb.append(F22Value);
		sb.append(", F22Mark=");
		sb.append(F22Mark);
		sb.append(", F23Code=");
		sb.append(F23Code);
		sb.append(", F23Name=");
		sb.append(F23Name);
		sb.append(", F23Value=");
		sb.append(F23Value);
		sb.append(", F23Mark=");
		sb.append(F23Mark);
		sb.append(", SumMark=");
		sb.append(SumMark);
		sb.append(", maker=");
		sb.append(maker);
		sb.append(", checker=");
		sb.append(checker);
		sb.append(", approver=");
		sb.append(approver);
		sb.append(", makermodified=");
		sb.append(makermodified);
		sb.append(", checkermodified=");
		sb.append(checkermodified);
		sb.append(", approvermodified=");
		sb.append(approvermodified);
		sb.append(", assessmentid=");
		sb.append(assessmentid);
		sb.append(", assessmentyear=");
		sb.append(assessmentyear);
		sb.append(", evaluationperiod=");
		sb.append(evaluationperiod);
		sb.append(", latestassessment=");
		sb.append(latestassessment);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append(", nextassessmentid=");
		sb.append(nextassessmentid);
		sb.append(", nextassessmentyear=");
		sb.append(nextassessmentyear);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssessmentofProduct toEntityModel() {
		AssessmentofProductImpl assessmentofProductImpl = new AssessmentofProductImpl();

		assessmentofProductImpl.setId(id);

		if (productcode == null) {
			assessmentofProductImpl.setProductcode(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setProductcode(productcode);
		}

		if (productname == null) {
			assessmentofProductImpl.setProductname(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setProductname(productname);
		}

		assessmentofProductImpl.setProductsequenceno(productsequenceno);

		if (productdescription == null) {
			assessmentofProductImpl.setProductdescription(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setProductdescription(productdescription);
		}

		if (productcodereference == null) {
			assessmentofProductImpl.setProductcodereference(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setProductcodereference(productcodereference);
		}

		if (productnamereference == null) {
			assessmentofProductImpl.setProductnamereference(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setProductnamereference(productnamereference);
		}

		if (F1Code == null) {
			assessmentofProductImpl.setF1Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF1Code(F1Code);
		}

		if (F1Name == null) {
			assessmentofProductImpl.setF1Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF1Name(F1Name);
		}

		if (F1Value == null) {
			assessmentofProductImpl.setF1Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF1Value(F1Value);
		}

		assessmentofProductImpl.setF1Mark(F1Mark);

		if (F2Code == null) {
			assessmentofProductImpl.setF2Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF2Code(F2Code);
		}

		if (F2Name == null) {
			assessmentofProductImpl.setF2Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF2Name(F2Name);
		}

		if (F2Value == null) {
			assessmentofProductImpl.setF2Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF2Value(F2Value);
		}

		assessmentofProductImpl.setF2Mark(F2Mark);

		if (F3Code == null) {
			assessmentofProductImpl.setF3Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF3Code(F3Code);
		}

		if (F3Name == null) {
			assessmentofProductImpl.setF3Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF3Name(F3Name);
		}

		if (F3Value == null) {
			assessmentofProductImpl.setF3Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF3Value(F3Value);
		}

		assessmentofProductImpl.setF3Mark(F3Mark);

		if (F4Code == null) {
			assessmentofProductImpl.setF4Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF4Code(F4Code);
		}

		if (F4Name == null) {
			assessmentofProductImpl.setF4Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF4Name(F4Name);
		}

		if (F4Value == null) {
			assessmentofProductImpl.setF4Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF4Value(F4Value);
		}

		assessmentofProductImpl.setF4Mark(F4Mark);

		if (F5Code == null) {
			assessmentofProductImpl.setF5Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF5Code(F5Code);
		}

		if (F5Name == null) {
			assessmentofProductImpl.setF5Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF5Name(F5Name);
		}

		if (F5Value == null) {
			assessmentofProductImpl.setF5Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF5Value(F5Value);
		}

		assessmentofProductImpl.setF5Mark(F5Mark);

		if (F6Code == null) {
			assessmentofProductImpl.setF6Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF6Code(F6Code);
		}

		if (F6Name == null) {
			assessmentofProductImpl.setF6Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF6Name(F6Name);
		}

		if (F6Value == null) {
			assessmentofProductImpl.setF6Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF6Value(F6Value);
		}

		assessmentofProductImpl.setF6Mark(F6Mark);

		if (F7Code == null) {
			assessmentofProductImpl.setF7Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF7Code(F7Code);
		}

		if (F7Name == null) {
			assessmentofProductImpl.setF7Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF7Name(F7Name);
		}

		if (F7Value == null) {
			assessmentofProductImpl.setF7Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF7Value(F7Value);
		}

		assessmentofProductImpl.setF7Mark(F7Mark);

		if (F8Code == null) {
			assessmentofProductImpl.setF8Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF8Code(F8Code);
		}

		if (F8Name == null) {
			assessmentofProductImpl.setF8Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF8Name(F8Name);
		}

		if (F8Value == null) {
			assessmentofProductImpl.setF8Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF8Value(F8Value);
		}

		assessmentofProductImpl.setF8Mark(F8Mark);

		if (F9Code == null) {
			assessmentofProductImpl.setF9Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF9Code(F9Code);
		}

		if (F9Name == null) {
			assessmentofProductImpl.setF9Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF9Name(F9Name);
		}

		if (F9Value == null) {
			assessmentofProductImpl.setF9Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF9Value(F9Value);
		}

		assessmentofProductImpl.setF9Mark(F9Mark);

		if (F10Code == null) {
			assessmentofProductImpl.setF10Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF10Code(F10Code);
		}

		if (F10Name == null) {
			assessmentofProductImpl.setF10Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF10Name(F10Name);
		}

		if (F10Value == null) {
			assessmentofProductImpl.setF10Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF10Value(F10Value);
		}

		assessmentofProductImpl.setF10Mark(F10Mark);

		if (F11Code == null) {
			assessmentofProductImpl.setF11Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF11Code(F11Code);
		}

		if (F11Name == null) {
			assessmentofProductImpl.setF11Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF11Name(F11Name);
		}

		if (F11Value == null) {
			assessmentofProductImpl.setF11Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF11Value(F11Value);
		}

		assessmentofProductImpl.setF11Mark(F11Mark);

		if (F12Code == null) {
			assessmentofProductImpl.setF12Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF12Code(F12Code);
		}

		if (F12Name == null) {
			assessmentofProductImpl.setF12Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF12Name(F12Name);
		}

		if (F12Value == null) {
			assessmentofProductImpl.setF12Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF12Value(F12Value);
		}

		assessmentofProductImpl.setF12Mark(F12Mark);

		if (F13Code == null) {
			assessmentofProductImpl.setF13Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF13Code(F13Code);
		}

		if (F13Name == null) {
			assessmentofProductImpl.setF13Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF13Name(F13Name);
		}

		if (F13Value == null) {
			assessmentofProductImpl.setF13Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF13Value(F13Value);
		}

		assessmentofProductImpl.setF13Mark(F13Mark);

		if (F14Code == null) {
			assessmentofProductImpl.setF14Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF14Code(F14Code);
		}

		if (F14Name == null) {
			assessmentofProductImpl.setF14Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF14Name(F14Name);
		}

		if (F14Value == null) {
			assessmentofProductImpl.setF14Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF14Value(F14Value);
		}

		assessmentofProductImpl.setF14Mark(F14Mark);

		if (F15Code == null) {
			assessmentofProductImpl.setF15Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF15Code(F15Code);
		}

		if (F15Name == null) {
			assessmentofProductImpl.setF15Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF15Name(F15Name);
		}

		if (F15Value == null) {
			assessmentofProductImpl.setF15Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF15Value(F15Value);
		}

		assessmentofProductImpl.setF15Mark(F15Mark);

		if (F16Code == null) {
			assessmentofProductImpl.setF16Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF16Code(F16Code);
		}

		if (F16Name == null) {
			assessmentofProductImpl.setF16Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF16Name(F16Name);
		}

		if (F16Value == null) {
			assessmentofProductImpl.setF16Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF16Value(F16Value);
		}

		assessmentofProductImpl.setF16Mark(F16Mark);

		if (F17Code == null) {
			assessmentofProductImpl.setF17Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF17Code(F17Code);
		}

		if (F17Name == null) {
			assessmentofProductImpl.setF17Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF17Name(F17Name);
		}

		if (F17Value == null) {
			assessmentofProductImpl.setF17Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF17Value(F17Value);
		}

		assessmentofProductImpl.setF17Mark(F17Mark);

		if (F18Code == null) {
			assessmentofProductImpl.setF18Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF18Code(F18Code);
		}

		if (F18Name == null) {
			assessmentofProductImpl.setF18Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF18Name(F18Name);
		}

		if (F18Value == null) {
			assessmentofProductImpl.setF18Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF18Value(F18Value);
		}

		assessmentofProductImpl.setF18Mark(F18Mark);

		if (F19Name == null) {
			assessmentofProductImpl.setF19Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF19Name(F19Name);
		}

		if (F19Code == null) {
			assessmentofProductImpl.setF19Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF19Code(F19Code);
		}

		if (F19Value == null) {
			assessmentofProductImpl.setF19Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF19Value(F19Value);
		}

		assessmentofProductImpl.setF19Mark(F19Mark);

		if (F20Code == null) {
			assessmentofProductImpl.setF20Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF20Code(F20Code);
		}

		if (F20Name == null) {
			assessmentofProductImpl.setF20Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF20Name(F20Name);
		}

		if (F20Value == null) {
			assessmentofProductImpl.setF20Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF20Value(F20Value);
		}

		assessmentofProductImpl.setF20Mark(F20Mark);

		if (F21Code == null) {
			assessmentofProductImpl.setF21Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF21Code(F21Code);
		}

		if (F21Name == null) {
			assessmentofProductImpl.setF21Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF21Name(F21Name);
		}

		if (F21Value == null) {
			assessmentofProductImpl.setF21Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF21Value(F21Value);
		}

		assessmentofProductImpl.setF21Mark(F21Mark);

		if (F22Code == null) {
			assessmentofProductImpl.setF22Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF22Code(F22Code);
		}

		if (F22Name == null) {
			assessmentofProductImpl.setF22Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF22Name(F22Name);
		}

		if (F22Value == null) {
			assessmentofProductImpl.setF22Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF22Value(F22Value);
		}

		assessmentofProductImpl.setF22Mark(F22Mark);

		if (F23Code == null) {
			assessmentofProductImpl.setF23Code(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF23Code(F23Code);
		}

		if (F23Name == null) {
			assessmentofProductImpl.setF23Name(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF23Name(F23Name);
		}

		if (F23Value == null) {
			assessmentofProductImpl.setF23Value(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setF23Value(F23Value);
		}

		assessmentofProductImpl.setF23Mark(F23Mark);
		assessmentofProductImpl.setSumMark(SumMark);

		if (maker == null) {
			assessmentofProductImpl.setMaker(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setMaker(maker);
		}

		if (checker == null) {
			assessmentofProductImpl.setChecker(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setChecker(checker);
		}

		if (approver == null) {
			assessmentofProductImpl.setApprover(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setApprover(approver);
		}

		if (makermodified == Long.MIN_VALUE) {
			assessmentofProductImpl.setMakermodified(null);
		}
		else {
			assessmentofProductImpl.setMakermodified(new Date(makermodified));
		}

		if (checkermodified == Long.MIN_VALUE) {
			assessmentofProductImpl.setCheckermodified(null);
		}
		else {
			assessmentofProductImpl.setCheckermodified(new Date(checkermodified));
		}

		if (approvermodified == Long.MIN_VALUE) {
			assessmentofProductImpl.setApprovermodified(null);
		}
		else {
			assessmentofProductImpl.setApprovermodified(new Date(
					approvermodified));
		}

		if (assessmentid == null) {
			assessmentofProductImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentofProductImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentofProductImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setEvaluationperiod(evaluationperiod);
		}

		if (latestassessment == Long.MIN_VALUE) {
			assessmentofProductImpl.setLatestassessment(null);
		}
		else {
			assessmentofProductImpl.setLatestassessment(new Date(
					latestassessment));
		}

		if (synchdate == Long.MIN_VALUE) {
			assessmentofProductImpl.setSynchdate(null);
		}
		else {
			assessmentofProductImpl.setSynchdate(new Date(synchdate));
		}

		if (nextassessmentid == null) {
			assessmentofProductImpl.setNextassessmentid(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setNextassessmentid(nextassessmentid);
		}

		if (nextassessmentyear == null) {
			assessmentofProductImpl.setNextassessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofProductImpl.setNextassessmentyear(nextassessmentyear);
		}

		assessmentofProductImpl.resetOriginalValues();

		return assessmentofProductImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		productcode = objectInput.readUTF();
		productname = objectInput.readUTF();
		productsequenceno = objectInput.readInt();
		productdescription = objectInput.readUTF();
		productcodereference = objectInput.readUTF();
		productnamereference = objectInput.readUTF();
		F1Code = objectInput.readUTF();
		F1Name = objectInput.readUTF();
		F1Value = objectInput.readUTF();
		F1Mark = objectInput.readDouble();
		F2Code = objectInput.readUTF();
		F2Name = objectInput.readUTF();
		F2Value = objectInput.readUTF();
		F2Mark = objectInput.readDouble();
		F3Code = objectInput.readUTF();
		F3Name = objectInput.readUTF();
		F3Value = objectInput.readUTF();
		F3Mark = objectInput.readDouble();
		F4Code = objectInput.readUTF();
		F4Name = objectInput.readUTF();
		F4Value = objectInput.readUTF();
		F4Mark = objectInput.readDouble();
		F5Code = objectInput.readUTF();
		F5Name = objectInput.readUTF();
		F5Value = objectInput.readUTF();
		F5Mark = objectInput.readDouble();
		F6Code = objectInput.readUTF();
		F6Name = objectInput.readUTF();
		F6Value = objectInput.readUTF();
		F6Mark = objectInput.readDouble();
		F7Code = objectInput.readUTF();
		F7Name = objectInput.readUTF();
		F7Value = objectInput.readUTF();
		F7Mark = objectInput.readDouble();
		F8Code = objectInput.readUTF();
		F8Name = objectInput.readUTF();
		F8Value = objectInput.readUTF();
		F8Mark = objectInput.readDouble();
		F9Code = objectInput.readUTF();
		F9Name = objectInput.readUTF();
		F9Value = objectInput.readUTF();
		F9Mark = objectInput.readDouble();
		F10Code = objectInput.readUTF();
		F10Name = objectInput.readUTF();
		F10Value = objectInput.readUTF();
		F10Mark = objectInput.readDouble();
		F11Code = objectInput.readUTF();
		F11Name = objectInput.readUTF();
		F11Value = objectInput.readUTF();
		F11Mark = objectInput.readDouble();
		F12Code = objectInput.readUTF();
		F12Name = objectInput.readUTF();
		F12Value = objectInput.readUTF();
		F12Mark = objectInput.readDouble();
		F13Code = objectInput.readUTF();
		F13Name = objectInput.readUTF();
		F13Value = objectInput.readUTF();
		F13Mark = objectInput.readDouble();
		F14Code = objectInput.readUTF();
		F14Name = objectInput.readUTF();
		F14Value = objectInput.readUTF();
		F14Mark = objectInput.readDouble();
		F15Code = objectInput.readUTF();
		F15Name = objectInput.readUTF();
		F15Value = objectInput.readUTF();
		F15Mark = objectInput.readDouble();
		F16Code = objectInput.readUTF();
		F16Name = objectInput.readUTF();
		F16Value = objectInput.readUTF();
		F16Mark = objectInput.readDouble();
		F17Code = objectInput.readUTF();
		F17Name = objectInput.readUTF();
		F17Value = objectInput.readUTF();
		F17Mark = objectInput.readDouble();
		F18Code = objectInput.readUTF();
		F18Name = objectInput.readUTF();
		F18Value = objectInput.readUTF();
		F18Mark = objectInput.readDouble();
		F19Name = objectInput.readUTF();
		F19Code = objectInput.readUTF();
		F19Value = objectInput.readUTF();
		F19Mark = objectInput.readDouble();
		F20Code = objectInput.readUTF();
		F20Name = objectInput.readUTF();
		F20Value = objectInput.readUTF();
		F20Mark = objectInput.readDouble();
		F21Code = objectInput.readUTF();
		F21Name = objectInput.readUTF();
		F21Value = objectInput.readUTF();
		F21Mark = objectInput.readDouble();
		F22Code = objectInput.readUTF();
		F22Name = objectInput.readUTF();
		F22Value = objectInput.readUTF();
		F22Mark = objectInput.readDouble();
		F23Code = objectInput.readUTF();
		F23Name = objectInput.readUTF();
		F23Value = objectInput.readUTF();
		F23Mark = objectInput.readDouble();
		SumMark = objectInput.readDouble();
		maker = objectInput.readUTF();
		checker = objectInput.readUTF();
		approver = objectInput.readUTF();
		makermodified = objectInput.readLong();
		checkermodified = objectInput.readLong();
		approvermodified = objectInput.readLong();
		assessmentid = objectInput.readUTF();
		assessmentyear = objectInput.readUTF();
		evaluationperiod = objectInput.readUTF();
		latestassessment = objectInput.readLong();
		synchdate = objectInput.readLong();
		nextassessmentid = objectInput.readUTF();
		nextassessmentyear = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (productcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productcode);
		}

		if (productname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productname);
		}

		objectOutput.writeInt(productsequenceno);

		if (productdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productdescription);
		}

		if (productcodereference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productcodereference);
		}

		if (productnamereference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productnamereference);
		}

		if (F1Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F1Code);
		}

		if (F1Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F1Name);
		}

		if (F1Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F1Value);
		}

		objectOutput.writeDouble(F1Mark);

		if (F2Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F2Code);
		}

		if (F2Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F2Name);
		}

		if (F2Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F2Value);
		}

		objectOutput.writeDouble(F2Mark);

		if (F3Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F3Code);
		}

		if (F3Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F3Name);
		}

		if (F3Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F3Value);
		}

		objectOutput.writeDouble(F3Mark);

		if (F4Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F4Code);
		}

		if (F4Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F4Name);
		}

		if (F4Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F4Value);
		}

		objectOutput.writeDouble(F4Mark);

		if (F5Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F5Code);
		}

		if (F5Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F5Name);
		}

		if (F5Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F5Value);
		}

		objectOutput.writeDouble(F5Mark);

		if (F6Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F6Code);
		}

		if (F6Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F6Name);
		}

		if (F6Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F6Value);
		}

		objectOutput.writeDouble(F6Mark);

		if (F7Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F7Code);
		}

		if (F7Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F7Name);
		}

		if (F7Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F7Value);
		}

		objectOutput.writeDouble(F7Mark);

		if (F8Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F8Code);
		}

		if (F8Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F8Name);
		}

		if (F8Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F8Value);
		}

		objectOutput.writeDouble(F8Mark);

		if (F9Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F9Code);
		}

		if (F9Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F9Name);
		}

		if (F9Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F9Value);
		}

		objectOutput.writeDouble(F9Mark);

		if (F10Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F10Code);
		}

		if (F10Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F10Name);
		}

		if (F10Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F10Value);
		}

		objectOutput.writeDouble(F10Mark);

		if (F11Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F11Code);
		}

		if (F11Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F11Name);
		}

		if (F11Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F11Value);
		}

		objectOutput.writeDouble(F11Mark);

		if (F12Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F12Code);
		}

		if (F12Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F12Name);
		}

		if (F12Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F12Value);
		}

		objectOutput.writeDouble(F12Mark);

		if (F13Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F13Code);
		}

		if (F13Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F13Name);
		}

		if (F13Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F13Value);
		}

		objectOutput.writeDouble(F13Mark);

		if (F14Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F14Code);
		}

		if (F14Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F14Name);
		}

		if (F14Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F14Value);
		}

		objectOutput.writeDouble(F14Mark);

		if (F15Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F15Code);
		}

		if (F15Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F15Name);
		}

		if (F15Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F15Value);
		}

		objectOutput.writeDouble(F15Mark);

		if (F16Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F16Code);
		}

		if (F16Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F16Name);
		}

		if (F16Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F16Value);
		}

		objectOutput.writeDouble(F16Mark);

		if (F17Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F17Code);
		}

		if (F17Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F17Name);
		}

		if (F17Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F17Value);
		}

		objectOutput.writeDouble(F17Mark);

		if (F18Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F18Code);
		}

		if (F18Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F18Name);
		}

		if (F18Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F18Value);
		}

		objectOutput.writeDouble(F18Mark);

		if (F19Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F19Name);
		}

		if (F19Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F19Code);
		}

		if (F19Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F19Value);
		}

		objectOutput.writeDouble(F19Mark);

		if (F20Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F20Code);
		}

		if (F20Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F20Name);
		}

		if (F20Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F20Value);
		}

		objectOutput.writeDouble(F20Mark);

		if (F21Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F21Code);
		}

		if (F21Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F21Name);
		}

		if (F21Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F21Value);
		}

		objectOutput.writeDouble(F21Mark);

		if (F22Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F22Code);
		}

		if (F22Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F22Name);
		}

		if (F22Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F22Value);
		}

		objectOutput.writeDouble(F22Mark);

		if (F23Code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F23Code);
		}

		if (F23Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F23Name);
		}

		if (F23Value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(F23Value);
		}

		objectOutput.writeDouble(F23Mark);
		objectOutput.writeDouble(SumMark);

		if (maker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maker);
		}

		if (checker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checker);
		}

		if (approver == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approver);
		}

		objectOutput.writeLong(makermodified);
		objectOutput.writeLong(checkermodified);
		objectOutput.writeLong(approvermodified);

		if (assessmentid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assessmentid);
		}

		if (assessmentyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assessmentyear);
		}

		if (evaluationperiod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(evaluationperiod);
		}

		objectOutput.writeLong(latestassessment);
		objectOutput.writeLong(synchdate);

		if (nextassessmentid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextassessmentid);
		}

		if (nextassessmentyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextassessmentyear);
		}
	}

	public long id;
	public String productcode;
	public String productname;
	public int productsequenceno;
	public String productdescription;
	public String productcodereference;
	public String productnamereference;
	public String F1Code;
	public String F1Name;
	public String F1Value;
	public double F1Mark;
	public String F2Code;
	public String F2Name;
	public String F2Value;
	public double F2Mark;
	public String F3Code;
	public String F3Name;
	public String F3Value;
	public double F3Mark;
	public String F4Code;
	public String F4Name;
	public String F4Value;
	public double F4Mark;
	public String F5Code;
	public String F5Name;
	public String F5Value;
	public double F5Mark;
	public String F6Code;
	public String F6Name;
	public String F6Value;
	public double F6Mark;
	public String F7Code;
	public String F7Name;
	public String F7Value;
	public double F7Mark;
	public String F8Code;
	public String F8Name;
	public String F8Value;
	public double F8Mark;
	public String F9Code;
	public String F9Name;
	public String F9Value;
	public double F9Mark;
	public String F10Code;
	public String F10Name;
	public String F10Value;
	public double F10Mark;
	public String F11Code;
	public String F11Name;
	public String F11Value;
	public double F11Mark;
	public String F12Code;
	public String F12Name;
	public String F12Value;
	public double F12Mark;
	public String F13Code;
	public String F13Name;
	public String F13Value;
	public double F13Mark;
	public String F14Code;
	public String F14Name;
	public String F14Value;
	public double F14Mark;
	public String F15Code;
	public String F15Name;
	public String F15Value;
	public double F15Mark;
	public String F16Code;
	public String F16Name;
	public String F16Value;
	public double F16Mark;
	public String F17Code;
	public String F17Name;
	public String F17Value;
	public double F17Mark;
	public String F18Code;
	public String F18Name;
	public String F18Value;
	public double F18Mark;
	public String F19Name;
	public String F19Code;
	public String F19Value;
	public double F19Mark;
	public String F20Code;
	public String F20Name;
	public String F20Value;
	public double F20Mark;
	public String F21Code;
	public String F21Name;
	public String F21Value;
	public double F21Mark;
	public String F22Code;
	public String F22Name;
	public String F22Value;
	public double F22Mark;
	public String F23Code;
	public String F23Name;
	public String F23Value;
	public double F23Mark;
	public double SumMark;
	public String maker;
	public String checker;
	public String approver;
	public long makermodified;
	public long checkermodified;
	public long approvermodified;
	public String assessmentid;
	public String assessmentyear;
	public String evaluationperiod;
	public long latestassessment;
	public long synchdate;
	public String nextassessmentid;
	public String nextassessmentyear;
}