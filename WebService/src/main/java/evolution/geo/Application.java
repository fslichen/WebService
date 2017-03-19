package evolution.geo;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class Application {
	public static void main(String[] args) {
		GeoIPService service = new GeoIPService();
		GeoIPServiceSoap soap = service.getGeoIPServiceSoap();
		GeoIP ip = soap.getGeoIP("151.101.77.164");// New York Times
		System.out.println(ip.getCountryName());
	}
}
