package com.adaction.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {

	}
	
	public static File_Reader_Manager getInstace() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}
	
	public Configuration_Reader getInstaceCR() throws Exception {
		
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
