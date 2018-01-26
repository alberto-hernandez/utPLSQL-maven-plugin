package org.utplsql.helper;

import java.util.Arrays;

import org.apache.maven.model.Resource;

/**
 * 
 * @author Alberto Hernández
 *
 */
public class PluginDefault
{

	// Source Directory
	private static final String SOURCE_DIRECTORY = "src/main/plsql";

	// Test Directory
	private static final String TEST_DIRECTORY = "src/test/plsql";

	/**
	 * 
	 * @return
	 */
    private static Resource buildDirectory(String directory, String includes)
	{
		Resource resource = new Resource();

		// Configure Resources
		resource.setDirectory(directory);
        resource.setIncludes(Arrays.asList(includes));

		return resource;
	}

	/**
	 * 
	 * @return
	 */
	public static Resource buildDefaultSource()
	{
        return buildDirectory(SOURCE_DIRECTORY, "**/*.*");
	}

	/**
	 * 
	 * @return
	 */
	public static Resource buildDefaultTest()
	{
        return buildDirectory(TEST_DIRECTORY, "**/*.pkg");
	}

}