package com.cblue.spring06.document;

public class DocumentManager {
	
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	public void read(){
		this.document.read();
	}
	
	public void write(){
		this.document.write();
	}
	

}