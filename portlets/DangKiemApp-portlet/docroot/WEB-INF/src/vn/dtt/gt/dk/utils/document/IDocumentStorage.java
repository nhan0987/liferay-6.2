/**
 * 
 */
package vn.dtt.gt.dk.utils.document;

/**
 * @author win_64
 *
 */
public interface IDocumentStorage {
	public ResultUpload upload(long userId, byte[] b, String fileName, String rootFolderName, String folderName);
	
	public void deleteFile(Long documentId);
	
	public String getURLById(Long fileId);
	
	public String getFileName(String fileName, String newName);
}
