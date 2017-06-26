package vn.dtt.gt.dk.api.bean.bbkt;

public class AttachedFile {
	private String AttachedTypeCode;
	
	private String AttachedTypeName;
	
	private String AttachedDocName;
	
	private String AttachedNote;
	
	private String AttachedSequenceNo;
	
	private String FullFileName;
	
	private String SHA1FileContent;
	
	private String Base64FileContent;

	public String getAttachedTypeCode() {
		return AttachedTypeCode;
	}

	public void setAttachedTypeCode(String attachedTypeCode) {
		AttachedTypeCode = attachedTypeCode;
	}

	public String getAttachedTypeName() {
		return AttachedTypeName;
	}

	public void setAttachedTypeName(String attachedTypeName) {
		AttachedTypeName = attachedTypeName;
	}

	public String getAttachedDocName() {
		return AttachedDocName;
	}

	public void setAttachedDocName(String attachedDocName) {
		AttachedDocName = attachedDocName;
	}

	public String getAttachedNote() {
		return AttachedNote;
	}

	public void setAttachedNote(String attachedNote) {
		AttachedNote = attachedNote;
	}

	public String getAttachedSequenceNo() {
		return AttachedSequenceNo;
	}

	public void setAttachedSequenceNo(String attachedSequenceNo) {
		AttachedSequenceNo = attachedSequenceNo;
	}

	public String getFullFileName() {
		return FullFileName;
	}

	public void setFullFileName(String fullFileName) {
		FullFileName = fullFileName;
	}

	public String getSHA1FileContent() {
		return SHA1FileContent;
	}

	public void setSHA1FileContent(String sHA1FileContent) {
		SHA1FileContent = sHA1FileContent;
	}

	public String getBase64FileContent() {
		return Base64FileContent;
	}

	public void setBase64FileContent(String base64FileContent) {
		Base64FileContent = base64FileContent;
	}
}
