package ws.biotea.ld2rdf.util;

import ws.biotea.ld2rdf.util.rdfization.OntologyRDFizationPrefix;

public enum ClassesAndProperties {
	FOAF_PERSON(OntologyPrefix.FOAF.getNS(), OntologyPrefix.FOAF.getURL(), "Person"),
	FOAF_AGENT(OntologyPrefix.FOAF.getNS(), OntologyPrefix.FOAF.getURL(), "Agent"), 
	RDFS_PROP_COMMENT(OntologyPrefix.RDFS.getNS(), OntologyPrefix.RDFS.getURL(), "comment"),
	RDF_PROP_VALUE(OntologyPrefix.RDF.getNS(), OntologyPrefix.RDF.getURL(), "value"),
	RDF_TYPE(OntologyPrefix.RDF.getNS(), OntologyPrefix.RDF.getURL(), "type"),
	RDFS_RESOURCE(OntologyPrefix.RDFS.getNS(), OntologyPrefix.RDFS.getURL(), "resource"),
	DCTERMS_PROP_REFERENCES(OntologyPrefix.DCTERMS.getNS(), OntologyPrefix.DCTERMS.getURL(), "references"),
	BIBO_ACADEMIC_ARTICLE(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "AcademicArticle"),
	BIBO_ARTICLE(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Article"),
	BIBO_COLLECTION(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Collection"),
	BIBO_THESIS(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Thesis"),
	BIBO_LETTER(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Letter"),
	BIBO_REPORT(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Report"),
	BIBO_DOCUMENT(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Document"),
	BIBO_BOOK(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Book"),
	BIBO_PROCEEDINGS(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Proceedings"),
	BIBO_MANUAL(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Manual"),
	BIBO_MANUSCRIPT(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Manuscript"),
	BIBO_PATENT(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Patent"),
	BIBO_SPECIFICATION(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Specification"),
	BIBO_STANDARD(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Standard"),
	BIBO_NOTE(OntologyRDFizationPrefix.BIBO.getNS(), OntologyRDFizationPrefix.BIBO.getURL(), "Note"),
	DOCO_SECTION(OntologyRDFizationPrefix.DOCO.getNS(), OntologyRDFizationPrefix.DOCO.getURL(), "Section"),
	DCTERMS_PROP_TITLE(OntologyPrefix.DCTERMS.getNS(), OntologyPrefix.DCTERMS.getURL(), "title");
	public static final String TEXT_PROPERTY = RDF_PROP_VALUE.getURLValue();

	String value;
	String ns;
	String url;
	private ClassesAndProperties(String ns, String url, String value) {
		this.value = value;
		this.ns = ns;
		this.url = url;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}	

	public String getNSValue() {
		return this.ns + ":" + this.value;
	}
	public String getURLValue() {
		return this.url + this.value;
	}
}
