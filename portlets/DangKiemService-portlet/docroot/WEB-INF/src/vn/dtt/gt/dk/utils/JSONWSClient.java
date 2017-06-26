package vn.dtt.gt.dk.utils;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

import com.liferay.portal.kernel.util.StringPool;

public class JSONWSClient {
	private static String SCHEMA = null;
	private static String DOMAIN = null;
	private static int PORT = 0;
	private static String USERNAME = null;
	private static String PASSWORD = null;
	private static HttpHost TARGET_HOST = null;
	private static HttpClient httpclient = null;
	
	public JSONWSClient() {
		SCHEMA = PortletPropsUtil.getString("api.dvc.schema");
		DOMAIN = PortletPropsUtil.getString("api.dvc.domain");
		PORT = PortletPropsUtil.getInteger("api.dvc.port");
		USERNAME = PortletPropsUtil.getString("api.dvc.username");
		PASSWORD = PortletPropsUtil.getString("api.dvc.password");
		TARGET_HOST = new HttpHost(DOMAIN, PORT, SCHEMA);
		
		httpclient = new DefaultHttpClient();
	}
	
	public String pushAPIByPost(String apiURL, List<NameValuePair> params) 
			throws Exception {
		
		HttpPost post = new HttpPost(apiURL);
		
		Base64 b = new Base64();
		String encoding = b.encodeAsString(new String(USERNAME + ":" + PASSWORD).getBytes());
		post.setHeader("Authorization", "Basic " + encoding);
		
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
		post.setEntity(entity);
		
		HttpResponse resp = httpclient.execute(TARGET_HOST, post, new BasicHttpContext());
		
		HttpEntity ent = resp.getEntity();
		
		String retSrc = StringPool.BLANK;
		
		if (ent != null) {
			retSrc = EntityUtils.toString(ent);
		}
		
		return retSrc;
	}
}
