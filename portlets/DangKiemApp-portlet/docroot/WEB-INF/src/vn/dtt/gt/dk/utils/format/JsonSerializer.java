package vn.dtt.gt.dk.utils.format;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

public class JsonSerializer {
	
	final static public DateFormat COMPACT_DATE_TIME = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss 'GMT'Z");
	private ObjectMapper mapper;
	
	public JsonSerializer() {
		mapper = new ObjectMapper(); // can reuse, share globally
		configure(mapper);
	}
	
	static public void configure(ObjectMapper mapper) {
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
		//mapper.getSerializationConfig().withSerializationInclusion(JsonSerialize.Inclusion.NON_NULL) ;
		DefaultPrettyPrinter prettyPrinter = new DefaultPrettyPrinter();
		prettyPrinter.indentArraysWith(new DefaultPrettyPrinter.Lf2SpacesIndenter());
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
		mapper.setDateFormat(COMPACT_DATE_TIME);
	}
	
	public <T> String toString(T idoc) {
		try {
			Writer writer = new StringWriter();
			ObjectWriter owriter = mapper.writerWithDefaultPrettyPrinter();
			owriter.writeValue(writer, idoc);
			return writer.toString();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public <T> String toString(List<T> lstT) {
		try {
			Writer writer = new StringWriter();
			ObjectWriter owriter = mapper.writerWithDefaultPrettyPrinter();
			owriter.writeValue(writer, lstT);
			return writer.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public <T> T fromString(String data, Class<T> type)
		throws IOException {
		StringReader reader = new StringReader(data);
		return mapper.readValue(reader, type);
	}
}
