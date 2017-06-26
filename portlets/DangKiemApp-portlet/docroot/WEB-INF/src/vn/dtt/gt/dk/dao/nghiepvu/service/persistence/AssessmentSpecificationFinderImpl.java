
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AssessmentSpecificationFinderImpl extends BasePersistenceImpl<AssessmentSpecification> implements AssessmentSpecificationFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentSpecificationFinderImpl.class);
	
	
}
