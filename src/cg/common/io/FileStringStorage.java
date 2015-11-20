package cg.common.io;

public class FileStringStorage implements StringStorage {

	private final String path;
	
	public FileStringStorage(String path) {
		this.path = path;
	}
	
	@Override
	public String read() {
		return FileUtil.readFromFile(path);
	}

	@Override
	public void write(String s) {
		FileUtil.writeToFile(s, path);
	}

}
