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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentofInspector in entity cache.
 *
 * @author win_64
 * @see AssessmentofInspector
 * @generated
 */
public class AssessmentofInspectorCacheModel implements CacheModel<AssessmentofInspector>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(221);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inspectorcontactcode=");
		sb.append(inspectorcontactcode);
		sb.append(", inspectorname=");
		sb.append(inspectorname);
		sb.append(", inspectorposition=");
		sb.append(inspectorposition);
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
	public AssessmentofInspector toEntityModel() {
		AssessmentofInspectorImpl assessmentofInspectorImpl = new AssessmentofInspectorImpl();

		assessmentofInspectorImpl.setId(id);

		if (inspectorcontactcode == null) {
			assessmentofInspectorImpl.setInspectorcontactcode(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setInspectorcontactcode(inspectorcontactcode);
		}

		if (inspectorname == null) {
			assessmentofInspectorImpl.setInspectorname(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setInspectorname(inspectorname);
		}

		if (inspectorposition == null) {
			assessmentofInspectorImpl.setInspectorposition(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setInspectorposition(inspectorposition);
		}

		if (F1Code == null) {
			assessmentofInspectorImpl.setF1Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF1Code(F1Code);
		}

		if (F1Name == null) {
			assessmentofInspectorImpl.setF1Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF1Name(F1Name);
		}

		if (F1Value == null) {
			assessmentofInspectorImpl.setF1Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF1Value(F1Value);
		}

		assessmentofInspectorImpl.setF1Mark(F1Mark);

		if (F2Code == null) {
			assessmentofInspectorImpl.setF2Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF2Code(F2Code);
		}

		if (F2Name == null) {
			assessmentofInspectorImpl.setF2Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF2Name(F2Name);
		}

		if (F2Value == null) {
			assessmentofInspectorImpl.setF2Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF2Value(F2Value);
		}

		assessmentofInspectorImpl.setF2Mark(F2Mark);

		if (F3Code == null) {
			assessmentofInspectorImpl.setF3Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF3Code(F3Code);
		}

		if (F3Name == null) {
			assessmentofInspectorImpl.setF3Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF3Name(F3Name);
		}

		if (F3Value == null) {
			assessmentofInspectorImpl.setF3Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF3Value(F3Value);
		}

		assessmentofInspectorImpl.setF3Mark(F3Mark);

		if (F4Code == null) {
			assessmentofInspectorImpl.setF4Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF4Code(F4Code);
		}

		if (F4Name == null) {
			assessmentofInspectorImpl.setF4Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF4Name(F4Name);
		}

		if (F4Value == null) {
			assessmentofInspectorImpl.setF4Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF4Value(F4Value);
		}

		assessmentofInspectorImpl.setF4Mark(F4Mark);

		if (F5Code == null) {
			assessmentofInspectorImpl.setF5Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF5Code(F5Code);
		}

		if (F5Name == null) {
			assessmentofInspectorImpl.setF5Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF5Name(F5Name);
		}

		if (F5Value == null) {
			assessmentofInspectorImpl.setF5Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF5Value(F5Value);
		}

		assessmentofInspectorImpl.setF5Mark(F5Mark);

		if (F6Code == null) {
			assessmentofInspectorImpl.setF6Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF6Code(F6Code);
		}

		if (F6Name == null) {
			assessmentofInspectorImpl.setF6Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF6Name(F6Name);
		}

		if (F6Value == null) {
			assessmentofInspectorImpl.setF6Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF6Value(F6Value);
		}

		assessmentofInspectorImpl.setF6Mark(F6Mark);

		if (F7Code == null) {
			assessmentofInspectorImpl.setF7Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF7Code(F7Code);
		}

		if (F7Name == null) {
			assessmentofInspectorImpl.setF7Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF7Name(F7Name);
		}

		if (F7Value == null) {
			assessmentofInspectorImpl.setF7Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF7Value(F7Value);
		}

		assessmentofInspectorImpl.setF7Mark(F7Mark);

		if (F8Code == null) {
			assessmentofInspectorImpl.setF8Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF8Code(F8Code);
		}

		if (F8Name == null) {
			assessmentofInspectorImpl.setF8Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF8Name(F8Name);
		}

		if (F8Value == null) {
			assessmentofInspectorImpl.setF8Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF8Value(F8Value);
		}

		assessmentofInspectorImpl.setF8Mark(F8Mark);

		if (F9Code == null) {
			assessmentofInspectorImpl.setF9Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF9Code(F9Code);
		}

		if (F9Name == null) {
			assessmentofInspectorImpl.setF9Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF9Name(F9Name);
		}

		if (F9Value == null) {
			assessmentofInspectorImpl.setF9Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF9Value(F9Value);
		}

		assessmentofInspectorImpl.setF9Mark(F9Mark);

		if (F10Code == null) {
			assessmentofInspectorImpl.setF10Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF10Code(F10Code);
		}

		if (F10Name == null) {
			assessmentofInspectorImpl.setF10Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF10Name(F10Name);
		}

		if (F10Value == null) {
			assessmentofInspectorImpl.setF10Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF10Value(F10Value);
		}

		assessmentofInspectorImpl.setF10Mark(F10Mark);

		if (F11Code == null) {
			assessmentofInspectorImpl.setF11Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF11Code(F11Code);
		}

		if (F11Name == null) {
			assessmentofInspectorImpl.setF11Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF11Name(F11Name);
		}

		if (F11Value == null) {
			assessmentofInspectorImpl.setF11Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF11Value(F11Value);
		}

		assessmentofInspectorImpl.setF11Mark(F11Mark);

		if (F12Code == null) {
			assessmentofInspectorImpl.setF12Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF12Code(F12Code);
		}

		if (F12Name == null) {
			assessmentofInspectorImpl.setF12Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF12Name(F12Name);
		}

		if (F12Value == null) {
			assessmentofInspectorImpl.setF12Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF12Value(F12Value);
		}

		assessmentofInspectorImpl.setF12Mark(F12Mark);

		if (F13Code == null) {
			assessmentofInspectorImpl.setF13Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF13Code(F13Code);
		}

		if (F13Name == null) {
			assessmentofInspectorImpl.setF13Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF13Name(F13Name);
		}

		if (F13Value == null) {
			assessmentofInspectorImpl.setF13Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF13Value(F13Value);
		}

		assessmentofInspectorImpl.setF13Mark(F13Mark);

		if (F14Code == null) {
			assessmentofInspectorImpl.setF14Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF14Code(F14Code);
		}

		if (F14Name == null) {
			assessmentofInspectorImpl.setF14Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF14Name(F14Name);
		}

		if (F14Value == null) {
			assessmentofInspectorImpl.setF14Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF14Value(F14Value);
		}

		assessmentofInspectorImpl.setF14Mark(F14Mark);

		if (F15Code == null) {
			assessmentofInspectorImpl.setF15Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF15Code(F15Code);
		}

		if (F15Name == null) {
			assessmentofInspectorImpl.setF15Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF15Name(F15Name);
		}

		if (F15Value == null) {
			assessmentofInspectorImpl.setF15Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF15Value(F15Value);
		}

		assessmentofInspectorImpl.setF15Mark(F15Mark);

		if (F16Code == null) {
			assessmentofInspectorImpl.setF16Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF16Code(F16Code);
		}

		if (F16Name == null) {
			assessmentofInspectorImpl.setF16Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF16Name(F16Name);
		}

		if (F16Value == null) {
			assessmentofInspectorImpl.setF16Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF16Value(F16Value);
		}

		assessmentofInspectorImpl.setF16Mark(F16Mark);

		if (F17Code == null) {
			assessmentofInspectorImpl.setF17Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF17Code(F17Code);
		}

		if (F17Name == null) {
			assessmentofInspectorImpl.setF17Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF17Name(F17Name);
		}

		if (F17Value == null) {
			assessmentofInspectorImpl.setF17Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF17Value(F17Value);
		}

		assessmentofInspectorImpl.setF17Mark(F17Mark);

		if (F18Code == null) {
			assessmentofInspectorImpl.setF18Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF18Code(F18Code);
		}

		if (F18Name == null) {
			assessmentofInspectorImpl.setF18Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF18Name(F18Name);
		}

		if (F18Value == null) {
			assessmentofInspectorImpl.setF18Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF18Value(F18Value);
		}

		assessmentofInspectorImpl.setF18Mark(F18Mark);

		if (F19Name == null) {
			assessmentofInspectorImpl.setF19Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF19Name(F19Name);
		}

		if (F19Code == null) {
			assessmentofInspectorImpl.setF19Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF19Code(F19Code);
		}

		if (F19Value == null) {
			assessmentofInspectorImpl.setF19Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF19Value(F19Value);
		}

		assessmentofInspectorImpl.setF19Mark(F19Mark);

		if (F20Code == null) {
			assessmentofInspectorImpl.setF20Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF20Code(F20Code);
		}

		if (F20Name == null) {
			assessmentofInspectorImpl.setF20Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF20Name(F20Name);
		}

		if (F20Value == null) {
			assessmentofInspectorImpl.setF20Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF20Value(F20Value);
		}

		assessmentofInspectorImpl.setF20Mark(F20Mark);

		if (F21Code == null) {
			assessmentofInspectorImpl.setF21Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF21Code(F21Code);
		}

		if (F21Name == null) {
			assessmentofInspectorImpl.setF21Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF21Name(F21Name);
		}

		if (F21Value == null) {
			assessmentofInspectorImpl.setF21Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF21Value(F21Value);
		}

		assessmentofInspectorImpl.setF21Mark(F21Mark);

		if (F22Code == null) {
			assessmentofInspectorImpl.setF22Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF22Code(F22Code);
		}

		if (F22Name == null) {
			assessmentofInspectorImpl.setF22Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF22Name(F22Name);
		}

		if (F22Value == null) {
			assessmentofInspectorImpl.setF22Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF22Value(F22Value);
		}

		assessmentofInspectorImpl.setF22Mark(F22Mark);

		if (F23Code == null) {
			assessmentofInspectorImpl.setF23Code(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF23Code(F23Code);
		}

		if (F23Name == null) {
			assessmentofInspectorImpl.setF23Name(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF23Name(F23Name);
		}

		if (F23Value == null) {
			assessmentofInspectorImpl.setF23Value(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setF23Value(F23Value);
		}

		assessmentofInspectorImpl.setF23Mark(F23Mark);
		assessmentofInspectorImpl.setSumMark(SumMark);

		if (maker == null) {
			assessmentofInspectorImpl.setMaker(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setMaker(maker);
		}

		if (checker == null) {
			assessmentofInspectorImpl.setChecker(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setChecker(checker);
		}

		if (approver == null) {
			assessmentofInspectorImpl.setApprover(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setApprover(approver);
		}

		if (makermodified == Long.MIN_VALUE) {
			assessmentofInspectorImpl.setMakermodified(null);
		}
		else {
			assessmentofInspectorImpl.setMakermodified(new Date(makermodified));
		}

		if (checkermodified == Long.MIN_VALUE) {
			assessmentofInspectorImpl.setCheckermodified(null);
		}
		else {
			assessmentofInspectorImpl.setCheckermodified(new Date(
					checkermodified));
		}

		if (approvermodified == Long.MIN_VALUE) {
			assessmentofInspectorImpl.setApprovermodified(null);
		}
		else {
			assessmentofInspectorImpl.setApprovermodified(new Date(
					approvermodified));
		}

		if (assessmentid == null) {
			assessmentofInspectorImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentofInspectorImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentofInspectorImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setEvaluationperiod(evaluationperiod);
		}

		if (latestassessment == Long.MIN_VALUE) {
			assessmentofInspectorImpl.setLatestassessment(null);
		}
		else {
			assessmentofInspectorImpl.setLatestassessment(new Date(
					latestassessment));
		}

		if (synchdate == Long.MIN_VALUE) {
			assessmentofInspectorImpl.setSynchdate(null);
		}
		else {
			assessmentofInspectorImpl.setSynchdate(new Date(synchdate));
		}

		if (nextassessmentid == null) {
			assessmentofInspectorImpl.setNextassessmentid(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setNextassessmentid(nextassessmentid);
		}

		if (nextassessmentyear == null) {
			assessmentofInspectorImpl.setNextassessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofInspectorImpl.setNextassessmentyear(nextassessmentyear);
		}

		assessmentofInspectorImpl.resetOriginalValues();

		return assessmentofInspectorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inspectorcontactcode = objectInput.readUTF();
		inspectorname = objectInput.readUTF();
		inspectorposition = objectInput.readUTF();
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

		if (inspectorcontactcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorcontactcode);
		}

		if (inspectorname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorname);
		}

		if (inspectorposition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorposition);
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
	public String inspectorcontactcode;
	public String inspectorname;
	public String inspectorposition;
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