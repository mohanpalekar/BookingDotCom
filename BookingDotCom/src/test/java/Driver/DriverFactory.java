package Driver;

public class DriverFactory {

	private DriverManager driverManager;

	public DriverFactory(final String browserName) {

		switch(browserName.toLowerCase()) {

		case "chrome":
			this.driverManager = new ChromeManager();
			break;

		case "firefox":
			this.driverManager = new FireFoxManager();
			break;

		default:
			throw new IllegalArgumentException("Invalid browserName");

		}

	}

	//	public DriverManager getDriverManager(String browserName) {
	//
	//		switch(browserName.toLowerCase()) {
	//
	//		case "chrome":
	//			return new ChromeManager();
	//
	//		case "firefox":
	//			return new FireFoxManager();
	//
	//		default:
	//			throw new IllegalArgumentException("Invalid browserName");
	//
	//		}
	//	}

	public DriverManager getDriverManager() {
		return this.driverManager;
	}

}
