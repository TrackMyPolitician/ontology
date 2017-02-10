package org.trackmypolitician;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;
import org.junit.*;

/**
 * Tests Person ontology class
 * 
 * @author Baljit Singh
 *
 */
public class Person {

	private static final String uri = "http://www.trackmypolitician.org#Person";
	private static OntModel model;

	/**
	 * Sets up an instance of OntModel
	 */
	@BeforeClass
	public static void setupModel() {
		model = ModelFactory.createOntologyModel();
	}

	/**
	 * Reads the file into the model before each test
	 */
	@Before
	public void readFile() {
		model.read("src/Person.owl");
	}

	/**
	 * Resets the model after each test
	 */
	@After
	public void resetModel() {
		model.removeAll();
		model.reset();
	}

	/**
	 * Tests if the class exists
	 */
	@Test
	public void findClass() {
		Assert.assertNotNull(model.getOntClass(uri));
	}

}
