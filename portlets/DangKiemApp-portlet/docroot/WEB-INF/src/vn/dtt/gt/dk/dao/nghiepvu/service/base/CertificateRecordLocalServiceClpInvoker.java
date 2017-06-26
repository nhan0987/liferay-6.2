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

package vn.dtt.gt.dk.dao.nghiepvu.service.base;

import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class CertificateRecordLocalServiceClpInvoker {
	public CertificateRecordLocalServiceClpInvoker() {
		_methodName0 = "addCertificateRecord";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"
			};

		_methodName1 = "createCertificateRecord";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCertificateRecord";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCertificateRecord";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchCertificateRecord";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getCertificateRecord";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getCertificateRecords";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCertificateRecordsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCertificateRecord";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"
			};

		_methodName486 = "getBeanIdentifier";

		_methodParameterTypes486 = new String[] {  };

		_methodName487 = "setBeanIdentifier";

		_methodParameterTypes487 = new String[] { "java.lang.String" };

		_methodName492 = "findBySafetyTestReportId";

		_methodParameterTypes492 = new String[] { "long" };

		_methodName493 = "findByEmissionTestReportId";

		_methodParameterTypes493 = new String[] { "long" };

		_methodName494 = "findByCopReportId";

		_methodParameterTypes494 = new String[] { "long" };

		_methodName495 = "findByCertificateNumber";

		_methodParameterTypes495 = new String[] { "java.lang.String" };

		_methodName496 = "findCertificateRecord";

		_methodParameterTypes496 = new String[] {
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int", "int"
			};

		_methodName497 = "countCertificateRecord";

		_methodParameterTypes497 = new String[] {
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int"
			};

		_methodName498 = "findByDossierIdAndInspectionReportId";

		_methodParameterTypes498 = new String[] { "long", "long" };

		_methodName499 = "findByDossierIdAndInspectionReportIdAndStampStatus";

		_methodParameterTypes499 = new String[] { "long", "long" };

		_methodName500 = "countSoLuongChoDongDau";

		_methodParameterTypes500 = new String[] { "long" };

		_methodName501 = "deleteCertificateSpecWithCertificateId";

		_methodParameterTypes501 = new String[] { "long" };

		_methodName502 = "deleteCertificateCircularWithCertificateId";

		_methodParameterTypes502 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.addCertificateRecord((vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.createCertificateRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.deleteCertificateRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.deleteCertificateRecord((vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.fetchCertificateRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.getCertificateRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.getCertificateRecords(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.getCertificateRecordsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.updateCertificateRecord((vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord)arguments[0]);
		}

		if (_methodName486.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes486, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName487.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes487, parameterTypes)) {
			CertificateRecordLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName492.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findBySafetyTestReportId(((Long)arguments[0]).longValue());
		}

		if (_methodName493.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findByEmissionTestReportId(((Long)arguments[0]).longValue());
		}

		if (_methodName494.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes494, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findByCopReportId(((Long)arguments[0]).longValue());
		}

		if (_methodName495.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes495, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findByCertificateNumber((java.lang.String)arguments[0]);
		}

		if (_methodName496.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes496, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findCertificateRecord((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue());
		}

		if (_methodName497.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes497, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.countCertificateRecord((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue());
		}

		if (_methodName498.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes498, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findByDossierIdAndInspectionReportId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName499.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes499, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.findByDossierIdAndInspectionReportIdAndStampStatus(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName500.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes500, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.countSoLuongChoDongDau(((Long)arguments[0]).longValue());
		}

		if (_methodName501.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes501, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.deleteCertificateSpecWithCertificateId(((Long)arguments[0]).longValue());
		}

		if (_methodName502.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes502, parameterTypes)) {
			return CertificateRecordLocalServiceUtil.deleteCertificateCircularWithCertificateId(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName486;
	private String[] _methodParameterTypes486;
	private String _methodName487;
	private String[] _methodParameterTypes487;
	private String _methodName492;
	private String[] _methodParameterTypes492;
	private String _methodName493;
	private String[] _methodParameterTypes493;
	private String _methodName494;
	private String[] _methodParameterTypes494;
	private String _methodName495;
	private String[] _methodParameterTypes495;
	private String _methodName496;
	private String[] _methodParameterTypes496;
	private String _methodName497;
	private String[] _methodParameterTypes497;
	private String _methodName498;
	private String[] _methodParameterTypes498;
	private String _methodName499;
	private String[] _methodParameterTypes499;
	private String _methodName500;
	private String[] _methodParameterTypes500;
	private String _methodName501;
	private String[] _methodParameterTypes501;
	private String _methodName502;
	private String[] _methodParameterTypes502;
}